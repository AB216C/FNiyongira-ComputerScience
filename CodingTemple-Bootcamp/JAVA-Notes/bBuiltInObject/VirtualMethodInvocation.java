package bBuiltInObject;
//VirtualMethodInvocation
//When a method is called on an object, the method that is executed is determined at runtime.
//It calls the most specific method, depending on the actual object's class, not the reference type.
class Animal {
    void sound() {
        System.out.println("Animal make Sound");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("Dogs barks");
    }
}

public class VirtualMethodInvocation {
    public static void main(String[] args) {

        Animal myAnimal = new Dog();     //This is Superclass reference to subclass object
        myAnimal.sound();      //Virtual method invocation calls dog's sound method

    }
}
