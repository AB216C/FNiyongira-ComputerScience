package chapter42RelationalOperators;

import java.util.Scanner;

public class DivisionPractice {

	public static void main(String[] args) {
		int number1, number2;
		double quotient;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter the first integer");
		
		number1 = keyboard.nextInt();
		
		
		System.out.println("Enter the second integer");
		
		number2 = keyboard.nextInt();
		
		
		//Division by zero rules
		if(number2==0) {
			System.out.println("Division by zero is not possible");
			System.out.println("Please run the program again");
			System.out.println("Enter a number other than zero");
		}
		else {
			quotient = (double) (number1/number2);
			System.out.println("The quotient of " + number1);
			System.out.println("divided by " + number2);
			System.out.println("is " + quotient);
			
		}
		
		
	}

}
