package com.softservinc.basic_programming_techniques.simple_loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.softserveinc.homework.Starter;
import com.softserveinc.homework.Task;

/**
 * Class used to add "1" to the begin and to the end of the number.
 * 
 * @author Kucheryavenko Dmytro
 */
public class Task_88_d extends Task implements Starter {
	/**
	 * Method turns int variable to String, adds "1" to the first and last
	 * position and turns it back to int type.
	 * 
	 * @param num
	 *            The number to be changed.
	 * @return The number that has "1" in it`s first and last digits.
	 */
	private int add1(Integer num) {
		String str;
		String result;

		str = num.toString();
		result = "1" + str + "1";
		num = Integer.parseInt(result);
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
		System.out.println(add1(number));
	}
}
