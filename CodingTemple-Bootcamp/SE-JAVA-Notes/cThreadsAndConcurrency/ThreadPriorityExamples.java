package cThreadsAndConcurrency;

public class ThreadPriorityExamples {
    public static void main(String[] args) {
        // Creating two threads
        Thread highPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("High Priority Thread - Count: " + i);
            }
        });

        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Low Priority Thread - Count: " + i);
            }
        });

        // Setting priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);  // Highest priority
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);    // Lowest priority

        // Starting the threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
