package chapter19Generic4Wildcard;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList();
	
	public int getSize() 
	{
		return list.size();
	}
	
	public E get(int index) 
	{
		return list.get(index);
	}
	
	
	public E peek() 
	{
		return list.get(getSize()-1);
	}
	
	
	public E pop() 
	{
		E o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o;
	}
	
	public void push(E o) 
	{
		list.add(o);
	}
	
	public boolean isEmpty() 
	{
		return list.isEmpty();
	}
	
	
	@Override
	public String toString() 
	{
		return "Stack" + list.toString();
	}
	

}
