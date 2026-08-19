package chapter5Notes;

import java.util.Scanner;

/*
 The program in Code Listing 5-14 is another test-averaging program. 
 It asks the user for the number of students and the number of test scores per student.
 A nested inner loop asks for all the test scores for one student, iterating once for each test score. 
 The outer loop iterates once for each student. 
 **/

public class NestedLoopsStudentScores {

	public static void main(String[] args) {
		
		
		int numStudents;
		
		int testScoresPerStudent;
		
		
		double score;
		
		
		double totalScore;
		
		
		double average;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Collect number of students
		System.out.println("THIS PROGRAM AVERAGES THE TEST SCORES");
		

		System.out.println("HOW MANY STUDENTS DO YOU HAVE?");
		
		numStudents = keyboard.nextInt();
		
		
		
		
		// Collect total number of test scores per student
		
		System.out.println("HOW MANY TEST SCORES PER STUDENT");
		
		testScoresPerStudent = keyboard.nextInt();
		

		

				// Record scores
		//Calculate average of each students
		
		
		for (int student=1; student<= numStudents; student++) 
		{
			totalScore = 0;
		
			for (int test=1; test<=testScoresPerStudent; test++)
			{
				
				System.out.println("Enter student " + student + " test score number" + test + ": ");
				score = keyboard.nextDouble();
				totalScore += score;

			}
			average = totalScore/testScoresPerStudent;
			System.out.println("The average for student "+ student + " is " + average);
		}
		
	}

}
