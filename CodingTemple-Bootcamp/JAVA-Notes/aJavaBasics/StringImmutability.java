package aJavaBasics;
public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";

        //Not modifying a string. Let's add "World" temporarly

        System.out.println(str.concat(" World"));
        System.out.println(str);  //str remained unmodified

        //Another example

        str += " World";
        System.out.println(str);   //Entire string is replaced by "Hello World"

        String result = "";

        for(int i=1; i<=5; i++ ) {
            result += "Number" + i + " ";
            System.out.println(result);
        }

    }
}
