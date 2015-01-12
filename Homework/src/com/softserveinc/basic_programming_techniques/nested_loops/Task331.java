package com.softserveinc.basic_programming_techniques.nested_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Console;
import com.softserveinc.tools.Executor;
import com.softserveinc.tools.Stream;
import com.softserveinc.tools.TaskHandler;

/**
 * Represents Task 331.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task331 extends Task implements Executor {
	/**
	 * Instance of stream object that handles input/output from the console.
	 */
	private Stream stream;
	/**
	 * Smallest value of natural number (according to Legendre);
	 */
	private final int SMALLEST_NATURAL_NUMBER = 0;
	/**
	 * Number can't be decomposed message.
	 */
	private final String NO_VARIANTS_MESSAGE = "%d can not be represented as the sum of three squares of integers";
	/**
	 * 'Result of number decomposition' message.
	 */
	private final String RESULT_MESSAGE = "%d can be represented as the sum of three squares of integers:\n";

	/**
	 * Starts task execution;
	 */
	@Override
	public void startTask() {
		stream = new Console();
		new TaskHandler(this, stream).runTask();
	}

	/**
	 * Executes task 331.
	 * 
	 * @param number
	 *            any natural number.
	 */
	@Override
	public void execute(int number) {
		boolean noResults = verifyForNotDecomposition(number);
		if (noResults) {
			stream.writeLine(String.format(NO_VARIANTS_MESSAGE, number));
			return;
		}
		stream.writeLine(String.format(RESULT_MESSAGE, number));
		calculate(number);

	}

	/**
	 * Decomposes natural number on sum of three squares of integers.
	 * 
	 * @param number
	 *            Any natural number.
	 */
	private void calculate(int number) {
		int count = 0;
		int max = (int) Math.floor(Math.sqrt(number) - 2
				* Math.pow(SMALLEST_NATURAL_NUMBER, 2));
		for (int i = SMALLEST_NATURAL_NUMBER; i <= max; i++) {
			for (int j = i; j <= max; j++) {
				for (int k = j; k <= max; k++) {
					int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2) + Math
							.pow(k, 2));
					if (sum == number) {
						count++;
						printResult(count, i, j, k);
					}
				}
			}
		}

	}

	/**
	 * Verifies if number can be decomposed on sum of three squares of integers.
	 * Uses Legendre's three-square theorem condition : number of type
	 * n=4^a(8*b+7) can't be decomposed on sum of three squares of integers.
	 * 
	 * @param number
	 *            Any natural number.
	 * @return true if number can't be decomposed.
	 */
	private boolean verifyForNotDecomposition(int number) {
		int maxA = (int) Math.floor(Math.log(number / 7) / Math.log(4));
		int maxB = (int) Math.floor((number - 7) / 8);
		for (int a = 0; a <= maxA; a++) {
			for (int b = 0; b <= maxB; b++) {
				int undecomposedNum = (int) Math.pow(4, a) * (8 * b + 7);
				if (undecomposedNum == number) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Prints variant of the task solution
	 * 
	 * @param count
	 *            Variant number.
	 * @param x
	 *            First integer of decomposition.
	 * @param y
	 *            Second integer of decomposition.
	 * @param z
	 *            Third integer of decomposition.
	 */
	private void printResult(int count, int x, int y, int z) {
		String formattedResult = String.format(
				"Variant #%d: X=%d; Y=%d; Z=%d;\n", count, x, y, z);
		stream.writeLine(formattedResult);
	}

}
