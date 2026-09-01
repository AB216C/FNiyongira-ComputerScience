package aInnerClasses;

public class OuterClassNested {
    private static String outerStaticField = "This is Outer static field. Learning Nexted classes";
    private String notStatic = "Not static field";

    // Static nested class
    public static class StaticNestedClass {
        public void display() {
            System.out.println(outerStaticField); // Accesses static members of OuterClass
            //System.out.println(notStatic);  //This will raise a compiler error because you can't access notStatic variable from static class. It has to be static to work.
        }
    }

    public static void main(String[] args) {
        StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }
}
