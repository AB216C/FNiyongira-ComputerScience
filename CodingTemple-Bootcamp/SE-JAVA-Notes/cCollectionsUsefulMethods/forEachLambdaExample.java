package cCollectionsUsefulMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachLambdaExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Chery", "Banana"));

        //print each element using lambda

        list.forEach(item-> System.out.println(item));
    }
}
