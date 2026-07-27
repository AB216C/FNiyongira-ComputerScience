package chapter7ArrayList;

import java.util.ArrayList;

/*
 * * This program demonstrates an ArrayList.
 * */


public class ArrayListDemo3RemoveMethod {

	public static void main(String[] args) {
		

		 // Create an ArrayList to hold some names.
		    ArrayList<String> nameList = new ArrayList<String>();
		   
		    // Add some names to the ArrayList.
		    nameList.add("James");
		    nameList.add("Catherine");
		    nameList.add("Bill");
		    nameList.add("Peter");
		   
		    // Display the items in nameList and their indices.
		    for (int index = 0; index < nameList.size(); index++)
		    {
		      System.out.println("Index: " + index + " Name: " +
		               nameList.get(index));
		  }
		   
		    // Now remove the item at index 1.
		    nameList.remove(1);
		   
		    System.out.println("The item at index 1 is removed. " +
		              "Here are the items now.");
		
		  // Now remove the item at index 1.
		    nameList.remove(1);
	   
		    System.out.println("The item at index 1 is removed. " +
		              "Here are the items now.");
		             
		    // Display the items in nameList and their indices.
		    for (int index = 0; index < nameList.size(); index++)
		    {
		      System.out.println("Index: " + index + " Name: " +
		               nameList.get(index));
		    }
	}

}
