package ferdinandNiyongiraAssignment2;
/*Generic stack that can store any data type*/
public class FerdinandNiyongiraGenericStack<E> {	

	// ArrayList is used internally to store stack elements
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    // Returns the number of elements in the stack
    public int ferdinandNiyongiraGetSize()
    {
        return list.size();
    }

    // Returns the top element without removing it
    public E ferdinandNiyongiraPeek()
    {
        return list.get(ferdinandNiyongiraGetSize() - 1);
    }

    // Pushes (adds) a new element onto the top of the stack
    public void ferdinandNiyongiraPush(E o)
    {
        list.add(o);
    }

    // Pops (removes) and returns the top element
    public E ferdinandNiyongiraPop()
    {
        E o = list.get(ferdinandNiyongiraGetSize() - 1);   // Save the top element
        list.remove(ferdinandNiyongiraGetSize() - 1);      // Remove the top element
        return o;                        // Return the removed element
    }

    // Checks whether the stack is empty
    public boolean ferdinandNiyongiraIsEmpty()
    {
        return list.isEmpty();
    }

    // Returns the stack as a readable string
    @Override
    public String toString()
    {
        return "stack: " + list.toString();
    }
    
	//Print results of the queue
	public void ferdinandNiyongiraPrint() 
	{
		
		System.out.print("Stack = [");
		
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
