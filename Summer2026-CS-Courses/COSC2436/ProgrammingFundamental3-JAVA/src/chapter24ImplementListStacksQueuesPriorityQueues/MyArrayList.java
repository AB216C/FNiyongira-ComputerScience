package chapter24ImplementListStacksQueuesPriorityQueues;

//public class MyArrayList <E> implements MyList<E>{
//	
//	// Initial capacity of the internal array.
//    public static final int INITIAL_CAPACITY = 16;
//
//    // The array that stores all elements in the list.
//    private E[] data = (E[])new Object[INITIAL_CAPACITY];
//
//    // Number of elements currently stored in the list.
//    private int size = 0; // Number of elements in the list
//
//    /** Create an empty list */
//    public MyArrayList()
//    {
//    	
//    }
//
//    /** Create a list from an array of objects */
//    public MyArrayList(E[] objects)
//    {
//        for (int i = 0; i < objects.length; i++)
//            add(objects[i]); // Warning: don't use super(objects)!
//    }
//
//    @Override /** Add a new element at the specified index */
//    public void add(int index, E e)
//    {
//        // Ensure the index is in the right range
//        if (index < 0 || index > size)
//            throw new IndexOutOfBoundsException
//                ("Index: " + index + ", Size: " + size);
//
//        // Make sure there is enough room before inserting.
//        ensureCapacity();
//
//        // Move the elements to the right after the specified index
//        for (int i = size - 1; i >= index; i--)
//            data[i + 1] = data[i];
//
//        // Insert new element to data[index]
//        data[index] = e;
//
//        // Increase size by 1
//        size++;
//    }
//
//	/** Create a new larger array, double the current size + 1 */
//	private void ensureCapacity()
//	{
//	    if (size >= data.length)
//	    {
//	        // Create a new array with a larger capacity.
//	        E[] newData = (E[])(new Object[size * 2 + 1]);
//
//	        // Copy all existing elements into the new array.
//	        System.arraycopy(data, 0, newData, 0, size);
//
//	        // Replace the old array with the new larger array.
//	        data = newData;
//	    }
//	}
//
//	@Override /** Clear the list */
//	public void clear()
//	{
//	    // Allocate a new array with the initial capacity.
//	    data = (E[])new Object[INITIAL_CAPACITY];
//
//	    // Reset the number of stored elements.
//	    size = 0;
//	}
//
//	@Override /** Return true if this list contains the element */
//	public boolean contains(Object e)
//	{
//	    // Search every element currently stored in the list.
//	    for (int i = 0; i < size; i++)
//	        if (e.equals(data[i])) return true;
//
//	    return false;
//	}
//
//	@Override /** Return the element at the specified index */
//	public E get(int index)
//	{
//	    // Verify that the requested index is valid.
//	    checkIndex(index);
//
//	    return data[index];
//	}
//
//	
//	private void checkIndex(int index)
//	{
//	    // Verify that the index is within the valid range of the list.
//	    if (index < 0 || index >= size)
//	        throw new IndexOutOfBoundsException
//	            ("Index: " + index + ", Size: " + size);
//	}
//
//	@Override /** Return the index of the first matching element
//	 *  in this list. Return -1 if no match. */
//	public int indexOf(Object e)
//	{
//	    // Search from the beginning of the list.
//	    for (int i = 0; i < size; i++)
//	        if (e.equals(data[i])) return i;
//
//	    return -1;
//	}
//
//	@Override /** Return the index of the last matching element
//	 *  in this list. Return -1 if no match. */
//	public int lastIndexOf(E e)
//	{
//	    // Search from the end of the list.
//	    for (int i = size - 1; i >= 0; i--)
//	        if (e.equals(data[i])) return i;
//
//	    return -1;
//	}
//
//	@Override /** Remove the element at the specified position
//	 *  in this list. Shift any subsequent elements to the left.
//	 *  Return the element that was removed from the list. */
//	public E remove(int index)
//	{
//	    // Verify that the index is valid.
//	    checkIndex(index);
//
//	    // Save the element that will be removed.
//	    E e = data[index];
//	    
//	    
//	    // Shift data to the left
//	    for (int j = index; j < size - 1; j++)
//	        data[j] = data[j + 1];
//
//	    data[size - 1] = null; // This element is now null
//
//	    // Decrement size
//	    size--;
//
//	    return e;
//	}
//
//	@Override /** Replace the element at the specified position
//	 *  in this list with the specified element. */
//	public E set(int index, E e)
//	{
//	    // Verify that the index is valid.
//	    checkIndex(index);
//
//	    // Save the current element before replacing it.
//	    E old = data[index];
//
//	    // Replace the element at the specified index.
//	    data[index] = e;
//
//	    return old;
//	}
//
//	@Override
//	public String toString()
//	{
//	    // Create a StringBuilder to efficiently build the string representation.
//	    StringBuilder result = new StringBuilder("[");
//
//	    // Append each element in the list.
//	    for (int i = 0; i < size; i++)
//	    {
//	        result.append(data[i]);
//
//	        // Add a comma and space between elements, but not after the last one.
//	        if (i < size - 1)
//	            result.append(", ");
//	    }
//
//	    return result.toString() + "]";
//	}    
//	
//	
//	/** Trims the capacity to current size */
//	public void trimToSize()
//	{
//	    if (size != data.length)
//	    {
//	        // Create a new array whose capacity is exactly equal to the current size.
//	        E[] newData = (E[])(new Object[size]);
//
//	        // Copy all existing elements into the new array.
//	        System.arraycopy(data, 0, newData, 0, size);
//
//	        // Replace the old array with the trimmed array.
//	        data = newData;
//	    } // If size == capacity, no need to trim
//	}
//
//	@Override /** Override iterator() defined in Iterable */
//	public java.util.Iterator<E> iterator()
//	{
//	    // Return an iterator for traversing the elements in this list.
//	    return new ArrayListIterator();
//	}
//
//	private class ArrayListIterator
//	    implements java.util.Iterator<E>
//	{
//	    // Keeps track of the current position while iterating.
//	    private int current = 0; // Current index
//
//	    @Override
//	    public boolean hasNext()
//	    {
//	        return current < size;
//	    }
//
//	    @Override
//	    public E next()
//	    {
//	        // Return the current element, then advance to the next position.
//	        return data[current++];
//	    }
//	    
//		@Override // Remove the element returned by the last next()
//		public void remove()
//		{
//		    if (current == 0) // next() has not been called yet
//		        throw new IllegalStateException();
//
//		    // Remove the last element returned by next().
//		    MyArrayList.this.remove(--current);
//		}
//	}
//	
//	@Override /** Return the number of elements in this list */
//	public int size()
//	{
//	    return size;
//	}
//	
//	
//	@Override	/*Print all elements stored in this list. Use toString format*/
//	public void print() 
//	{
//		System.out.print("ArrayList: "+ toString());
//	}
//	
//}


