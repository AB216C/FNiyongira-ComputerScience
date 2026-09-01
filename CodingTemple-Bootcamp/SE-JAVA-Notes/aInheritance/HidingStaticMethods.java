package aInheritance;

class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

/*
In Java, static methods cannot be overridden, but they can be hidden.
When a subclass defines a static method with the same name and parameters as a static method in the superclass, it hides the superclass method.
This works similarly to overriding.
*/

public class HidingStaticMethods {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child(); // Reference type is Parent

        parent.greet();  // Calls Parent's static method
        child.greet();   // Still calls Parent's static method (not overridden)
    }
}
