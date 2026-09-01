package PracticeExamples;

import java.util.List;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class streamsPractice {

    public static void main(String[] args) {
        //.Collectors
        List<String> Names = Arrays.asList("Jimmy", "Ben", "Quincy", "Bruce", "Juda", "Ben", "Niyo", "Bruce", "Meddy");

        //Names.forEach(System.out::println);

        Set<String> uniqueNames = Names.stream().collect(Collectors.toSet());
        System.out.println("Only unique names"+ uniqueNames);

        //Group by FIrst name

        Map<Character, List<String>> groupByFirstCharacter = Names.stream().collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println(groupByFirstCharacter);


        Map<Boolean, List<String>> partitionedByB = Names.stream().collect(Collectors.partitioningBy(name->name.startsWith("B")));

        System.out.println(partitionedByB);

        List<String> uniquo = Names.stream()
                .map(String::toUpperCase)
                .filter(name->name.startsWith("B"))
                .collect(Collectors.toList());

        System.out.println("Unique filter:"+uniquo);
    }
}
