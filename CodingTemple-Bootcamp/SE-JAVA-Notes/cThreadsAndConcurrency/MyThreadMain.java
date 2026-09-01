package cThreadsAndConcurrency;

public class MyThreadMain {
    public static void main(String[] args) {
        // System.out.println(Thread.activeCount());
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread().getId());

        //Thread.currentThread().setName("Thread renamed");
        //System.out.println(Thread.currentThread().getName());

        // //Thread priority range from 1 to 10
        //System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(8);
        //System.out.println(Thread.currentThread().getPriority());

        //System.out.println(Thread.currentThread().isAlive());


        // //Creating a Thread so it can sleep for a certain amount of time

//        for (int i=3; i>0; i--){
//            System.out.println(i);
//            try {
//                Thread.sleep(1500);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println("You're done!");

        //Accessing MyThread class-created

        MyThreadSubClass thread2 = new MyThreadSubClass();
//        System.out.println(thread2.isAlive());
//        System.out.println(thread2.getPriority());
//        System.out.println(thread2.getName());
//        thread2.setPriority(1);
//        System.out.println(thread2.getPriority());
        System.out.println(Thread.activeCount());


        // // Differ Daemon thread from user thread

        //Daemon thread: low-priority thread that runs in the background to perform tasks such as garbage collection
        //JVM(Java Virtual Machine) terminate itself when all user threads(non-daemon threads) finishes execution

        thread2.setDaemon(false);
        System.out.println(thread2.isDaemon());
        thread2.start();



    }
}
