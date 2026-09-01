package aInheritance;

/*
Abstract Classes/Methods
An abstract class in Java is a class that cannot be instantiated directly and is designed to be extended by other classes.
It can contain abstract methods, which are method declarations without implementations.
Subclasses of an abstract class must provide concrete implementations for these abstract methods.
The purpose of abstract classes is to serve as blueprints for other classes, guiding their structure.
Since abstract methods must be overridden, they cannot be marked as private or final.
*/

//Abstract class

abstract class Animals {

    int age;

    // Abstract method (does not have a body)
    // always end with a semi colon
    public abstract void makeSound();

    //Adding a regular method
    public void sleep(){
        System.out.println("Animal sleeps");
    }

}

    //Adding a regular methods


class Dogs extends Animals {
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

class Cat extends Animals {
    public void makeSound() {
        System.out.println("Meow  Meowwwwwwwwwwwwwwwwwwwww");
    }
}

public class InheritanceWithAbstractClass {
    public static void main(String[] args) {
//        Animal a = new Animal();  This will give a compiler error because abstract class is not supposed to be instantiated

        //Instantiate subClass

        Dogs dog = new Dogs();
        Cat cat = new Cat();

        dog.age = 23;
        cat.age = 39;

        dog.makeSound();
        cat.makeSound();
        dog.sleep();
        System.out.println("Dog's age: "+dog.age);
        System.out.println("Cat's age: "+cat.age);
    }
}



