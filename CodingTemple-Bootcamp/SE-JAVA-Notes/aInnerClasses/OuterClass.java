package aInnerClasses;
//An inner class in Java is a class defined within the body of another class.
// It has access to the members (including private ones) of the outer class, which allows for a close relationship between the two.
//A class defined at the same level as instance variables
  //can access all instance variables of outer class (private variables as well)
public class OuterClass {   //This is outerCLASS

    private String outerField = "Outer field";

    // Member (inner) class
    public class MemberClass {    //This inner class
        public void display() {       //This is inner class method
            System.out.println(outerField); // Accesses instance members of OuterClass
        }
    }
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        MemberClass member = outer.new MemberClass();
        member.display();

    }
}


