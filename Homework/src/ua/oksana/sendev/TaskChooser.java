package ua.oksana.sendev;

import java.util.Scanner;

import com.softservinc.basic_programming_techniques.nested_loops.Task331;
import com.softservinc.basic_programming_techniques.simple_loops.Task108;

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
	 * Handles task choice.
	 * 
	 * @param scanIn
	 *            Scanner that reads data from System.in
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
