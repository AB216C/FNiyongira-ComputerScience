package chapter9InheritanceSuperClassOverriding;

import java.util.Scanner;

/*This program demonstrate the grade activity class*/

public class GradeDemo {

	public static void main(String[] args) {
		
		double testScore;
		
		
		//Create a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Create a grade activity object
		
		GradedActivity grade = new GradedActivity();
		
		
		//Get a test score from the user
		
		
		System.out.println("Enter a numeric test score: ");
		
		testScore = keyboard.nextDouble();
		
		
		//Set a grade activity object score
		
		grade.setScore(testScore);
		
		
		//Display a letter grade for that score
		
		System.out.println("THe grade for that test was " + grade.getGrade());
		
		
		
	}

}
