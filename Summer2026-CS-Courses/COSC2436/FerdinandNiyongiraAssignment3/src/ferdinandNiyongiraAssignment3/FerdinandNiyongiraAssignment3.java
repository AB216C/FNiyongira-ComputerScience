package ferdinandNiyongiraAssignment3;

import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class FerdinandNiyongiraAssignment3 {
	
	public static List<Double> ferdinandNiyongiraDistance(String filename)  throws IOException
	{
		File file = new File(filename);
		
		//Check if the file exist
		
		if(!file.exists()) 
		{
			System.out.println("The file " + filename + " doesn't exist.");
			System.exit(0);
		}
		
		//Create the scanner object to read the file
		
		Scanner inputFile = new Scanner(file);
		
		
		//Create a list to store distance
		
		List<Double> myFerdinandNiyongiraDistance = new ArrayList<>();
		
		
		while(inputFile.hasNextLine()) 
		{
			//Read one line from the Assignment3DataFile.txt
			String line = inputFile.nextLine();
			
			// Split the line into three parts: starting city, destination city, and distance.
			String[] parts = line.split("\\t");

			// Get the distance from the last part of the line.
			double value = Double.parseDouble(parts[2]);

			// Add the distance to the list.
			myFerdinandNiyongiraDistance.add(value);
			
		}
		//Close the input file after reading all distance values
		inputFile.close();
		
		//Return distance values read from the input file
		return myFerdinandNiyongiraDistance;
	}
	
	
	public static HashSet<String> ferdinandNiyongiraCity1(String filename)  throws IOException
	{
		File file = new File(filename);
		
		//Check if the file exist
		
		if(!file.exists()) 
		{
			System.out.println("The file " + filename + " doesn't exist.");
			System.exit(0);
		}
		//Create the scanner object to read the file
		
		Scanner inputFile = new Scanner(file);
		//Create a list to store distance
		
		HashSet<String> ferdinandNiyongiraCity1Values = new HashSet<>();
		
		while(inputFile.hasNextLine()) 
		{
			//Read one line from the Assignment3DataFile.txt
			String line = inputFile.nextLine();
			
			// Split the line into three parts: starting city, destination city, and distance.
			String[] parts = line.split("\\t");

			// Get the distance from the last part of the line.
			String value = parts[0];

			// Add the distance to the list.
			 ferdinandNiyongiraCity1Values.add(value);
		}
		
		inputFile.close();
		
		//Return unique city1 values read from the input file
		return ferdinandNiyongiraCity1Values;
	}
	
	public static HashMap<String,Double> ferdinandNiyongiraCity2AndDistance(String filename)  throws IOException
	{
		File file = new File(filename);
		
		//Check if the file exist
		
		if(!file.exists()) 
		{
			System.out.println("The file " + filename + " doesn't exist.");
			System.exit(0);
		}
		//Create the scanner object to read the file
		
		Scanner inputFile = new Scanner(file);
		//Create a list to store distance
		
		HashMap<String,Double> ferdinandNiyongiraCity2AndValues = new HashMap<>();
		
		while(inputFile.hasNextLine()) 
		{
			//Read one line from the Assignment3DataFile.txt
			String line = inputFile.nextLine();
	
			// Split the line into three parts: starting city, destination city, and distance.
			String[] parts = line.split("\\t");

			// Get the distance from the last part of the line.

			String city2 = parts[1];
			double distance = Double.parseDouble(parts[2]);
			// Add the distance to the list.
			
			ferdinandNiyongiraCity2AndValues.put(city2,distance);
		}
		
		inputFile.close();
		
		//Return city2 values and their corresponding distances read from input the file
		return ferdinandNiyongiraCity2AndValues;
	}
	
	public static FerdinandNiyongiraUnweightedGraph<String> 
					ferdinandNiyongiraCreateGraphForCity1And2(String filename)  throws IOException
	{
		File file = new File(filename);
		
		//Check if the file exist
		
		if(!file.exists()) 
		{
			System.out.println("The file " + filename + " doesn't exist.");
			System.exit(0);
		}
		//Create the scanner object to read the file
		
		Scanner inputFile = new Scanner(file);
		//Create a list to store distance
		
		FerdinandNiyongiraUnweightedGraph<String> 
								ferdinandNiyongiraGraph = new FerdinandNiyongiraUnweightedGraph<>();
		
		while(inputFile.hasNextLine()) 
		{
			//Read one line from the Assignment3DataFile.txt
			String line = inputFile.nextLine();
			
			// Split the line into three parts: starting city, destination city, and distance.
			String[] parts = line.split("\\t");

			// Get the distance from the last part of the line.

			String city1 = parts[0];
			String city2 = parts[1];
			
			//Add cities as vertices
			ferdinandNiyongiraGraph.ferdinandNiyongiraAddVertex(city1);
			ferdinandNiyongiraGraph.ferdinandNiyongiraAddVertex(city2);
			
			//Get index of each city
			int city1Index = ferdinandNiyongiraGraph.ferdinandNiyongiraGetIndex(city1);
			int city2Index = ferdinandNiyongiraGraph.ferdinandNiyongiraGetIndex(city2);
			
			//Add a directed edge from city1 to city2 using their vertex indexes
			
			ferdinandNiyongiraGraph.ferdinandNiyongiraAddEdge(city1Index,city2Index);
		}
		
		//Close the input file after all city connections have been read
		inputFile.close();
		
		//Return the completed graph containing all city vertices and edges
		return ferdinandNiyongiraGraph;
	}
	

	public static void main(String[] args) throws IOException {
		
		//Create a scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt a user to enter a file name
		
		System.out.print("Enter a filename: ");
		
		String filename = keyboard.nextLine();
		
		System.out.println("\n========================TESTING TREE INTERFACE WITH  "
									+ "BST AND AVL CLASSES========================================\n");
		 
		 //Read distance values from input file
		
		List<Double> distances = ferdinandNiyongiraDistance(filename);
		
		//Display total number of distance values that were read
		System.out.println("Distance count: " + distances.size());

		//Create an empty Binary Search FerdinandNiyongiraTree and an empty AVL FerdinandNiyongiraTree
		FerdinandNiyongiraBinarySearchTree<Double> 
							myFerdinandNiyongiraBST = new FerdinandNiyongiraBinarySearchTree<>();
		FerdinandNiyongiraAVLTree<Double> 
							myFerdinandNiyongiraAVLTree = new FerdinandNiyongiraAVLTree<>();

		//Confirm that both tree been created
		System.out.println("Trees created.");

		
		//Insert each distance value into both BST and AVL tree
		for (Double value : distances) 
		{
			myFerdinandNiyongiraBST .ferdinandNiyongiraInsert(value);
		    myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInsert(value);
		}
		
		System.out.println("Finished inserting.");

		System.out.println("\nPrint Ferdinand Niongira BST inorder:");
		myFerdinandNiyongiraBST.ferdinandNiyongiraInorder();

		System.out.println("\n\nPrint Ferdinand Niongira AVL inorder:");
		myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInorder();
		
		
		System.out.println("\n\nPrint Ferdinand Niongira BST preorder:");
		myFerdinandNiyongiraBST.ferdinandNiyongiraPreorder();

		System.out.println("\n\nPrint Ferdinand Niongira AVL preorder:");
		myFerdinandNiyongiraAVLTree.ferdinandNiyongiraPreorder();
		
		System.out.println("\n\nPrint Ferdinand Niongira BST postorder:");
		myFerdinandNiyongiraBST.ferdinandNiyongiraPostorder();

		System.out.println("\n\nPrint Ferdinand Niongira AVL postorder:");
		myFerdinandNiyongiraAVLTree.ferdinandNiyongiraPostorder();
		
		
		System.out.println("\n\nFerdinand Niyongira BST tree SearchI: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraSearch(34.0));
		
		System.out.println("\nFerdinand Niyongira AVL tree SearchI: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraSearch(34.0));
		
		System.out.println("\nFerdinand Niyongira BST tree SearchII: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraSearch(555.0));
		
		System.out.println("\nFerdinand Niyongira AVL tree SearchII: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraSearch(555.0));
		

		System.out.println("\nFerdinand Nioyngira BST Size: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraGetSize());
		
		System.out.println("\nFerdinand Niyongira AVL size: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraGetSize());
		
		
		System.out.println("\nFerdinand Niyongira BST root: " 
								+ myFerdinandNiyongiraBST.getRoot());
		
		System.out.println("\nFerdinand Niyongira AVL tree root: " 
								+ myFerdinandNiyongiraAVLTree.getRoot());
		
		
		System.out.println("\nFerdinand Niyongira BST insert 5.0: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraInsert(5.0));
		
		System.out.println("\nFerdinand Niongira AVL tree insert 5.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInsert(5.0));
		
		System.out.println("\nFerdinand Niyongira BST insert 100.0: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraInsert(100.0));
		
		System.out.println("\nFerdinand Niyongira AVL tree insert 100.0: " 
								+myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInsert(100.0));
		
		System.out.println("\nFerdinand Niyongira BST insert 20.0: " +
								myFerdinandNiyongiraBST.ferdinandNiyongiraInsert(20.0));
		
		System.out.println("\nFerdinand Niyongira AVL tree insert 20.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInsert(20.0));
		
		System.out.println("\nFerdinand Niyongira BST insert a duplicate of 100.0: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraInsert(100.0));
		
		System.out.println("\nFerdinand Niyongira AVL tree insert a duplicate of 100.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraInsert(100.0));
		
		
		System.out.println("\nFerdinand Niyongira BST Size: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraGetSize());
		
		System.out.println("\nFerdinand Niyongira AVL tree size: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraGetSize());
		
		System.out.println("\nFerdinand Niyongira BST delete a leaf: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraDelete(48.5));
		System.out.println("\nFerdinand Niyongira BST delete 20.0: "
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraDelete(20.0));
		System.out.println("\nFerdinand Niyongira BST delete 5.0: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraDelete(5.0));
		System.out.println("\nFerdinand Niyongira BST delete 1224.0: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraDelete(1224.0));
		System.out.println("\nFerdinand Niyongira BST delete 11.0(Value 11 .0 doesn't exist): " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraDelete(11.0));
		
		
		System.out.println("\nFerdinand Niyongira AVL tree delete a leaf: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraDelete(48.5));
		System.out.println("\nFerdinand Niyongira AVL tree delete 20.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraDelete(20.0));
		System.out.println("\nFerdinand Niyongira AVL tree delete 5.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraDelete(5.0));
		System.out.println("\nFerdinand Niyongira AVL tree delete 1224.0: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraDelete(1224.0));
		System.out.println("\nFerdinand Niyongira AVL tree delete 11.0(Value 11.0 doesn't exist): " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraDelete(11.0));
		
		
		System.out.println("\nFerdinand Niyongira BST Size: " 
								+ myFerdinandNiyongiraBST.ferdinandNiyongiraGetSize());
		System.out.println("\nFerdinand Niyongira AVL tree size: " 
								+ myFerdinandNiyongiraAVLTree.ferdinandNiyongiraGetSize());
		System.out.println("\nFerdinand Niyongira BST root: " 
								+ myFerdinandNiyongiraBST.getRoot());
		System.out.println("\nFerdinand Niyongira AVL tree root: " 
								+ myFerdinandNiyongiraAVLTree.getRoot());
		System.out.println("\nFerdinand Niyongira BST path to 1192.0: " 
								+ myFerdinandNiyongiraBST.path(1192.0));
		System.out.println("\nFerdinand Niyongira  AVL tree root to 1192.0: " 
								+ myFerdinandNiyongiraAVLTree.path(1192.0));
		System.out.println("\nFerdinand Niyongira  BST path to 10.0(Value 10 doesn't exist): " 
								+ myFerdinandNiyongiraBST.path(10.0));
		System.out.println("\nFerdinand Niyongira  AVL tree root to 10.0(Value 10 doesn't exist): " 
								+ myFerdinandNiyongiraAVLTree.path(10.0));
		System.out.println("\nIs Ferdinand Niyongira  BST tree empty?: " 
								+ myFerdinandNiyongiraBST.isEmpty());
		System.out.println("\nIs Ferdinand Niyongira  AVL tree empty?: " 
								+ myFerdinandNiyongiraAVLTree.isEmpty());
		
		myFerdinandNiyongiraBST.clear();
		myFerdinandNiyongiraAVLTree.clear();
		
		System.out.println("\nIs Ferdinand Niyongira  BST tree empty?: " 
								+ myFerdinandNiyongiraBST.isEmpty());
		System.out.println("\nIs Ferdinand Niyongira  AVL tree empty?: " 
								+ myFerdinandNiyongiraAVLTree.isEmpty());
		

		System.out.println("\n=======================TESTING MAP INTERFACE WITH HASHSET "
								+ "and HASHMAP CLASSES==============================================\n");
		 
		
		//Read unique city1 values from the input file
		
		HashSet<String> cities = ferdinandNiyongiraCity1(filename);
		
		
		//Create an empty FerdinandNiyongiraHashSet to store the city1 values
		FerdinandNiyongiraHashSet<String> myFerdinandNiyongiraHS = new FerdinandNiyongiraHashSet<>();
		
		//Insert each unique city1 value into FerdinandNiyongiraHashSet
		for (String city:cities) 
		{
			
			myFerdinandNiyongiraHS.add(city);
		}
		
		System.out.println("\nChecking Ferdinand NiyongiraHashSet size: "
										+ myFerdinandNiyongiraHS.size());
		System.out.println("\nFerdinandNiyongira Hash Set: "
										+ myFerdinandNiyongiraHS);
		
		
		System.out.println("\nDoes Ferdinand Niyongira Hash Set contains Unknown city? "
										+ myFerdinandNiyongiraHS.contains("Unknown city"));
		System.out.println("\nDoes Ferdinand Niyongira Hash Set contains Columbus? "
										+ myFerdinandNiyongiraHS.contains("Columbus"));
		
		System.out.println("\nAble to add Mongolia on Ferdinand Niyongira Hash Set? "
										+myFerdinandNiyongiraHS.add("Mongolia"));
		System.out.println("\nAble to add Lagos on Ferdinand Niyongira Hash Set? "
										+myFerdinandNiyongiraHS.add("Lagos"));
		
		System.out.println("\nChecking Ferdinand Niyongira Hash Set size: "
										+ myFerdinandNiyongiraHS.size());
		System.out.println("\nFerdinand Niyongira Hash Set: "
										+ myFerdinandNiyongiraHS);
		
		System.out.println("\nAble to remove NewYork? "
										+ myFerdinandNiyongiraHS.remove("New York"));
		System.out.println("\nAble to remove Albany? "
										+ myFerdinandNiyongiraHS.remove("Albany"));
		
		System.out.println("\nChecking Ferdinand Niyongira Hash Set size: "
										+ myFerdinandNiyongiraHS.size());
		System.out.println("\nIs FerdinandNiyongira Hash Set empty? "
										+ myFerdinandNiyongiraHS.isEmpty());
		
		//Test the toArray() methods
		
		//Convert all elements in FerdinandNiyongiraHashSet into an Object Array
		
		Object[] array = myFerdinandNiyongiraHS.toArray();
		
		System.out.println("\nArray Length:" + array.length);
		System.out.println("\nArray1:");
		
		//Display all elements returned in the object array
		for (int i = 0; i < array.length; i++) 
		{
		    System.out.print(array[i] + " ");

		    // Start a new line after every 15 elements.
		    if ((i + 1) % 12 == 0)
		        System.out.println();
		}

		System.out.println();
		
		//Convert all elements in FerdinandNiyongiraHashSet into a String Array by specifying the array type		
		String[] citiesArray = myFerdinandNiyongiraHS.toArray(new String[0]);
		
		System.out.println("\nArray Length:" + citiesArray.length);
		System.out.println("\nArray2:");
		
		//Display all elements returned in the String array

		for (int i = 0; i < citiesArray.length; i++) 
		{
		    System.out.print(citiesArray[i] + " ");

		    // Start a new line after every 15 elements.
		    if ((i + 1) % 12 == 0)
		        System.out.println();
		}

		System.out.println();
		
		
		//Create a second HashSet to use as a separate collection for testing set operations
	
		FerdinandNiyongiraHashSet<String> testFerdinandNiyongiraHS = new FerdinandNiyongiraHashSet<>();
		
		testFerdinandNiyongiraHS.add("Dallas");
		testFerdinandNiyongiraHS.add("Wichita");
		testFerdinandNiyongiraHS.add("Lincoln");
		testFerdinandNiyongiraHS.add("Denver");
		testFerdinandNiyongiraHS.add("Pitsburg");
		
		System.out.println("\nAble to add all elements from Ferdinand Niyongira test Hash Set? "
											+ myFerdinandNiyongiraHS.addAll(testFerdinandNiyongiraHS));
		
		System.out.println("\nPrint Ferdinand Niyongira Hash Set: "+ myFerdinandNiyongiraHS);
		System.out.println("\nPrint Ferdinand Niyongira test Hash Set: "+ testFerdinandNiyongiraHS);
		System.out.println("\nChecking Ferdinand NiyongiraHash Set size: "+myFerdinandNiyongiraHS.size());
		System.out.println("\nChecking Ferdinand Niyongira test Hash Set size: "+ testFerdinandNiyongiraHS.size());
		
		//Retain elements from testHS
		System.out.println("\nRetain all common elements from Ferdinand Niyongira test Hash Set: "
											+ myFerdinandNiyongiraHS.retainAll(testFerdinandNiyongiraHS));
		System.out.println("\nPrint Ferdinand Niyongira Hash Set: "+ myFerdinandNiyongiraHS);
		System.out.println("\nPrint Ferdinand Niyongira test Hash Set: "+ testFerdinandNiyongiraHS);
		System.out.println("\nChecking FerdinandNiyongiraHashSet size: "+ myFerdinandNiyongiraHS.size());
		System.out.println("\nChecking Ferdinand Niyongira test Hash Set size: "+ testFerdinandNiyongiraHS.size());
		//Keep only elements that appears in myHS only
		
		System.out.println("\nRemove all common elements and all elments from Ferdinand Niyongira Hash Set: "
											+ myFerdinandNiyongiraHS.removeAll(myFerdinandNiyongiraHS));
		System.out.println("\nRemove all common elements and all elments from Ferdinand Niyongira test Hash Set: "
											+ testFerdinandNiyongiraHS.removeAll(testFerdinandNiyongiraHS));
		
		System.out.println("\nChecking Ferdinand Niyongira Hash Set size: "+ myFerdinandNiyongiraHS.size());
		System.out.println("\nChecking Ferdinand Niyongira test Hash Set size: "+ testFerdinandNiyongiraHS.size());
		
		System.out.println("\nIs Ferdinand Niyongira Hash Set empty? "+ myFerdinandNiyongiraHS.isEmpty());
		System.out.println("\nIs Ferdinand Niyongira test Hash Set empty? "+ testFerdinandNiyongiraHS.isEmpty());
		
		//Read city2 and corresponding distance values from the input file
		
		HashMap<String, Double> mapValues = ferdinandNiyongiraCity2AndDistance(filename);
		
		
		//Create an empty FerdinandNiyongiraHashMap to store each city2 as a key and its corresponding distance as a value
		
		FerdinandNiyongiraHashMap<String,Double> myFerdinandNiyongiraHM = new FerdinandNiyongiraHashMap<>();
		
		//Insert each city2 and its corresponding value into the FerdinandNiyongiraHashMap
		mapValues.forEach((city, distance)->{
			myFerdinandNiyongiraHM.ferdinandNiyongiraPut(city, distance);
			});
		
		System.out.println("\nPrint Ferdinand Niyongira Hash Map:" + myFerdinandNiyongiraHM);
		
		myFerdinandNiyongiraHM.ferdinandNiyongiraPut("Kigali", 400.0);
		myFerdinandNiyongiraHM.ferdinandNiyongiraPut("London", 650.0);
		
		System.out.println("\nWhether Ferdinand Niyongira Hash Map contains Phoenix as key "
										+myFerdinandNiyongiraHM.ferdinandNiyongiraContainsKey("Phoenix"));
		
		System.out.println("\nWhether Ferdinand Niyongira Hash Map contains 2175 as value "
										+myFerdinandNiyongiraHM.ferdinandNiyongiraContainsValue(2175.0));
		
		System.out.println("\nGet the value distance of San Jose " 
										+ myFerdinandNiyongiraHM.ferdinandNiyongiraGet("San Jose"));
		
		
		
		System.out.println("\nReturn set containing all Keys of the map: ");
		// Initialize the counter before displaying the map keys.
		int count = 0;

		// Examine each key returned by the map.
		for (String key : myFerdinandNiyongiraHM.ferdinandNiyongiraKeySet()) 
		{
		    // Display the current map key.
		    System.out.print(key + " ");

		    // Count the key that was just displayed.
		    count++;

		    // Move to the next line after every 15 keys.
		    if (count % 15 == 0)
		        System.out.println();
		}

		// Move to a new line after all keys have been displayed.
		System.out.println();
		
		
		System.out.println("\nReturn a set containing all values of the map: " );

		// Reset the counter before displaying the map values.
		count = 0;

		// Examine each value returned by the map.
		for (Double value : myFerdinandNiyongiraHM.ferdinandNiyongiraValues()) 
		{
		    // Display the current map value.
		    System.out.print(value + " ");

		    // Count the value that was just displayed.
		    count++;

		    // Move to the next line after every 15 values.
		    if (count % 15 == 0)
		        System.out.println();
		}

		// Move to a new line after all values have been displayed.
		System.out.println();
	
		
		System.out.println("\nReturn set containing all Key-Value pairs of the map: ");
								
		// Reset the counter before displaying the map entries.
		count = 0;

		// Examine each key-value entry returned by the map.
		for (FerdinandNiyongiraMap.FerdinandNiyongiraEntry<String, Double> entry :
		        myFerdinandNiyongiraHM.ferdinandNiyongiraEntrySet()) 
		{
		    // Display the current key-value entry.
		    System.out.print(entry + " ");

		    // Count the entry that was just displayed.
		    count++;

		    // Move to the next line after every 15 entries.
		    if (count % 8 == 0)
		        System.out.println();
		}

		// Move to a new line after all entries have been displayed.
		System.out.println();
		
	
		
		System.out.println("\nWhat's the FerdinandNiyongira Hash Map size? "
										+ myFerdinandNiyongiraHM.ferdinandNiyongiraSize());
		System.out.println("\nIs the FerdinandNiyongira HashMap empty? " 
										+ myFerdinandNiyongiraHM.ferdinandNiyongiraIsEmpty());
		
		myFerdinandNiyongiraHM.ferdinandNiyongiraRemove("Boston");

		System.out.println("\nDoes Ferdinand Niyongira Hash Map still contains Boston? " 
										+myFerdinandNiyongiraHM.ferdinandNiyongiraContainsKey("Boston"));
		
		myFerdinandNiyongiraHM.ferdinandNiyongiraClear();
		
		System.out.println("\nWhat's the FerdinandNiyongira Hash Map's new size? "
										+ myFerdinandNiyongiraHM.ferdinandNiyongiraSize());
		System.out.println("\nIs the Ferdinand Niyongira Hash Map empty?" + 
										myFerdinandNiyongiraHM.ferdinandNiyongiraIsEmpty());
		
		
		System.out.println("\n===============================TESTIN GRAPH INTERFACE WITH EDGE "
											+ "AND UNWEIGHTEDGRAPH CLASSES============================\n");

		//Create an Unweighted graph using city 1 and city2 from the input file
		FerdinandNiyongiraUnweightedGraph<String> myFerdinandNiyongiraUG = 
												ferdinandNiyongiraCreateGraphForCity1And2(filename);
		
		//Display total number of vertices stored in the graph
		System.out.print("\nDisplay all vertices and their edges: "+ 
												myFerdinandNiyongiraUG.ferdinandNiyongiraGetSize() );
		
		//Display every vertex with its connected edges
		myFerdinandNiyongiraUG.ferdinandNiyongiraPrintEdges();

		System.out.println();
		
		System.out.println("\nTotal number of vertices in the Graph: " + 
												myFerdinandNiyongiraUG.ferdinandNiyongiraGetSize());
		
		System.out.println("\nVertex at index 0: " + 
												myFerdinandNiyongiraUG.ferdinandNiyongiraGetVertex(0));
		System.out.println("\nIndex of Vertex Dallas: " 
												+ myFerdinandNiyongiraUG.ferdinandNiyongiraGetIndex("Dallas"));
		System.out.println("\nNeighboring vertex indexes for the vertex at index 0: " 
												+ myFerdinandNiyongiraUG.ferdinandNiyongiraGetNeighbors(0));
		System.out.println("\nNumber of edges connected to vertex at index 0: " 
												+ myFerdinandNiyongiraUG.ferdinandNiyongiraGetDegree(0));
		System.out.println("\nAdding a duplicate vertex: " + 
												myFerdinandNiyongiraUG.ferdinandNiyongiraAddVertex("Dallas"));
		System.out.println("\nAdding an edge from vertex 0 to vertex 1: "
												+ myFerdinandNiyongiraUG.ferdinandNiyongiraAddEdge(0,1));
		System.out.println("\nAdding a duplicate edge from vertex 0 to vertex 1: "
												+ myFerdinandNiyongiraUG.ferdinandNiyongiraAddEdge(0,1));
		
		/*Checking DFS traversal starting from vertex 0*/
		FerdinandNiyongiraUnweightedGraph<String>.SearchTree 
									ferdinandNiyongiraDFSTree = myFerdinandNiyongiraUG.ferdinandNiyongiraDFS(0);

		System.out.println("\nDFS root vertex(Starting Vertex of DFS traversal): " 
					+ myFerdinandNiyongiraUG.ferdinandNiyongiraGetVertex(ferdinandNiyongiraDFSTree.getRoot()));
		
		
		System.out.println("\nDFS search order(The order in which vertices were visited): ");
		
		// Initialize the counter before displaying the DFS search order.
		int counter = 0;

		// Examine each vertex in the order it was visited by DFS.
		for (Integer vertex : ferdinandNiyongiraDFSTree.getSearchOrder()) 
		{
		    // Display the current vertex.
		    System.out.print(vertex + " ");

		    // Count the vertex that was just displayed.
		    counter++;

		    // Move to the next line after every 15 vertices.
		    if (counter % 20 == 0)
		        System.out.println();
		}

		// Move to a new line after all DFS vertices have been displayed.
		System.out.println();
		
		
		System.out.println("\nNumber of vertices found during DFS traversal): " 
							+ ferdinandNiyongiraDFSTree.getNumberOfVerticesFound());
		
		/*Checking BFS traversal starting from vertex 0*/
		FerdinandNiyongiraUnweightedGraph<String>.SearchTree 
							ferdinandNiyongiraBFSTree = myFerdinandNiyongiraUG.ferdinandNiyongiraBFS(0);
		
		System.out.println("\nBFS root vertex(Starting Vertex of DFS traversal): " 
						+ myFerdinandNiyongiraUG.ferdinandNiyongiraGetVertex(ferdinandNiyongiraBFSTree.getRoot()));
		
		
		
		System.out.println("\nBFS search order(The order in which vertices were visited): " );
		
		// Reset the counter before displaying the BFS search order.
		counter = 0;

		// Examine each vertex in the order it was visited by BFS.
		for (Integer vertex : ferdinandNiyongiraBFSTree.getSearchOrder()) 
		{
		    // Display the current vertex.
		    System.out.print(vertex + " ");

		    // Count the vertex that was just displayed.
		    counter++;

		    // Move to the next line after every 15 vertices.
		    if (counter % 20 == 0)
		        System.out.println();
		}
		
	
		System.out.println("\n\nNumber of vertices found during DFS traversal): " 
							+ ferdinandNiyongiraBFSTree.getNumberOfVerticesFound());
		
		/*Check parent of vertex 1 in the DFS tree*/
		System.out.println("\n\nParent of vertex at index 1 in DFS tree is " + ferdinandNiyongiraDFSTree.getParent(1));
		System.out.println("\n\nPath from vertex at index 1 to DFS root: " + ferdinandNiyongiraDFSTree.getPath(1));
		System.out.println("\n\nPrint path from  DFS root to Vertex at index 1: ");
		
		ferdinandNiyongiraDFSTree.printPath(1);
		
		System.out.println("\n\nPrint a complete DFS search tree: ");
		ferdinandNiyongiraDFSTree.printTree();
		
		/*Check if the edge can be removed*/
		System.out.println("\nRemoving Edge from vertex 0 to vertex 1: " 
										+ myFerdinandNiyongiraUG.ferdinandNiyongiraRemove(0,1));
		/*Check if the the vertex can be removed*/
		System.out.println("\nRemoving vertex New York(The city exisits): " 
										+ myFerdinandNiyongiraUG.ferdinandNiyongiraRemove("New York"));
		//Check if a vertex that don't belong can be removed
		System.out.println("\nRemoving vertex Elizabeth City(The city doesn't exist): " 
										+ myFerdinandNiyongiraUG.ferdinandNiyongiraRemove("Elizabeth City"));
		//Clearing all vertices from the graph
		myFerdinandNiyongiraUG.ferdinandNiyongiraClear();
		
		System.out.println("\nThe number of vertices left after after clearing the graph: "
																+myFerdinandNiyongiraUG.ferdinandNiyongiraGetSize());
		
		
	}

}
