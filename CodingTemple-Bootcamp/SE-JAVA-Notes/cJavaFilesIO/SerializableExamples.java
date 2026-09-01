package cJavaFilesIO;

import java.io.Serializable;
import java.io.*;

class Person implements Serializable { // Class implements Serializable
    private static final long serialVersionUID = 1L; // Optional, helps during deserialization
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class SerializableExamples {
    public static void main(String[] args) {
        // File where we will store the serialized object
        String filename = "person.ser";

        // Create a new person object
        Person person = new Person("Joe", 29);

        // Serialize the object (save it to a file)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person); // Serialize object
            System.out.println("Object has been serialized: " + person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Deserialize the object (read it from the file)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) in.readObject(); // Deserialize object
            System.out.println("Object has been deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
