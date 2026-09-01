package cTreadingMultiThreadingIssues;
//Definition: Occurs when two or more threads are blocked forever, waiting for each other to release resources.
//Example: Thread A holds resource 1 and waits for resource 2, while thread B holds resource 2 and waits for resource 1.
// Neither thread can continue.
//Real-world analogy: Two people trying to cross a narrow hallway but refusing to let the other pass first, resulting in a standstill.
//In this example both threads are locked forever because thread1 has resource1 and is waiting for resource2, while thread2 has resource2 and is waiting for resource1.

public class DeadLockExample {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked resource 1");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource2) {
                    System.out.println("Thread 1: Locked resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked resource 2");

                try { Thread.sleep(50); } catch (InterruptedException e) {}

                synchronized (resource1) {
                    System.out.println("Thread 2: Locked resource 1");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
