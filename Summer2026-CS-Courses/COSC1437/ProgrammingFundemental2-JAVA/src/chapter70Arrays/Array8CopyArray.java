package chapter70Arrays;

public class Array8CopyArray {

	public static void main(String[] args) {


		
		final int ARRAY_SIZE = 5;
		
		
		int[] firstArray = {2,4,6,8,10};
		
		
		//Create and initialize object of the second array to copy elements to
		
		int[] secondArray = new int[ARRAY_SIZE];
		
		
		//Use for loop to copy elements of the first array to the second array
		
		for (int index = 0; index < firstArray.length; index ++)
			secondArray[index] = firstArray[index];
		
		//Change 1st and last element in 1st array 
		

		firstArray[0] = 200;
		firstArray[4] = 10000;
		
		//Change first and last element in the 2nd array
		secondArray[0] = 250;
		secondArray[4] = 15000;
		
		
		//Print both first and second array elements and verify if copies are different
		
		for (int value:firstArray)
			System.out.println("First Array elements: "+value);
		
		for (int val:secondArray)
			System.out.println("Second Array elements: "+val);
		
		//Result confirms both copies are not different
	}

}
