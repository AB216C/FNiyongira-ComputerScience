package aMethodsAndEncapsulation;

public class MethodOverLoading {

    /*
    We've discussed this a bit with Constructors already but method overloading allows multiple methods with the same name but different parameters.
    This enables flexibility in how a method can be called, depending on the arguments passed.
    This is a form of polymorphism (meaning many forms), one of the 4 pillars of Object Oriented Programming.
    */

    public static void main(String[] args) {
        System.out.println(add(233,433));
        System.out.println(add(2.34,234.4));
        System.out.println(add(12,34,34));
    }

    //"Void" is used in method in case you are not using "return"


    //Method 1: Adding two integers;
    public static int add(int a, int b) {
        System.out.println("Method 1 is called:");
        return a + b;
    }

    public static double add(double a,double b) {
        System.out.println("Method 2 is called:");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("Method 3 is called:");
        return a + b + c;
    }
}


