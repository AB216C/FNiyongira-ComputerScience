package chapter20JavacollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {

	public static void main(String[] args) {
		

		ArrayList<String> collection1 = new ArrayList<>();
		
		collection1.add("New York");
		collection1.add("Atlanta");
		collection1.add("Dallas");
		collection1.add("Madision");
		
		
		System.out.println("A list of cities in collection1:");
		System.out.println(collection1);
		
		
		System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));
		
		collection1.remove("Dallas");
		
		System.out.println(collection1.size() + " cities are in collection1");
		
		
		Collection<String> collection2 = new ArrayList<>();
		
		collection2.add("Seattle");
		collection2.add("Portland");
		collection2.add("Los Angeles");
		collection2.add("Atlanta");
		
		System.out.println("A list of cities in collection2:");
		System.out.println(collection2);

		
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
		c1.addAll(collection2);
		
		System.out.println("A list of cities in collection 1 and collection2:");
		System.out.println(c1);
		
		System.out.println("\n==============================================\n");
		
		c1.retainAll(collection2);			//Retains the elements in both collection1 and in this collection2No douplicate
		System.out.println(c1);
		
		
		c1.removeAll(collection2);
		System.out.println(c1);
		
		
		


	}

}
