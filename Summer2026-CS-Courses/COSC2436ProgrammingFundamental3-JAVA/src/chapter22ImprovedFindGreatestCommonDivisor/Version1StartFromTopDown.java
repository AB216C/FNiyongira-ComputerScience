package chapter22ImprovedFindGreatestCommonDivisor;

//This is also considered Brute-force-Since you will check all possible divisors
//Notice, k is the greatest common divisor we are looking for; 
//K can be more than one but k with the highest value is the one to be returned

import java.util.Scanner;

public class Version1StartFromTopDown {
	
	public static int gcd(int m, int n) {

	    int gcd = 1;

	    for (int k = Math.min(m, n); k >= 1; k--) {		//Downward search

	        if (m % k == 0 && n % k == 0) {
	            gcd = k;
	            break;
	        }
	    }

	    return gcd;
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
