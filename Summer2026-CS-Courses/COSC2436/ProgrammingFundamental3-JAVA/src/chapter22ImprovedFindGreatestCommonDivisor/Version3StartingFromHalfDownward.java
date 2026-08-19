package chapter22ImprovedFindGreatestCommonDivisor;
//Notice, k is the greatest common divisor we are looking for; 
//K can be more than one but k with the highest value is the one to be returned

import java.util.Scanner;

public class Version3StartingFromHalfDownward {
	
	public static int gcd(int m, int n) {

	    int gcd = 1;

	    int smaller = Math.min(m, n);

	    for (int k = smaller / 2; k >= 1; k--) {

	        if (m % k == 0 && n % k == 0) {
	            gcd = k;
	            break;
	        }
	    }

	    // If one number divides the other
	    if (m % smaller == 0)
	        gcd = smaller;

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
