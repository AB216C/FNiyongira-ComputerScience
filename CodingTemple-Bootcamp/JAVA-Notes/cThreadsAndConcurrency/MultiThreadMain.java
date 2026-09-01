package cThreadsAndConcurrency;

public class MultiThreadMain {
    public static void main(String[] args) throws InterruptedException {
        //MultiThreading: A process of executing multiple Threads simultaneously
        //Helps Maximum utilization of CPU
        //Threads are independent. They do not affect executions of other threads
        //An exception in one Thread will not interrupt other threads
        //Useful for serving multiple clients, Multiplayer games or other mutually independent tasks

        MultiThreadSubClass thread1 = new MultiThreadSubClass();

        //2nd method of creating thread using interface
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);
        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
        thread1.join(3000);   //The join method will cause both threads to stop running at the same time. 2nd thread will run after 3 seconds
        thread2.start();

        //When thread encounters exception error, it will keep running because they act independently
        System.out.println(1/0);

        //However, setting both thread into Daemon will prevent them from running anymore once faced with an exception

    }
}
