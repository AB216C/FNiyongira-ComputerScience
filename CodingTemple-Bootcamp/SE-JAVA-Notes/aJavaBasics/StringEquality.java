package aJavaBasics;
public class StringEquality {
    public static void main(String[] args) {
        String a = "test";
        String b = "test";

        String c = new String("test");

        System.out.println(a==b);  //This will be equal to "True"
        System.out.println(a==c);   //But this is equal to "False"

        // TO FIX THE ISSUE, to compare strings, you should use ".equals() "

        boolean valueTest = a.equals(c);   //This case, we get "true" right answer
        System.out.println(valueTest);


        String z = "cat";
        String x = "dog";

        boolean compare = x.equals(z);
        System.out.println(compare);

    }
}
