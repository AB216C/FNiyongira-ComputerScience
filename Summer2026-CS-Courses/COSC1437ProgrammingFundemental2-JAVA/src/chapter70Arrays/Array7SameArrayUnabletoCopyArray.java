package chapter70Arrays;

public class Array7SameArrayUnabletoCopyArray {

	public static void main(String[] args) {
		

		
		//Create an array
		
		int[] array1 = {2,4,6,8,10};
		
		
		int[] array2 = array1;
		
		
		//Change element in array1
		
		array1[0] = 100;
		
		
		// Change element in array2
		
		
		array2[4] = 1000; 
		
		
		//Print elements in array1
		
		System.out.println("Elements in array1");
		
		for (int val1:array1)
			System.out.println(val1);
		
		for (int val2:array2)
			System.out.println(val2);
	
		//Notice, there was no copy happened
		
	}

}
