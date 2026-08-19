package chapter9InheritanceSuperClassOverriding;

import java.util.Scanner;

 /**
  * This program demonstrates the CurvedActivity class,
  * which inherits from the GradedActivity class.
  */

public class CurvedActivityDemo extends GradedActivity {

	public static void main(String[] args) {
		
		double score,				//Raw score
			cPercent;			//Curve percentage
		
		//Create a scanner object for keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get the unadjusted exam score
		
		System.out.println("Enter student raw numeric score: ");
		
		score = keyboard.nextDouble();
		
		
		//Get the curve percentage
		
		
		System.out.println("Enter the curve percentage: ");
		
		cPercent = keyboard.nextDouble();
		
		//Create a curve activity object
		
		CurvedActivity curvedExam = new CurvedActivity(cPercent);
		
		//Set the exam score
		
		curvedExam.setScore(score);
		
		//Display the test results
		
		System.out.println("The raw score is " + curvedExam.getRawScore() + "points");
		
		System.out.println("The curved score is " + curvedExam.getScore());
		
		
		System.out.println("The exam grade is  " + curvedExam.getGrade());		

		
	}

}
