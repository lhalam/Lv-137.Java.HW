package com.softservinc.basic_programming_techniques.nested_loops;

import java.util.Scanner;

import com.softservinc.basic_programming_techniques.simple_loops.Task108;
import com.softservinc.homework.Starter;
import com.softservinc.homework.Task;
import com.softservinc.tools.Calculator;
import com.softservinc.tools.Constants;
import com.softservinc.tools.DataScanner;
import com.softservinc.tools.TaskHandler;

/**
 * Represents Task 331.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task331 extends Task implements Calculator {
	private TaskHandler handler;

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
								.append(": x=").append(i).append(" y=")
								.append(j).append(" z=").append(k).append("\n")
								.toString());
					}
				}
			}
		}
		return result.toString();
	}

	@Override
	public void startTask() {
		handler = new TaskHandler(this);
		handler.showTask(Constants.TASK_331);
		handler.runTask(DataScanner.getScanner());
	}

}
