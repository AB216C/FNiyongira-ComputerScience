package ferdinandNiyongiraAssignment2;

public class FerdinandNiyongiraLinkedList<E> implements FerdinandNiyongiraList<E> {
	
	//The first node in the list
	private FerdinandNiyongiraNode<E> head;
	
	
	//The second node in the list
	private FerdinandNiyongiraNode<E> tail;
	
	
	//Number of elements in the list
	private int size = 0;
	
	//Create an empty linkedlist
	public FerdinandNiyongiraLinkedList() 
	{
		
	}

	/*Create a list from an array of objects*/
	public FerdinandNiyongiraLinkedList(E[] Objects) 
	{
		//Add each element from the array to the linked list
		for (int i=0; i<Objects.length; i++) 
		{
			add(Objects[i]);
		}
	}
	
	/*Return the head element in the list*/
	public E ferdinandNiyongiraGetFirst() 
	{
		//Return null if the list is empty
		if(size==0) 
		{
			return null;
		}
		else 
		{
			return head.element;		//Return the head element
		}
	}
	
	
	/*Return the last element in the list*/
	public E ferdinandNiyongiraGetLast() 
	{
		//return null if the list is empty
		if(size==0) 
		{
			return null;
		}
		else 
		{
			return tail.element;		//Return the tail element
		}
	}
	
	
	/*Add an element to the beginning of the list*/
	
	public void ferdinandNiyongiraAddFirst(E e) 
	{
		FerdinandNiyongiraNode<E> newNode = new FerdinandNiyongiraNode<>(e);		//Create a new node
		newNode.next = head;				//Link new node with the head
		head = newNode;						//Head point to the new node
		
		if(tail==null) 
		{
			tail = head;
		}
		size++;								//Increase the size of the list
	}
	
	/*Add an element to the end of the list*/
	public void ferdinandNiyongiraAddLast(E e) 
	{
		FerdinandNiyongiraNode<E> newNode = new FerdinandNiyongiraNode<>(e);	//Create anew node or new element e
		
		if(tail==null) 
		{
			head = tail = newNode;		//The new node is the only node in the list
		}
		else 
		{
			tail.next = newNode;		//Link the new with the last node
			tail = newNode;				//tail now point to the last node
		}
		
		size ++;						//Increase the size of the list
		
	}
	
	@Override		/*Add a new element at the specified index in the list. The index of the head element is 0*/
	public void ferdinandNiyongiraAdd(int index, E e) 
	{
		//Add to the beginning of the list
		if(index==0) 
		{
			ferdinandNiyongiraAddFirst(e);
		}
		
		//Add to the end if the index is greater than or equal to the list size
		else if(index >=size) 
		{
			ferdinandNiyongiraAddLast(e);
		}
		else 
		{
			FerdinandNiyongiraNode<E> current = head;			//Start from the head node
			
			//Move to the node before the specified index
			for (int i=1; i<index; i++) 
			{
				current = current.next;
			}
			
			FerdinandNiyongiraNode<E> temp = current.next;	//Save the next node
			current.next = new FerdinandNiyongiraNode<>(e);	//Create and link the new node
			(current.next).next = temp;		//Linked the new node to the rest of the list
			
			size++;			//Increase the list's size
		}
	}
	
	/*Remove the head node and return the object that is contained in the removed node*/
	
	public E ferdinandNiyongiraRemoveFirst() 
	{
		//Return null if the list is empty
		if(size == 0) 
		{
			return null;
		}
		else 
		{
			E temp = head.element;		//Save the head element
			head = head.next;			//Move head to the next node
			size--;						//Decrease the list's size
			
			//If the head is empty now, the tail should be null
			if (head == null) 
			{
				tail = null;
			}
			
			return temp;				//return the removed node
		}
		
	}
	
	/*Remove the last node and return the object that is contained in the removed node*/
	
	public E ferdinandNiyongiraRemoveLast() 
	{
		//Return null if the list is empty
		if(size == 0) 
		{
			return null;
		}
		
		//Remove the only node in the list
		else if(size == 1) 
		{
			E temp = head.element;		//Save the element
			head = tail = null;			//The list becomes empty
			size = 0;					//Reset the list's size
			
			
			return temp;				//return the removed element
		}
		//Remove the last node in case the list has more than one node
		else 
		{
			FerdinandNiyongiraNode<E> current = head;		//Start from the head
			
			//Move through the list to find the node just before the last node
			for (int i=0; i<size-2; i++) 
			{
				current = current.next;
			}
			
			E temp = tail.element;		//Save the last element
			tail = current;				//Make the node just before the last node the new tail
			tail.next = null;			//Remove the link to the old tail
			
			size--;						//Decrease the size of the list	
			
			return temp;				//Return the removed element
		}
	}
	
	@Override	/*Remove element at the specified position in the list. 
	 			* Return the element that was removed form teh list*/
	public E ferdinandNiyongiraRemove(int index) 
	{
		//Return null if the index is invalid
		if(index < 0 || index >=size) 
		{
			return null;
		}
		
		//Remove the first element
		else if(index == 0) 
		{
			return ferdinandNiyongiraRemoveFirst();
		}
		
		//Remove the last element
		else if (index == size-1) 
		{
			return ferdinandNiyongiraRemoveLast();
		}
		//Remove the element anywhere in the middle of the list
		else 
		{
			FerdinandNiyongiraNode<E> previous = head;			//Start from the head node 
			
			for (int i=1; i<index; i++) 		//Move the node before the one to remove
			{
				previous = previous.next;		
			}
			
			FerdinandNiyongiraNode<E> current = previous.next;	//Save a reference to the node to remove
			previous.next = current.next;		//Remove the current node by connecting previous node to the next node
			
			size--;								//Decrease the size of the list
			
			return current.element;				//Return the removed element
		}
	}
	
