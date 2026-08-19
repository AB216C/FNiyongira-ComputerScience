package chapter24ImplementPriorityQueue;

public class MyPriorityQueue<E> {
	
    // Heap is used internally to maintain priority order
    private Heap<E> heap;

    // Creates a priority queue using the default ordering
    public MyPriorityQueue()
    {
        heap = new Heap<E>();
    }

    // Creates a priority queue using a custom Comparator
    public MyPriorityQueue(java.util.Comparator<E> c)
    {
        heap = new Heap<E>(c);
    }

    // Adds a new element to the priority queue
    public void enqueue(E newObject)
    {
        heap.add(newObject);
    }

    // Removes and returns the highest-priority element
    public E dequeue()
    {
        return heap.remove();
    }

    // Returns the number of elements in the priority queue
    public int getSize()
    {
        return heap.getSize();
    }

}
