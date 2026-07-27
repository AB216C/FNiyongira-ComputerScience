package chapter23Sorting;

public class Method3BubbleSort {
	
	/**
	 * Sorts an array using Bubble Sort.
	 *
	 * @param list the array to sort
	 */
	public static void bubbleSort(int[] list)
	{
	    /** Indicates whether another pass is needed. */
	    boolean needNextPass = true;

	    /** Repeat passes until sorted or all passes are complete. */
	    for (int k = 1; k < list.length && needNextPass; k++)
	    {
	        /** Assume the array is sorted. */
	        needNextPass = false;

	        /** Compare adjacent elements. */
	        for (int i = 0; i < list.length - k; i++)
	        {
	            /** Swap if the left element is larger. */
	            if (list[i] > list[i + 1])
	            {
	                int temp = list[i];
	                list[i] = list[i + 1];
	                list[i + 1] = temp;

	                /** Another pass is needed. */
	                needNextPass = true;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		
		int[] numbers = {4,5,45,100,5,-5};
		
		bubbleSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}

		
	}

}
