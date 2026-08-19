package ferdinandNiyongiraAssignment3;

import java.util.Collection;

public interface FerdinandNiyongiraTree<E> extends Collection<E> {
	/**Return true if the element is in the tree*/
	
	public boolean ferdinandNiyongiraSearch(E e);
	
	/**Insert element e into the binary tree
	 * Return true if the element is inserted successfully*/
	
	public boolean ferdinandNiyongiraInsert(E e);
	
	/**Delete the specified element from the tree
	 * Return true if the element is inserted successfully*/
	
	public boolean ferdinandNiyongiraDelete(E e);
	
	/**Get the number of elements in the tree*/
	
	public int ferdinandNiyongiraGetSize();
	
	/**Inorder traversal from the root */
	
	
	public default void ferdinandNiyongiraInorder() 
	{
		// Default implementation is empty.
		// Classes implementing FerdinandNiyongiraTree can override this method.
	}
	
	/**Postorder traversal from the root*/
	public default void ferdinandNiyongiraPostorder()
	{
		// Default implementation is empty.
		// Classes implementing FerdinandNiyongiraTree can override this method.
	}
	
	/**Preorder traversal from the root*/
	public default void ferdinandNiyongiraPreorder() 
	{
		// Default implementation is empty.
		// Classes implementing FerdinandNiyongiraTree can override this method.
	}
	
	
	@Override	/**Return true if the is empty*/
	public default boolean isEmpty() 
	{
		// A tree is empty when its size is zero.
		return this.size() == 0;
	}
	
	@Override
	public default boolean contains(Object e) 
	{
		// Use the search method to determine whether the element exists.
		return ferdinandNiyongiraSearch((E)e);
	}
	
	@Override
	public default boolean add(E e) 
	{
		// Use the insert method to add the element to the tree.
		return ferdinandNiyongiraInsert(e);
	}
	
	@Override
	public default boolean remove(Object e) 
	{
		// Use the delete method to remove the element from the tree.
		return ferdinandNiyongiraDelete((E)e);
	}
	
	@Override
	public default int size() 
	{
		// Return the number of elements currently stored in the tree.
		return ferdinandNiyongiraGetSize();
	}
	
	@Override
	public default boolean containsAll(Collection<?>c) 
	{		
		// Check every element in the specified collection.
		for (Object e : c) 
		{
			// Return false if any element is not found in the tree.
			if (!contains(e))
				return false;
		}
		
		// All elements from the collection are contained in the tree.
		return true;
	}
	
	@Override
	public default boolean addAll(Collection<? extends E> c) 
	{		
		// Keep track of whether the tree was modified.
		boolean modified = false;
		
		// Add every element from the collection to the tree.
		for (E e : c) 
		{
			// add() calls the tree's insert() method.
			if (add(e))
				modified = true;
		}
		
		// Return true if at least one element was added.
		return modified;
	}
	
	@Override
	public default boolean removeAll(Collection<?>c) 
	{		
		// Keep track of whether the tree was modified.
		boolean modified = false;
		
		// Remove every element from the tree that is found in the collection.
		for (Object e : c) 
		{
			// remove() calls the tree's delete() method.
			if (remove(e))
				modified = true;
		}
		
		// Return true if at least one element was removed.
		return modified;
	}
	
	@Override
	public default boolean retainAll(Collection<?>c) 
	{		
		// Keep track of whether the tree was modified.
		boolean modified = false;
		
		// Use the iterator to examine every element in the tree.
		java.util.Iterator<E> iterator = iterator();
		
		while (iterator.hasNext()) 
		{
			E e = iterator.next();
			
			// Remove elements that are not contained in the specified collection.
			if (!c.contains(e)) 
			{
				iterator.remove();
				modified = true;
			}
		}
		
		// Return true if at least one element was removed.
		return modified;
	}
	
	@Override
	public default Object[] toArray() 
	{		
		// Create an Object array with enough space for all tree elements.
		Object[] array = new Object[size()];
		
		// Keep track of the current position in the array.
		int index = 0;
		
		// Copy each element from the tree into the array.
		for (E e : this) 
		{
			array[index++] = e;
		}
		
		// Return the array containing all tree elements.
		return array;
	}
	
	@Override
	public default <T> T[] toArray(T[] array) 
	{
		//left as an exercises
		
		// Create a new array of the same type if the supplied array is too small.
		if (array.length < size()) 
		{
			array = java.util.Arrays.copyOf(array, size());
		}
		
		// Keep track of the current position in the array.
		int index = 0;
		
		// Copy each element from the tree into the array.
		for (E e : this) 
		{
			array[index++] = (T)e;
		}
		
		// If the supplied array is larger than the tree,
		// place null immediately after the last element.
		if (array.length > size())
			array[size()] = null;
		
		// Return the array containing all tree elements.
		return array;
	}

}
