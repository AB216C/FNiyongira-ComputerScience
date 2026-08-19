package chapter5Notes;
import java.util.Scanner;

public class ForLoopInputControlledSquaredNum {

	public static void main(String[] args) {
		
		int num;
		
		int maxNum;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		//Create a table of squared numbers
		
		
		System.out.println("How high would you like to go?");
		
		maxNum = keyboard.nextInt();
		
		System.out.println("Number  squared");
		
		for (num=1; num<=maxNum; num++) 
			
		{	
			System.out.println(num + "\t\t" + num*num);
		}
	}

}
