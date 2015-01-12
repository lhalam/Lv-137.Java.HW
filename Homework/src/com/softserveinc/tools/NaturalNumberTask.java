package com.softserveinc.tools;

import java.util.Scanner;

import com.softserveinc.homework.Task;

/**
 * Represent common behaviour for tasks
 * 
 * @author Oleg Pavlish
 *
 */
public abstract class NaturalNumberTask extends Task {
	/**
	 * Represent validity of input parameters
	 */
	protected boolean isValid = false;

	/**
	 * Read natural number
	 * 
	 * @param scanner
	 *            Text scanner
	 * @return Natural number
	 * @throws NumberFormatException
	 *             if scanned line is not valid natural number
	 */
	protected int readNatural(Scanner scanner) throws NumberFormatException {
		int ret = Integer.parseUnsignedInt(scanner.nextLine());
		if (!isNatural(ret)) {
			throw new NumberFormatException();
		}
		return ret;
	}

	/**
	 * Check if given decimal number is positive
	 * 
	 * @param num
	 *            Decimal number to check
	 * @return true if parameter is natural number
	 */
	protected boolean isNatural(long num) {
		if (num > 0) {
			return true;
		}
		return false;
	}
}