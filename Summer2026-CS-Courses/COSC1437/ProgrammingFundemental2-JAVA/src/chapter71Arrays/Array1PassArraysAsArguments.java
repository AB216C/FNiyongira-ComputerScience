package chapter71Arrays;

public class Array1PassArraysAsArguments {

	public static void main(String[] args) {
		

		//Create an array
		
		int[] numbers = {5,10,15,20,25,30,35,40};
		
		
		//pass each element to the showArray method
		
		for (int index = 0; index < numbers.length; index++) 
		{
			showArray(numbers[index]);
			
		}
		
	}
	
	/*
	 * ShowArray method will display its argument
	 * */

	public static void showArray(int n) {
	
	System.out.print(n + " ");
	}

}


//println : print data vertically as each element go to the next line
// print :  print data horizontally as each element stay on same line