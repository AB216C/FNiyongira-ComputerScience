package chapter19Generic4Wildcard;

//Compiler error: max() expects a GenericStack<Number>,
//but intStack is a GenericStack<Integer>.

public class WIldCardNeedDemo {
	
	
	public static void main(String[] args) {
		
		GenericStack<Integer>intStack = new GenericStack<>();		//This line will be the main origin for the compiler error
		
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		
		//System.out.println("Max number is " + max(intStack));		//Error
		
		
	}

	/**Find the maximum in a stack of numbers*/
	public static double max(GenericStack<Number> stack) 
	{
		double max = stack.pop().doubleValue();			//Initialize max
		
		
		while(!stack.isEmpty()) 
		{
			double value = stack.pop().doubleValue();
			if(value>max)
				max = value;
		}
		
		return max;
	}

}
