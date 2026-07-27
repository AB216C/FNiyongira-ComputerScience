package chapter24ImplementPriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// Create four patients with different priorities
        Patient patient1 = new Patient("John", 2);
        Patient patient2 = new Patient("Jim", 1);
        Patient patient3 = new Patient("Tim", 5);
        Patient patient4 = new Patient("Cindy", 7);

        // Create a priority queue for Patient objects
        MyPriorityQueue<Patient> priorityQueue = new MyPriorityQueue<>();

        // Add patients to the priority queue
        priorityQueue.enqueue(patient1);
        priorityQueue.enqueue(patient2);
        priorityQueue.enqueue(patient3);
        priorityQueue.enqueue(patient4);

        // Remove patients one by one in priority order
        while (priorityQueue.getSize() > 0)
            System.out.print(priorityQueue.dequeue() + " ");
		
	}
	
	 static class Patient implements Comparable<Patient>
	    {
	        // Patient information
	        private String name;
	        private int priority;

	        // Constructor
	        public Patient(String name, int priority)
	        {
	            this.name = name;
	            this.priority = priority;
	        }

	        // Returns a readable representation of the patient
	        @Override
	        public String toString()
	        {
	            return name + "(priority:" + priority + ")";
	        }

	        // Defines how patients are compared by priority
	        @Override
	        public int compareTo(Patient o)
	        {
	            return this.priority - o.priority;
	        }
	    }
}
