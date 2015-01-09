package com.softserveinc.edu.olko123;

import java.util.ArrayList;
import java.util.List;

public class MersenneNumber {
	private static final double TWO = 2.0;

	/**
	 * Returns Mersenne number range from 1 to max
	 * 
	 * @param max
	 *            Upper limit of prime range exclusive
	 * @return Range of prime numbers
	 */
	public static List<Integer> getMersenneRange(int max) {
		List<Integer> ret = new ArrayList<Integer>();

		for (int i = 1; i < max; i++) {
			i = PrimeNumber.getNext(i);

			int mersenne = getMersenneNumber(i);
			if (mersenne >= max) {
				break;
			}
			if (mersenne != -1) {
				ret.add(mersenne);
			}
		}

		return ret;
	}

	/**
	 * Count possible Mersenne number.
	 * <p>
	 * Mersenne number is prime number, counted by formula (2^p - 1), where p is
	 * also prime number.
	 * 
	 * @param p
	 *            Prime number used in Mersenne number calculation
	 * @return Mersenne number or
	 *         <p>
	 *         -1 if calculated number is not Mersenne
	 */
	public static int getMersenneNumber(int p) {
		if (!PrimeNumber.isPrimeNumber(p)) {
			return -1;
		}

		int ret = (int) (Math.round(Math.pow(TWO, p)) - 1);

		if (!PrimeNumber.isPrimeNumber(ret)) {
			return -1;
		}

		return ret;
	}
}
