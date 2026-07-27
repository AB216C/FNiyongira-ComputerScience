package chapter18Recursive;

public class RecursivePalindrome3RecursiveSelectionSort {
	
	//public method: Starts the recursive process
	public static void sort(double[] list) 
	{
		
		sort(list, 0,list.length-1);	
		
	}
	
	//Recursive helper method
	private static void sort(double[] list, int low, int high) 
	{	
		//Base case: Stop when there is only one (or zero) element left
		if (low < high) 
		{
			//Find the smallest number and its index in list(low....high)
			
			int indexOfMin = low;
			double min = list[low];
			
			
			for (int i = low + 1; i <= high; i++) 
			{
				if (list[i]<min) 
				{
					min = list[i];
					indexOfMin = i;
				}
			}
			
			// Swap the smallest element with list with list[low]
			
			list[indexOfMin] = list[low];
			list[low] = min;
			
			
	
			// Recursively, sort the remaining portion of the array
			
			sort(list, low+1, high);
			
		}

	}
	
	public static void main(String[] args) 
	{
		
		double[] list = {2,1,3,1, 2,5,2,-1, 0};
		sort(list);
		
		for (int i=0; i < list.length; i++) 
		{
			System.out.print(list[i] + " ");
		}
		
		
		
	}

}
