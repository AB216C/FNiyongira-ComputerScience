package ferdinandNiyongiraAssignment2;

public class FerdinandNiyongiraGenericQueue<E> {
	
	private java.util.LinkedList<E> list = new java.util.LinkedList<E>();
	
	//Add a new element to the end(back) of the queue
	public void ferdinandNiyongiraEnqueue(E e) 
	{
		list.addLast(e);
	}
	
	//Remove and return the first/front element in the queue
	public E ferdinandNiyongiraDequeue() 
	{
		return list.removeFirst();
	}
	
	
	//Return the number of elements currently in the queue
	
	public int ferdinandNiyongiraGetSize() 
	{
		return list.size();
	}
	
	//Return a queue converted into a string
	@Override
	public String toString() 
	{
		return "FerdinandNiyongiraGenericQueue:" + list.toString();
	}
	
	//Print results of the queue
	public void ferdinandNiyongiraPrint() 
	{
		
		System.out.print("QUEUE = [");
		
		//Loop through every element in the queue
		for (int i=0; i<list.size(); i++) 
		{
			//print the current element
			
			System.out.print(list.get(i)+ "");
			
			//If not this not the last element, print comma and space
			if(i<list.size()-1) 
			{
				System.out.print(", ");
			}
		}
		//Print the closing bracket
		System.out.print("]");
	}
	

}
