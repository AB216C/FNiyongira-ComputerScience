package bLambdaAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExamples {
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Double every single integer in the list
        List<Integer> doubled = new ArrayList<>();

        //Using for Loop to double each digit

//        for (int number : numbers) {
//            doubled.add(number * 2);
//        }

        //using Lambda to achieve the same results
        numbers.forEach(number->doubled.add(number*2));
        System.out.println(doubled);


        /*
        The code number -> doubled.add(number * 2) is a lambda expression.
        It can be read as: "For each number in the list, add number * 2 to the doubled list.

        Instead of creating an explicit loop (for or while) to process the elements, lambdas allow us
        to directly define the behavior we want to apply to each element in the collection.
        */

    }
}