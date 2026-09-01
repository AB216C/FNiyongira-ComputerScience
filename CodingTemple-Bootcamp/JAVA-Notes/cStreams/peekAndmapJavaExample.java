package cStreams;

//peek(): Used here to print the person's name while processing the stream.
// It doesn't modify the stream, but allows you to perform side operations like logging.
//map(): This extracts the names of the people.
//mapToInt(): A primitive version of map() that directly extracts int values (ages in this case),
// making operations like sum() more efficient.


import java.util.*;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class peekAndmapJavaExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice",30), new Person("Jack",40), new Person("Febrice",40));

        //Using peak to log objects
        people.stream()
                .peek(person-> System.out.println("Processing: "+person.getName()))
                .map(Person::getName)
                .forEach(name-> System.out.println(name));

        // Using primitive map (mapToInt) to extract ages and calculate sum

        int totalAge = people.stream()
                .mapToInt(Person::getAge)
                .sum();

        System.out.println("Total Age: "+totalAge);
    }

}
