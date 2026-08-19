package chapter9TheInterfaceAnonymousInnerClass;

import java.util.Scanner;

/*
 * This program demonstrates anonymous inner class
 * */
public class AnonymousClassDemo {

	public static void main(String[] args) {
		

		int num;
		
		
		//Create a scanner object for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//CREATE AN OBJECT THAT implements IntCalculator
		
		IntCalculator square = new IntCalculator() 
		{
			public int calculate(int number) 
			{
				return number * number;
			}
		};
		
		
		//Get a number from the user
		
		System.out.print("Enter a number: ");
		
		num = keyboard.nextInt();
		
		
		//Display the square of the number
		
		
		System.out.println("The square is " + square.calculate(num));
		
	}

}
