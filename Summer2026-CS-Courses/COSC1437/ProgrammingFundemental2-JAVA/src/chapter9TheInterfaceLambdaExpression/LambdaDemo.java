package chapter9TheInterfaceLambdaExpression;

import java.util.Scanner;

/*This program demonstrate a simple Lambda expression*/

public class LambdaDemo {

	public static void main(String[] args) {
		
		
		int num;
		
		
		//Create a scanner object for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Create an object that implements IntCalculator
		
		
		IntCalculator square = x -> x * x;
		

		//Get a number from a user
		
		
		System.out.print("Enter an integer number: ");
		
		num = keyboard.nextInt();
		
		
		//Display the square of a number
		
		System.out.println("Square of " + num + " is " + square.calculate(num) );
		
		
		
	}

}
