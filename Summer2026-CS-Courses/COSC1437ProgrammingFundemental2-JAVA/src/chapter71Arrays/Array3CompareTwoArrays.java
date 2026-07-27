package chapter71Arrays;

public class Array3CompareTwoArrays {

	public static void main(String[] args) {
		
		
		int [] firstArray = {2, 4, 6 , 8, 10 };
		int [] secondArray = {2, 4, 6, 8, 10};
		

		
		//Declare flag variable
		
		boolean arraysEqual = true;			//Flag variable
		
		int index = 0;						// Loop control variable
		
		
		//Determine whether the array are the same size
		
		if(firstArray.length != secondArray.length) 
		{
			arraysEqual = false;
		}
		
		//Determine whether elements contains same data
		
		while(arraysEqual && index < firstArray.length) 
		{
			if(firstArray[index]!=secondArray[index]) 
			{
				arraysEqual = false;
			}
			index ++;
		}
		
		if(arraysEqual) 
		{
			System.out.println("The arrays are equal");
		}
		else 
		{
			System.out.println("The arrays are not equal");
			
		}
		
	}

}
