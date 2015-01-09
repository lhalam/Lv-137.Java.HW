package com.softserveinc.edu.olko123;

import java.util.List;
import java.util.Scanner;

/**
 * Task 559 from homework book
 * 
 * @author Oleg Pavlish
 *
 */
public class Task559 extends Task {
	/**
	 * Natural number parameter for task
	 */
	private int n;

	/**
	 * Initialize and validate input parameters from stdin
	 */
	public Task559() {
		readInput();
	}

	/**
	 * Initialize and validate input parameters from stdin
	 */
	private void readInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter natural number n: ");
			this.n = readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("Incorrect number format");
		}
	}

	/**
	 * Solves Task 559:
	 * <p>
	 * Find all Mersenne numbers less than given natural number
	 */
	public void solve() {
		if (!isValid) {
			return;
		}

		List<Integer> result = MersenneNumber.getMersenneRange(n);

		for (int item : result) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		Task559 task559 = new Task559();
		task559.solve();
	}
}
