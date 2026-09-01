package cStreams;
//A primitive stream in Java is a specialized version of the Stream interface
// that works with primitive data types, such as int, long, and double.

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {

        //Printing numbers in the range(1,6)
        IntStream numbers = IntStream.range(1,6);
        numbers.forEach(System.out::println);

        //Sum, average, and max


        IntStream intStream = IntStream.range(1,6);

        int sum = intStream.sum();
        OptionalDouble average = IntStream.range(1,6).average();
        OptionalInt max = IntStream.range(1,6).max();

        System.out.println("SUM: "+ sum);
        System.out.println("Average: "+average.orElse(0) );
        System.out.println("MAX: "+max.orElse(0));

    }
}
