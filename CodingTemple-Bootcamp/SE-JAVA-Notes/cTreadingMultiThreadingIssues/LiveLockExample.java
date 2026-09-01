package cTreadingMultiThreadingIssues;
//Definition: Occurs when two or more threads continuously change their state in response to each other, but no progress is made.
//Example: Two threads trying to avoid a deadlock by releasing resources and retrying, but they both keep doing this without progressing.
//Real-world analogy: Two people trying to step out of each other's way but both keep moving in the same direction repeatedly.
public class LiveLockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                synchronized (resource1) {
                    System.out.println("Thread 1: Trying to lock resource 2");
                    synchronized (resource2) {
                        System.out.println("Thread 1: Locked resource 2");
                        break;
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (resource2) {
                    System.out.println("Thread 2: Trying to lock resource 1");
                    synchronized (resource1) {
                        System.out.println("Thread 2: Locked resource 1");
                        break;
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
