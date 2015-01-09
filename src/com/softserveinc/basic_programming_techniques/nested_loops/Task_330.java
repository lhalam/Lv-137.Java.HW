package com.softserveinc.basic_programming_techniques.nested_loops;

import java.util.*;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;

/**
 * Task 330 from homework book. 
 * Displays all perfect numbers smaller than N.
 * 
 * @author Taras Vuyiv
 *
 */

class Task_330 extends Task {

	/**
	 * Check if number is perfect.
	 * 
	 * @param number
	 *            Number to check
	 * @return Boolean expression - is the entered number perfect or not
	 */
	static boolean isPerfect(long number) {
		long sum = Constants.INITIAL_VALUE_LONG;

		for (long i = 1L; i < number; i++) {
			if ((number % i) == 0) {
				sum += i;
			}
		}

		return sum == number ? true : false;
	}

	/**
	 * Get all perfect numbers smaller than value.
	 * 
	 * @param number
	 *            Number till we look for perfect numbers
	 * @return A list of all perfect numbers that are smaller than entered value
	 */
	static ArrayList<Long> getPerfectNumbers(long number) {

		ArrayList<Long> listOfPerfectNumbers = new ArrayList<Long>();

		for (long i = 1L; i < number; i++) {
			if (isPerfect(i)) {
				listOfPerfectNumbers.add(i);
			}
		}

		return listOfPerfectNumbers;

	}
	
	public void startTask() {
		
		int number = Constants.INITIAL_VALUE_INT;
		boolean isValid = Constants.INITIAL_VALUE_BOOLEAN;
		ArrayList<Long> listOfPerfectNumbers = new ArrayList<Long>();
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Get all perfect numbers smaller than: ");
			number = Input.readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("Incorrect number format");
		}
		
		if(!isValid)
			return;
		
		listOfPerfectNumbers = getPerfectNumbers(number);;
		  
		 if (listOfPerfectNumbers.size() != 0) {
		 System.out.print("Perfect numbers before " + number + ": "); for (long i
		  : listOfPerfectNumbers) { System.out.print(i + " "); } } else {
		 System.out.println("No perfect numbers before " + number); }
		  
		  }

	}


