package com.softserveinc.tools;

/**
 * The Stream interface is responsible for data input/output from/into console and resources releasing.
 * 
 * @author Oksana Senchuk
 *
 */
public interface Stream {
	/**
	 * Reads data from console.
	 * 
	 * @return Input data.
	 */
	String readLine();

	/**
	 * Writes data into console.
	 * 
	 * @param x Output data.
	 */
	void writeLine(String x);

	/**
	 * Releases resources.
	 */
	void close();
}
