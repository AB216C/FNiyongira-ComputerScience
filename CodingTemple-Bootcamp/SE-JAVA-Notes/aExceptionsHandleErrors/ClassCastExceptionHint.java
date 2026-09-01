package aExceptionsHandleErrors;
//ClassCastException error occur when you try to cast an object to a subclass that it is not an instance of.
public class ClassCastExceptionHint {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer number = (Integer)obj;    //Invalid cast

        }catch(ClassCastException e){
            System.out.println("Caught ClassCastException error:"+ e.getMessage());
        }
    }

}
