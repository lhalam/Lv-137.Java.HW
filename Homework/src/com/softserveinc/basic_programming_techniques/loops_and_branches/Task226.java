package com.softserveinc.basic_programming_techniques.loops_and_branches;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;

/**
 * Task 226 from homework book
 * 
 * @author Oleg Pavlish
 *
 */
public class Task226 extends Task {
	/**
	 * Natural number parameter for task
	 */
	private int n;

	/**
	 * Natural number parameter for task
	 */
	private int m;
	
	private boolean isValid;

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
			this.n = Input.readNatural(scanner);
			System.out.println("Enter natural number m: ");
			this.m = Input.readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
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
			System.out.print(Constants.NOT_NATURAL_NUMBER_MESSAGE);
			return;
		}
		
		List<Integer> result = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i * m % n == 0) {
				result.add(i * m);
			}
		}
		
		System.out.print(result.toString());
	}
}
