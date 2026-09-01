package aJavaBasics;

public class StringMethods {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        //.length()   returns a length of a string

        System.out.println(str.length());

        //.charAt() returns a character a specific index

        System.out.println(str.charAt(5));
        //System.out.println(str[5]);  //Doesn't work in Java


        //indexOf()  return the index of the first occurence that we pass as a parameter

        System.out.println(str.indexOf("0"));
        System.out.println(str.indexOf("World"));

        //substring()-all lower case:  return a part of a string

        System.out.println(str.substring(2, 7));  //2 inclusive 7 exclusive
        System.out.println(str.substring(9)); //return a substring from index 9 inclusive

        // Using .equals
        System.out.println(str.equals("  Hello, World!  "));

        // using.equals with ignore case(lowercase or uppercase)

        System.out.println(str.equalsIgnoreCase("  HeLLo, WoRld!  ")); // return true since upper case are converted to the same case before comparison

        // Convert to  lowerCase and toUpperCase

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //startsWith() and endsWith()

        System.out.println(str.startsWith("  H"));
        System.out.println(str.endsWith("!  "));

        //contains()   check if a string contain a substring parameter

        System.out.println(str.contains("Hello"));
        System.out.println(str.contains("java"));

        //replace (x,y) -replace stirng x inside a string with a string y

        System.out.println(str.replace("World", "Java"));

        //trim() -removes leading and trailing whitespace

        System.out.println(str.trim());

    }
}
