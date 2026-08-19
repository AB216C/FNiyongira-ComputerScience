package chapter22ImprovedFindGreatestCommonDivisor;


import java.util.Scanner;

public class Version4BestUsingEuclidAlgorithmWhileLoop {
	
	public static int gcd(int a, int b)
	{
	    while (b != 0)
	    {
	        int remainder = a % b;
	        a = b;
	        b = remainder;
	    }

	    return a;
	}

	public static void main(String[] args) {
		
		int m;
		
		int n;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Finding the GCD-Greatest Common Divisor");
		
		
		System.out.print("Enter the first number:");
		
		m = input.nextInt();
		
		System.out.print("Enter the first number:");
		
		n = input.nextInt();
		
		System.out.println("GCD for " + m + " and " + n + " is "+ gcd(m,n));
	}

}
