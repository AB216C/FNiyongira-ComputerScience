package cCollections;
import java.util.Set;
import java.util.HashSet;

//A Set is a collection that does not allow duplicate elements and has no specific ordering.
// They're good for when uniqueness is a factor
//A HashSet is a collection that uses a hash table for storing elements allowing for efficient lookup.
// A HashSet is faster for insertion, removal, and lookup but does not maintain order.

public class setExamples {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Mango");
        set.add("Apple");
        set.add("Mango");
        set.add("Icunga");
        set.add("Umutobe");

        System.out.println(set);
    }
}
