package chapter76ReturnArray;

 /**
  * This program demonstrates how a reference to an
  * array can be returned from a method.
  */

import java.util.Scanner;

public class ReturnArray {

	public static void main(String[] args) {
		

		double [] values;
		
		int size;			//Hold the size of the array
		
		
		//Create a scanner object
		
		Scanner keyboard = new Scanner(System.in);

		
		//Enter the size of the array
		
		System.out.println("How big do you want the array to be?");
		
		size = keyboard.nextInt();
		
		
		//let values reference the array returned from getArrayMethod
		
		
		
		values = getArray(size);
		
		
		
		//Display the values in the array
		
		System.out.println("Entered array is as follows:");
		
		for (double value : values) 
		{
			System.out.print(value + " ");
		}
		
	
		
		
	}
	
	
	public static double[] getArray( int size) 
	{
		
		//Create array of specified size
		
		double[] array = new double[size];
		
		//Create a scanner object for a keyboard input
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter a series of " + array.length + " numbers");
		
		
		for (int index=0; index<array.length; index++) 
		{
			System.out.println("Enter number " + (index + 1) + ":");
			array[index] = keyboard.nextDouble();
		}
		
		return array;

	}


}
