package chapter24ImplementListStacksQueuesPriorityQueues;

import java.util.Scanner;

import chapter24ImplementQueue.GenericQueue;

public class ferdinandNiyongiraDemo {
public static void main(String[] args) {
		
		
		//Instantiating the Array utility Class
		Array array = new Array();
		
		//Instantiate an int[] array object with capacity of 10
		int[] intArray = new int[10];
		
		//Instantiating MyArrayList object using a MyList interface reference
		MyList<Integer> arrayList = new MyArrayList<>();
		
		//Instantiating a LinkedList object to access linkedList-specific methods
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		
		//Create my MyList interface reference to the same MyLinkedList object
		MyList<Integer> linkedList2 = linkedList;
		
		//Instantiating a GenericQueue Object
		GenericQueue<Integer> queue = new GenericQueue<>();
			
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
			queue.enqueue(numbers);
		}
		
		//print Array
		System.out.println("\n==========TEST ARRAY==========\n");
		array.print(intArray);
		System.out.println();	
		
		System.out.println("\n==========TEST ARRAY LIST==========\n");
		//Print an Array List
		arrayList.print();
		System.out.println();
		
		//Return element at a specific index
		System.out.println("Value at index 4: "+arrayList.get(4));
		
		//Clear elements from the list
		System.out.println("Does list contain 30? "+ arrayList.contains(30));
		
		System.out.println("\n==========TEST LINKEDLIST==========\n");
		//Check the size of the linked list
		System.out.println("Linked List size = " + linkedList.size());
		//Print a linked list
		linkedList.print();
		linkedList2.print();		
		//Get first element in the list
		System.out.println("Return first number:"+linkedList.getFirst());
		System.out.println("Remove last elelement from linked list");
		//Remove the last index
		System.out.println(linkedList.removeLast());
		//Print again to see changes
		System.out.println("Display new linked list:");
		linkedList.print();
		linkedList2.print();

		System.out.println("\n==========TEST QUEUE==========\n");
		//print a queue
		queue.print();
		System.out.println("\nRemoved first 2 elelements from the queue");
		//Remove element from the queue
		queue.dequeue();
		//Remove another element
		queue.dequeue();
		//Print the queue to see changes
		System.out.println("Display new queue:");
		queue.print();
		
		//Print sortAlgorithmComplexity
		System.out.println("\n\n========SortAlgorithmComplexity=================");
		array.ferdinandNiyongiraSortAlgorithmComplexity();
		
		System.out.println("\n======CALL SORTING METHODS FROM ARRAY UTILITY CLASS===========================\n");
		
		System.out.println();
		array.insertionSort(intArray);
		System.out.print("Insertion Sort: Array= ");
		array.print(intArray);
		System.out.println();
		
		array.bubbleSort(intArray);
		System.out.print("Bubble Sort: Array= ");
		array.print(intArray);
		System.out.println();
		
		array.mergeSort(intArray);
		System.out.print("Merge Sort: Array= ");
		array.print(intArray);
		System.out.println();
		

		array.quickSort(intArray);
		System.out.print("Quick Sort: Array= ");
		array.print(intArray);
		System.out.println();
		
	}

}
