package aMethodsAndEncapsulation;

/*
    We achieve Encapsulation through:
    Private Fields: Declare the fields of a class as private to restrict direct access from outside the class.
    Public Getter and Setter Methods: Provide public methods to get and set the values of private fields.
    These methods are known as "getters" and "setters".
    Control Access: Use getter and setter methods to control how fields are accessed or modified,
    allowing for validation and logic to be applied.
 */

public class PersonEncapsulated {
    //private fields, not directly accessible

    private int age;
    private String name;

    //constructor
    public PersonEncapsulated(int age, String name) {
        this.name = name;
        this.age = age;
    }

    //Adding getter and setter methods

    public String getName() {
        return name;
    }

    //To modify a name: Using a setter method

    public void setName (String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age>0) {
            this.age = age;
        } else {
            System.out.println("Age can not be negative");
        }

    }

}

class MainEncapsulated {
    public static void main(String[] args) {
        PersonEncapsulated person = new PersonEncapsulated( 20,"Alice");

//We can now access our class attributes using defined setter and getter methods. The objects below will results to compiler errors
//        System.out.println(person.name);
//        person.age = -1;
//        System.out.println(person.age);
        System.out.println("Person's name: "+person.getName());
        System.out.println("Person's age: "+person.getAge());
        person.setAge(-1);
        System.out.println("New age still: "+person.getAge());

        person.setAge(30);
        System.out.println("New age now: "+person.getAge());
    }



}

