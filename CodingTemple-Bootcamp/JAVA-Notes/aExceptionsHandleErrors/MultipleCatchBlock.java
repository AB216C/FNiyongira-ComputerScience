package aExceptionsHandleErrors;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
           int[] numbers = {1, 2, 3};
           System.out.println(numbers[5]);   // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0;
            System.out.println(result);  //This will throw arithmeticException

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index is out of bounds" + e.getMessage());
        }catch(
                ArithmeticException e){
            System.out.println("Can not divide by zero" + e.getMessage());
        }catch(
                Exception e){
            System.out.println("General exception caught" + e.getMessage());
        }
    }
}

