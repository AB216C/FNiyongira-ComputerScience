package cThreadsAndConcurrency;
//Synchronize
//In Java, when multiple threads are running, they might try to access the same data at the same time.
// This can lead to problems, like one thread changing a value while another thread is reading it, causing unexpected behavior.
// To prevent these issues, we can use the synchronized keyword to control access to shared resources.
//Think of synchronized like a lock on a door: when one thread enters a synchronized block, it locks the door, preventing other threads from entering until it is done.
// This ensures that only one thread can access the shared resource at a time, keeping everything safe and organized.

public class SynchronizedExample {
    private static int count = 0; // Shared resource

    // Method to increment count
    public synchronized static void incrementCount() {
        for (int i = 0; i < 5; i++) {
            count++; // Incrementing the shared resource
            System.out.println("Count: " + count);
            try {
                Thread.sleep(100); // Simulating some work
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        // Creating two threads that will increment the count
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCount(); // Calling the synchronized method
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                incrementCount(); // Calling the synchronized method
            }
        });

        // Starting both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join(); // Main thread waits for thread1 to finish
            thread2.join(); // Main thread waits for thread2 to finish
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Display the final count
        System.out.println("Final Count: " + count);
    }


}
