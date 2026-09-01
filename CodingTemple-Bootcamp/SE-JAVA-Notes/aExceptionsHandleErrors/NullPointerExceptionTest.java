package aExceptionsHandleErrors;


// Occurs when attempting to use an object reference
// that is null, such as calling a method or accessing a variable on a null object.

public class NullPointerExceptionTest {
    public static void main(String[] args) {

        try {
            String str = null;
            int length = str.length();   //Accessing a method on a null object

        }catch(NullPointerException e){
            System.out.println("Caught NullPointerException error: "+ e.getMessage());
        }
    }
}
