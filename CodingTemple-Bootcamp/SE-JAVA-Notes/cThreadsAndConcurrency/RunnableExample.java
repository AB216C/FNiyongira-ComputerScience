package cThreadsAndConcurrency;

public class RunnableExample {
    public static void main(String[] args) {
        // Creating a worker thread using Runnable (defines the run method)
        Runnable task = () -> System.out.println("Runnable task is running");

        // Starting the thread
        Thread thread = new Thread(task);
        thread.start();
    }
}
