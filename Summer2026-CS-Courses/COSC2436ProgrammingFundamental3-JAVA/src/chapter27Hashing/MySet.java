package chapter27Hashing;

public interface MySet<E> extends java.lang.Iterable 
{
	/**Remove all elements from this set*/
	
	public void clear();
	
	/**Return true if the element is in the set*/
	
	public boolean contains(E e);
	
	/**Add an element to the set*/
	
	public boolean add(E e);
	
	/**Remove the element from the set*/
	
	public boolean remove(E e);
	
	/**Return true if the set contains no elements*/
	
	public boolean isEmpty();
	
	/**Return the number of elements from the set*/
	
	public int size();
	
}
