package ferdinandNiyongiraAssignment3;

import java.util.*;

public class FerdinandNiyongiraHashSet<E> implements Collection<E>
{

	// Define the default hash table size. Must be a power of 2
	private final static int DEFAULT_INITIAL_CAPACITY = 4;

	// Define the maximum hash table size. 1 << 30 is same as 2^30
	private final static int MAXIMUM_CAPACITY = 1 << 30;

	// Current hash table capacity. Capacity is a power of 2
	private int capacity;

	// Define default load factor
	private final static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;

	// Specify a load factor threshold used in the hash table
	private float loadFactorThreshold;

	// The number of elements in the set
	private int size = 0;

	// Hash table is an array with each cell that is a linked list
	private LinkedList<E>[] table;

	/** Construct a set with the default capacity and load factor */
	public FerdinandNiyongiraHashSet() 
	{
		// Use the default capacity and default load factor.
		this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
	}

	/** Construct a set with the specified initial capacity and
	 * default load factor */
	public FerdinandNiyongiraHashSet(int initialCapacity) 
	{
		// Use the specified capacity and default load factor.
		this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
		
	}

	/** Construct a set with the specified initial capacity
	 * and load factor */

	public FerdinandNiyongiraHashSet(int initialCapacity, float loadFactorThreshold) 
	{
		// Make sure the capacity does not exceed the maximum allowed capacity.
		if (initialCapacity > MAXIMUM_CAPACITY)
	      this.capacity = MAXIMUM_CAPACITY;
	    else
	      // Make the capacity a power of 2.
	      this.capacity = trimToPowerOf2(initialCapacity);

		// Store the load factor threshold.
	    this.loadFactorThreshold = loadFactorThreshold;

	    // Create the hash table with the specified capacity.
	    table = new LinkedList[capacity];
	}

	@Override /** Remove all elements from this set */
	public void clear() 
	{
		// Reset the number of elements to zero.
		size = 0;

		// Remove all elements from every bucket.
	    removeElements();
	}

	@Override /** Return true if the element is in the set */
	public boolean contains(Object e) 
	{
		// Calculate the bucket index using the element's hash code.
		int bucketIndex = hash(e.hashCode());

		// Check whether the bucket exists.
		if (table[bucketIndex] != null) 
		{
			// Get the linked list stored in the bucket.
			LinkedList<E> bucket = table[bucketIndex];

			// Search the bucket for the specified element.
			return bucket.contains(e);
	    }
		
		// Return false if the bucket does not exist.
		return false;
		
	  }

	@Override /** Add an element to the set */
	public boolean add(E e) 
	{
		// Check whether the element already exists in the set.
		if (contains(e)) // Duplicate element not stored
			return false;

		// Check whether adding the new element exceeds the load factor.
		if (size + 1 > capacity * loadFactorThreshold) 
		{
			// Do not allow the table to grow beyond the maximum capacity.
			if (capacity == MAXIMUM_CAPACITY)
				throw new RuntimeException("Exceeding maximum capacity");

			// Increase the capacity and redistribute the elements.
			rehash();
			
		}

		// Calculate the bucket index for the new element.
		int bucketIndex = hash(e.hashCode());

		// Create a linked list for the bucket if it is not created
		if (table[bucketIndex] == null) 
		{
			// Create a new linked list for the bucket.
			table[bucketIndex] = new LinkedList<E>();
			
		}

		// Add e to hashTable[index]
		table[bucketIndex].add(e);

		// Increase the number of elements.
		size++; // Increase size

		// Return true because the element was successfully added.
		return true;
		
	}

	@Override /** Remove the element from the set */
	public boolean remove(Object e) 
	{
		// Check whether the element exists before attempting to remove it.
		if (!contains(e))
	      return false;

		// Calculate the bucket index for the element.
	    int bucketIndex = hash(e.hashCode());

	    // Create a linked list for the bucket if it is not created
	    if (table[bucketIndex] != null) 
	    {
	    	// Get the bucket containing the element.
	    	LinkedList<E> bucket = table[bucketIndex];

	    	// Remove the specified element from the bucket.
	    	bucket.remove(e);
	    	
	    }

	    // Decrease the number of elements.
	    size--; // Decrease size

	    // Return true because the element was removed.
	    return true;
	    
	}
	  
	@Override /** Return true if the set contains no elements */
	public boolean isEmpty() 
	{
		// The set is empty when its size is zero.
		return size == 0;
	}

	@Override /** Return the number of elements in the set */
	public int size() 
	{
		// Return the current number of elements.
		return size;
	}

	@Override /** Return an iterator for the elements in this set */
	public java.util.Iterator<E> iterator() 
	{
		// Create and return an iterator for this hash set.
		return new MyHashSetIterator(this);
	}

	/** Inner class for iterator */
	private class MyHashSetIterator implements java.util.Iterator<E> 
	{
		// Store the elements in a list
		private java.util.ArrayList<E> list;

		// Point to the current element in list
		private int current = 0; // Point to the current element in list

		// Store a reference to the hash set being traversed.
		private FerdinandNiyongiraHashSet<E> set;

