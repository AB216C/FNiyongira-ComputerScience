package chapter19Generic4Wildcard;

import java.util.List;
import java.util.Arrays;

public class LowerBoundWildCardDemo {
	
	public static void printOnlyInteger(List<? super Integer> list) 
	{
		System.out.println("list contents: ");
		
		//Can only read elements as object
		
		
		for (Object obj:list) 
		{
			System.out.println(obj);
		}
		
		System.out.println();
		
	}
	
	public static void main(String[] args) {

		//Integer list
		
		List<Integer>list1 = Arrays.asList(1,2,3);
		
		
		//Integer list object is being passed - will work
		
		printOnlyInteger(list1);
		
		
		//Number list
		
		List<Number>list2 = Arrays.asList(1,2,3,4);
		
		//Number(Superclass) list object is being passed - will work
		
		printOnlyInteger(list2);
		
		
		//double list
		
		List<Double> list3 = Arrays.asList(1.0, 2.0, 3.0);
		
		//Double list is being passed----compilation error
		//Doesn't compile because double is not a super class of integer
		
		
		//printOnlyInteger(list3);
		
		
		

	}

}
