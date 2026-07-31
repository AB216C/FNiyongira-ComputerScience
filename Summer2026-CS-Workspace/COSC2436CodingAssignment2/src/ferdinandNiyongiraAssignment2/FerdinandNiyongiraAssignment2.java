package ferdinandNiyongiraAssignment2;

import java.util.Scanner;

public class FerdinandNiyongiraAssignment2 {

	public static void main(String[] args) {
		
		
		//Instantiating the FerdinandNiyongiraArray utility Class
		FerdinandNiyongiraArray array = new FerdinandNiyongiraArray();
		
		//Instantiate an int[] array object with capacity of 10
		int[] intArray = new int[10];
		
		//Instantiating FerdinandNiyongiraArrayList object using a FerdinandNiyongiraList interface reference
		FerdinandNiyongiraList<Integer> arrayList = new FerdinandNiyongiraArrayList<>();
		
		//Instantiating a LinkedList object to access linkedList-specific methods
		FerdinandNiyongiraLinkedList<Integer> linkedList = new FerdinandNiyongiraLinkedList<>();
		
		//Create my FerdinandNiyongiraList interface reference to the same FerdinandNiyongiraLinkedList object
		FerdinandNiyongiraList<Integer> linkedList2 = linkedList;
		
		//Instantiating a FerdinandNiyongiraGenericQueue Object
		FerdinandNiyongiraGenericQueue<Integer> queue = new FerdinandNiyongiraGenericQueue<>();
			
		//Instantiating a FerdinandNiyongiraGenericStack Object
		FerdinandNiyongiraGenericStack<Integer> stack = new FerdinandNiyongiraGenericStack<>();
		
		//Create scanner object
		
		Scanner keyboard = new Scanner(System.in);
		
		//Allow user to separate integers with comma or whitespace
		keyboard.useDelimiter(",|\\s+");
		
		//Prompt user to enter 10 integers
		
		System.out.print("Enter 10 integers:");
		
		//Store integers in the array
		
		for(int i=0; i<intArray.length; i++) 
		{
			int numbers = keyboard.nextInt();
			
			intArray[i]= numbers;
			arrayList.add(numbers);
			linkedList2.add(numbers);
			queue.ferdinandNiyongiraEnqueue(numbers);
			stack.ferdinandNiyongiraPush(numbers);
		}
		
		//print an array
		System.out.println("\n==========TEST ARRAY==========\n");
		array.ferdinandNiyongiraPrint(intArray);
		System.out.println();	
		
		System.out.println("\n==========TEST ARRAY LIST==========\n");
		//Print an array list
		arrayList.ferdinandNiyongiraPrint();
		System.out.println();
		
		//Return element at a specific index
		System.out.println("Value at index 4: "+arrayList.ferdinandNiyongiraGet(4));
		
		
		System.out.println("Does list contain 30? "+ arrayList.contains(30));
		
		System.out.println("\n==========TEST LINKEDLIST==========\n");
		//Check the size of the linked list
		System.out.println("Linked List size = " + linkedList.size());
		//Print a linked list using both objects reference variables
		linkedList.ferdinandNiyongiraPrint();
		linkedList2.ferdinandNiyongiraPrint();		
		//Get first element in the list
		System.out.println("Return first number:"+linkedList.ferdinandNiyongiraGetFirst());
		System.out.println("Remove last element from linked list");
		//Remove the last index
		System.out.println(linkedList.ferdinandNiyongiraRemoveLast());
		//Print again to see changes
		System.out.println("Display new linked list:");
		linkedList.ferdinandNiyongiraPrint();
		linkedList2.ferdinandNiyongiraPrint();

		System.out.println("\n==========TEST QUEUE==========\n");
		//print a queue
		queue.ferdinandNiyongiraPrint();
		System.out.println("\nRemoved first 2 elelements from the beginning of the queue");
		//Remove element from the queue
		queue.ferdinandNiyongiraDequeue();
		//Remove another element
		queue.ferdinandNiyongiraDequeue();
		//Print the queue to see changes
		System.out.println("Display new queue:");
		queue.ferdinandNiyongiraPrint();
		
		System.out.println("\n==========TEST STACK =========\n");
		//print a stack
		stack.ferdinandNiyongiraPrint();
		System.out.println("\nRemoved first 2 elelements from the top of the stack");
		//Remove element from the stack
		stack.ferdinandNiyongiraPop();
		//Remove another element
		stack.ferdinandNiyongiraPop();
		//Print the queue to see changes
		System.out.println("Display new stack:");
		stack.ferdinandNiyongiraPrint();
		
		//Print sortAlgorithmComplexity
		System.out.println("\n\n========SortAlgorithmComplexity=================");
		array.ferdinandNiyongiraSortAlgorithmComplexity();
		
		System.out.println("\n======CALL SORTING METHODS FROM ARRAY UTILITY CLASS=======\n");
		
		System.out.println();
		array.ferdinandNiyongiraInsertionSort(intArray);
		System.out.print("Insertion Sort:Array= ");
		array.ferdinandNiyongiraPrint(intArray);
		System.out.println();
		
		array.ferdinandNiyongiraBubbleSort(intArray);
		System.out.print("Bubble Sort: Array= ");
		array.ferdinandNiyongiraPrint(intArray);
		System.out.println();
		
		array.ferdinandNiyongiraMergeSort(intArray);
		System.out.print("Merge Sort: Array= ");
		array.ferdinandNiyongiraPrint(intArray);
		System.out.println();
		

		array.ferdinandNiyongiraQuickSort(intArray);
		System.out.print("Quick Sort: Array= ");
		array.ferdinandNiyongiraPrint(intArray);
		System.out.println();
		
	}

}
