package chapter18Recursive;

public class RecursiveBinarySearch {
	
	public static  int binarySearch(int[] list, int key) 
	{
		int low = 0;
		int high = list.length-1;
		
		return binarySearch(list, key, low, high);
		
	}
	
	
	public static int binarySearch(int[] list, int key, int low, int high) 
	{
		
		//Key not found
		if(low>high)			//These are keys with index outside the array's length
			return -low-1;
		
		//Find the middle index
		int mid = (low + high)/2;
		
		
		//Recursively-search for the left half
		if(key < list[mid])
			return binarySearch(list,key, low ,mid-1);
			
		//key found
		
		else if (key == list[mid])
			return mid;
		
		//Recursively-search the right half
		else
			return binarySearch(list, key, mid + 1, high);
		
		
			
	}

	public static void main(String[] args) {
		
		
		int list[] = {3,5,7,8,12,17,24,29};
		
		
		System.out.println(binarySearch(list,7));
		
		System.out.println(binarySearch(list,0));

		
	}

}
