package chapter23Sorting;
import java.util.ArrayList;
//This method is able to sort any number

public class Method7GeneralBucketSort {
	
    /**
     * Sorts an Integer array using Bucket Sort.
     */
    public static void bucketSort(Integer[] list)
    {
        // Return if the array is empty
        if (list == null || list.length == 0)
            return;

        // Assume the first element is both the minimum and maximum
        int min = list[0];
        int max = list[0];

        // Find the minimum and maximum values
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];

            if (list[i] > max)
                max = list[i];
        }

        // Compute the total number of buckets needed
        int range = max - min + 1;

        // Create an array of buckets
        ArrayList<Integer>[] bucket =
                (ArrayList<Integer>[]) new ArrayList[range];

        // Place every number into its corresponding bucket
        for (int i = 0; i < list.length; i++)
        {
            // Shift values so the smallest value maps to bucket 0
            int key = list[i] - min;

            // Create the bucket if it doesn't exist
            if (bucket[key] == null)
                bucket[key] = new ArrayList<>();

            // Add the value to its bucket
            bucket[key].add(list[i]);
        }

        // Index for rebuilding the original array
        int k = 0;

        // Visit every bucket in ascending order
        for (int i = 0; i < bucket.length; i++)
        {
            // Skip empty buckets
            if (bucket[i] != null)
            {
                // Copy each value back into the array
                for (int j = 0; j < bucket[i].size(); j++)
                {
                    list[k++] = bucket[i].get(j);
                }
            }
        }
    }

	public static void main(String[] args) {
		
		Integer[] numbers = {4, 5, 45, 100, 5, -5, -20, 80, 1};

        bucketSort(numbers);

        // Print the sorted array
        for (int number : numbers)
        {
            System.out.print(number + " ");
        }
		
	}

}
