package chapter20JavacollectionFramework;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorInterface {

	public static void main(String[] args) {
		

		Collection <String> cityCollection = new ArrayList<>();
		
		
		cityCollection.add("New York");
		cityCollection.add("Atlanta");
		cityCollection.add("Dallas");
		cityCollection.add("Madision");
		
		
		Iterator<String> cityIterator = cityCollection.iterator();
		
		
		while(cityIterator.hasNext()) 
		{
			System.out.println(cityIterator.next().toUpperCase() + " ");
		}
		
		System.out.println();
	}

}
