package MorePractice;
import java.util.*;
class Student implements Comparable<Student>{

    String name;
    int grade;

    public Student(String name, int grade){
        this.grade = grade;
        this.name = name;
    }

    @Override
    public String toString(){
        return "name:" + name + ", grade: "+ grade;
    }

    @Override
    public int compareTo(Student o) {
        //return o.grade-this.grade;
        return this.grade-o.grade;
    }
}

public class PracticesComparable {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("James",34));
        students.add(new Student("Ferdinand", 96));
        students.add(new Student("Ferdinand", 98));
        students.add(new Student("Ferd", 90));
        students.add(new Student("Paul", 35));


//        for(Student student:students){
//            System.out.println(student);
//        }

        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);
    }
}
