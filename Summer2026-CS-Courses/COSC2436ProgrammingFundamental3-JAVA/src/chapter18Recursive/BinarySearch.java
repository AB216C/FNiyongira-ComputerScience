package chapter18Recursive;

public class BinarySearch {
	
	//Search for the key in a sorted array
	//Returns the index if found, otherwise, return -(insertion point)-1
	
	
	public static int binarySearch(int[] list, int key) 
	{
		
		//Search range 
		int low=0;
		int high=list.length-1;
		
		
		//Continue while there are elements to search
		while(high>low) 
		{
			//Find the middle index
			int mid = (low + high)/2;
			
			//Search the left half
			if(key<list[mid])
				high = mid-1;
			
			//if key found in the middle
			else if(key == list[mid])
				return mid;
			
			//search the right half
			else
				low = mid + 1;
		}
		
		//Key not found, return insertion point
		return  - low -1;

	}

	public static void main(String[] args) {
		

		int[] list = {-3,1,2,4,9,23};
		
		System.out.println(binarySearch(list,-44));
		
		
	}

}
