package chapter18Recursive;

import java.util.Scanner;

public class computeFibonacci {

	public static void main(String[] args) {
		
		
		int indexNum;
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter index for a fibonacci number: ");
		
		
		indexNum = keyboard.nextInt();
		
		
		System.out.println("Fibonacci for the index " + indexNum + " is " + fib(indexNum));
		
		

		
	}
	
	
	public static long fib(long index) 
	{
		
		if(index == 0)				//Base case
			return 0;
		
		else if (index == 1)		//Base case
			return 1;
		
		else
			return fib(index-1) + fib(index-2);	//Reduction and recursive calls
		
	}

}
