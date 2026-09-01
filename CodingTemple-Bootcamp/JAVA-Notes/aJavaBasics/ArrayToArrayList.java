package aJavaBasics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Convert Array to ArrayList
        String[] array = {"apple", "banana", "cherry"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));

        System.out.println("ArrayList: " + arrayList);
        // Output: [apple, banana, cherry]
    }
}
