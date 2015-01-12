package com.softserveinc.basic_programming_techniques.loops_and_branches;

import java.util.Scanner;

import com.softserveinc.tools.NaturalNumberTask;

/**
 * Task 226 from homework book
 * 
 * @author Oleg Pavlish
 *
 */
public class Task226 extends NaturalNumberTask {
	/**
	 * Natural number parameter for task
	 */
	private int n;

	/**
	 * Natural number parameter for task
	 */
	private int m;

	/**
	 * Initialize and validate input parameters from stdin
	 */
	public Task226() {
		readInput();
	}

	/**
	 * Initialize and validate input parameters from stdin
	 */
	private void readInput() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter natural number n: ");
			this.n = readNatural(scanner);
			System.out.println("Enter natural number m: ");
			this.m = readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("Incorrect number format");
		}
	}

	/**
	 * Solves Task 226:
	 * <p>
	 * Get all common multiples of natural numbers n,m, that are less than n*m.
	 */
	@Override
	public void startTask() {
		if (!isValid) {
			return;
		}

		for (int i = 1; i <= n; i++) {
			if (i * m % n == 0) {
				System.out.println(i * m);
			}
		}
	}
}
