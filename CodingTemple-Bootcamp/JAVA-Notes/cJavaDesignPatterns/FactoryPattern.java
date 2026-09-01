package cJavaDesignPatterns;
interface Animal {
    void makeSound();
}

class Bird implements Animal {
    public void makeSound() {
        System.out.println("Tweet");
    }
}

class Cat implements Animal {
    public void makeSound(){
        System.out.println("Meow");
    }
}

class AnimalFactory {
    //Methods that creeate objects based on input
    public static Animal createAnimal(String type){
        if (type.equalsIgnoreCase("bird")) {

            return new Bird();
        }else if(type.equalsIgnoreCase("cat")){
            return new Cat();
        }else {
            throw new IllegalArgumentException("Unknown Animal Type");
        }
    }
}


public class FactoryPattern {
    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.createAnimal("bird");
        animal1.makeSound();

        Animal animal2 = AnimalFactory.createAnimal("cat");
        animal2.makeSound();
    }

}
