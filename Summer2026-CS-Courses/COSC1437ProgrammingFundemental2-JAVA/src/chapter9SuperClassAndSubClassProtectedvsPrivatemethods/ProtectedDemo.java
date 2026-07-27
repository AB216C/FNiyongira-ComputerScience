package chapter9SuperClassAndSubClassProtectedvsPrivatemethods;

import java.util.Scanner;

/**
  * This program demonstrates the FinalExam2 class, which
  * inherits from the GradedActivity2 class.
  */


public class ProtectedDemo {

	public static void main(String[] args) {
		
		int questions,			
				missed;
		
		
		
		//Create a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get the number of questions on the final exam
		
		System.out.println("How many questions are on the final exams? ");
		
		questions = keyboard.nextInt();
		
		
		// Get the number of questions the student missed
		
		
		System.out.println("How many questions did the student miss? ");
		
		
		missed = keyboard.nextInt();
		
		
		//Create a final exam object
		
		FinalExam2 fexam = new FinalExam2(questions,missed);
		
		
		//Display the test result
		
		System.out.println("Each question counts  " + fexam.getPointsEach() + " points");
		
		System.out.println("The exam's score is " + fexam.getScore());
		
		System.out.println("The exam's grade is " + fexam.getGrade());
		
		
		
		/*
		 * How many questions are on the final exams? 
			40
			How many questions did the student miss? 
			5
			Each question counts  2.5 points
			The exam's score is 88.0
			The exam's grade is B
			
			Unadjusted numeric store would be 87.5 but was adjusted to 88.0 by adjustScore method 
		 * */

	}

}
