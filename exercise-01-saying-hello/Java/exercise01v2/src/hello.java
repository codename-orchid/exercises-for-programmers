/**
 * Exercises for programmers, exercise 01: Saying hello
 * Version 2
 * @author codename-orchid
 */

import java.util.Scanner;

public class hello {
  
  public static void main(String[] args) {
    System.out.print("What is your name? ");
    System.out.printf("Hello, %s, nice to meet you!\n", new Scanner(System.in).nextLine());
  }
  
}
