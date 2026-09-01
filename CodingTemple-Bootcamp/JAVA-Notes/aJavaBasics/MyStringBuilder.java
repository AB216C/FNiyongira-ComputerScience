package aJavaBasics;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();   //This is an empty string


        str.append("Hello");
        str.append(" World,");
        str.append(" Here, we are!");
        System.out.println(str);

        //insert str2 at index 5

        str.insert(5," Java");
        System.out.println(str);

        //Delete(5,10) -deletes from the index start to the index end(start-inclusive, end-exclusive)

        str.delete(5,15);
        System.out.println(str);

        //Delete character at a certain index;

        str.deleteCharAt(5);
        System.out.println(str);

        //Delete last character of a sentence
        str.deleteCharAt(str.length()-1);
        System.out.println(str);

        //reversing a string

        str.reverse();

        System.out.println(str);

        str.toString();
        System.out.println(str);


    }

}
