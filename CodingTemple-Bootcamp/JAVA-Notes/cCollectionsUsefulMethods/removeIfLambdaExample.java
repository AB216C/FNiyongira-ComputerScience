package cCollectionsUsefulMethods;

import java.util.*;

public class removeIfLambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Chery", "Banana"));

        //remove element that equals Banana using Lambda
        list.removeIf(item->item.equals("Banana"));

        System.out.println(list);

    }
}
