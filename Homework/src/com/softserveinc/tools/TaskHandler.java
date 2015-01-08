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
	 * Data received from console
	 */
	private String requestResult;
	/**
	 * Data received from console after validation
	 */
	private int enteredNumber;
	/**
	 * Instance of data validator class;
	 */
	private NumberValidator checker;
	private Calculator calc;

	public TaskHandler(Calculator calc) {
		this.calc = calc;
	}



	/**
	 * Displays task conditions in the console.
	 * 
	 * @param task
	 *            Task conditions.
	 */
	public void showTask(String[] task) {
		for (String line : task) {
			System.out.println(line);
		}

	}

	/**
	 * Executes task algorithm.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	public void runTask(Scanner scanIn) {
		checker = new NumberValidator();
		askForNumber(scanIn);
		if (isValid()) {
			enteredNumber = checker.getEnteredNumber();
			String result = calc.makeCalculation(enteredNumber);
			showResult(enteredNumber, result);
		}
		askForProceed(scanIn);
	}

	/**
	 * Displays 'enter number request' in the console;
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	private void askForNumber(Scanner scanIn) {
		System.out.println(Constants.ENTER_NUMBER_REQUEST);
		requestResult = scanIn.nextLine();
	}

	/**
	 * Checks incoming data with help of NumberValidator class.
	 * 
	 * @return true if data is valid
	 */
	private boolean isValid() {
		return checker.checkIfNumberIsValid(requestResult);
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
				.append(naturalNumber).append(" : ").append(result).toString());
	}

	/**
	 * Handles inter- and intra- task navigation;
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
