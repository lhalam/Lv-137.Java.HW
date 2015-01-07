package ua.oksana.sendev;

import java.util.Scanner;

/**
 * Represents tool for task switching.
 * 
 * @author Oksana Senchuk
 *
 */
public class TaskChooser {
	/**
	 * Creates a new TaskChooser with Scanner.
	 */
	public TaskChooser() {
		Scanner scanIn = new Scanner(System.in);
		chooseTask(scanIn);
		scanIn.close();
	}

	/**
	 * Handle task choice.
	 * 
	 * @param scanIn
	 *            Scanner that read data from System.in
	 */
	private void chooseTask(Scanner scanIn) {
		System.out.println(Constants.CHOOSE_TASK_QUESTION);
		String choice = scanIn.nextLine();
		if (choice.equals(Constants.CHOICE_TASK_108)) {
			new Task108(scanIn);
		} else if (choice.equals(Constants.CHOICE_TASK_331)) {
			new Task331(scanIn);
		} else {
			System.out.println(Constants.WRONG_TASK_CHOICE);
			chooseTask(scanIn);
		}
	}
}
