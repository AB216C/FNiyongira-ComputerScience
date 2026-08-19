package chapter23Sorting;

import java.util.Arrays;

public class Method6HeapSortDemo {

	public static void main(String[] args) {
		
		Integer [] numbers = {4,5,45,100,5,-5};
		
		Method6HeapSort.heapSort(numbers);
		
		
		for (int i=0; i<numbers.length; i++) 
		{
			System.out.print(numbers[i] + " ");
		}

	}

}
