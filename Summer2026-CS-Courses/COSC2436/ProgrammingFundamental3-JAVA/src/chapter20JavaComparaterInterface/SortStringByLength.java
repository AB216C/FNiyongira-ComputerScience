package chapter20JavaComparaterInterface;


import java.util.Arrays;

import java.util.Comparator;

public class SortStringByLength {

	public static void main(String[] args) {
		
		String[] cities = {"Atlanta", 
						   "Savannah", 
						   "New York",
						   "Dallas"};
		
		// Sort by length
		java.util.Arrays.sort(cities,new MyComparator());
		
		System.out.println("Sorted by length: ");
		
		for (String s:cities) 
		{
			System.out.println(s + " ");
		}
		
		
		
		//Sort alphabetically ignoring case)
		Arrays.sort(cities, (s1,s2)->s1.compareToIgnoreCase(s2));
		
		System.out.println("Sorted Alphabetically: ");
		
		for (String s:cities) 
		{
			System.out.println(s + " ");
		}
	}
	
	public static class MyComparator implements Comparator<String>
	{
		@Override
		public int compare(String s1, String s2)
		{
			return s1.length() - s2.length();
			
			
		}
	}

}
