package com.softserveinc.basic_programming_techniques.nested_loops;

import com.softserveinc.homework.Task;

/**
 * task 322
 * 
 * @author Володя
 */
public class Task322 extends Task {

  public static final int LIM = 10000;

  public Task322() {

  }
  
/**
 * max sum of Dividers for number for 1 to LIM
 */
  public static void maxDiv() {
    int sum = 0;
    int maximum = 0;
    int elem = 0;
    for (int i = 1; i < LIM; i++) {
      for (int a = 1; a < i; a++) {
        if (i % a == 0) {
          sum = sum + a;
          if (maximum < sum) {
            maximum = sum;
            elem = i;
            sum = 0;
          }
        }
      }
    }
    System.out.println(elem);
  }

@Override
  public void startTask() {
    maxDiv();
  }
}
