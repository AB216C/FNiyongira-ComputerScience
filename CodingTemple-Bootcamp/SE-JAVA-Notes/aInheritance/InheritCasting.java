package aInheritance;

//Upcasting: Moving from subclass to superclass, safe and automatic.

//Downcasting: When we move from superclass to subclass, explicit and risky if not done properly.

class Animale {
    public void makeSound(){
        System.out.println("Animals make Sounds");
    }
}


class DogA extends Animale {

    @Override
    public void makeSound(){
        System.out.println("Barks");
    }

    public void fetch() {
        System.out.println("Fetching.........");
    }
}


public class InheritCasting {

    public static void main(String[] args) {

        //Upcasting
        Animale myAnimal = new DogA();    //Using DogA instead of Animale after "new" are called Upcasting(implicit up case)
        myAnimal.makeSound();    // // Outputs "Bark" (runtime polymorphism)

//        myAnimal.fetch();   //This will give a compiler error since fetch() method doesn't appear in the Supper class(Animale).
        //To fix this, we will wrap DogA in brackets while creating objects

        ( (DogA) myAnimal).fetch();


        //DownCasting
        Animale myAnimal2 = new DogA();
        DogA myDog = (DogA)myAnimal;    //DownCasting do DogA
        myDog.fetch();  // // Works fine since the actual object is a Dog
    }
}
