package chapter5;

import java.util.Scanner;

public class NestedLoopRectanglePatternUserControlled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int col;
		
		int row;
		
		
		int maxLength;
		int maxWidth;
		
		
		Scanner keyboard = new Scanner(System.in);	
		
		
		System.out.println("Enter total number of rows you wish to use: ");
		
		
		maxLength = keyboard.nextInt();		
		
		
		System.out.println("Enter total number of columns you wish to use: ");
		
		
		maxWidth = keyboard.nextInt();
		

		
		for(row = 0; row < maxLength; row++) 
		{
			for(col = 0; col<maxWidth; col++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		
	}

}
