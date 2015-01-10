package com.softserveinc.basic_programming_techniques.nested_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Calculator;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.DataScanner;
import com.softserveinc.tools.TaskHandler;

/**
 * Represents Task 331.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task331 extends Task implements Calculator {
	/**
	 * Instance of class that handles task execution;
	 */
	private TaskHandler handler;

	/**
	 * Starts task execution;
	 */
	@Override
	public void startTask() {
		handler = new TaskHandler(this);
		handler.runTask(DataScanner.getScanner());
	}

	/**
	 * Makes calculation for task 331.
	 * 
	 * @param naturalNumber
	 *            Valid value of incoming data.
	 */
	@Override
	public String makeCalculation(int naturalNumber) {
		int count = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= naturalNumber; i++) {
			for (int j = i; j <= naturalNumber; j++) {
				for (int k = j; k <= naturalNumber; k++) {
					int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2) + Math
							.pow(k, 2));
					if (sum == naturalNumber) {
						count++;
						result.append(new StringBuilder()
								.append(Constants.VARIANT).append(count)
								.append(Constants.X).append(i)
								.append(Constants.Y).append(j)
								.append(Constants.Z).append(k).append("\n")
								.toString());
					}
				}
			}
		}
		return result.toString();
	}

}
