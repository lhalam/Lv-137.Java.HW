package com.softserveinc.tools;


/**
 * Represents a tool that handles task execution algorithm.
 * 
 * @author Oksana Senchuk
 *
 */
public class TaskHandler {
	private final String ENTER_NUMBER_REQUEST = "Please, enter natural number or '%s' for exit";
	private final String QUIT_WORD = "q";
	private final int SMALLEST_NATURAL_NUMBER = 0;
	private final String WRONG_NUMBER_FORMAT_MESSAGE = "'%s' is not a number(NaN)";
	private final String NOT_NATURAL_NUMBER_MESSAGE = "%d is not a natural number.(n>=0)";
	/**
	 * Instance of executor.
	 */
	private Executor exec;
	private Stream stream;

	/**
	 * Creates a tool that handles task execution.
	 * 
	 * @param calc
	 *            Instance of calculator.
	 */
	public TaskHandler(Executor exec, Stream stream) {
		this.exec = exec;
		this.stream = stream;
	}

	/**
	 * Runs task execution algorithm.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	public void runTask() {
		stream.writeLine(String.format(ENTER_NUMBER_REQUEST, QUIT_WORD));
		String inputData = stream.readLine();
		int number;
		if (inputData.equals(QUIT_WORD)) {
			stream.close();
			return;
		}
		try {
			number = Integer.parseInt(inputData);
		} catch (NumberFormatException ex) {
			stream.writeLine(String.format(WRONG_NUMBER_FORMAT_MESSAGE,
					inputData));
			runTask();
			return;
		}

		if (number < SMALLEST_NATURAL_NUMBER) {
			stream.writeLine(String.format(NOT_NATURAL_NUMBER_MESSAGE, number));
			runTask();
			return;
		}

		exec.execute(number);
		runTask();
	}

}
