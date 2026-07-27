package chapter19Generic5AvoidUnsafeRawType;

import java.util.ArrayList;

public class TestArrayListNew {

	public static void main(String[] args) {
		
		
		//Create a list to store cities

		ArrayList<String> cityList = new ArrayList<String>();
		
		
		//Add some cities in the list
		
		cityList.add("London");

		cityList.add("NewYork");

		cityList.add("Paris");

		cityList.add("Toronto");

		cityList.add("Hong Kong");

		cityList.add("Singapore");
		
		
		System.out.println("List size?" + cityList.size());
		
		System.out.println("Is Toronto in the list?" + cityList.contains("Toronto"));
		
		System.out.println("The location of New York in the list" + cityList.indexOf("NewYork"));
		
		System.out.println("Is the list empty?" + cityList.isEmpty());
		
		//Inset a new city at index2
		
		cityList.add(2, "Buja");
		
		System.out.println(cityList);
		
		cityList.remove("Toronto");
		cityList.remove(1);
		
		for (int i=0; i < cityList.size(); i++) 
		{
			System.out.println(cityList.get(i)+" ");
		}
	}
	

}
