package MorePractice;
import java.util.*;
public class ListExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Claudette");
        names.add("Bk");

        System.out.println(names);

        names.remove(0);

        System.out.println(names);

        names.add("Peter");
        names.add(0,"James");
        System.out.println(names);
    }
}
