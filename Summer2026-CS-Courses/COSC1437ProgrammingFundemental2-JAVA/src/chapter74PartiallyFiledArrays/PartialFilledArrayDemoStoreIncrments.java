package chapter74PartiallyFiledArrays;

import java.util.Scanner;

public class PartialFilledArrayDemoStoreIncrments {

	public static void main(String[] args) {
		
		

		final int ARRAY_SIZE = 100;        // To store 
		int number;
		
		
	    int[] array = new int[ARRAY_SIZE];
	    int count = 0;			//NOTICE, count is a pointer: Direct which index a new number is added to
	    						// Since count++, once the first input is entered, increment allow the next input to be entered
	    
	    
	    
	    Scanner keyboard = new Scanner (System.in);
	    
	    
	    System.out.println("Enter a number or -1 to quit:");
	    number = keyboard.nextInt();

	     

	    while (number != -1 & count < array.length)				//Count or index here should be lower than array.length to prevent index out of bound errors
		  {
			array[count] = number;
			count ++;											//Confirming that the next input should be stored in the next index
		    System.out.println("Enter a number or -1 to quit: ");
		   	number = keyboard.nextInt();
		  }


	    //index<count was used instead of index < array.length because THIS IS PARTIALLY FILLED ARRAY
	    //Only count knows total number of positions in the array filled up by user input and the empty position
	    //We want to display only filled up position
	    

	    System.out.println("Users were able to fill positions in the array with numbers as follows:");
		
	    for (int index=0; index < count ; index++) 			
		System.out.print(array[index] + " ");

		
	    System.out.println("You can also print filled and unfilled positions as follows:");
	    for (int index=0; index < array.length; index++) 			
		System.out.print(array[index] + " ");					//Notice the unfilled positions are represented by zeros
	}

}
