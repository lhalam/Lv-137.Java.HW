package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;
import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.Input;

/**
 * Task 86a from homework book. 
 * Displays count of digits in entered number.
 * 
 * @author Taras Vuyiv
 *
 */

class Task_86_a extends Task {
	
	/**
	 * Counting digits in number.
	 * 
	 * @param number Value to count a number of digits
	 * @return Count of digits in entered value
	 */
	static int getDigitsCount(int number) {
		int digitsCount = 0;

		while (number != 0) {
			number /= 10;
			digitsCount++;
		}

		return digitsCount;
	}
	
	
	public void startTask() {
		int number = Constants.INITIAL_VALUE_INT;
		boolean isValid = Constants.INITIAL_VALUE_BOOLEAN;
		int countOfDigits;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Please enter a number to count digits from: ");
			number = Input.readNatural(scanner);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.println("Incorrect number format");
		}
		
		if(!isValid)
			return;
		
		countOfDigits = getDigitsCount(number);
		
		System.out.println("There is " + countOfDigits + " digits in the number.");
		
	}

}
