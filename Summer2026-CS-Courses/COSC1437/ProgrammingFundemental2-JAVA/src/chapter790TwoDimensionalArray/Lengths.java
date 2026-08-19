package chapter790TwoDimensionalArray;

 /**
  * This program uses the length fields of a 2D array
  * to display the number of rows and the number of 
  * columns in each row.
  */

public class Lengths {

	public static void main(String[] args) {

		//Declare 2D array with 3 ROWS AND 4 COLUMNS
		
		int [][] numbers = {{1,2,3, 4},
		        			{5,6,7,8},
		        			{9,10,11,12}};

		
		//Display number of rows
		
		System.out.println("The number of rows is " + numbers.length);
		
		
		//Disply the number of columns in each row
		
		
		for (int index = 0; index<numbers.length; index++) 
		{
			System.out.println("Number of columns in row " + index + " is " + numbers[index].length);
		}

		
	}

}
