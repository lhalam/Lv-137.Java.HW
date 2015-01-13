package com.softserveinc.task_by_topics.integers;

import java.util.List;
import java.util.Scanner;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;
import com.softserveinc.tools.numeric.MersenneNumber;

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
	
	private boolean isValid;

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
			this.n = Input.readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * Solves Task 559:
	 * <p>
	 * Find all Mersenne numbers less than given natural number
	 */
	@Override
	public void startTask() {
		if (!isValid) {
			System.out.print(Constants.NOT_NATURAL_NUMBER_MESSAGE);
			return;
		}

		List<Integer> result = MersenneNumber.getMersenneRange(n);

		System.out.print(result.toString());
	}
}
