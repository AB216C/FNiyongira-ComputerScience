package bMethodReference;

//A method reference in Java provides a way to refer to methods or constructors without actually invoking them.
// It's a shorthand syntax that allows you to pass a method as an argument to a function or use it in a lambda expression.
// Method references improve code readability by simplifying the process of calling existing methods within the context of functional programming.
// At the end of the day, these are alternative syntax that you don't have to use, but it's good to know it is valid.

import java.util.function.Function;
class Utils {
    public static int square(int x) {
        return x * x;
    }
}
public class StaticMethodReferenceExample {


    public static void main(String[] args) {
        //Static Method Reference
        //
        //Refers to a static method of a class.
        //ClassName::staticMethodName

        Function<Integer,Integer> func = Utils::square;

        System.out.println(func.apply(5));

    }
}
