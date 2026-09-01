package cCollections;
import java.util.List;
import java.util.ArrayList;

public class ListExamples {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("pineapple");
        list.add("Umutobe");

        System.out.println(list);

        System.out.println(list.get(1));
        list.set(0,"Orange");
        System.out.println(list);

        list.add(2,"Sanduich");
        System.out.println(list);

        System.out.println(list.indexOf("Banana"));
    }
}