		/** Create a list from the set */
		public MyHashSetIterator(FerdinandNiyongiraHashSet<E> set) 
		{
			// Store the reference to the set.
			this.set = set;

			// Copy all elements from the set into a list.
			list = setToList();
			
		}

		@Override /** Next element for traversing? */
		public boolean hasNext()
		{
			// Return true if there are more elements to traverse.
			return current < list.size();
			
		}

		@Override /** Get current element and move cursor to the next */
		public E next() 
		{
			// Return the current element and move to the next position.
			return list.get(current++);
			
		}

		@Override /** Remove the element returned by the last next() */
		
		public void remove() 
		{
			// Get the element that was most recently returned by next().
			E element = list.get(current - 1);

			// Remove the element from the actual hash set.
			set.remove(element);

			// Remove the element from the iterator's list.
			list.remove(current - 1);

			// Move the cursor back because the list became smaller.
			current--;
	    }
		
	}


	/** Hash function */
	private int hash(int hashCode) 
	{
		// Use the lower bits of the hash code to determine the bucket.
		return hashCode & (capacity - 1);
	}

	/** Return a power of 2 for initialCapacity */
	private int trimToPowerOf2(int initialCapacity) 
	{
		// Start with the smallest power of 2.
		int capacity = 1;

		// Keep doubling the capacity until it reaches the requested size.
		while (capacity < initialCapacity) 
		{
			capacity <<= 1;
		}

		// Return the calculated power-of-two capacity.
		return capacity;
	}

	/** Remove all e from each bucket */
	private void removeElements() 
	{
		// Visit every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Remove all elements from the current bucket.
				table[i].clear();
	        }
	    }
	}

	/** Rehash the set */
	private void rehash() 
	{
		// Copy all existing elements into a temporary list.
		java.util.ArrayList<E> list = setToList(); // Copy to a list

		// Double the capacity of the hash table.
		capacity <<= 1; // Double capacity

		// Create a new hash table with the new capacity.
		table = new LinkedList[capacity]; // Create a new hash table

		// Reset size because the elements will be inserted again.
		size = 0; // Reset size
		
		// Add every element to the newly created hash table.
		for (E element: list) 
		{
			add(element); // Add from the old table to the new table
		}
		
	}

	/** Copy elements in the hash set to an array list */
	private java.util.ArrayList<E> setToList() 
	{
		// Create a list to store all elements in the hash set.
		java.util.ArrayList<E> list = new java.util.ArrayList<>();

		// Examine every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Traverse every element in the current bucket.
				for (E e: table[i]) 
				{
					// Add the element to the list.
					list.add(e);
	            }
	        }
	    }

		// Return the list containing all elements.
	    return list;
	}

	@Override
	public String toString() 
	{
		// Copy all elements from the set into a list.
		java.util.ArrayList<E> list = setToList();

		// Create a StringBuilder for the string representation.
		StringBuilder builder = new StringBuilder("[");

	    // Add the elements except the last one to the string builder
	    for (int i = 0; i < list.size() - 1; i++) 
	    {
	    	builder.append(list.get(i) + ", ");
	    	
	    	// Start a new line after every 15 elements.
	    	if ((i + 1) % 12 == 0)
	    		builder.append("\n");
	    }

	    // Add the last element in the list to the string builder
	    if (list.size() == 0)
	        builder.append("]");
	    else
	        builder.append(list.get(list.size() - 1) + "]");

	    // Return the completed string representation.
	    return builder.toString();
	}

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
	    // Add every element from the specified collection.
	    boolean changed = false;

	    for (E e : arg0)
	    {
	    	// Add the element and track whether the set changed.
	    	if (add(e))
	    		changed = true;
	    }

	    // Return true if at least one element was added.
	    return changed;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
	    // Check whether every element in the specified collection exists in this set.
	    for (Object e : arg0)
	    {
	    	if (!contains(e))
	    		return false;
	    }

	    // Return true when all elements are contained in the set.
	    return true;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
	    // Track whether any elements were removed.
	    boolean changed = false;

	    // Remove every element from the specified collection.
	    for (Object e : arg0)
	    {
	    	if (remove(e))
	    		changed = true;
	    }

	    // Return true if the set was modified.
	    return changed;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
	    // Track whether any elements were removed.
	    boolean changed = false;

	    // Create a list of the current elements to avoid modifying
	    // the hash table while traversing it directly.
	    java.util.ArrayList<E> list = setToList();

	    // Remove elements that are not contained in the specified collection.
	    for (E e : list)
	    {
	    	if (!arg0.contains(e))
	    	{
	    		remove(e);
	    		changed = true;
	    	}
	    }

	    // Return true if the set was modified.
	    return changed;
	}

	@Override
	public Object[] toArray() {
	    // Create a list containing all elements in the set.
	    java.util.ArrayList<E> list = setToList();
	    
	    

	    // Convert the list into an Object array.
	    return list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
	    // Create a list containing all elements in the set.
	    java.util.ArrayList<E> list = setToList();

	    // Convert the list into an array of the requested type.
	    return list.toArray(arg0);
	}

}
