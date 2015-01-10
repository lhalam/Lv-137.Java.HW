package com.softserveinc.edu.olko123;

import java.util.Scanner;

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
	public void solve() {
		if (!isValid) {
			return;
		}

		int result = 0;
		int nCount = getDigitCount(n);

		for (int i = 0; (i < m) && (i < nCount); i++) {
			result += n % 10;
			n = n / 10;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		Task87 task87 = new Task87();
		task87.solve();
	}
}
