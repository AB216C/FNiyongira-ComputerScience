package bMethodReference;

import java.util.function.Consumer;

class Printer{
    public void print(String message){
        System.out.println(message);
    }
}
public class InstanceMethodReferenceSpecificInstance {
    //Refers to an instance method of a specific object
    //instance::instanceMethodName

    public static void main(String[] args) {
        Printer printer = new Printer();
        Consumer<String> consumer = printer::print;

        consumer.accept("Hello World");
    }
}
