package chapter5Notes;

public class ForLoop {

	public static void main(String[] args) {
		
		int count;
		
		//For this example, count variable is only in the loop header
		
		
		for (count = 1; count <=5; count++)
			System.out.println("Hello");
		
      // This example used the loop to control variable in the body of the loop
		
		
		int number;
		
		
		System.out.println("Number Squared");
		
		
		for (number = 1; number <=10; number++) 
		{
			System.out.println(number + "       " + number * number);
		}
		
		
		//You are not limited to increments
		// A loop that create even numbers from from 2 to 100 by adding 2 to its counter
		
		
		
		for (number = 2;  number<=100; number+=2)
			System.out.println(number);
		
		
		//Another loop that count backward from 10 to zero
		
		
		System.out.println("Counting backward");
		for (number = 10; number >=0; number--)
			System.out.println(number);
		
		
		//Declaring a variable in the initialization
		
		System.out.println("Declared during initialization");
		
		for (int num=0; num<=10; num++)
			System.out.println(num);
		//System.out.println("The num now is " + num);     //This will result in the error because the num datatype was declared during initialization
	
	}

}
