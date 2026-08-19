package chapter23Sorting;

//This method can not sort negative numbers(-5 was removed from the list)
//Can only sort integer of numbers less than 100

import java.util.ArrayList;

public class Method7StricktBucketSort {
	
	/**
	 * Sorts an array using Bucket Sort.
	 */
	public static <E> void bucketSort(E[] list)
	{
	    int t = 100; // Maximum key value (creates buckets 0 through 100)

	    // Create an array of ArrayLists (buckets)
	    ArrayList<E>[] bucket = (ArrayList<E>[]) new ArrayList[t + 1];

	    // Visit every element in the array
	    for (int i = 0; i < list.length; i++)
	    {
	        // Get the bucket number (works only because elements are Integers)
	        int key = (Integer) list[i];

	        // Create the bucket if it does not exist yet
	        if (bucket[key] == null)
	            bucket[key] = new ArrayList<>();

	        // Place the element into its corresponding bucket
	        bucket[key].add(list[i]);
	    }

	    int k = 0; // Index for placing elements back into the original array

	    // Visit each bucket from smallest key to largest key
	    for (int i = 0; i < bucket.length; i++)
	    {
	        // Skip buckets that contain no elements
	        if (bucket[i] != null)
	        {
	            // Copy every element from the current bucket back into the array
	            for (int j = 0; j < bucket[i].size(); j++)
	            {
	                list[k++] = bucket[i].get(j);
	            }
	        }
	    }
	}


	public static void main(String[] args) {
		
		Integer [] numbers = {4,5,45,100,5,5,34};
		
		bucketSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
	}

}
