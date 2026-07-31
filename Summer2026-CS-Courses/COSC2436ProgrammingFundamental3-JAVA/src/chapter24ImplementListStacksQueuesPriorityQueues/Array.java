package chapter24ImplementListStacksQueuesPriorityQueues;

public class Array {
	
	public static void print(int[] list) 
	{
		System.out.print("Array = [");	//Print the Array label with an opening bracket
		
		for (int i=0; i<list.length; i++) 
		{
			
			System.out.print(list[i]);
			
			
			//Print a commas and a space after every element except the last one
			if(i<list.length-1) 
			{
				System.out.print(", ");
			}
		}
		
		System.out.print("]");	//Print the closing bracket
	}
	
	//Sort Array using insertion sort method
	public static void insertionSort(int[] list) 
	{
		
		//Start from the second element since first element is considered sorted
		for (int i=1; i<list.length; i++) 
		{
			//Save the current element from the unsorted sublist
			int currentElement = list[i];
			
			//Create index to scan sorted sublist from right to left
			int k;
			
			//Shift the larger elements in the sorted sublist one position to the right
			
			for (k = i-1; k>=0 && list[k]>currentElement; k--) 
			{
				list[k+1] = list[k];
			}
			
			//insert current element into list k + 1
			//insert it in its correct position of sorted sublist
			
			list[k+1] = currentElement;
		}
		
	}
	
	//Sort Array using bubble sort method
	public static void bubbleSort(int[] list) 
	{
		
		//Indicate whether another pass is needed
		boolean needNextPass = true;
		
		//Repeat passes until the list is sorted
		
		for (int k=1; k<list.length && needNextPass; k++) 
		{
			//Assume the array is sorted and next pass not needed
			needNextPass = false;
			
			//Compare adjacent elements
			for (int i=0; i<list.length-k; i++) 
			{
				//Swap if the left element is larger
				if(list[i]>list[i+1]) 
				{
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					
					//Next pass still needed
					needNextPass = true;
				}
			}
			
		}
		
		
	}
	
	//Sort Array using merge sort method
	public static void mergeSort(int[] list) 
	{
		//continue splitting untill the array has one element
		
		if (list.length>1) 
		{
			/*Merge sort the first half*/
			
			//create the first half of the array
			int[] firstHalf = new int[list.length/2];
			
			//Copy the first half into a new array
			System.arraycopy(list, 0, firstHalf, 0, list.length/2);
			
			//Merge Sort recursively the first half
			mergeSort(firstHalf);
			
			/*Merge sort the second half*/
			
			//Calculate the size of the second half
			
			int secondHalfLength = list.length - list.length/2;
			
			//Create the second half of the array
			int[] secondHalf = new int[secondHalfLength];
			
			//Copy the second half into a new array
			System.arraycopy(list,list.length/2, secondHalf,0, secondHalfLength);
			
			//Merge sort recursively the second half
			mergeSort(secondHalf);
			
			//Merge first half and second half into a list
			merge(firstHalf, secondHalf, list);
		}
		
	}
	
	/*Create a method to merge two sorted halves*/
	public static void merge(int[] list1, int[] list2, int[] temp) 
	{
		//Current index in list1
		int current1 = 0;
		
		//Current index in list2
		int current2 = 0;
		
		//Current index in temp
		int current3 = 0;
		
		/*Compare elements until one list is exhausted*/
		while(current1 < list1.length && current2<list2.length) 
		{
			//Copy the smaller element into temp list
			
			if(list1[current1]<list2[current2])
				temp[current3++] = list1[current1++];
			else
				temp[current3++] = list2[current2++];
			
		}
		
		//Copy any remaining elements from list1
		while(current1<list1.length)
			temp[current3++] = list1[current1++];
		//Copy any remaining elements from list2
		while(current2<list2.length)
			temp[current3++] = list2[current2++];
		
	}
	
	
	
	//Sort Array using quick sort method
	
	
	/*Create a method that starts quickSort*/
	public static void quickSort(int[] list) 
	{
		quickSort(list, 0, list.length-1);
	}
	
