/**
 * Exercises for programmers, exercise 3: Printing quotes
 * Version 1
 * @author codename-orchid
 */

import java.util.Scanner;

public class quote {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String quote, author;

    System.out.print("What is the quote? ");
    quote = input.nextLine();
    System.out.print("Who said it? ");
    author = input.nextLine();
    System.out.println(author + " says, \"" + quote + "\"");
    
  }
  
}