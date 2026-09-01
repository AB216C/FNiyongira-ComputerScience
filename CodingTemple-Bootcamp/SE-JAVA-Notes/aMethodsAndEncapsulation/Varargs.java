package aMethodsAndEncapsulation;


/*
Optional Specifiers

Java methods can have an Optional Specifier. Each have its own usage, must be after Access Modifier and before return type.

1. STATIC: Indicate that a member(variable, method, block, and nested class) belongs to the class, not the instances of the class
2. Abstract: Used to declare a method without implementation or a class that can not be instantiated
3. Final: Prevent modifications: A final variable can not be reassigned, and a final method can not be overridden;
and a final class can not be subclassed.
4. Synchronized:  Restrict access to a method or block by allowing only one thread to execute it at a time.
*/

/*
Varargs

Not really much to say about normal parameters.  We specify the type we need and then utilize it!

Java has another somewhat used parameter type called Varargs or Variable Length Arguments
that allow a method to accept zero or more arguments of a specific type.
They are defined by three dots (...) after the parameter type in the method signature.
The following sum method can take in any number as arguments
*/
public class Varargs {

    public static int sum(int x, int...numbers) {
        int total = 0;

        for(int num:numbers) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        int varargsTest = sum(2,5,6);
        System.out.println(varargsTest);
    }

}
