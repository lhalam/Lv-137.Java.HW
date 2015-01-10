package com.softserveinc.basic_programming_techniques.simple_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.softserveinc.homework.Task;

/**
 * Class used to swap the first and the last digits of the number.
 * 
 * @author Kucheryavenko Dmytro
 * 
 */
public class Task_88_c extends Task{
	/**
	 * Method swaps the first and the last digits of the number, by means of
	 * turning int variable to String, swapping first and last symbols and
	 * returning the meaning to int type.
	 * 
	 * @param num
	 *            The number to be changed.
	 * @return The number with swapped first and last digits.
	 */
	private int change(Integer num) {
		String str;
		String result;
		Character firstn;
		Character lastn;

		str = num.toString();
		firstn = str.charAt(0);
		lastn = str.charAt(str.length() - 1);
		try {
			result = lastn.toString() + str.subSequence(1, str.length() - 1)
					+ firstn.toString();
			num = Integer.parseInt(result);
		} catch (IndexOutOfBoundsException exc) {
			System.out.println("The number must have more than one digit");
			return 0;
		}
		return num;

	}

	public void startTask() {
		int number;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, input the natural number");
		try {
			str = br.readLine();
			number = Integer.parseInt(str);
		} catch (NumberFormatException | IOException exc) {
			System.out.println("Invalid format");
			number = 0;
		}
		System.out.println(change(number));
	}

}