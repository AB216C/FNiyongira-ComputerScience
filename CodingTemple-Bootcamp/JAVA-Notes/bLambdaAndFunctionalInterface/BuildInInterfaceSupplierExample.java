package bLambdaAndFunctionalInterface;
import java.util.function.Supplier;
import java.util.Random;
public class BuildInInterfaceSupplierExample {
    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);

        System.out.println("This is a random Number: "+randomNumber.get());
    }

}
