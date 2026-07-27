package chapter42RelationalOperators;

import java.util.Scanner;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		
		int firstNumber,
			secondNumber;
		
		int sum;
		
		int usersAnswer;
		
		//Create objects to get random numbers
		
		Random randNum = new Random();
		
		
		// Create objects to for users to input answers
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		firstNumber = randNum.nextInt(90);
		secondNumber = randNum.nextInt(90);
		
		
		sum = firstNumber + secondNumber;
		
		
		//Ask users to enter the sum of the number
		
		System.out.println("Enter the sum of the numbers");
		
		
		usersAnswer = keyboard.nextInt();
		
		
		//Check if user is correct
		
		
		if (sum == usersAnswer) 
		{
			System.out.println("That's correct. Congratulations!");
		}
		else
			System.out.println("The sum of the first number " + firstNumber + 
					" and second number " + secondNumber + " is " 
					+ sum + ". Please try again!");
		
		
	}

}
