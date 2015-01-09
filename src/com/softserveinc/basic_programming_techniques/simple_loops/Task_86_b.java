package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;

/**
 * Task 86b from homework book. 
 * Displays sum of digits in entered number.
 * 
 * @author Taras Vuyiv
 *
 */

class Task_86_b extends Task {
	/**
	 * Counting sum of digits in number.
	 * 
	 * @param number
	 *            Value to count a number of digits
	 * @return Sum of digits in entered value
	 */
	static int getDigitsSum(int number) {
		int sum = Constants.INITIAL_VALUE_INT;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

	public void startTask() {
		int number = Constants.INITIAL_VALUE_INT;
		boolean isValid = Constants.INITIAL_VALUE_BOOLEAN;
		int sumOfDigits;

		try (Scanner scanner = new Scanner(System.in)) {
			System.out
					.print("Please enter a number to count digits sum from: ");
			number = Input.readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("Incorrect number format");
		}

		if (!isValid)
			return;

		sumOfDigits = getDigitsSum(number);

		System.out.println("The sum of digits is " + sumOfDigits);

	}

}
