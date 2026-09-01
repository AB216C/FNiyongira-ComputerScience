package bLambdaAndFunctionalInterface;
import java.util.function.Consumer;
public class BuiltInInterfaceConsumerExample {
    public static void main(String[] args) {

        Consumer<String> printString = str -> System.out.println("String: " + str);

        String consumerTest = "Hello Everyone. Welcome";

        printString.accept(consumerTest);
    }
}
