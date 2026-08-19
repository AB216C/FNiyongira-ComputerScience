package chapter19Generic4Wildcard;

import java.util.List;
import java.util.Arrays;

public class UnboundedWildCard {
	
	
	private static void printList(List<?>list) 
	{
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		//Integer list
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		
		
		//Double list
		
		List<Double> list2 = Arrays.asList(1.1,2.2,3.3);
		
		
		//String list
		
		List<String> list3 = Arrays.asList("Bus", "Toyota", "Jaquar");
		
		
		printList(list1);
		printList(list2);
		printList(list3);
		
		

	}

}
