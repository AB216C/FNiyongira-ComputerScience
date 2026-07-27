package chapter6OverloadedMethods;

import java.util.Scanner;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		
		
		double dNum;
		
		int iNum;
		
		
		//Create a Scanner object to receive user input 
		
		Scanner keyboard = new Scanner(System.in);
		
		//Ask user for a double number
		
		
		System.out.println("Enter a double:");
		dNum = keyboard.nextDouble();
		
		
		System.out.println("Enter integer: ");
		iNum = keyboard.nextInt();
		
		
		
		System.out.println("The square of an integer is " + MyMath.square(iNum));
		
		System.out.println("The square of the double is " + MyMath.square(dNum));
		
	}

}
