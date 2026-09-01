package bJavaBeans;
//JavaBeans are reusable software components in Java that follow specific conventions,
// making them easy to manage and reuse in different applications.
// They typically include private fields with public getter and setter methods for accessing them, and they must have a no-arguments constructor.
// JavaBeans are designed to be modular and can be easily manipulated in development environments, making them great for building flexible, reusable components.
public class Person {

    private String name;

    public Person() {
        // No-argument constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
