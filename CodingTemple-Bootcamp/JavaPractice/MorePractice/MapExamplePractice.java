package MorePractice;
import java.util.*;

public class MapExamplePractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Boris", "Bosco", "Mane", "Abe"));

        System.out.println(names);

        names.forEach(name-> System.out.println(name));
        names.removeIf(name->name.equals("Boris"));

        System.out.println(names);





    }

}
