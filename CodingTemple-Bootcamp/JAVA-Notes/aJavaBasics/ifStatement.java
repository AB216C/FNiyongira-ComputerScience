package aJavaBasics;
public class ifStatement {
    public static void main(String[] args) {
      //Wrong syntax but doesn't result in errors
       int z = 10;
       if(z>5)
           System.out.println("z is greater than 5");
        System.out.println("Not inside if statement");


        //Another example: Correct syntax

        int y = 400;

        if( y> 100) {
            System.out.println("Y is greater  than 100");
        } else{
            System.out.println("Everthing is cool");
        }

    }
}
