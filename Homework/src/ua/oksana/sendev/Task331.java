package ua.oksana.sendev;

import java.util.Scanner;

/**
 * Represents Task 331.
 * 
 * @author Oksana Senchuk
 *
 */
public class Task331 extends TaskHandler {
	/**
	 * Starts task 331 execution.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
	 */
	public Task331(Scanner scanIn) {
		showTask(Constants.TASK_331);
		runTask(scanIn);
	}

	/**
	 * Makes calculation for task 331.
	 * 
	 * @param naturalNumber
	 *            Valid value of incoming data.
	 */
	@Override
	protected String makeCalculation(int naturalNumber) {
		int count = 0;
		StringBuilder result = new StringBuilder();
		for (int i = 1; i <= naturalNumber; i++) {
			for (int j = i; j <= naturalNumber; j++) {
				for (int k = j; k <= naturalNumber; k++) {
					int sum = (int) (Math.pow(i, 2) + Math.pow(j, 2)
							+ Math.pow(k, 2));
					if (sum == naturalNumber) {
						count++;
						result.append(new StringBuilder()
								.append(Constants.VARIANT).append(count)
								.append(": x=").append(i)
								.append(" y=").append(j)
								.append(" z=").append(k)
								.append("\n").toString());
					}
				}
			}
		}
		return result.toString();
	}
}
