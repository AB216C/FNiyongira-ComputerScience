package cStreams;

import java.util.*;
import java.util.stream.Collectors;

public class streamExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Jane", "Tom", "Emily", "Anna");


        //Identifying all names that start with "J", Convert them to Uppercase, and add them to the list

//        //Using for loop method
//        List<String> result = new ArrayList<>();
//        for(String name:names){
//            if(name.startsWith("J")){
//                result.add(name.toUpperCase());
//            }
//        }
//        System.out.println(result);

        //Using stream method
        //In this method, collect(Collector.toList) should be used on every step of the way to collect all result from previously performed operations

//        List<String> result = names.stream()
//                                   .map(String::toUpperCase)
//                                   .collect(Collectors.toList());
//        System.out.println(result);

        //Let's add another operation

        List<String> result = names.stream()
                .map(String::toUpperCase)                      // Convert everything to Uppercase
                .filter(name->name.startsWith("J"))
                .collect(Collectors.toList());                 //Collect the result to the list
        System.out.println(result);

    }
}
