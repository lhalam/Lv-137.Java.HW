package package1;

import java.util.Scanner;

/**
     * Class which consist of solutions of 88 a),b).
    * @author Volodia
    */
public class First {

    /**
    * main method
    * @param args
    */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int sqnum = num * num;
    StringBuilder sb = new StringBuilder();
    String snum = String.valueOf(num);
    sb.append(snum);
    sb.reverse();
    
    
    String stnum = String.valueOf(sqnum);
    char[] mas = stnum.toCharArray();
    boolean cons = false;

    for (int i = 0; i < stnum.length(); i++) {
      if (mas[i] == '3') {
        cons = true;
      }
    }

    if (cons == true) {
      System.out.println("цифра 3 присутня у записі " + num + "^2");
    } else {
      System.out.println("цифра 3 відсутня у записі " + num + "^2");
    }
    System.out.println(sb);
  }
}
