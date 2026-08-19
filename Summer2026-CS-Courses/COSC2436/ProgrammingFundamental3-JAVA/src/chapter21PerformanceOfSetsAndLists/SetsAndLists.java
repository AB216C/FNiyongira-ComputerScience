package chapter21PerformanceOfSetsAndLists;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.LinkedList;
public class SetsAndLists {
	
	static final int N = 50000;

	public static void main(String[] args) {
		
		
		//Add numbers 0,1,2,..............N-1 to the ArrayList
		
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=0; i < N; i++)
			list.add(i);
		
		
		Collections.shuffle(list);		//Shuffle the array list
		
		
//		System.out.println(list);
//		
		
		//Create a Hash set and test its performance
		
		Collection<Integer> set1 = new HashSet<>(list);
		
		System.out.println("Member test time for hashset is " + getTestTime(set1) + " milleseconds");
		
		
		System.out.println("Remove element time for hashset is " + getRemoveTime(set1) + " milleseconds");
		
		
		//Create a linked hash set, test its performance
		
		Collection<Integer> set2 = new LinkedHashSet<>(list);
		
		System.out.println("Member test time for linked hashset is " + getTestTime(set2) + " milleseconds");
		
		
		System.out.println("Remove element time for linked hashset is " + getRemoveTime(set2) + " milleseconds");
		
		//Create a Tree set and test its performance
		
		Collection<Integer> set3 = new TreeSet<>(list);
		
		System.out.println("Member test time for tree set is " + getTestTime(set3) + " milleseconds");
		
		
		System.out.println("Remove element time for tree set is "  + getRemoveTime(set3) + " milleseconds");
		
		
		//Create an arrayList and test its performance
		Collection<Integer> set4 = new ArrayList<>(list);
		
		System.out.println("Member test time for array list is " + getTestTime(set4) + " milleseconds");
		
		
		System.out.println("Remove element time for array list is " + getRemoveTime(set4) + " milleseconds");
		
		
		//Create a linked list and test its performance
		
		Collection<Integer> set5 = new LinkedList<>(list);
		
		System.out.println("Member test time for linked list is " + getTestTime(set5) + " milleseconds");
		
		
		System.out.println("Remove element time for linked list is " + getRemoveTime(set5) + " milleseconds");
	
	}
	
	
	
	public static long getTestTime(Collection<Integer> c) 
	{
		long startTime = System.currentTimeMillis();
		
		//Test if number is in the collection
		
		for (int i=0; i< N; i++) 
		{
			c.contains((int)(Math.random()*2*N));
			
		}
		
		return System.currentTimeMillis()-startTime;
	}
	
	
	public static long getRemoveTime(Collection<Integer>c) 
	{
		long startTime = System.currentTimeMillis();
		
		for (int i=0; i<N; i++)
			c.remove(i);
		
		return System.currentTimeMillis()-startTime;
	}
	
}
