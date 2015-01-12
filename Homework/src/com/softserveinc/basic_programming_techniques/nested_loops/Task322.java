package com.softserveinc.basic_programming_techniques.nested_loops;

import com.softserveinc.homework.Task;

/**
 * task 322
 * 
 * @author Volodymur Lishchynskiy
 */
public class Task322 extends Task {

	public static final int LIM = 10000;

	public Task322() {

	}

	/**
	 * 
	 * @param n1
	 *            First number
	 * @param n2
	 *            Second number
	 * @return max of First and Second numbers
	 */
	public static int max(int n1, int n2) {
		int max = 0;
		if (n1 > n2) {
			max = n1;
		} else {
			max = n2;
		}
		return max;
	}

	/**
	 * 
	 * @param num
	 *            Number entered by keyboard
	 * @return sum all dividers of Number(num)
	 */
	public static int sumOfDividers(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	/**
	 * 
	 * @return element from array which have max sum of dividers!
	 */
	public static int getElement() {
		int[] array = new int[LIM + 1];
		int maximum = 0;
		int element = 0;
		for (int i = 1; i <= LIM; i++) {
			array[i] = i;
			if (maximum < max(sumOfDividers(array[i]),
					sumOfDividers(array[i - 1]))) {
				maximum = max(sumOfDividers(array[i]),
						sumOfDividers(array[i - 1]));
				element = i;
			}
		}
		return element;
	}

	public static void solveTask() {
		int k;
		k = getElement();
		System.out.println(k);
	}

	@Override
	public void startTask() {
		solveTask();
	}
}
