package chapter23Sorting;

public class Method5QuickSort {
	
	 /**
     * Public method that starts Quick Sort.
     *
     * @param list the array to sort
     */
    public static void quickSort(int[] list)
    {
        /** Sort the entire array. */
        quickSort(list, 0, list.length - 1);
    }

    /**
     * Recursively sorts a portion of the array.
     *
     * @param list  the array
     * @param first first index
     * @param last  last index
     */
    private static void quickSort(int[] list, int first, int last)
    {
        /** Continue only if there is more than one element. */
        if (last > first)
        {
            /** Partition the array and get the pivot's final position. */
            int pivotIndex = partition(list, first, last);

            /** Sort the left side of the pivot. */
            quickSort(list, first, pivotIndex - 1);

            /** Sort the right side of the pivot. */
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] */
    private static int partition(int[] list, int first, int last)
    {
        /** Choose the first element as the pivot. */
        int pivot = list[first];

        /** Index for forward search. */
        int low = first + 1;

        /** Index for backward search. */
        int high = last;

        /** Continue until the two pointers meet. */
        while (high > low)
        {
            // Search forward from left
            while (low <= high && list[low] <= pivot)
                low++;

            // Search backward from right
            while (low <= high && list[high] > pivot)
                high--;

            // Swap two elements in the list
            if (high > low)
            {
                /** Exchange the two misplaced elements. */
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        /** Move high left until finding an element smaller than the pivot. */
        while (high > first && list[high] >= pivot)
            high--;

        // Swap pivot with list[high]
        if (pivot > list[high])
        {
            /** Put the pivot into its correct position. */
            list[first] = list[high];
            list[high] = pivot;

            /** Return the pivot's final index. */
            return high;
        }
        else
        {
            /** Pivot was already in the correct position. */
            return first;
        }
    }

	public static void main(String[] args) {
		
		int[] numbers = {4,5,45,100,5,-5};
		
		quickSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}
	}

}
