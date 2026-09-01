package aJavaBasics;

public class PrimitiveVsReferenceTypes {
    public static void main(String[] args) {


        //Reference: Represent Objets in java rather than storing raw data directly.
        //Primitive types: Hold values directly in memory

        //ReferenceTypes: store a reference (memory address) to the actual data;

        //While working with strings in Java, you are using "Reference types" because Strings are object

        //Reference types in Java represent objects rather than storing raw data directly.
        // While primitive types hold their values in memory, reference types store a reference (or memory address)
        // to the actual data, much like a pointer in languages like C.
        // For example, when working with Strings in Java, you're using reference types since Strings are objects.
        // Instead of directly holding the text, a reference type points to where the text data is stored in memory,
        // allowing you to work with more complex data structures.

        /*
       In Java, primitives like int, char, and boolean are stored on the stack, which is fast and automatically cleared when methods finish.
       Reference Types (objects), like Strings or arrays, are stored on the heap, which is a bigger area of memory where things can last longer.
       The stack is quick and temporary, while the heap is used for more permanent storage, but Java needs to clean up the heap when objects are no longer used.
       This helps Java manage memory smoothly.
       It's good to have a solid understanding of this as a Java developer.


       Primitive dataTypes:
       Memory location: stored in Stack
       Data Type: Hold actual data value
       Null assignment: Can not be assigned null
       naming convention: lowercase(int, bool, str, char)
       Methods call: Can not call method directly
       Default values: Default to zero, false, etc
       Size: fixed(int is 32 bit, etc)

       Reference DataTypes:
       Memory location: Stored on the heap
       Data Type: Hold a reference to the object
       Null Assignment: can be assigned null
       naming convention: Capitalized(Integer, Boolean, String, Character)
        Methods call: can call method directly
        Default values: Default to null when initialized
        Size: varies based on the object
        */





    }
}
