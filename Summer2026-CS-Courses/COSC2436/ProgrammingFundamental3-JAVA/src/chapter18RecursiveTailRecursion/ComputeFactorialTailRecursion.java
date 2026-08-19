package chapter18RecursiveTailRecursion;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {
	
	
	public static long factorial(int n) 
	{
		return factorial(n,1);				//Call auxiliary method
	}
	
	
	/* Auxiliary tail recursive method for factorial */

	private static long factorial(int n, int result) 
	{
		if (n==0)
			return result;
		else
			return factorial(n-1, n*result);		//Recursive call
	}

	public static void main(String[] args) {
		

		//Create scanner
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a non-negative number: ");
		
		int n = input.nextInt();
		
		
		//Display factorial
		
		System.out.println("Factorial of " + n + " is " + factorial(n));
		
	}

}
