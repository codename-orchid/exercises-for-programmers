/**
 * Exercises for programmers, exercise 2: Character count
 * Version 2
 * @author codename-orchid
 */

import java.util.Scanner;

public class count {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String userString, prompt;
    prompt = "What is the input string? ";

    System.out.print(prompt);
    userString = input.nextLine();
    while(userString.length() == 0) {
      System.out.println("Please enter a string.\n");
      System.out.print(prompt);
      userString = input.nextLine();
    }
    System.out.printf("%s has %d characters.\n", userString, userString.length());
    
  }
  
}