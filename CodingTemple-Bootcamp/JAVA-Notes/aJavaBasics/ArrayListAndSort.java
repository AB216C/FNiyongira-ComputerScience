package aJavaBasics;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAndSort {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(100);
        numbers.add(8);
        numbers.add(200);
        numbers.add(1);
        numbers.add(50);


        System.out.println(numbers);
        System.out.println();

        //Sorting

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
