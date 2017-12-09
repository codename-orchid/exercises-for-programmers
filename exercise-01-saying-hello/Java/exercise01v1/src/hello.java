/**
 * Exercises for programmers, exercise 01: Saying hello
 * Version 1
 * @author codename-orchid
 */

import java.util.Scanner;

public class hello {
  
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String greeting, hello, name, nice, prompt;
    hello = "Hello, ";
    nice = ", nice to meet you!";
    prompt = "What is your name? ";

    System.out.print(prompt);
    name = input.nextLine();
    greeting = hello + name + nice;
    System.out.println(greeting);
  }
  
}
