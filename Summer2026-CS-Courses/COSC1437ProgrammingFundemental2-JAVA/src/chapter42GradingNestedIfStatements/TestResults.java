package chapter42GradingNestedIfStatements;

import java.util.Scanner;

public class TestResults {

	public static void main(String[] args) {
		
		//Create object to enter score
		
		Scanner keyboard = new Scanner(System.in);
		
		//CREATE OBJECT FROM THE TestGrade class
		
		int testScore;
//		char testGrade;
		
		
		//Ask a user to enter test Score
		
		
		System.out.println("Enter your score");
		
		testScore = keyboard.nextInt();
		
		
		TestGrade entry = new TestGrade(testScore);  //Notice using testScore in a created Test Grade object from Test Grade class,initialize the object faster and the score is used right away
		
		
		System.out.println("Your grade is " + entry.getLetterGrade());
		
	
		
	}

}
