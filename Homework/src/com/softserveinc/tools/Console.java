package com.softserveinc.tools;

import java.util.Scanner;

/**
 * Represents a tool that read/write data from/into console.
 * 
 * @author Oksana Senchuk
 *
 */
public class Console implements Stream {

	/**
	 * Reads data from console.
	 * 
	 * @return Input data as string.
	 */
	@Override
	public String readLine() {
		Scanner scanIn = DataScanner.getScanner();
		return scanIn.nextLine();
	}

	/**
	 * Writes data into console.
	 * 
	 */
	@Override
	public void writeLine(String x) {
		System.out.println(x);
	}

	/**
	 * Closes scanner object.
	 */
	@Override
	public void close() {
		DataScanner.closeScanner();
	}

}
