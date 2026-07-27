package chapter79SelectionSortandBinarySearchAlgorithm;

import java.lang.reflect.Array;

public class ArrayTools {
	
	//FIRST METHOD ON SELECTION SORT
	
	public static void selectionSort(int[] array) 
	{
		
		int startScan, index, minIndex, minValue;
		
		
		for(startScan = 0; startScan < array.length-1; startScan++) 
		{
			minIndex = startScan;
			minValue = array[startScan];
			
			for (index = startScan + 1; index < array.length; index++) 
			{
				if (array[index]<minValue) 
				{
					minValue = array[index];
					minIndex = index;
				}
			}
			
			
			
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
		
	}
	
	//SECOND METHOD ON BINARY SEARCH
	
	public static int binarySearch(int[] array, int value) 
	{
		
		int first, 			//First array element
			last, 			//Last array element
			middle, 		//Midpoint of search
			position;		//Position of search value
		boolean found;		//Flag
		
		//Set the initial value
		
		first = 0;
		last = array.length -1;
		position = -1;
		found = false;
		
		
		//Search for the value
		while(!found&&first <= last) 
		{
			middle = (first + last)/2;			//Calculate midpoint
			if(array[middle] == value)			// if value is found at mid
			{
				found = true;
				position = middle;
			}
			else if(array[middle]>value) 			//If the value in lower half
			{
				last = middle-1;
			}
			else 
			{
				first = middle + 1;				// if the value in upper half
			}
				
		}
		
		//Return the position of the item or -1 if not found
		return position;
	}
	

}
