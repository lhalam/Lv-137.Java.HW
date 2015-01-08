package com.softserveinc.edu.vlish;

/**
 * Solution of task 333
 * 
 * @author Володя
 */
public class Task333 {

public static void main(String[] args) {
    int sum = 0;
    int maximum = 0;
    int elem = 0;
    for (int i = 1; i < 10000; i++) {
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
}
