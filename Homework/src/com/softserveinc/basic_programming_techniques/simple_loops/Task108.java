package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Calculator;
import com.softserveinc.tools.DataScanner;
import com.softserveinc.tools.TaskHandler;

/**
 * Represents Task 108.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task108 extends Task implements Calculator {
	/**
	 * Starts task execution;
	 */
	@Override
	public void startTask() {
		new TaskHandler(this).runTask(DataScanner.getScanner());
	}

	/**
	 * Makes calculation for task 108.
	 * 
	 * @param naturalNumber
	 *            Valid value of incoming data.
	 */
	@Override
	public String calculate(int naturalNumber) {
		int i = 1;
		while (i <= naturalNumber) {
			i *= 2;
		}
		String result = String.valueOf(i);
		return result;
	}

}
