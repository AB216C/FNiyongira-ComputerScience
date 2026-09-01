package cThreadsAndConcurrency;

public class MyThreadSubClass extends Thread{

    @Override
    public void run(){
        if(this.isDaemon()){
            System.out.println("This is Daemon thread running");
        }else{
            System.out.println("This is a user thread that is running");
        }
    }
}
