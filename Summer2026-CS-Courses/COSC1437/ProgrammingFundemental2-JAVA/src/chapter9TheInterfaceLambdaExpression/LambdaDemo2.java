package chapter9TheInterfaceLambdaExpression;

import java.util.Scanner;

 /*
   * This program demonstrates a lambda expression
   * that uses a final local variable.
  */


public class LambdaDemo2 {

	public static void main(String[] args) {
		
		final int factor = 10;
		
		
		int num;
		
		
		//Create a scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Create an object that implement InCalculator
		
		IntCalculator multiplier = x -> x * factor;
		
		
		//Get a number from the user
		
		System.out.print("Enter a number: ");
		
		num = keyboard.nextInt();
		
		
		
		//Display the result of a number multiplied by 10
		
		System.out.println("Multipliedd by 10, that number is " + multiplier.calculate(num));

		
	}

}
