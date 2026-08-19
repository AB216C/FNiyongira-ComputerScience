package chapter42RelationalOperators;

import java.util.Scanner;

public class AverageScore {

	public static void main(String[] args) {

		
		double score1,
			   score2,
			   score3,
			   average;
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("This program avarages 3 scores");
		
		
		System.out.println("Enter the first score: ");
		
		score1 = keyboard.nextDouble();
		
		System.out.println("Enter the second score: ");
		
		score2 = keyboard.nextDouble();
		
		System.out.println("Enter the third score: ");
		
		score3 = keyboard.nextDouble();
		
		average = (score1 + score2 + score3)/3;
		
		
		if (average >= 90)
			System.out.println("That's a great score. Congratulation");
		else
			System.out.println("Keep playing-stay on track\n");
		
		int hours;
		boolean overTime;
		
		System.out.println("Enter total number of hours worked\n");
		
		hours = keyboard.nextInt();
		
		if (hours > 40) {
			overTime = true;
			System.out.println("He should make big money");
		}
		else
			System.out.println("Invalid number");
		
		//Comparing characters
		
		
		char myLetter;
		
		
		System.out.print("Enter any letter from a-z or A-Z \n ");
		
		myLetter = keyboard.next().charAt(0);
		
		
		if (myLetter == 'D')
			System.out.println("Good bye. Great to see you");
		else
			System.out.println("Please try again");
		
		
		

		
		
		
		
		
		
		
		
		
		
		
			   
			  
			   
	}

}
