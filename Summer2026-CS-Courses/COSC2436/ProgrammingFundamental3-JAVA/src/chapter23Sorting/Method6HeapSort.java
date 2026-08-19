package chapter23Sorting;

import java.util.Comparator;
public class Method6HeapSort {

	/** Heap sort method */
    public static <E> void heapSort(E[] list)
    {
        // Create a Heap of integers
        heapSort(list,
            (e1, e2) -> ((Comparable<E>) e1).compareTo(e2));
    }

    /** Heap sort method */
    public static <E> void heapSort(E[] list, Comparator<E> c)
    {
        // Create a Heap of integers
        Method6Heap<E> heap = new Method6Heap<>(c);

        // Add elements to the heap
        for (int i = 0; i < list.length; i++)
            heap.add(list[i]);

        // Remove elements from the heap
        // Largest values are removed first
        for (int i = list.length - 1; i >= 0; i--)
            list[i] = heap.remove();
    }

}
