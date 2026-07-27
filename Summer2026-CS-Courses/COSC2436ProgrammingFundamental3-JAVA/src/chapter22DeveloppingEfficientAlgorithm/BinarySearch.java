package chapter22DeveloppingEfficientAlgorithm;


/**Use a binary search to find a key in a list*/

public class BinarySearch {
	
	public static int binarySearch(int[] list, int key) 
	{
		int low = 0;
		int high = list.length-1;
		
		
		while(high>low) 
		{
			int mid = (low + low)/2;
			if(key < list[mid])
				high = mid-1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		
		return -low-1;		//High < low
	}

	public static void main(String[] args) {
		
		int [] myList = {-3, 1,2,4,9,23};
		
		System.out.println(binarySearch(myList,2));
		


	}

}
