package com.softserveinc.basic_programming_techniques.simple_loops;

import java.util.Scanner;

import com.softservinc.homework.Task;



/**
 * Task 88 a),b)
 * 
 * @author Володя
 */

public class Task88 extends Task {
  public static final char CHARNUM = '3';
 
  public Task88() {
          
  }
  /**
   * 
   * @param numb Entered number
   * @return Is this number natural or not 
   */
  public static boolean isValid(int numb) {
    if (numb > 0) {
      return true;
    } else {
      return false;
    }
  }
    
  /**
   * 
   * @return number from keyboard
   */
  public static int getNum() {
    int num;
    Scanner sc = new Scanner(System.in);
    num = sc.nextInt();
    return num;
  }
  
  /**
   * 
   * @param number
   * @return sqr(number)
   */
  public static int sqr(int number) {
    int result = number * number;
    return result;
  }
 
/**
 * 
 * @param masive
 *            array of chars which is a String (entered number)
 * @return Consist this array with 3?
 */
  public static boolean consistCharnum(char[] masive) {
    boolean cons = false;
    for (int i = 0; i < masive.length; i++) {
      if (masive[i] == CHARNUM) {
        cons = true;
      }
    }
    return cons;
  }

/**
 * 
 * @param snum
 *     The number entered and converted in String
 * @return reverse (snum).
 */
  public static StringBuilder reverseNumber(String snum) {
    StringBuilder sb = new StringBuilder();
    sb.append(snum);
    sb.reverse();
    return sb;
  }

  @Override
public void startTask() {
    int num = getNum();
    
    if (!isValid(num)) {
      return;
    }
    
    int sqrnum = sqr(num);
    String ssqrnum = String.valueOf(sqrnum);
    String snum = String.valueOf(num);
    StringBuilder sb = new StringBuilder();
    sb = reverseNumber(snum);
    System.out.println(sb);
    char[] arr = ssqrnum.toCharArray();
    boolean cst = consistCharnum(arr);
    if (cst == true) {
      System.out.println("The sqr of " + snum + " consist" + " " + CHARNUM);
    } else {
      System.out.println("The sqr of " + snum + " doesn't consist " + " " + CHARNUM);
    }
  }
}


