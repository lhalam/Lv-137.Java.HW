package ua.oksana.sendev;

/**
 * Represents tool for validation of incoming data.
 * 
 * @author Oksana Senchuk
 *
 */
public class NumberValidator {
	/**
	 * Valid natural number
	 */
	private int enteredNumber;

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
}
