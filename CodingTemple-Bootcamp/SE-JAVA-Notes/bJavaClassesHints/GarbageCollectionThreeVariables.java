package bJavaClassesHints;

public class GarbageCollectionThreeVariables {
    public static void main(String[] args) {
        String a = new String("Apple"); //Object "Apple" created and referenced by "a"
        String b = new String("Banana"); //Object "Banana" created and referenced by "b"
        String c = new String("Cherry");  //Object "Cherry" created and referenced by "c"

        a = b;   //"a" now point to Banana. Apple has no reference
        b = c;   // "b" now points to "Cherry" and still point to Banana
        c = null;  //C is now null; but b still points to "cherry"
        a = null;   //a is now null, but b still points to banana
        b = null;  //b is now null, and "Banana" and "Cherry" has no reference
    }
}
