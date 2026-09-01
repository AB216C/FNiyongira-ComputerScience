package aJavaBasics;
import java.util.Arrays;
public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers = {23,1,0,34,40,3,3};

        //before sorting

        System.out.println("Before sorting " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("After sorting" + Arrays.toString(numbers));

        //SORTING WORDS

        String[] words = {"Banana", "Juice", "Mango", "Strawberry", "Candy", "Pineapple"};
        System.out.println("Before sorting "+ Arrays.toString(words));

        Arrays.sort(words);

        System.out.println("After sorting" + Arrays.toString(words));

    }
}
