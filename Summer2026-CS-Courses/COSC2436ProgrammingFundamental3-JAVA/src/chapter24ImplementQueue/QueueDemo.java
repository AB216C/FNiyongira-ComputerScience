package chapter24ImplementQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Create a queue
		GenericQueue<String> queue = new GenericQueue<>();

		// Add elements to the queue
		queue.enqueue("Tom"); // Add Tom to the queue
		System.out.println("(7) " + queue);

		queue.enqueue("Susan"); // Add Susan to the queue
		System.out.println("(8) " + queue);

		queue.enqueue("Kim"); // Add Kim to the queue
		queue.enqueue("Michael"); // Add Michael to the queue
		System.out.println("(9) " + queue);

		// Remove elements from the queue
		System.out.println("(10) " + queue.dequeue());
		System.out.println("(11) " + queue.dequeue());
		System.out.println("(12) " + queue);

	}

}
