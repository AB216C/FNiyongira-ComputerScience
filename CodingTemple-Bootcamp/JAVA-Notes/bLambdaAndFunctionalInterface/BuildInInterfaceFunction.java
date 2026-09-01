package bLambdaAndFunctionalInterface;

/*Function<T, R>
Description: Represents a function that takes an argument of type T and produces a result of type R. It can be used for transformations.
Example: Convert a string to its length
*/

import java.util.function.Function;

public class BuildInInterfaceFunction {
    public static void main(String[] args) {
        Function<String,Integer> stringLength = str -> str.length();

        String testString = "Hello World";

        System.out.println("Length of this string: " + stringLength.apply(testString));
    }

}
