package edu.softserveinc.tarasvuyiv;

/**
 * Tasks 86 a & b from homework book.
 * Displays count & sum of digits in entered number. 
 * @author Taras Vuyiv
 *
 */

class NaturalNumber {
	public static final int NUMBER = 547666000;
	public static final int INITIAL_VALUE = 0;

	/**
	 * 
	 * @param number Value to count a number of digits
	 * @return Count of digits in entered value
	 */
	static int getDigitsCount(int number) {
		int digitsCount = INITIAL_VALUE;

		while (number != 0) {
			number /= 10;
			digitsCount++;
		}

		return digitsCount;
	}

	/**
	 * 
	 * @param number Value to count a number of digits
	 * @return Sum of digits in entered value
	 */
	static int getDigitsSum(int number) {
		int sum = INITIAL_VALUE;

		while (number != 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Count of digits in " + NUMBER + ": "
				+ NaturalNumber.getDigitsCount(NUMBER));
		System.out.println("Sum of digits in " + NUMBER + ": "
				+ NaturalNumber.getDigitsSum(NUMBER));
	}

}
