package edu.softserveinc.tarasvuyiv;

import java.util.*;

/** Task 330 from homework book.
 * Displays all perfect numbers smaller than N.
 * @author Taras Vuyiv
 *
 */

class PerfectNumbers {

	public static final long INITIAL_VALUE = 0L;
	public static final long NUMBER = 10000L;

	/**
	 * 
	 * @param number Number to check 
	 * @return Boolean expression - is the entered number perfect or not
	 */
	static boolean isPerfect(long number) {
		long sum = INITIAL_VALUE;

		for (long i = 1L; i < number; i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}

		return sum == number ? true : false;
	}

	/**
	 * 
	 * @param number Number till we look for perfect numbers
	 * @return A list of all perfect numbers that are smaller than entered value
	 */
	static ArrayList<Long> getPerfectNumbers(long number) {

		ArrayList<Long> listOfPerfectNumbers = new ArrayList<Long>();

		for (long i = 1L; i < number; i++) {
			if (isPerfect(i)) {
				listOfPerfectNumbers.add(i);
			}
		}

		return listOfPerfectNumbers;

	}

	public static void main(String[] args) {

		ArrayList<Long> listOfPerfectNumbers = new ArrayList<Long>();

		listOfPerfectNumbers = PerfectNumbers.getPerfectNumbers(NUMBER);

		if (listOfPerfectNumbers.size() != 0) {
			System.out.print("Perfect numbers before " + NUMBER + ": ");
			for (long i : listOfPerfectNumbers) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("No perfect numbers before " + NUMBER);
		}

	}

}
