package chapter9InheritanceSuperClassOverriding;

import java.util.Scanner;

 /**
 * This program demonstrates the FinalExam class, which
  * inherits from the GradedActivity class. 
  */

public class FinalExamDemo {

	public static void main(String[] args) {
		

		
		int questions,		//Number of questions
		
		      missed;		//Number of questions missed
		
		
		
		//Create a scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get the number of questions on the final exam
		
		System.out.println("How many questions are on the final exams? ");
		
		questions = keyboard.nextInt();
		
		
		// Get the number of questions the student missed
		
		
		System.out.println("How many questions did the student miss? ");
		
		
		missed = keyboard.nextInt();
		
		
		//Create a final exam object
		
		FinalExam fexam = new FinalExam(questions,missed);
		
		
		//Display the test result
		
		System.out.println("Each question counts  " + fexam.getPointsEach() + " points");
		
		System.out.println("The exam's score is " + fexam.getScore());
		
		System.out.println("The exam's grade is " + fexam.getGrade());
		
		
	}

}
