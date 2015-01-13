package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;

/**
 * Task 87 from homework book
 * 
 * @author Oleg Pavlish
 *
 */
public class Task87 extends Task {
	/**
	 * Natural number whose last digits will be summed
	 */
	private long n;

	/**
	 * Natural number representing digits count
	 */
	private long m;
	
	private boolean isValid;

	/**
	 * Initialize and validate input parameters from stdin
	 */
	public Task87() {
		readInput();
	}

	/**
	 * Initialize and validate parameters from stdin
	 */
	private void readInput() {
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter natural number n: ");
			this.n = Input.readNatural(scanner);
			System.out.println("Enter natural number m: ");
			this.m = Input.readNatural(scanner);
			this.isValid = true;
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * Calculate number of digits
	 * 
	 * @param num
	 *            Decimal number to calculate number of digits
	 * @return Number of digits
	 */
	private static int getDigitCount(long num) {
		return String.valueOf(num).length();
	}

	/**
	 * Solves Task87:
	 * <p>
	 * Get sum of last m digits of natural number n
	 */
	@Override
	public void startTask() {
		if(!isValid){
			System.out.print(Constants.NOT_NATURAL_NUMBER_MESSAGE);
			return;
		}

		int result = 0;
		int nCount = getDigitCount(n);

		for (int i = 0; (i < m) && (i < nCount); i++) {
			result += n % 10;
			n = n / 10;
		}

		System.out.print(result);
	}
}
