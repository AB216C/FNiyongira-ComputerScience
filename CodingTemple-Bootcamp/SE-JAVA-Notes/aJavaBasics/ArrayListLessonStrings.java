package aJavaBasics;
import java.util.ArrayList;
public class ArrayListLessonStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //Add elements

        list.add("Banana");
        list.add("Strawberry");
        list.add("Tomatoes");

        System.out.println(list);

        //.set() replace elements at a specified index with a provided element

        list.set(1, "Blueberry");
        System.out.println(list);

        //.isEmpty() a boolean, returns true if empty or false if otherwise
        System.out.println(list.isEmpty());

        //.size() return the size of a list

        System.out.println(list.size());

        //.contains checks if

        System.out.println(list.contains("Rasberry"));

        //.clear() delete all data in the list
//
        list.clear();
        System.out.println("Everthing has been deleted:" + list);

        // .equals compares two lists

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Banana");
        list2.add("Blueberry");
        list2.add("Tomatoes");

        System.out.println(list.equals(list2));

        //.remove() by specifying index

        list2.remove(0);
        System.out.println("Remaining items for list2 are "+list2);

        //.remove() by specifying object

        list2.remove("Tomatoes");
        System.out.println("Remaining items for list2 are "+list2);


    }
}
