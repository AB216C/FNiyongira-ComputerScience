package cTreadingMultiThreadingIssues;
import java.util.concurrent.atomic.AtomicInteger;
//The java.util.concurrent.atomic package provides a set of atomic classes designed for safe, non-blocking operations on single variables in a multi-threaded environment.
// These classes allow threads to update values without the need for synchronization, ensuring that operations like increments and updates happen in a way that guarantees atomicity, or indivisibility.
// This means that updates to the variables are consistent and thread-safe, reducing the overhead typically associated with managing shared data in concurrent programming.
//By using atomic classes, developers can efficiently handle simple operations on shared data while minimizing the complexity of thread synchronization.
class AtomicCounter {
    private AtomicInteger count = new AtomicInteger(0);

    // Increment the count using AtomicInteger
    public void increment() {
        count.getAndIncrement();
    }

    public int getCount() {
        return count.get();
    }
}
public class AtomicExample {
    public static void main(String[] args) {
        AtomicCounter counter = new AtomicCounter();

        // Creating two threads that will try to increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Starting both threads
        t1.start();
        t2.start();

        // Waiting for both threads to finish
//        t1.join();
//        t2.join();

        // Output the final count
        System.out.println("Final count: " + counter.getCount());  // Expected: 2000
    }
}
