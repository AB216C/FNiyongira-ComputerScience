package chapter23Sorting;

public class Method4MergeSort {
	
	public static void mergeSort(int[] list)
	{
	    /** Continue splitting until the array has one element. */
	    if (list.length > 1)
	    {
	        // Merge sort the first half

	        /** Create the first half of the array. */
	        int[] firstHalf = new int[list.length / 2];

	        /** Copy the first half into a new array. */
	        System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

	        /** Recursively sort the first half. */
	        mergeSort(firstHalf);

	        // Merge sort the second half

	        /** Calculate the size of the second half. */
	        int secondHalfLength = list.length - list.length / 2;

	        /** Create the second half. */
	        int[] secondHalf = new int[secondHalfLength];

	        /** Copy the second half into a new array. */
	        System.arraycopy(list,
	                         list.length / 2,
	                         secondHalf,
	                         0,
	                         secondHalfLength);

	        /** Recursively sort the second half.*/
	        mergeSort(secondHalf);

	        // Merge firstHalf with secondHalf into list

	        /** Combine the two sorted halves into one sorted array. */
	        merge(firstHalf, secondHalf, list);
	    }
	}
	

	public static void main(String[] args) {
		
		int[] numbers = {4,5,45,100,5,-5};
		
		mergeSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}

		
	}
	
	/**
	 * Merge two sorted lists
	 */
	public static void merge(int[] list1, int[] list2, int[] temp)
	{
	    /** Current index in list1 */
	    int current1 = 0;

	    /** Current index in list2 */
	    int current2 = 0;

	    /** Current index in temp */
	    int current3 = 0;

	    /** Compare elements until one list is exhausted. */
	    while (current1 < list1.length && current2 < list2.length)
	    {
	        /** Copy the smaller element into temp. */
	        if (list1[current1] < list2[current2])
	            temp[current3++] = list1[current1++];
	        else
	            temp[current3++] = list2[current2++];
	    }

	    /** Copy any remaining elements from list1. */
	    while (current1 < list1.length)
	        temp[current3++] = list1[current1++];

	    /** Copy any remaining elements from list2. */
	    while (current2 < list2.length)
	        temp[current3++] = list2[current2++];
	}
	
}
