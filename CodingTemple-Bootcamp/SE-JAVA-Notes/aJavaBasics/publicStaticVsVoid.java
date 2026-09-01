package aJavaBasics;
public class publicStaticVsVoid {
//instance vs class variables

    int age;  // instance variables: This is available for one student(field) default value for int is zero (0)
    static int classSize; //This is available to all students(shared across our class) default value is zero

    // Default value for bool will be defaulted to false
    // Default value for objects such as String will be defaulted to Null

    //Instance Variables - These are the fields inside our class (not created inside a method)

    //Class Variables - created with static keyword, a shared variable across classes (every class accesses the same variable) This will be discussed more when we dive into classes.

    public static int addNumber (int x ) {
        int y = 0;  // This a local variable. Only accessible by addNumber
        return x + y ; // return an int type
    }

    public static void main(String[] args) {
        addNumber(5);
        //System.out.println(y);  //Y is only accessible in addNumber
    }

    // Java scope and understanding local variables

    public static void accessNumber() {
        int num1 = 5;

        {
            //created scope
//            int num2 = 20;  //This is accessible only inside a created scope
//            System.out.println(num1);
//            System.out.println(num2);
        }
        // This will give a compiler error
       // System.out.println(num2);



    }


}
