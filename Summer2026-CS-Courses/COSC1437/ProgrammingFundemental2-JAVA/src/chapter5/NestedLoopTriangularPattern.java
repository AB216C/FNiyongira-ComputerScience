package chapter5;

import java.util.Scanner;

public class NestedLoopTriangularPattern {

	public static void main(String[] args) {
		

		
		final int maxRows = 7;
		
		int col;
		
		int maxWidth;
		
		
		Scanner keyboard = new Scanner(System.in);	
	
		

		
		for(int row = 0; row < maxRows; row ++) 
		{
			for(col = 0; col<(row+2); col ++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
