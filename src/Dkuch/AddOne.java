package Dkuch;

/**
 * Class used to add "1" to the begin and to the end of the number.
 * 
 * @author Kucheryavenko Dmytro
 */
public class AddOne {
	/**
	 * Method turns int variable to String, adds "1" to the first and last
	 * position and turns it back to int type.
	 * 
	 * @param num
	 *            The number to be changed.
	 * @return The number that has "1" in it`s first and last digits.
	 */
	static int add1(Integer num) {
		String str;
		String result;

		str = num.toString();
		result = "1" + str + "1";
		num = Integer.parseInt(result);
		return num;
	}
}

