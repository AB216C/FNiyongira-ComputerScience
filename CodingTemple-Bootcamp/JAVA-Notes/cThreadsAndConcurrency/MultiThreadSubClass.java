package cThreadsAndConcurrency;

//This is called a subclass because it is a subclass of Thread class.
//Thread class: It is a built in class
//Overriding a method simply means, using a method in a parent class and customize it with your own code of choice. But its name stay the same
public class MultiThreadSubClass extends Thread{

    @Override
    public void run(){
        System.out.println("Thread 1 is running now");

        for(int i=10; i>=0; i--){
            System.out.println("Thread #1 : "+i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread 1 is finished :)");
    }
}
