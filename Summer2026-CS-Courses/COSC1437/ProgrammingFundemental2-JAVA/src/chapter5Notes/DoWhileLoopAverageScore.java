package chapter5Notes;
import java.util.Scanner;
// This program demonstrates a user-controlled loop

public class DoWhileLoopAverageScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		double score1,
		       score2, 
		       score3;
		
		double average;
		char repeat;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		do 
		{
			
			System.out.println("This program is calculating the average of three scores");
			System.out.println("Enter Score 1");
			score1 = keyboard.nextDouble();
			
			System.out.println("Enter Score 2");
			score2 = keyboard.nextDouble();
			
			System.out.println("Enter Score 3");
			score3 = keyboard.nextDouble();
			

			average = (score1 + score2 + score3 )/3;
			
			
			System.out.println("The average of three scoreas is " + average);
			
			System.out.println("Would you like to test another set of score? ");
			
			System.out.println("Type Y for Yes or N or NO");
			
			input = keyboard.next();
			repeat = input.charAt(0);

			
		}while(repeat == 'Y' || repeat == 'y');
		
	}

}
