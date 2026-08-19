package chapter18Recursive;

import java.util.Scanner;
/*
 * A program that prompt a user to enter a non-negative number and display factorail for the number
 * */

public class ComputerFactorial {

	public static void main(String[] args) {
		

		int positiveNum;
		
		int result;
		
		//Create a Scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Prompt user to enter a non-negative number
		
		System.out.print("Enter a non-negative number:");
		
		positiveNum = keyboard.nextInt();
		
		

		System.out.println("Factorial of " + positiveNum + " is " + factorial(positiveNum));
		
		
	}
	
	public static long factorial(int n) 
	{
		if(n==0)					//Base case
			return 1;
		else
			return n * factorial(n-1);	//recursive call
	}

}
