package com.softserveinc.tools.numeric;

public class PrimeNumber {
	/**
	 * Checks if given number is prime
	 * 
	 * @param num
	 *            Number to be checked
	 * @return true if number is prime
	 */
	public static boolean isPrimeNumber(int num) {
		if (num < 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Returns next prime number
	 * 
	 * @param num
	 *            Lower limit of search for prime number
	 * @return Prime number
	 */
	public static int getNext(int num) {
		while (!isPrimeNumber(num)) {
			num++;
		}

		return num;
	}
}
