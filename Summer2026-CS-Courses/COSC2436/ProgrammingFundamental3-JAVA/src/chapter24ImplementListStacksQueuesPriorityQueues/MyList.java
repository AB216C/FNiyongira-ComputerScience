package chapter24ImplementListStacksQueuesPriorityQueues;

import java.util.Collection;

///*
// * MyList<E> is a custom interface that extends Java's Collection interface.
// * It adds methods that are common to a List, such as accessing elements by index.
// */
//public interface MyList<E> extends Collection<E>
//{
//	
//    /** Add a new element at the specified index in this list */
//    public void add(int index, E e);
//
//    /** Return the element from this list at the specified index */
//    public E get(int index);
//
//    /** Return the index of the first matching element in this list.
//     *  Return -1 if no match. */
//    public int indexOf(Object e);
//
//    /** Return the index of the last matching element in this list
//     *  Return -1 if no match. */
//    public int lastIndexOf(E e);
//
//    /** Remove the element at the specified position in this list
//     *  Shift any subsequent elements to the left.
//     *  Return the element that was removed from the list. */
//    public E remove(int index);
//
//    /** Replace the element at the specified position in this list
//     *  with the specified element and returns the new set. */
//    public E set(int index, E e);
//    
//    public void print();
//
//    
//    @Override /** Add a new element at the end of this list */
//    public default boolean add(E e)
//    {
//        // Calls the indexed add() method and inserts the new
//        // element at the end of the list.
//        add(size(), e);
//
//        return true;
//    }
//
//    @Override /** Return true if this list contains no elements */
//    public default boolean isEmpty()
//    {
//        return size() == 0;
//    }
//
//    @Override /** Remove the first occurrence of the element e
//     *  from this list. Shift any subsequent elements to the left.
//     *  Return true if the element is removed. */
//    public default boolean remove(Object e)
//    {
//        // If the element exists in the list...
//        if (indexOf(e) >= 0)
//        {
//            // Remove it using its index.
//            remove(indexOf(e));
//
//            return true;
//        }
//        else
//            return false;
//    }
//
//    @Override
//    public default boolean containsAll(Collection<?> c)
//    {
//        // Left as an exercise
//
//        return true;
//    }
//
//    @Override
//    public default boolean addAll(Collection<? extends E> c)
//    {
//        // Left as an exercise
//
//        return true;
//    }
//
//    @Override
//    public default boolean removeAll(Collection<?> c)
//    {
//        // Left as an exercise
//
//        return true;
//    }
//
//    @Override
//    public default boolean retainAll(Collection<?> c)
//    {
//        // Left as an exercise
//
//        return true;
//    }
//
//    @Override
//    public default Object[] toArray()
//    {
//        // Left as an exercise
//
//        return null;
//    }
//
//    @Override
//    public default <T> T[] toArray(T[] array)
//    {
//        // Left as an exercise
//
//        return null;
//    }
//}


//MyList<E> is an interface that extends java's Collection interface

public interface MyList<E> extends Collection<E> {

	//Add element at the specified index in a list
	
	public void add(int index, E e);
	
	
	//Return element from a list at the specified index
	
	public E get(int index);
	
	//Return the index of the first matching element in the list
	//Return -1 if no match
	
	public int indexOf(Object e);
	
	//Return the index of the last matching element in the list
	//Return -1 if no match
	
	public int lastIndexOf(E e);
	
	
	/*Remove the element at the specified element in this list
	 Shift any subsequent elements to the left
	Return the element that was removed from the list */
	
	public E remove(int index);
	
	/* Replace the element a the specified index in this list
	 * With specified  element and returns a new set
	 * */
	
	public E set(int index, E e);
	
	/*Print the elements of the list*/
	public void print();
	
	
	@Override	//Add a new element at the end of the list
	public default boolean add(E e) 
	{
		add(size(), e);
		return true;
	}
	
	@Override //Returns true if this list contains no elements
	public default boolean isEmpty() 
	{
		return size() == 0;
	}
	
	@Override	/*Remove the first occurrence of the element e from this list. 
				  Shift an subsequent element to the left. 
				  Returns true if element is removed*/
	public default boolean remove(Object e) 
	{
		if(indexOf(e)>=0) 
		{
			remove(indexOf(e));
			return true;
		}
		
		else 
		{
			return false;
		}
		
	}
	
	@Override	/*Returns True of this list contains all elements of the specified collection*/
	public default boolean containsAll(Collection<?>c) 
	{
		for (Object element: c) 
		{
			if(indexOf(element)<0)
				return false;
		}
		
		return true;
	}
	
	
	@Override	/*Appends all elements in the specified collection to the end of the list*/
	public default boolean addAll(Collection<? extends E> c) 
	{
		//Loop through every element in the collection C
		for (E element: c) 
		{
			add(element);	//Add each element to the end of the list
		}
		
		return true;		//Returns true after all elements are added
		
	}
	
	
	@Override	/*Remove all elements from the list that exist in the Collection*/
	public default boolean removeAll(Collection<?>c) 
	{
		//Loop through every element in the collection C 
		for (Object element : c) 
		{
			boolean itemRemoved = remove(element);
			
			//Keep removing as long many copies of elements exist
			while (itemRemoved) 
			{
				itemRemoved = remove(element);		//Try removing another copy
			}
		}
		
		
		return true;	//Return true after removing all elements from the list
	}
	
	
	@Override	/*Keep only the elements in the list that also part of Collection C*/
	public default boolean retainAll(Collection<?> C) 
	{
		
		//Loop backward from the end of the list to index 0
		for (int i=size()-1; i>=0; i--) 
		{
			//Check if the current element is not in collection C
			if(!C.contains(get(i))) 
			{
				remove(i);		//If not in collection, remove it
			}
		}
				
		
		return true;			//Return true after removing the non-matching items from collection C
		
	}
	
	@Override	/*Convert the list into object array*/
	public default Object[] toArray()
	{
		//Create a new Array with same size as of the current list
		Object[] result = new Object[size()];
		
		//Copy each item from the list into a new Array
		for (int i=0; i<size(); i++) 
		{
			result[i] = get(i);		
		}

			
		return result;
	}
	
	@Override
	public default <T> T[] toArray(T[] array)	
	{
		//Copy every element from the list into the given array
		
		for (int i = 0; i < size(); i++) 
		{
			array[i] = (T) get(i);
		}
		
		return array;		//Return completed array
	}
	
	
	//Print all elements in any type of the array
	public default<T> void print( T[] array)
	
	{
		//Loop through every element in the array
		for (int i=0; i<array.length; i++) 
		{
			//print the current element
			System.out.print(array[i]);
		}
		System.out.println();	//Move to the next line after printing all elements
	}
	
}
