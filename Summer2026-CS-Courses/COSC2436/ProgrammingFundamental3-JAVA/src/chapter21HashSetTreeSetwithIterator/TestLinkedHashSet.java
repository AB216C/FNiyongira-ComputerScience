package chapter21HashSetTreeSetwithIterator;

import java.util.Set;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

	public static void main(String[] args) {
		

		//Create a HashSet
		
		Set<String> set = new LinkedHashSet<>();
		
		
		set.add("London");
		
		set.add("Paris");
		
		set.add("New York");
		
		set.add("San Francisco");
		
		set.add("Beijing");
		
		System.out.println(set);
		
		
		//Display the elements in a hashSet and change the elements to the upper case
		
		System.out.println("\n================================\n");
		
		for (String element:set) 
		{
			System.out.println(element.toLowerCase() + " ");
		}
		
	}

}
