package chapter21HashSetTreeSetwithIterator;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		
		//Create a HashSet
		
		Set<String> set = new HashSet<>();
		
		
		set.add("London");
		
		set.add("Paris");
		
		set.add("New York");
		
		set.add("San Francisco");
		
		set.add("Beijin");
		
		System.out.println(set);
		
		
		//Display the elements in a hashSet and change the elements to the upper case
		
		System.out.println("\n================================\n");
		
		for (String s:set) 
		{
			System.out.println(s.toUpperCase() + " ");
		}
		
		//Process elements using a forEach method
		System.out.println("\n================================\n");

		
		set.forEach(e->System.out.println(e.toLowerCase() + " "));
		
		
		

		
	}

}
