package cStreams;
import java.util.*;
import java.util.stream.Collectors;

public class dotCollectAndCollectors {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aline", "Tom", "Techman", "Robin","Bosco", "Rose", "Alpha", "Omega", "Niyo", "Aline", "Bosco");

        //Unique names with no duplicates
        Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
        System.out.println("Unique names: "+uniqueNames);

        //Groupings

        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name->name.charAt(0)));
        System.out.println("Grouping result: "+ groupedByFirstLetter);

        //Boolean grouping oriented

        Map<Boolean, List<String>> partitionedByA = names.stream()
                .collect(Collectors.partitioningBy(name->name.startsWith("A")));
        System.out.println("Grouping result: " + partitionedByA);

        Map<Boolean, List<String>> partitionedByT = names.stream()
                .collect(Collectors.partitioningBy(name->name.startsWith("T")));
        System.out.println("Grouping result: " + partitionedByT);
    }
}
