package aInnerClasses;

//Local Inner Class
//defined within a method
//can access local variables of the method if they are declared as final
// (or effectively final, meaning it is a variable that isn't declared final, but has not been reassigned)


public class OuterClassLocal {
    public void someMethod() {
        final String localVariable = "Local variable";

    // Local inner class
    class LocalInnerClass {
        public void display() {
            System.out.println(localVariable); // Accesses local variables of the method
        }
    }

    LocalInnerClass localInner = new LocalInnerClass();
    localInner.display();
}

    public static void main(String[] args) {
        OuterClassLocal outer = new OuterClassLocal();
        outer.someMethod();
    }

}
