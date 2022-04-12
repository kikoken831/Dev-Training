import java.util.Scanner;

import java.util.*;
public class Addition {

  static String t = "*";
  static String b = " ";
  public static void main(String[] args) {

    System.out.println("Please input string to be printed");
    Scanner s = new Scanner(System.in);
    String input = s.nextLine();
    input = input.toLowerCase();
    char [] c = input.toCharArray();
    
    for(char x : c)
    {
      System.out.println(x);
    }


  }
  void stringParser()
  {

  }
}



/*
 * for (int i = 0; i < 4; i++) {
 * System.out.println("****");
 * }
 * System.out.println();
 * for (int i = 1; i < 6; i++) {
 * for (int j = 0; j < i; j++) {
 * System.out.print(t);
 * }
 * System.out.println();
 * }
 * System.out.println();
 * for (int i = 5; i != 0; i--) {
 * for (int j = 0; j < i; j++) {
 * System.out.print(t);
 * }
 * System.out.println();
 * }
 * 
 * }
 * 
 * for (int j = 1, i = 5; i > 0; i--, j += 2) {
 * for (int k = 0; k < i; k++) {
 * System.out.print(b);
 * }
 * for (int k = 0; k < j; k++) {
 * System.out.print(t);
 * }
 * System.out.println();
 * }
 * 
 * System.out.println();
 * 
 * for (int j = 1, i = 9; i > 0; i -= 2, j ++) {
 * for (int k = 0; k < j; k++) {
 * System.out.print(b);
 * }
 * for (int k = 0; k < i; k++) {
 * System.out.print(t);
 * }
 * System.out.println();
 * }
 * }
 */
