package com.softservinc.tools;

import java.util.Scanner;

public class DataScanner {
	private static Scanner scanIn;

	public static Scanner getScanner() {
		if (scanIn == null) {
			scanIn = new Scanner(System.in);
		}
		return scanIn;
	}

	public static void closeScanner() {
		if (scanIn != null) {
			scanIn.close();
		}
	}
}
