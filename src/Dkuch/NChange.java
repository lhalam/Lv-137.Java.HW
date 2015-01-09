package Dkuch;

/**
 * Class used to swap the first and the last digits of the number.
 * 
 * @author Kucheryavenko Dmytro
 * 
 */
public class NChange {
	/**
	 * Method swaps the first and the last digits of the number, by means of
	 * turning int variable to String, swapping first and last symbols and
	 * returning the meaning to int type.
	 * 
	 * @param num
	 *            The number to be changed.
	 * @return The number with swapped first and last digits.
	 */
	static int change(Integer num) {
		String str;
		String result;
		Character firstn;
		Character lastn;

		str = num.toString();
		firstn = str.charAt(0);
		lastn = str.charAt(str.length() - 1);
		try {
			result = lastn.toString() + str.subSequence(1, str.length() - 1)
					+ firstn.toString();
			num = Integer.parseInt(result);
		} catch (IndexOutOfBoundsException exc) {
			System.out.println("The number must have more than one digit");
			return 0;
		}
		return num;

	}

}