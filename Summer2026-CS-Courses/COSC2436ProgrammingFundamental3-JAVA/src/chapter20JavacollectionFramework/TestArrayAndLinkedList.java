package chapter20JavacollectionFramework;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayAndLinkedList {

	public static void main(String[] args) {
		

		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);

		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(0,10);
		arrayList.add(3,30);
				
		
	System.out.println("A list of integers in the array list:");
	
	System.out.println(arrayList);
	
	
	LinkedList<Object> linkedList = new LinkedList<>(arrayList);
	
	linkedList.add(1, "Red");
	
	linkedList.removeLast();
	
	linkedList.addFirst("Green");
	
	
	System.out.println(linkedList);
	
	System.out.println("Display all linked List backward");
	
	
	for (int i=linkedList.size()-1; i>=0; i--) 
	{
		System.out.print(linkedList.get(i) + " ");
	}
	
	
	}

}
