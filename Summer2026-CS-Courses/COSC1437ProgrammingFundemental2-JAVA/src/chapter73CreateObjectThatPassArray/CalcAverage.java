package chapter73CreateObjectThatPassArray;

import java.util.Scanner;


/*
 * shows the program that Dr. LaClaire will use to calculate a student’s adjusted average. The program gets a series of test scores, 
 * stores those scores in an array, and uses an instance of the Grader class to calculate the average.
 * */

public class CalcAverage {

	public static void main(String[] args) {
		
		
		int numScores;			//To hold number of sschores
		
		//Create a scanner object for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get the number of test scores
		
		System.out.println("How many test scores do you have?");
		
		
		numScores = keyboard.nextInt();
		
		
		//Create an array to hold testScORES
		
		
		double[] scores = new double[numScores];
		
		
		//Get test score and store them in the scores array
		
		
		for (int index=0; index<scores.length; index++) 
		{
			System.out.print("Enter score" + (index+1) + ":");
			scores[index]=keyboard.nextDouble();
		}
		
		
		//Create a grader object and pass scores array as an argument to the constructor
		
		
		Grader myGrader = new Grader(scores);
		
		
		//Display adjusted score
		
		System.out.println("My adjusted score is " + myGrader.getAverageScore());
			
		
		//Display the lowest score
		
		
		System.out.println("Your lowest score was " + myGrader.getLowestScore());
	
		
	}

}
