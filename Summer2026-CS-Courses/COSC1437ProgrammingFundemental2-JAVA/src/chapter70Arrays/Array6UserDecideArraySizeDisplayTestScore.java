package chapter70Arrays;

import java.util.Scanner;


/*
 * This program demonstrates how the user may specify the array's size, create array from the array size, 
 * and add scores or grades in the array one by one, and display the resulting array in the end;
 * */

public class Array6UserDecideArraySizeDisplayTestScore {

	public static void main(String[] args) {
		
		
		int size;		//This will hold the size of the array
		
		int[] scores;		//This will hold an array of scores; reference variable
		
		
		
		
		//Create scanner object for  a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		//Ask a user to input the size of the array(How big does the array needs to be?)
		
		System.out.println("Enter how big you want to size of the array to be: ");
		
		size = keyboard.nextInt();
		
		//Create the array object and initialize it with size from the user
		
		scores = new int[size]; 
		
		
		//Enter a score one by one based on the specified array's size
		
		
		for (int index = 0; index < scores.length; index++) 
		{
			System.out.println("Enter score" + (index + 1) + ":");
			scores[index] = keyboard.nextInt(); 
		}
		

		
		for (int score:scores) 
		{
			
			System.out.println("The secore you entered is " + score);
		}
		
		
		System.out.println("======================================");
		
		//Another method to print this
		
		
		for (int index = 0; index < scores.length; index++) 
		{
			System.out.println("The score oyu entered is " + scores[index]);
		}
		
	}

}
