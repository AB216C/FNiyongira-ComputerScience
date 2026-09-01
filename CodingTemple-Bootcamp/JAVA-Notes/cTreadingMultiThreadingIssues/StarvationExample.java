package cTreadingMultiThreadingIssues;
//Definition: Occurs when a thread is perpetually denied access to resources or execution because other threads are constantly prioritized.
//Example: A low-priority thread waits indefinitely because higher-priority threads keep using the CPU.
//Real-world analogy: Someone stuck at a busy intersection but can never cross because traffic is constantly flowing in other directions.
public class StarvationExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Low-priority thread running");
                try { Thread.sleep(100); } catch (InterruptedException e) {}
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("High-priority thread running");
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY); // Low priority
        thread2.setPriority(Thread.MAX_PRIORITY); // High priority

        thread1.start();
        thread2.start();

    }
}
