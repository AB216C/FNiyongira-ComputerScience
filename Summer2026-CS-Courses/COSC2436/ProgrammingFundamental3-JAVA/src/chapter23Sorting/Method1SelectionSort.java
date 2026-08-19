package chapter23Sorting;
import java.util.Scanner;
public class Method1SelectionSort {
	
	// Method that sorts an array of doubles using the Selection Sort algorithm
	public static void selectionSort(double[] list)
	{
	    // Repeat for every position in the array except the last one
	    for (int i = 0; i < list.length - 1; i++)
	    {
	        // Assume the first element in the unsorted portion is the minimum
	        double currentMin = list[i];

	        // Store the index of the current minimum value
	        int currentMinIndex = i;

	        // Search the remaining unsorted portion of the array
	        // to find the actual smallest value
	        for (int j = i + 1; j < list.length; j++)
	        {
	            // If a smaller value is found
	            if (currentMin > list[j])
	            {
	                // Update the minimum value
	                currentMin = list[j];

	                // Remember where the minimum value is located
	                currentMinIndex = j;
	            }
	        }

	        // If the smallest value is not already in the correct position
	        if (currentMinIndex != i)
	        {
	            // Move the original value at position i
	            // into the minimum value's old position
	            list[currentMinIndex] = list[i];

	            // Place the minimum value into its correct sorted position
	            list[i] = currentMin;
	        }
	    }
	}

	public static void main(String[] args) {
		
		
		double[] numbers = {4,5,45,100,5,-5};
		
		selectionSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
		
	

		
		

	}

}
