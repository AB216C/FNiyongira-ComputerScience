package ferdinandNiyongiraAssignment2;

public class FerdinandNiyongiraArrayList<E> implements FerdinandNiyongiraList<E> 
{
	
	//Initial capacity of the internal array
	public static final int INITIAL_CAPACITY = 16;
	
	//Create array that record all data in the list
	
	private E[] data = (E[]) new Object[INITIAL_CAPACITY];
	private int size = 0;			//Number of elements currently stored in the list
	
	//Create an empty arrayList
	
	public FerdinandNiyongiraArrayList() 
	{
		
	}
	
	/*Create a list from an array of objects*/
	public FerdinandNiyongiraArrayList(E[] Objects) 
	{
		
		for (int i=0; i<Objects.length; i++) 
		{
			add(Objects[i]);		//Warning: don't use super(objects)
		}
		
	}
	
	@Override /*Add a new element at the specified index*/
	public void ferdinandNiyongiraAdd(int index, E e) 
	{
		//Ensure the index is in the right range
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException
			("Index:" + index + ", Size: " + size);
		
		//Ensure there is enough capacity before inserting
		
		ferdinandNiyongiraEnsureCapacity();
		
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
	
	private void ferdinandNiyongiraEnsureCapacity() 
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
		//Allocate  a new array with initial capacity
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
	public E ferdinandNiyongiraGet(int index ) 
	{
		ferdinandNiyongiraCheckIndex(index);
		
		return data[index];
	}
	
	
	private void ferdinandNiyongiraCheckIndex(int index) 
	{
		//Ensure the index is in the right range
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException
			("Index:" + index + ", Size: " + size);
	}
	
	
	@Override	/*Return the index of the first matching element. Return -1 if no match*/
	public int ferdinandNiyongiraIndexOf(Object e) 
	{
		//Search from the beginning of the list
		for (int i = 0; i < size; i++)
			if(e.equals(data[i]))
				return i;
		return -1;
	}
	
	@Override  /*Return the index of the last matching element. Return -1 if no match*/
	public int ferdinandNiyongiraLastIndexOf(E e) 
	{
		for (int i = size-1; i>=0; i--) 
		{
			if(e.equals(data[i]))
				return i;
		}
		return -1;
	}
	
	@Override /*Remove the element from the specified position*/
	public E ferdinandNiyongiraRemove(int index) 
	{
		
		//Verify if the index is valid
		ferdinandNiyongiraCheckIndex(index);
		
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
	public E ferdinandNiyongiraSet(int index, E e) 
	{
		ferdinandNiyongiraCheckIndex(index);
		
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
	public void ferdinandNiyongiraTrimToSize() 
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
		return new FerdinandNiyongiraArrayListIterator();
	}
	
	
	
	private class FerdinandNiyongiraArrayListIterator implements java.util.Iterator<E>
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
			FerdinandNiyongiraArrayList.this.remove(--current);
		}
	
	}
	

	@Override	/*Return the number of elements in this list*/
	public int size() 
	{
		return size;
	}

	
	@Override	/*Print all elements stored in this list. Use toString format*/
	public void ferdinandNiyongiraPrint() 
	{
		System.out.print("ArrayList = "+ toString());
	}


}
