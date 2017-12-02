/**
 * Exercises for programmers, exercise 01: Saying hello
 * @author codename-orchid
 */

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greeting;
        String hello = "Hello, ";
        String name;
        String nice = ", nice to meet you!";        
        String prompt = "What is your name? ";
        
        System.out.print(prompt);        
        name = input.nextLine();
        greeting = hello + name + nice;
        System.out.println(greeting);
    }
    
}
