package cThreadsAndConcurrency;


//This is interface

import static java.lang.Thread.sleep;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 2 is running now");

        for(int i=0; i<=10; i++){
            System.out.println("Thread #2 :"+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread 2 is finished :)");
    }
}
