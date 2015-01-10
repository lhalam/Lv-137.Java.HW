package com.softserveinc.tools;

import java.util.Scanner;

/**
 * Represents algorithm of task execution.
 * 
 * @author Oksana Senchuk
 *
 */
public class TaskHandler {
	/**
	 * Instance of calculator.
	 */
	private Calculator calc;

	/**
	 * Creates a tool that handles task execution.
	 * 
	 * @param calc
	 *            Instance of calculator.
	 */
	public TaskHandler(Calculator calc) {
		this.calc = calc;

	}

	/**
	 * Runs task execution algorithm.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	public void runTask(Scanner scanIn) {
		NumberValidator checker = new NumberValidator();
		String dataToCheck = askForNumber(scanIn);
		boolean isValid = checker.isValid(dataToCheck);
		if (isValid) {
			int enteredNumber = checker.getEnteredNumber();
			String result = calc.calculate(enteredNumber);
			showResult(enteredNumber, result);
		}
		askForProceed(scanIn);
	}

	/**
	 * Displays 'enter number' request.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 * @return entered data as String object.
	 */
	private String askForNumber(Scanner scanIn) {
		System.out.println(Constants.ENTER_NUMBER_REQUEST);
		String requestResult = scanIn.nextLine();
		return requestResult;
	}

	/**
	 * Displays solution of the problem for given natural number.
	 * 
	 * @param naturalNumber
	 *            Valid natural number.
	 * @param result
	 *            Solution of the problem.
	 */
	private void showResult(int naturalNumber, String result) {
		if (result.equals(Constants.EMPTY_STRING)) {
			result = Constants.NO_RESULT;
		}
		System.out.println(new StringBuilder().append(Constants.RESULT_MESSAGE)
				.append(naturalNumber).append(Constants.DIVIDER).append(result)
				.toString());
	}

	/**
	 * Handles ;
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	private void askForProceed(Scanner scanIn) {
		System.out.println(Constants.PROCEED_QUESTION);
		String answer = scanIn.nextLine();
		if (answer.equals(Constants.POSITIVE_ANSWER)) {
			runTask(scanIn);
		} else if (answer.equals(Constants.NEGATIVE_ANSWER)) {

		} else {
			System.out.println(Constants.WRONG_ANSWER_MESSAGE);
			askForProceed(scanIn);
		}
	}

}
