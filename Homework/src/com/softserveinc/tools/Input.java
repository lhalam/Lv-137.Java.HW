package com.softserveinc.tools;

import java.util.Scanner;

public class Input {
	/**
	 * Read natural number
	 * 
	 * @param scanner
	 *            Text scanner
	 * @return Natural number
	 * @throws NumberFormatException
	 *             if scanned line is not valid natural number
	 */
	public static int readNatural(Scanner scanner) throws NumberFormatException {
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
	public static boolean isNatural(long num) {
		if (num > 0) {
			return true;
		}
		return false;
	}
}
