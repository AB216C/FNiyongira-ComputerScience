package chapter22ImprovedFindingPrimeNumbers;

import java.util.Scanner;

public class TestBothClasses {

	public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is a prime number: ");
        int n = input.nextInt();

        System.out.println("\nBrute Force:");
        FindPrimeNumbersBruteForce2.printPrimeNumbers(n);

        System.out.println("\n\nEfficient Version:");
        FindPrimeNumbersMoreEfficient.printPrimeNumbers(n);

        input.close();
		
	}

}
