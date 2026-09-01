package cTreadingMultiThreadingIssues;
//Definition: Occurs when two or more threads access shared data and try to modify it simultaneously, leading to unpredictable results.
//Example: Two threads try to increment the same variable at the same time, resulting in an incorrect final value.
//Real-world analogy: Two people trying to write on the same piece of paper at the same time, making the result chaotic.
public class RaceConditionExample {
    private static int counter = 0;
    public static void main(String[] args) {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter++;
            }
        };

        Thread thread1 = new Thread(incrementTask);
        Thread thread2 = new Thread(incrementTask);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final counter value: " + counter);

    }
}
