package chapter19Generic4Wildcard;

import java.util.List;

import java.util.Arrays;

public class UpperBoundWildCard {
	
	private static double sum (List < ? extends Number> list) 
	{
		double sum = 0.0;
		for (Number i:list) 
		{
			sum += i.doubleValue(); 		//Add members as double values
		}
		
		return sum;
	}

	public static void main(String[] args) {
		

		//UpperBounded integer list
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		
		
		
		//Printing sum of elements in the list
		
		System.out.println("Total sum is " + sum(list1));
		
		
		//double list
		
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
		
		
		
		//Printing sum of elements in the list
		
		System.out.println("Total sum is " + sum(list2));
		
		
		
	}

}
