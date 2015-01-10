package Dkuch;

import static java.lang.Math.sqrt;

/**
 * Class used for finding four variables that can represent a natural number as
 * the sum of it`s squares(Lagrandge Theorem).
 * 
 * @author Kucheryavenko Dmytro
 * 
 */
public class LagT {
	/**
	 * {@value homework.LagT#var}
	 */
	private static int var = 0;

	/**
	 * Method uses cycle to decompose the natural number into it`s squares and
	 * saves results into the array. It also uses recursion if result is
	 * incorrect.
	 * 
	 * @param n
	 *            The natural number to be decomposed.
	 */
	static void findNums(int n) {
		int number = n;
		int counter = 0;
		int xAmount = 4;
		int controlVal = 0;
		int result[] = new int[xAmount];

		while (counter < xAmount) {
			if (counter == 0) {
				result[counter] = (int) sqrt(n) - var;
				n = n - (int) (sqrt(n) - var) * ((int) sqrt(n) - var);
			} else {
				result[counter] = (int) sqrt(n);
				n = n - (int) sqrt(n) * (int) sqrt(n);
			}
			controlVal = controlVal + result[counter] * result[counter];
			counter++;
		}
		if (number != controlVal) {
			var++;
			findNums(number);
		} else
			for (int i = 0; i < xAmount; i++) {
				System.out.print("x" + i + "=" + result[i] + " ");
			}
	}
}