package aExceptionsHandleErrors;

public class ThrowError {
    public static void main(String[] args) {
        try {
            checkNumber(-1);

        }catch(IllegalArgumentException e){
            System.out.println("Caught an exception" + e.getMessage());
        }
    }

    public static void checkNumber(int number) throws IllegalArgumentException {
        if(number<0){
            throw new IllegalArgumentException(" Number must be positive!");
        }
        System.out.println("Number is positive");
    }
}

/*

Purpose of Exception Handling:

Prevents Program Crashes: Without exception handling, errors would cause your program to stop suddenly.
Handling exceptions keeps the program running.
Keeps Code Clean: By separating error-handling code from regular code, it makes your program easier to read and maintain.
Improves Debugging: By catching exceptions, you can get detailed messages about what went wrong, helping you fix bugs.
Allows for Recovery: Your program can recover from minor issues and continue to function.

Common Exception Classes:

NullPointerException: Occurs when you try to use a null object.
ArithmeticException: Happens when you try to divide by zero.
ArrayIndexOutOfBoundsException: Occurs when you try to access an array element that doesn’t exist.
ClassCastException: Happens when you try to cast an object to a class it doesn’t belong to.

*/
