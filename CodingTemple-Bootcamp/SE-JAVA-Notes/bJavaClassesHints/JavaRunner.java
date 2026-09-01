package bJavaClassesHints;

public class JavaRunner {
    public static void main(String[] args) {

        JavaConstructors StudentA = new JavaConstructors();
       //For reference type, when instantiating our Objects, we use "new" keyword
        System.out.println("StudentA: \n");
        System.out.println( "Student A's Name Will be:"+  StudentA.name);
        System.out.println("Student A's Age will be:"+ StudentA.age + " years old \n");

        //To construct Student B, we need the following methods and attributes.
        JavaConstructors StudentB = new JavaConstructors("Sally", 23);

        System.out.println("StudentB: \n");

        System.out.println("Student B's name will be:" + StudentB.name);
        System.out.println("Student B'S age will be:" + StudentB.age + "years old \n");

        JavaConstructors StudentC = new JavaConstructors("Bosco",32);


        System.out.println("StudentC: \n");

        System.out.println("Student C's name will be:" + StudentC.name);
        System.out.println("Student C'S age will be:" + StudentC.age);


        //POTENTIAL ISSUES:

        /*
        On its own, this is a pretty unsafe thing to do.
        If you gave someone access to this code base, you are saying they can modify the variables to be whatever they want.
        Imagine if they tried setting age to a negative number, or created a name with over 1000 characters??
        We’ll learn how to protect our class variables with encapsulation at some point soon.
        */

        JavaConstructors studentA;
        studentA = new JavaConstructors();
        studentA.name = "Wendy"; // set
        System.out.println(studentA.name); // get


    }
}
