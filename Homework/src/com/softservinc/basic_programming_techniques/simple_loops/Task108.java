package com.softservinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softservinc.homework.Starter;
import com.softservinc.homework.Task;
import com.softservinc.tools.Calculator;
import com.softservinc.tools.Constants;
import com.softservinc.tools.DataScanner;
import com.softservinc.tools.TaskHandler;

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
