package aExceptionsHandleErrors;
// NumberFormatException occurs when a string that does not represent a valid number is parsed into an integer.
public class NumberFormatExceptionTest {
    public static void main(String[] args) {

        try {
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr);   //Throw NumberFormatException
        }catch(NumberFormatException e){
            System.out.println("Caught NumberFormatException error:" + e.getMessage());
        }
    }
}
