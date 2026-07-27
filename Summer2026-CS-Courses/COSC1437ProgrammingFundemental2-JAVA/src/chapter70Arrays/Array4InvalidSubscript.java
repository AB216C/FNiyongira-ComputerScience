package chapter70Arrays;

/*This program uses invalid subscript with an array*/

public class Array4InvalidSubscript {

	public static void main(String[] args) {
		

		
		//CREATE AN ARRAY WITH 3 ELEMENTS
		
		int[] values = new int[3];
		
		
		System.out.println("I will attempt to store four numbers in  3 elements array");
		
		
		for (int index = 0; index < 4; index ++)    //This will leads to ArrayIndexOUtOfBound error
		{
			System.out.println("Now processing element"+ index);
			
			values[index] = 10;
		}
		

	}

}


//This cause an error index out of bounds-