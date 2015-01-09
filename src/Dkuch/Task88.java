package Dkuch;

import java.io.*;

/**
 * Class used to demonstrate work of class NChange and class AddOne.
 * 
 * @author Kucheryavenko Dmytro
 * 
 */
public class Task88 {
	/**
	 * This method used to get number from the command line and to pass it`s
	 * value to the methods change() and add1().
	 * 
	 * @param args
	 *            Is not used.
	 * @throws IOException
	 *             Input error exception.
	 * @see IOException
	 */
	public static void main(String[] args) throws IOException {
		int number;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, input the natural number");
		str = br.readLine();
		try {
			number = Integer.parseInt(str);
		} catch (NumberFormatException exc) {
			System.out.println("Invalid format");
			number = 0;
		}

		System.out.println(NChange.change(number));
		System.out.println(AddOne.add1(number));

	}
}
