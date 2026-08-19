package chapter71Arrays;

import java.util.Scanner;

/*
 * This method demonstrates, passing an array to a method as an argument
 * */

public class Array2PassArrayAsArgumentsFromUsers {

	public static void main(String[] args) {
		
		//Declare array size variable
		 int  arraySize;
		 
		 //Create scanner object
		 
		 Scanner keyboard = new Scanner(System.in);
		 
		 //Get the array size from users
		 
		 System.out.println("How many students you want to record grades for?");
		
		 arraySize = keyboard.nextInt();
		
		//Create an array
		
		int[] grades = new int[arraySize];
		
		//Get values
		
		System.out.println("Get values from users");
		
		getValue(grades);
		
		//Show values
		
		System.out.println("The following are the entered grades from students");
		
		showGrades(grades);
		
	}
	
	//The user is asked to enter the value of each element
	
	public static void getValue(int[] grades) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a serie of " + grades.length + " grades");
		
		for (int index = 0; index< grades.length; index++) 
		{
			System.out.print("Enter value " + (index+1) + ":");
			grades[index] = keyboard.nextInt();
		}
	}
	
	//Now created array can be passed on a showGrades method so its elements can be displayed one by one
	
	public static void showGrades(int[] grades) 
	{
		for (int index=0; index < grades.length; index++) 
		{
			System.out.print(grades[index] + " ");
		}

	}

}
