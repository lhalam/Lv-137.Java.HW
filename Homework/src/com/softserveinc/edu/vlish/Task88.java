package com.softserveinc.edu.vlish;

import java.util.Scanner;

/**
 * Solution of Task 88 a),b).
 * 
 * @author Володя
 * 
 */

public class Task88 {
	/**
	 * 
	 * @param snum
	 *            The number entered and converted in String
	 * @return reverse (snum).
	 */
	public static StringBuilder ReverseNumber(String snum) {
		StringBuilder sb = new StringBuilder();
		sb.append(snum);
		sb.reverse();
		return sb;
	}

	/**
	 * 
	 * @param masive
	 *            array of chars which is a String( entered number)
	 * @return Consist this array with 3?
	 */
	public static boolean Consist3(char[] masive) {
		boolean cons = false;
		for (int i = 0; i < masive.length; i++) {
			if (masive[i] == '3') {
				cons = true;
			}
		}
		return cons;
	}
	/**
	 * 
	 * @param number
	 * @return sqr(number)
	 */
	public static int sqr(int number){
		int result = number * number;
		return result;
		}
	
	public static void main(String[] args){{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sqrnum = sqr(num);
		String ssqrnum = String.valueOf(sqrnum);
		String snum = String.valueOf(num);
		StringBuilder RevNum = ReverseNumber(snum);
		System.out.println(RevNum);
		char[] arr = ssqrnum.toCharArray();
		boolean cst = Consist3(arr);
		if (cst == true){
			System.out.println("The sqr of " + snum + " consist 3!");
		}
		else{
			System.out.println("The sqr of " + snum + " doesn't consist 3!");
		}
		
		
	}

}
}
