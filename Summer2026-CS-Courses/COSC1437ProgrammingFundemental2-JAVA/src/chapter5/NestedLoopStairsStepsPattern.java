package chapter5;

import java.util.Scanner;

//Build a stare like

public class NestedLoopStairsStepsPattern {

	public static void main(String[] args) {
		
		final int maxSteps = 7;
		

		
	//This is a step option 1
		
		for(int row = 0; row<maxSteps; row++) 
		{
			for(int col = 0; col<row; col ++) 
			{
				System.out.print(" ");
			}
			System.out.println("#");
		}	
	}
}
