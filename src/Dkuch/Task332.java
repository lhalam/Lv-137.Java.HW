package Dkuch;

import java.io.*;

/**
 * Class used to demonstrate work of class LagT.
 * 
 * @author Kycheryavenko Dmytro
 * 
 */
public class Task332 {
	/**
	 * This method used to get number from the command line and to pass it`s
	 * value to the method findNums().
	 * 
	 * @param args
	 *            Is not used.
	 * @throws IOException
	 *             Input error exception.
	 * @see IOException
	 */
	public static void main(String[] args) throws IOException {
		int num;
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, input the natural number");
		str = br.readLine();
		try {
			num = Integer.parseInt(str);
		} catch (NumberFormatException exc) {
			System.out.println("Invalid format");
			num = 0;
		}

		LagT.findNums(num);
	}
}
