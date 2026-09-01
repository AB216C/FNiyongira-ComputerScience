package aJavaBasics;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 3,5, 7,9,11,13,15};

        System.out.println("Array" + Arrays.toString(numbers));


        int searchForExisting = 3;

        //search for 10 will return (-insersion point)-1: -5-1=-6 because 10 is at 5th index

        int indexExisting = Arrays.binarySearch(numbers, searchForExisting);

        System.out.println(indexExisting);

        if (indexExisting> 0) {
            System.out.println("Element: "+ searchForExisting + " Index found: "+ indexExisting);
        } else {
            System.out.println( indexExisting+ " Not found");
        }
    }
}
