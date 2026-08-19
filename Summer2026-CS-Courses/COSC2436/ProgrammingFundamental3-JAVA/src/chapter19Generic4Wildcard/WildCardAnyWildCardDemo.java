package chapter19Generic4Wildcard;

public class WildCardAnyWildCardDemo {

	public static void main(String[] args) {
		
		GenericStack<Integer> intStack = new GenericStack<>();
		
		intStack.push(1);			//1 autoboxed into an Integer object
		intStack.push(-2);
		intStack.push(2);
		
		print(intStack);			//During printing, the program do LIFO, last in Last out
									//Means, During 1st iteration-the program removes 2 and returns 2 from the stack
									//2nd iteration-the program removes -2 and return -1
									//3rd iteratiom-the program removes 1 and return 1
									//No 4th iteration because the stack is empty

		
		
	}

	
	public static void print(GenericStack<?>stack) 
	{
		while(!stack.isEmpty()) 
		{
			System.out.println(stack.pop() + " ");
		}
		
		
		//check if the stack is empty after printing
		System.out.print("Is stack now emty? "+stack.isEmpty());
	}
}
