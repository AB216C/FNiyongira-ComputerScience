package aInheritance;

class SecondAnimal {
    //Parent class variables

    String name;

    //Constructors

    SecondAnimal(String name) {
        this.name = name;
    }

    //Methods

    public void eat() {
        System.out.println(name + " is eating food");
    }

    //Method to be overridden
    void makeSound(){
        System.out.println("Animal Make sounds");
    }
}

//Another class

class SecondDog extends Animal {
    //Child class variable

    String breed;

    //constructors
    SecondDog(String name, String breed) {
        super(name);  //calling the parent class(super class) constructor
        this.breed = breed;
    }

    //Child method

    void bark () {
        System.out.println(name + " the "+breed + " barks");
    }

    //Overriding method
    //@Override
    void makeSound(){
        System.out.println("Dog barks");
    }

}

//PUBLIC CLASS

public class InheritanceMethodOverriding {
    public static void main(String[] args) {
        SecondAnimal animal = new SecondAnimal("Rex");
        SecondDog myDog = new SecondDog("Marks", "Corgi");

        //call methods for both dog and animal classes
        myDog.eat();
        myDog.bark();
        //Both animal and dog will use the makeSound() method specific to their class
        animal.makeSound();  // Outputs Animal makes a sound (calling Animal makeSound method)
        myDog.makeSound();    // Outputs: Dog barks (method overriding where the more specific makeSound for Dog is the one in the Dog class)

    }
}
