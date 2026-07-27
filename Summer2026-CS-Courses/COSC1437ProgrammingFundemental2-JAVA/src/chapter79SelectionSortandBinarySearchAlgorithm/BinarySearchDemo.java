package chapter79SelectionSortandBinarySearchAlgorithm;

import java.util.Scanner;

/**
 * This program demonstrates the binary search method in  
 * the ArrayTools class.
 */

public class BinarySearchDemo {

	public static void main(String[] args) {
		
		
		int result, 				//Result of the search
			searchValue;			//Value to search for
		
		String again;				//Indicate whether to search again
		
		
		//Create a scanner object for keyboard input
		
		
		Scanner keyboard = new Scanner(System.in);
		
	    // The values in the following array are sorted
	    // in ascending order.
	    int numbers[] = {101, 142, 147, 189, 199, 207, 222,
	             234, 289, 296, 310, 319, 388, 394,
	             417, 429, 447, 521, 536, 600};
	    
	    
	    do {
	    	
	    	
	    	//Get the value to search for
	    	System.out.println("Enter value to search for:");
	    	
	    	
	    	searchValue = keyboard.nextInt();
	    	
	    	
	    	//Search for the value
	    	
	    	result = ArrayTools.binarySearch(numbers, searchValue);
	    	
	    	
	    	//Display the value
	    	
	    	if (result == -1) 
	    	{
	    		System.out.println(searchValue + " was not found");
	    	}
	    	else
	    	{
	    		System.out.println(searchValue + " was found at element " +  result);
	    	}
	    	
	    	
	    	//Consume the remaining new line
	    	keyboard.nextLine();
	    	
	    	
	    	//Does the user want to search again
	    	
	    	
	    	System.out.println("Do you want to search again? Y or N");
	    	
	    	again = keyboard.nextLine();
	    	
	    	
	    	
	    	
	    } while (again.charAt(0) == 'Y' || again.charAt(0)=='y');

	}

}
