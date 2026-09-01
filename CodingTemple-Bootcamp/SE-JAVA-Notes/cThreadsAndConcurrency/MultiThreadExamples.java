package cThreadsAndConcurrency;

public class MultiThreadExamples {
    public static void main(String[] args) {
        // Create first task using Runnable
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1 - Count: " + i);
                try {
                    Thread.sleep(500); // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Create a second task using Runnable
        Runnable task2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 2 - Count: " + i);
                try {
                    Thread.sleep(500); // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        // Create and start two threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start(); // Start first thread
        thread2.start(); // Start second thread
    }
}
