package chapter23Sorting;

public class Method2InsertionSort {
	
	/**
	 * Sorts an array using Insertion Sort.
	 *
	 * @param list the array to sort
	 */
	public static void insertionSort(int[] list)
	{
	    /** Start from the second element. */
	    for (int i = 1; i < list.length; i++)
	    {
	        /** Save the current element. */
	        int currentElement = list[i];

	        /** Index for scanning left. */
	        int k;

	        /** Shift larger elements to the right. */
	        for (k = i - 1; k >= 0 && list[k] > currentElement; k--)
	        {
	            list[k + 1] = list[k];
	        }

	        /** Insert the current element. */
	        list[k + 1] = currentElement;
	    }
	}

	public static void main(String[] args) {
		
		int[] numbers = {4,5,45,100,5,-5};
		
		insertionSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
		
	}
	
}
