package chapter24ImplementStack;

public class GenericStack<E>   // Generic stack that can store any data type
{
    // ArrayList is used internally to store stack elements
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    // Returns the number of elements in the stack
    public int getSize()
    {
        return list.size();
    }

    // Returns the top element without removing it
    public E peek()
    {
        return list.get(getSize() - 1);
    }

    // Pushes (adds) a new element onto the top of the stack
    public void push(E o)
    {
        list.add(o);
    }

    // Pops (removes) and returns the top element
    public E pop()
    {
        E o = list.get(getSize() - 1);   // Save the top element
        list.remove(getSize() - 1);      // Remove the top element
        return o;                        // Return the removed element
    }

    // Checks whether the stack is empty
    public boolean isEmpty()
    {
        return list.isEmpty();
    }

    // Returns the stack as a readable string
    @Override
    public String toString()
    {
        return "stack: " + list.toString();
    }
}
