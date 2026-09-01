package bMethodReference;
import java.util.*;
class Person {
    String name ;
    public Person (String name){
        this.name = name;
    }

    public int CompareByName (Person other){
        return this.name.compareTo(other.name);
    }
}
public class InstanceMethodReferenceArbitrary {
    public static void main(String[] args) {
        //Refers to an instance method of an arbitrary object of a specified type.
        //ClassName::instanceMethodName

        List <Person> people = Arrays.asList(
                new Person("Alice"),
                new Person("Jacky"),
                new Person("Charles")
        );

        people.sort(Person::CompareByName);   //sorting using instance method
       people.forEach(person-> System.out.println(person.name));
    }
}
