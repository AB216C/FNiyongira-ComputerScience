package bJavaClassesHints;

public class ConstructorAnimal {
    String type="Mammals";

    public ConstructorAnimal() {
        System.out.println("This is animal constructor");

    }

    public static void main(String[] args) {
        ConstructorAnimal animal = new ConstructorAnimal();
        System.out.println(animal.type);
    }

    {
        System.out.println("Block initializer");
    }
}
