package com.softserveinc.tools;

import java.util.Scanner;

/**
 * Represents tool for validation of incoming data.
 *
 * @author Oksana Senchuk
 */
public class NumberValidator {
	/**
	 * Valid natural number
	 */
	private int enteredNumber;
	private Scanner scanner = DataScanner.getScanner();

	/**
	 * Checks if entered value is valid for the task. Value must be numeric and
	 * natural number.
	 *
	 * @param dataToCheck
	 *            Data received from console.
	 * @return true if entered value is valid.
	 */
	public boolean checkIfNumberIsValid(String dataToCheck) {
		boolean isValid = false;
		if (isNumeric(dataToCheck)) {
			isValid = isNatural();
		}
		return isValid;
	}

	/**
	 * Checks if entered value is numeric.
	 *
	 * @param dataToCheck
	 *            Data received from console.
	 * @return true if value is numeric.
	 */
	private boolean isNumeric(String dataToCheck) {
		try {
			enteredNumber = Integer.parseInt(dataToCheck);
		} catch (NumberFormatException nfe) {
			System.out.println(dataToCheck
					+ Constants.WRONG_NUMBER_FORMAT_MESSAGE);
			return false;
		}
		return true;
	}

	/**
	 * Checks if entered value is natural number.
	 *
	 * @return true if value is natural number.
	 */
	private boolean isNatural() {
		boolean isNatural = enteredNumber > 0;
		if (!isNatural) {
			System.out.println(enteredNumber
					+ Constants.NOT_NATURAL_NUMBER_MESSAGE);
		}
		return isNatural;

	}

	/**
	 * Gets value of entered number.
	 *
	 * @return Value of entered number.
	 */
	public int getEnteredNumber() {
		return this.enteredNumber;
	}

	
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