package aExceptionsHandleErrors;

public class UncheckedException {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4};

        //System.out.println(arr[5]);     //This will raise error called "ArrayIndexOutOfBoundsException" at run time
        //To fix it is to access something that is not out of bounds

        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Index is out of range. Please try again");

            //Adding finally to our errors handling in java. Finally code will be executed wheather you find a compiler error or not
        } finally {
            System.out.println("Execution is ended!");
        }
    }
}