public class MyArrayList<E> implements MyList<E> 
{
	
	//Initial capacity of the internal array
	public static final int INITIAL_CAPACITY = 16;
	
	//Create array that record all data in the list
	
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	private int size = 0;			//Number of elements currently stored in the list
	
	//Create an empty arrayList
	
	public MyArrayList() 
	{
		
	}
	
	/*Create a list from an array of objects*/
	public MyArrayList(E[] Objects) 
	{
		
		for (int i=0; i<Objects.length; i++) 
		{
			add(Objects[i]);		//Warning: don't use super(objects)
		}
		
	}
	
	@Override /*Add a new element at the specified index*/
	public void add(int index, E e) 
	{
		//Ensure the index is in the right range
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException
			("Index:" + index + ", Size: " + size);
		
		//Ensure there is enough capacity before inserting
		
		ensureCapacity();
		
		//Move elements to the right after specified index
		for (int i=size-1; i>=index; i--) 
		{
			data[i+1] = data[i];
		}
		
		//Insert new element to data[index]
		data[index] = e;
		
		size ++;	//Increase size by 1
	}
	
	
	/*Create a new larger array, double the current size + 1*/
	
	private void ensureCapacity() 
	{
		if(size>data.length) 
		{
			//Create a new array with a larger capacity
			E[] newData = (E[]) (new Object[size*2 + 1]);
			
			//Copy all existing elements into a new array
			System.arraycopy(data,0, newData,0,size);
			
			data = newData;	//Replace old array with larger new array
		}
		
	}
	
	
	@Override	/*Clear the list*/
	public void clear() 
	{
		//Allocate  a new array with inital capacity
		data =  (E[])  new Object[INITIAL_CAPACITY];
		size = 0;	//reset the number of stored elements
		
	}
	
