package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Console;
import com.softserveinc.tools.Executor;
import com.softserveinc.tools.Stream;
import com.softserveinc.tools.TaskHandler;

/**
 * Represents Task 108.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task108 extends Task implements Executor {
	/**
	 * Instance of stream object that handles input/output from the console.
	 */
	private Stream stream;
	/**
	 * 'Result of number decomposition' message.
	 */
	private final String RESULT_MESSAGE = "The least number of type 2^r greater than %d is %d;";

	/**
	 * Starts task execution;
	 */
	@Override
	public void startTask() {
		stream = new Console();
		new TaskHandler(this, stream).runTask();
	}

	/**
	 * Executes task 108.
	 * 
	 * @param number
	 *            any natural number.
	 */
	@Override
	public void execute(int number) {
		int resultValue = calculate(number);
		String result = String.format(RESULT_MESSAGE, number, resultValue);
		stream.writeLine(result);
	}

	/**
	 * Calculates the least number of type 2^r greater than entered number.
	 * 
	 * @param naturalNumber
	 *            Any natural number of integer type.
	 * @return result of the calculation.
	 */
	private int calculate(int naturalNumber) {
		int temp = 1;
		while (temp <= naturalNumber) {
			temp *= 2;
		}
		return temp;
	}

}
