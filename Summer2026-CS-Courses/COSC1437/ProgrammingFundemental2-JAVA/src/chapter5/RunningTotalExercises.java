package chapter5;

import java.util.Scanner;
/*
 Write a for loop that repeats seven times, asking the user to enter a number. 
 The loop should also calculate the sum of the numbers entered.
 * */
public class RunningTotalExercises {

	public static void main(String[] args) {
		
		
		int number;
		
		int sum;
		
		sum=0;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		for (int repetition = 1; repetition<=7; repetition++) 		

		{
			System.out.println("Enter the number" + repetition + ":");
			number = keyboard.nextInt();
			sum += number;

		}
		
		System.out.println("Total number of points is " + sum);
	
	}

}
