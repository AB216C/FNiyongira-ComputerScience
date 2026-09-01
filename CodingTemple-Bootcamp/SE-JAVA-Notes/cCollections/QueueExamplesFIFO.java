package cCollections;

import java.util.Queue;
import java.util.ArrayDeque;
//Queue
//A Queue is a collection that represents First In, First Out (FIFO) sequence of elements.
//ArrayDeque can implement both a queue for FIFO and a Stack for LIFO (last in first out)
public class QueueExamplesFIFO {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.add("First");
        queue.add("Second item");
        queue.add("Third item");
        queue.add("Fourth Item");

        System.out.println(queue);

        System.out.println("Poll: "+queue.poll());     //Poll removes the first item added the the queue
        System.out.println("After Poll:" + queue);
        System.out.println("Peek: "+queue.peek());     //Shows the next element in a queue

    }



}