	@Override /**Override toString() to return elements in the list*/
	public String toString() 
	{
		//Create a StringBuilder to build string efficiently
		StringBuilder result = new StringBuilder("[");
		
		FerdinandNiyongiraNode<E> current = head;					//Start from the head node
		
		while(current !=null) 
		{
			result.append(current.element);
			
			
			//If there is another element after this one, add comma
			
			if(current.next != null) 
			{
				result.append(", ");
			}
			
			current = current.next;
		}
		
		result.append("]");
		return result.toString();		//Return the completed string
	}
	
	
	@Override	/*Clear the list*/
	public void clear() 
	{
		size = 0;
		head = tail = null;
	}
	
	@Override	/*Return true if this list contains element e*/
	public boolean contains(Object e) 
	{
		FerdinandNiyongiraNode<E> current = head;	//Start from the first element
		
		//Search every element in the list
		while(current != null) 
		{
			if(current.element.equals(e)) 
			{
				return true;
			}
			
			current = current.next;		//Move to the next node
		}
		
		return false;	//Return false if element not found
	}
	
	@Override	/*Return element at the specified index*/
	public E ferdinandNiyongiraGet(int index) 
	{
		//Check for invalid index
		if(index < 0 || index>= size) 
		{
			return null;
		}
		
		FerdinandNiyongiraNode<E> current = head;		//Start from the head node
		
		//Move to the specified index
		for (int i=0; i<index; i++) 
		{
			current = current.next;
		}
		
		return current.element;		//Return the element
	}
	
	
	@Override	/*Return the index of the first matching element in this list. Return -1 if no match*/
	public int ferdinandNiyongiraIndexOf(Object e) 
	{
		FerdinandNiyongiraNode<E> current = head;		//Start from the head node
		
		//Search each node in the list
		for (int i=0; i<size; i++) 
		{
			if(current.element.equals(e)) //Return the current index if the element is found
			{
				return i;
			}
			
			current = current.next;		  //Move to the next node
		}
		
		return -1 ;	//If element not found
	}
	
	@Override 	/*Return the index of the last matching element in the list. Return -1 if no match*/
	public int ferdinandNiyongiraLastIndexOf(E e) 
	{
		FerdinandNiyongiraNode<E> current = head;	//Start from the head node
		int lastIndex = -1;		//Store the last matching index: Remains -1 if no match found
		
		//Update the lastIndex whenever a matching element is found
		for (int i=0; i<size; i++) 
		{
			if(current.element.equals(e)) 
			{
				lastIndex = i;
			}
			
			current = current.next;	//Move to the next node
		}
		
		return lastIndex;		//Return the last matching index or -1 if not match found
	}
	
	@Override	/*Replace the element at the specified position in this list with the specified element*/
	public E ferdinandNiyongiraSet( int index,  E e) 
	{
		//Check for an invalid index
		if(index<0 || index>=size) 
		{
			return null;
		}
		
		FerdinandNiyongiraNode<E> current = head;		//Start from the first node
		
		//Move to the specified index
		for (int i=0; i<index; i++) 
		{
			current = current.next;
		}
		
		E oldElement = current.element;		//Save old element
		current.element = e;				//Replace the old element
		return null;
	}
	
	
	@Override	/*Override the iterator() defined in the Iterable*/
	public java.util.Iterator<E> iterator()
	{
		return new FerdinandNiyongiraLinkedListIterator();
	}
	
	private class FerdinandNiyongiraLinkedListIterator implements java.util.Iterator<E>
	{
		private FerdinandNiyongiraNode<E> current = head;		//Current node
		private int currentIndex = 0;		//Current index;
		
		@Override	/*Return true if there another element in the list*/
		public boolean hasNext() 
		{
			return(current != null);		//
		}
		
		@Override		/*Return the next element in the list*/
		public E next() 
		{
			E e = current.element;		//Save the current element
			current = current.next;		//Move to the next node
			currentIndex ++;			//Move to the next index
			return e;					//Return the saved element
		}
		
		@Override	/*Remove element returned by the last next() call*/
		public void remove() 
		{
			//Throw an exception if next() has been not called
			if(currentIndex == 0) 
			{
				throw new IllegalStateException();
			}
			
			//Move back to the last returned index and remove that element
			FerdinandNiyongiraLinkedList.this.remove(--currentIndex);
		}
	}
	
	protected static class FerdinandNiyongiraNode<E>
	{
		E element;		//Data stored in the node
		FerdinandNiyongiraNode<E> next;	// A reference to the next node
		
		/*Create a node with specified element*/
		public FerdinandNiyongiraNode(E element) 
		{
			this.element = element;
		}
	}
	
	@Override	/**Return the number of elements in the list*/
	
	public int size() 
	{
		return size;
	}
	
	@Override	/*Print elements in the linkedList*/
	
	public void ferdinandNiyongiraPrint() 
	{
		System.out.println("LINKEDLIST = " + toString());
	}
		
	
}
