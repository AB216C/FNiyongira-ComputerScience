package aJavaBasics;
import java.util.ArrayList;
public class ArrayVSArrayList {
    public static void main(String[] args) {

        //Array: Fixed size, can store primitives and objects, fewer built-in methods, not resizeable.
        //Synthax:

        int[] arrayName = new int[3];  //3 means, only 3 integers per array. It can change by creating a new array

        //Adding elements to the array

        arrayName[0]=34;
        arrayName[1]=3;
        arrayName[2]=-1;

        //Printing array
        //You can't use System.out.println(arrayName) or System.out.println(arrayName) to print array elements
        //Only for loop can be used here to print elements.

        for(int num:arrayName) {
            System.out.println(num);
        }

        //ArrayList:

        //Size: It has a dynamic size. It grows, shrinks as needed.
        //Type: Can only store objects
        //Automatically resize

        ArrayList<Integer> numbers = new ArrayList<>();

        //Adding elements to the arrayList

        numbers.add(34);
        numbers.add(-1);
        numbers.add(3);
        numbers.add(-34);
        numbers.add(14);
        numbers.add(304);
        numbers.add(340);

        //printing arrayList

        //Method 1 for printing arraylist
        System.out.println(numbers);


        //Method 2 for printing arrayList

        for(int num:numbers){
            System.out.println(num);
        }

        //3rd Method for printing arrayList

        System.out.println(numbers.toString());








    }
}
