package aInheritance;

class Animal {
    //Parent class variables

    String name;

    //Constructors

    Animal(String name) {
        this.name = name;
    }

    //Methods

    public void eat() {
        System.out.println(name + " is eating food");
    }
}

//Another class

class Dog extends Animal {
    //Child class variable

    String breed;

    //constructors
    Dog(String name, String breed) {
        super(name);  //calling the parent class(super class) constructor
        this.breed = breed;
    }

    //Child method

    void bark () {
        System.out.println(name + " the "+breed + " barks");
    }

}

//PUBLIC CLASS

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("Marks", "Corgi");

        //call methods for both dog and animal classes
        myDog.eat();
        myDog.bark();
    }
}


