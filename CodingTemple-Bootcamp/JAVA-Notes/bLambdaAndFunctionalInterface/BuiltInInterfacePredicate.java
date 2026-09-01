package bLambdaAndFunctionalInterface;
import java.util.function.Predicate;

/*
Predicate<T>
Description: Represents a boolean-valued function of one argument. It is often used for conditional checks.
*/
public class BuiltInInterfacePredicate {
    public static void main(String[] args) {
        Predicate<String> isLongerThanFive = str -> str.length()>5;

        String testString = "Hello World";

        System.out.println("Is it longer than 5 characters? " + isLongerThanFive.test(testString));
    }




}
