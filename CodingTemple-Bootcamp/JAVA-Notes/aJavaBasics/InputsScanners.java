package aJavaBasics;

/*
//SCANNERS

How to Use the Scanner
Import the Scanner Class: Before using the Scanner, you need to import it at the beginning of your Java program:
import java.util.Scanner;
Create a Scanner Object: You create an instance of the Scanner class by passing the input source. For keyboard input, use System.in:
Scanner scanner = new Scanner(System.in);
Reading Input: The Scanner class provides several methods to read different types of input:
nextLine(): Reads a complete line of text.
nextInt(): Reads the next integer.
nextDouble(): Reads the next double.
next(): Reads the next word (delimited by whitespace).
Close the Scanner: It's a good practice to close the Scanner object when you're done using it to free up system resources:
scanner.close();
*/

import java.util.Scanner;

public class InputsScanners {
    public static void main(String[] args) {
        //CREATE Scanner Object for Keyword Input

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

//        scanner.nextLine();     //Without this line, the function will still execute the next line because the code with the next line in it was executed first

        System.out.print("What's your age? ");
        int age = scanner.nextInt();


        System.out.println("Your name is " + name);
        System.out.println("Hello "+name+", you're " + age + " years old");

        scanner.close();
    }

}
