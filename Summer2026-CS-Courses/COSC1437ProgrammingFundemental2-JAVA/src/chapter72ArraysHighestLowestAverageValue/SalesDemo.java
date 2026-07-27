package chapter72ArraysHighestLowestAverageValue;

import java.util.Scanner;

 /**
  * This program gathers sales amounts for the week. 
  * It uses the SalesData class to display the total, 
  * average, highest, and lowest sales amounts.
  */

public class SalesDemo {

	public static void main(String[] args) {
		
		final int ONE_WEEK = 7;		//Number of array elements
		
		
		//Create an array to hold the sales data for one week
		
		double[] sales = new double[ONE_WEEK];
		
		
		//get the week's sales figures and store them in the sales array
		
		getValues(sales);
		
		
		//Create SalesData object and initialize it with the sales array
		
		SalesData week = new SalesData(sales);
		
		//Display total, average, highest and lowest
		
		// Sales amount for the week
		
		System.out.println();
		
		
		System.out.printf("The total sales were %,.2f \n",week.getTotal());
		
		System.out.printf("The average sales were %,.2f \n",week.getAverage());
		
		System.out.printf("The highest sale was %,.2f \n",week.getHighest());
		
		System.out.printf("The lowest sale was %,.2f \n",week.getLowest());
		
	}
	
	   /**
	   * The following method accepts an array as its 
	   * argument. The user is asked to enter sales  
	   * amounts for each element.
	   */
	
	private static void getValues(double[] array) 
	{
		//Create a scanner for a keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Enter sales for each of the following days");
		
		
		//Get sales for each days in a week
		
		for (int index=0; index < array.length; index++) 
		{
			System.out.print("Day" + (index + 1) + ":");
			array[index] = keyboard.nextDouble();
		}
		
		
		
	}

}
