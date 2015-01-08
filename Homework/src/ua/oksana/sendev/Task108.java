package ua.oksana.sendev;

import java.util.Scanner;

/**
 * Represents Task 108.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task108 extends TaskHandler {
	/**
	 * Starts task 108 execution.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	public Task108(Scanner scanIn) {
		showTask(Constants.TASK_108);
		runTask(scanIn);
	}

	/**
	 * Makes calculation for task 108.
	 * 
	 * @param naturalNumber
	 *            Valid value of incoming data.
	 */
	@Override
	protected String makeCalculation(int naturalNumber) {
		int i = 1;
		while (i <= naturalNumber) {
			i *= 2;
		}
		String result = String.valueOf(i);
		return result;
	}

}
