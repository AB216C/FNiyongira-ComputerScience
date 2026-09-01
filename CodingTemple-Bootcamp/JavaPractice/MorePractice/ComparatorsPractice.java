package MorePractice;
import java.util.*;

class Person {
    String name;
    int score;


    public Person(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString(){
        return "name:"+ name + ", score:" + score;
    }
}

class NameComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

class ScoreComparator implements Comparator<Person>{

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.score,p2.score);
    }
}

public class ComparatorsPractice {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Mugisha",34));
        people.add(new Person("Gashumba",304));
        people.add(new Person("Kamanzi",34));
        people.add(new Person("Mugisha",100));
        people.add(new Person("Sosiso",304));
        people.add(new Person("Peter",0));


        //Before sorting
        System.out.println(people);

        Collections.sort(people, new NameComparator());
        System.out.println(people);
        Collections.sort(people,new ScoreComparator());
        System.out.println(people);

    }
}
