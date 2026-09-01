package aJavaBasics;
import java.util.ArrayList;

class Course {

    String name;
    int grade;
    String studentName;

    //Constructor

    public Course(String name, int grade, String studentName) {
        this.name = name;
        this.grade = grade;
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return "Name:"+name + ", Grade:" + grade + ", Student Name:" + studentName;
    }

}
public class MixedVsSimilarTypeArrayList {
    public static void main(String[] args) {

        //ArrayList storing different types of variables
        //1. This allows you to store any type of object in the list;
        ArrayList<Object> mixedList = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();   //If you want to use a different keyword other than "Object", you need to create a class and constructors ready to work.
                                                          //Otherwise, you will get a compiler error. For a non-class mixed ArrayList, you should always use Object.

        mixedList.add("Hello");
        mixedList.add(12);
        mixedList.add(true);
        mixedList.add("Amakuru");

        courses.add(new Course("Math", 45, "Fabiola"));
        courses.add(new Course("Chemistry", 90, "Peter"));


        for(Object item:mixedList){
            System.out.println(item);
        }

        //Executing mixedList
        System.out.println(mixedList);

        //Executing mixedList with class
        for(Course course:courses){
            System.out.println(course);
        }

        //2.Storing same type of object in an ArrayList;
        //In this case, String,double, Integer will be used to determine which datatype is being used in a list

        ArrayList<Double> doubleList = new ArrayList<>();

        doubleList.add(3.0);
        doubleList.add(4.5);

        ArrayList<String> stringList = new ArrayList();
        stringList.add("Men");
        stringList.add("Woman");

        ArrayList<Integer> integerList = new ArrayList();
        integerList.add(3);
        integerList.add(4);

        System.out.println(doubleList);
        System.out.println(stringList);
        System.out.println(integerList);







    }
}
