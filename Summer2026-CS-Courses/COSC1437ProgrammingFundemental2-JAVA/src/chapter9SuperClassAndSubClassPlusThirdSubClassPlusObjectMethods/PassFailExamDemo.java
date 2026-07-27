package chapter9SuperClassAndSubClassPlusThirdSubClassPlusObjectMethods;

import java.util.Scanner;


/*This class demonstrates the PassFailExam class*/

public class PassFailExamDemo {

	public static void main(String[] args) {
		
		//These are local variables
		
		int questions,			//Hold number of questions
				missed;			//Hold number of questions missed
		double minPassing;		//Hold minimum passing score
		
		
		//create as scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Get the number of question son exam
		
		System.out.println("Enter number of questions on the exam: ");
		
		questions = keyboard.nextInt();
		
		
		System.out.println("Enter number of questions missed: ");
		
		missed = keyboard.nextInt();
		
		
		//Get the minimum passing score
		
		System.out.println("What is the minimum passing Score?  ");
		
		minPassing = keyboard.nextDouble();
		
		
		//Create a PassFailExam object
		
		PassFailExam exam = new PassFailExam(questions, missed, minPassing);
		
		//Display the test result
		
		System.out.println("Each question counts " + exam.getPointsEach() + " points");
		
		System.out.println("Exam score is  " + exam.getScore());
		
		System.out.println("Exam grade is " + exam.getGrade());
		
		
	}

}
