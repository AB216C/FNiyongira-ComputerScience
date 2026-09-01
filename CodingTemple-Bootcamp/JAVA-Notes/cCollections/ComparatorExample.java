package cCollections;

import java.util.*;

//Comparator is an interface used to define an alternative ordering of objects.
//It allows sorting objects based on different attributes without modifying the class itself.

class Students {
    String name;
    int grade;

    public Students(String name, int grade){
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString(){
        return name + ":" + grade;
    }
}

class NameComparator implements Comparator<Students>{
    @Override
    public int compare(Students S1, Students S2) {
        return S1.name.compareTo(S2.name);
    }
}

class GradeComparator implements Comparator<Students>{
    @Override
    public int compare(Students S1, Students S2) {
        return Integer.compare(S1.grade,S2.grade);
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students("Edmont", 23));
        students.add(new Students("Aline", 203));
        students.add(new Students("Mathew", 40));
        students.add(new Students("Karara", 100));
        students.add(new Students("John", 20));
        students.add(new Students("Bill", 2));


        Collections.sort(students,new GradeComparator());
        System.out.println("Sorted by Grade:"+ students);
        Collections.sort(students,new NameComparator());
        System.out.println("Sorted by Names:"+ students);

    }
}
