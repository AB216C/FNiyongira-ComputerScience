package cThreadsAndConcurrency;

//In Java, threads are like separate workers that can do tasks at the same time.
// This allows your program to run multiple things at once, making it faster and more efficient, especially when doing tasks like handling multiple users or running things in the background.
//When a program has many threads running together, they all work within the same environment, which is called a process.
// Threads in the same process can talk to each other and share information.
//Java has something called the Runnable interface, which is a simple way to describe a task that a thread will do.
// Runnable tasks don’t give back a result or cause errors that must be handled.
// Implementing the Runnable interface

class MyTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task is running: " + i);
            try {
                Thread.sleep(1000);  // Pauses execution for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new Thread(new MyTask());

        // Starting the thread
        thread.start();

        System.out.println("Main thread continues execution.");
    }

}
