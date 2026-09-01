package cCollections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//Comparable:

//Comparable is an interface used to define the natural ordering of objects in a class.
// Objects of a class that implement Comparable can be sorted using methods like Collections.sort() or by data structures that rely on ordering (like TreeSet or TreeMap).
//You define the comparison logic inside the class itself by overriding the compareTo() method.

//CompareTo returns:

//Negative Integer: If the current object is less than the specified object.
//Zero: If the current object is equal to the specified object.
//Positive Integer: If the current object is greater than the specified object.

class Student implements Comparable<Student>{
    String name;
    int grade;


    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }


    @Override
    public String toString(){
        return name + ":" + grade;
    }

    @Override
    public int compareTo(Student o){
        //return this.grade-o.grade;    //Make the ascending order of the int value
        return o.grade-this.grade;     //Make the Descending order of the int value
    }
}
public class ComparableExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Edmont", 23));
        students.add(new Student("Aline", 203));
        students.add(new Student("Mathew", 40));
        students.add(new Student("Karara", 100));
        students.add(new Student("John", 20));
        students.add(new Student("Bill", 2));

        System.out.println("Before sorting: "+students);
        Collections.sort(students);
        System.out.println("After sorting: "+ students);

    }
}
