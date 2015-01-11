package com.softserveinc.tools;

import java.util.Scanner;

/**
 * Represents a tool that scans data from console.
 * 
 * @author Oksana Senchuk
 *
 */
public class DataScanner {
	/**
	 * Instance of Scanner.
	 */
	private static Scanner scanIn;

	/**
	 * Gets scanner object.
	 * 
	 * @return scanner object.
	 */
	public static Scanner getScanner() {
		if (scanIn == null) {
			scanIn = new Scanner(System.in);
		}
		return scanIn;
	}

	/**
	 * Closes scanner.
	 */
	public static void closeScanner() {
		if (scanIn != null) {
			scanIn.close();
		}
	}
}
