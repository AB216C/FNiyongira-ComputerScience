package chapter24ImplementQueue;

public class GenericQueue <E> {
    // LinkedList is used internally to store queue elements
    private java.util.LinkedList<E> list
        = new java.util.LinkedList<E>();

    // Adds a new element to the rear (end) of the queue
    public void enqueue(E e)
    {
        list.addLast(e);
    }

    // Removes and returns the front (first) element of the queue
    public E dequeue()
    {
        return list.removeFirst();
    }

    // Returns the number of elements currently in the queue
    public int getSize()
    {
        return list.size();
    }

    // Returns the queue as a readable string
    @Override
    public String toString()
    {
        return "Queue: " + list.toString();
    }
	

}
