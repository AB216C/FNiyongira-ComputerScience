package aJavaBasics;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamFilterAndForEach {
    public static void main(String[] args) {


        //Stream: A sequence of elements supporting sequential and parallel aggregate operations
        //Steam does not store data, but it operates on the source data such as collections, arrays or i/o channels

        //Filter: Exclude elements based on conditions(predicate). Returns only elements that matches the predicade

        //Examples on how to use Filter and Stream


        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer>evenNumbers = numbers.stream()
                                          .filter(n->n%2==0)
                                           .collect(Collectors.toList());

        List<Integer>oddNumbers = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());

        System.out.println("Even numbers:" + evenNumbers);
        System.out.println("Odd Numbers: "+ oddNumbers);

        //Another example
        //Filter only works that start by A

        List<String> words = Arrays.asList("Hello", "Bus", "Ants", "Amatara", "Donkey");

        List<String> aWords = words.stream().filter(word->word.startsWith("A")).collect(Collectors.toList());
        System.out.println(aWords);

        //Using forEach instead of collect

        List<Integer> newNumbers = Arrays.asList(101,200,3,40,500,6,7,81,90);

        //List<Integer> filtered = newNumbers.stream().filter(n->n%2==0).forEach(System.out::println);//This will give compiler error because
        // ForEach is a terminal operator that returns void not a list;
        //Variable assignment is not needed when filtering


        newNumbers.stream().filter(n->n%2==0)
                           .forEach(System.out::println);





    }
}
