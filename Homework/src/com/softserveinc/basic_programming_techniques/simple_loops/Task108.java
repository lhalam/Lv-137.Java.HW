package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softserveinc.homework.Starter;
import com.softserveinc.homework.Task;
import com.softserveinc.tools.Calculator;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.DataScanner;
import com.softserveinc.tools.TaskHandler;

/**
 * Represents Task 108.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task108 extends Task implements Calculator {
	private TaskHandler handler;

	/**
	 * Makes calculation for task 108.
	 * 
	 * @param naturalNumber
	 *            Valid value of incoming data.
	 */
	@Override
	public String makeCalculation(int naturalNumber) {
		int i = 1;
		while (i <= naturalNumber) {
			i *= 2;
		}
		String result = String.valueOf(i);
		return result;
	}

	@Override
	public void startTask() {
		handler = new TaskHandler(this);
		handler.showTask(Constants.TASK_108);
		handler.runTask(DataScanner.getScanner());

	}

}
