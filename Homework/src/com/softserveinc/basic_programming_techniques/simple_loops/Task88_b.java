package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softserveinc.homework.Task;

/**
 * Task88 b)
 * 
 * @author Volodia Lishchynskiy
 *
 */
public class Task88_b extends Task {
	/**
	 * 
	 * @param n
	 *            entered numbers
	 * @return is n natural or not
	 */
	public static boolean isNatural(int nat) {
		if (nat > 0) {
			return true;
		}
		return false;
	}

	/**
	 * @param sc   Scanner(System.in)
	 * @return Natural number
	 * @throws NumberFormatException
	 */
	public static int getNumber(Scanner sc) throws NumberFormatException {
		int num = sc.nextInt();
		if (!isNatural(num)) {
			throw new NumberFormatException();
		}
		return num;
	}

	/**
	 * 
	 * @param snum
	 *            The number entered and converted in String
	 * @return reverse (snum).
	 */
	public static String reverseNumber(String snum) {
		StringBuilder sb = new StringBuilder();
		sb.append(snum);
		sb.reverse();
		return sb.toString();
	}
	/**
	 * Solution of Task 88 b)
	 */
	public static void solveTask() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = getNumber(sc);
			String snumber = String.valueOf(number);
			StringBuilder sb = new StringBuilder();
			String resnum = sb.toString();
			resnum = reverseNumber(snumber);
			System.out.println(resnum);
		} catch (NumberFormatException e) {
			System.out.println("Not Natural number!!!Enter Natural(>0)");
		}

	}

	@Override
	public void startTask() {
		solveTask();
	}
	
}