	/*Recursively sort a portion of the array*/
	public static void quickSort(int[] list, int first, int last) 
	{
		//Continue if there is more than one element
		if(last > first) 
		{
			//Partition the array and get the pivot's final position
			int pivotIndex = partition(list, first, last);
			
			//Sort the left side of the pivot
			
			quickSort(list, first, pivotIndex-1);
			
			//Sort the right side of the pivot
			quickSort(list, pivotIndex+1, last);
			
		}
		
	}
	
	/*Partition the array List [first......last]*/
	
	public static int partition(int[] list, int first, int last) 
	{
		//Chose the first element as the pivot
		int pivot = list[first];
		
		//index for forward search
		int low = first + 1;
		
		//index for backward search
		int high = last;
		
		
		//Continue until two pointers meet
		while(high>low) 
		{
			//Search forward from left
			while(low<=high && list[low] <= pivot)
				low++;
			//Search backward from right
			while(low<=high&& list[high] > pivot)
				high--;
			
			//Swap two elements in the list
			
			if (high > low) 
			{
				//Exchange misplaced elements
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		//Move high to the left until the element smaller than the pivot is found
		
		while(high > first && list[high]>=pivot)
			high--;
		
		
		//Swap pivot with list[high]
		
		if (pivot > list[high]) 
		{
			//Place pivot into its current position
			list[first] = list[high];
			list[high] = pivot;
			
			//return pivot's final index
			return high;
		}
		else 
		{
			//In case pivot was already in correct position
			return first;
			
		}
	
	}
	
	
	//The method to output the Complexity of the 4 sorting algorithms in Big-O Notation
	//Which sorting method is better and explanations
	public static void ferdinandNiyongiraSortAlgorithmComplexity() 
	{

		System.out.println("\n============insertionSort==============\n");
		System.out.println("The complexity of insertion sort has best-time O(n): \n Less work is done especially for sorted and nearly list sorted list"+ 
							"\n because outerloop run n-1 times while inner loop stop immediately on each comparison");
		
		System.out.println("The complexity of insertion sort has worst-time O(n^2):\n More work is done on very unsorted or reverse list"+
							"\n because on each outloop n-1 run, \n the inner loop also run by shifting elemnents repeatedly from unsorted to sorted sublist");
		

		
		System.out.println("\n============bubbleSort==============\n");
		
		System.out.println("The complexity of bubble sort has best-time O(n): \n For sorted and nearly sorted list, there is less work because "+
							"\n as the outerloop start its first pass,"+
							" the inner loop performs n-1 comparisons, \n and since no swap occurs,the inner loop stops immediately.");

		System.out.println("The complexity of buble sort has worst-time O(n^2): \n For highly unsorted and reversed list, the outerloop run n-1 passes and "+
							"during each pass \n the inner loop run up to n-1 passes to swap neighboring elements in case not in order");
		
		System.out.println("\n============mergeSort==============\n");
		
		System.out.println("The complexity of merge sort is O(nlogn) for best-time, worst-time and average time");
		
		System.out.println("Reason:merge sort use divide and conquer technique and divide a list into a half to create(log2n) and"+
							" \nthe n elements are get sorted recursively and get merged back to create nlogn");
		
		System.out.println("\n============quicksort==============\n");
		
		System.out.println("The complexity of quick sort is O(nlogn) for best-time and average time "+
							"\n because use divide and conquer where the array is divided into two subarray with the same size");
		System.out.println("The complexity of quick sort is O(n^2) for worst-time use divide and conquer, "+
							"\n however, in case the pivot divides the array each time into one big subarray \n while the second half is empty:"
							+ "it takes O(n^2) time to complete sorting");
		
		
		System.out.println("\n===========Best sorting algorithm===============\n");
		
		System.out.println("The best sorting algorithm is merge sort because it uses divide and conquer technique,"+
							"\n and it has time complexity of O(nlogn) during best, avarage, and worst cases");
	}

}