	@Override		/*Return true if this list contains the element*/
	public boolean contains(Object e) 
	{
		//Search every element current stored in the list
		for (int i=0; i<size; i++) 
		{
			if(e.equals(data[i]))
				return true;
		}
		
		return false;
	}
	
	
	
	@Override	/*Return the element at the specified index*/
	public E get(int index ) 
	{
		checkIndex(index);
		
		return data[index];
	}
	
	
	private void checkIndex(int index) 
	{
		//Ensure the index is in the right range
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException
			("Index:" + index + ", Size: " + size);
	}
	
	
	@Override	/*Return the index of the first matching element. Return -1 if no match*/
	public int indexOf(Object e) 
	{
		//Search from the beginning of the list
		for (int i = 0; i < size; i++)
			if(e.equals(data[i]))
				return i;
		return -1;
	}
	
	@Override  /*Return the index of the last matching element. Return -1 if no match*/
	public int lastIndexOf(E e) 
	{
		for (int i = size-1; i>=0; i--) 
		{
			if(e.equals(data[i]))
				return i;
		}
		return -1;
	}
	
	@Override /*Remove the element from the specified position*/
	public E remove(int index) 
	{
		
		//Verify if the index is valid
		checkIndex(index);
		
		//Save the element that will be removed
		E e = data[index];
		
		//Shift data to the left
		
		for (int j=0; j<size-1; size++) 
		{
			data[j] = data[j + 1];
		}
		
		data[size-1] = null;		//This element is now null
		
		size --;			//Decrement size
		
		return e;
	}
	
	@Override	/*Replace the element at the specified position in this list with specified element*/
	public E set(int index, E e) 
	{
		checkIndex(index);
		
		//save the current element before replacing it
		E old = data[index];
		
		//Replace the element at the specified index
		data[index] = e;
		
		return old;
	}
	
	
	@Override 
	public String toString() 
	{
		//Create a StringBuilder for the efficient String representation
		StringBuilder result = new StringBuilder("[");
		
		for (int i=0; i<size; i++) 
		{
			
			//Append each element in the list
			result.append(data[i]);
			if(i<size-1)
				result.append(", ");	//Add comma and space between the elements but not the last one
		}
		
		return result.toString() + "]";
	}
	
	
	
	/*Trim the capacity of the current size*/
	public void trimToSize() 
	{
		if(size!=data.length) 
		{
			//Create a new array whose capacity is exactly equal to the current size
			E[] newData = (E[]) (new Object[size]);
			//Copy all existent elements into the new array
			System.arraycopy(data,0, newData, 0, size);
			//Replace the old array with trimmed array
			data = newData;
			//if size == capacity, no need to trim
		}
	}
	
	@Override	/*Override the iterator defined in the iterable*/
	public java.util.Iterator<E> iterator()
	{
		//Return an iterator for traversing the elements in the list
		return new ArrayListIterator();
	}
	
	
	
	private class ArrayListIterator implements java.util.Iterator<E>
	{
		//Keep track of the current position while iterating
		private int current = 0;		//current index
		
		
		@Override
		public boolean hasNext() 
		{
			return current<size;
		}
		
		
		@Override
		public E next() 
		{
			//return the current element and then advance to the next position
			return data[current++];
		}
		
		@Override	/*Remove element returned by the last next*/
		public void remove() 
		{
			if(current == 0) 
			{
				throw new IllegalStateException();
			}
			MyArrayList.this.remove(--current);
		}
	
	}
	

	@Override	/*Return the number of elements in this list*/
	public int size() 
	{
		return size;
	}

	
	@Override	/*Print all elements stored in this list. Use toString format*/
	public void print() 
	{
		System.out.print("ArrayList = "+ toString());
	}
}



