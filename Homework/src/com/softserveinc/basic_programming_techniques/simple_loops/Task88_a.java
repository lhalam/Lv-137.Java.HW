package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softserveinc.homework.Task;

/**
 * Task 88 a)
 * 
 * @author Volodia Lishchynskiy
 */
public class Task88_a extends Task {

	public Task88_a() {

	}

	public final static int DEGREE = 2;
	public final static char SYMBOL = '3';

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
	 * 
	 * @param sc Scanner(System.in)
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
	 * @param array
	 *            Array of chars
	 * @return Consist this array Symbol or not
	 */
	public static boolean ConsistSymb(char[] array) {
		boolean cst = false;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == SYMBOL) {
				cst = true;
			}
		}
		return cst;
	}

	/**
	 * Solution of Task 88a)
	 */
	public static void solveTask() {
		int number = 0;
		Scanner sc = new Scanner(System.in);
		try {
			number = getNumber(sc);
			int sqrnumber = (int) Math.pow(number, DEGREE);
			String strnumber = String.valueOf(sqrnumber);
			char[] arr = strnumber.toCharArray();
			if (ConsistSymb(arr) == true) {
				System.out.println(sqrnumber + " consist" + " with " + SYMBOL);
			} else {
				System.out.println(sqrnumber + " doesn't consist" + " with "
						+ SYMBOL);
			}
		} catch (NumberFormatException e) {
			System.out.println("Not Natural number!!!Enter Natural(>0)");
		}

	}

	@Override
	public void startTask() {
		solveTask();
	}

	

}
