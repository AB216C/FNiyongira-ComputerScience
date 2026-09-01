package PracticeExamples;

public class MorePractice {

    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

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
                break;
            }
        });

        thread1.setPriority(Thread.MIN_PRIORITY); // Low priority
        thread2.setPriority(Thread.MAX_PRIORITY); // High priority

        thread1.start();
        thread2.start();
    }

}
