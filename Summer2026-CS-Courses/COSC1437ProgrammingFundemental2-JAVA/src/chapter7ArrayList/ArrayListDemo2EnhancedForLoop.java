package chapter7ArrayList;

import java.util.ArrayList;


 /**
 * This program demonstrates how the enhanced for loop
  * can be used with an ArrayList.
  */

public class ArrayListDemo2EnhancedForLoop {

	public static void main(String[] args) {
		
		    // Create an ArrayList to hold some names.
		    ArrayList<String> nameList = new ArrayList<String>();
		
		    // Add some names to the ArrayList.
		    nameList.add("James");
		    nameList.add("Catherine");
		    nameList.add("Bill");
		    nameList.add("Niyongira");
		   
		    // Display the size of the ArrayList.
		    System.out.println("The ArrayList has " +
		              nameList.size() +
		              " objects stored in it.");
		
		    // Now display the items in nameList.
		    for (String name : nameList)
		      System.out.println(name);
		    
		    
		    //Can also be use to print a list but not one by one
		    
		    System.out.println("Trial" + nameList);
	
	}

}
