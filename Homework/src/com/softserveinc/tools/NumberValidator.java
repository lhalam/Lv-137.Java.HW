package com.softserveinc.tools;

import java.util.Scanner;

/**
 * Represents tool for validation of incoming data.
 *
 * @author Volodymyr Yakymiv
 */
public class NumberValidator {
	/**
	 * Valid natural number
	 */
	private int enteredNumber;
	private Scanner scanner = DataScanner.getScanner();

	/**
	 * Checks if entered value is valid for the task 107, 243. Value must be
	 * numeric, natural number and number>1.
	 *
	 * Data received from console.
	 *
	 * @return correct entered natural number which is >1.
	 */
	public int checkIfEnteredValueIsValid() {
		System.out.println(Constants.ENTER_NUMBER_REQUEST);
		outer: while (scanner.hasNext()) {
			if (scanner.hasNextInt()) {
				enteredNumber = scanner.nextInt();
				if (enteredNumber > 1 && enteredNumber < Integer.MAX_VALUE) {
					break outer;
				} else
					System.out.println(Constants.NOT_NATURAL_NUMBER_MESSAGE);
				continue outer;
			} else if (scanner.hasNextLine()) {
				String incorrectValue = scanner.nextLine();
				System.out.printf(Constants.WRONG_NUMBER_FORMAT_MESSAGE);
				continue outer;
			}
		}
		DataScanner.closeScanner();
		return enteredNumber;
	}
}