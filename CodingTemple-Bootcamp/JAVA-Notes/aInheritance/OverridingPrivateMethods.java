package aInheritance;

/*
Something else to note with access modifiers is the private methods cannot be overwritten.
In the following example, each class has their own greet() method.
*/

public class OverridingPrivateMethods {

    // Superclass
    public class Parent {
        // Private method in superclass
        private String greet() {
            return "Hello from Parent";
        }
    }

    // Subclass
    public class Child extends Parent {
        // Private method in subclass
        private String greet() {
            return "Hello from Child";
        }
    }

    public static void main(String[] args) {

        OverridingPrivateMethods greet = new OverridingPrivateMethods(); //outer class

        Parent parent = greet.new Parent();  //inner class
        Child child = greet.new Child();     //second inner class

        System.out.println("Parents said: "+parent.greet());
        System.out.println("Children said: "+ child.greet());
    }
}
