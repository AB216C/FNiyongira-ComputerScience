package bJavaClassesHints;

public class GarbageCollection {
    public static void main(String[] args) {

        /*
        Garbage Collector
            As we learned earlier, Objects are stored inside our program’s heap as they are created.
             (When we say new Object () we are creating it on the heap).  Its size is dynamic, ie it adjusts based on the program’s needs.
             But what happens when we are done with that object?

            Garbage Collector - When an object is no longer needed, the garbage collector frees up the memory it was using originally on the heap.
             This happens automatically (manual in C for example, where you have to free your own memory)

            To determine if an object is no longer needed (meaning it is eligible for Garbage Collection), either of the following must occur:

            all references to the object have gone out of scope (ie method it is being used in ends)
            The object no longer has any references pointing to it (reference points to null or a different object)
            The following is going to sound kind of complex, but I assure you it's not something you need to beat your head over.
            The JVM manages garbage collection, and while it happens automatically, you cannot control or guarantee exactly when it will run.
            The JVM handles this in a way that balances performance and memory management.

         */

        String str1 = new String ("Hello"); //Object is created, referenced by str1;
        String str2 = new String("World"); //Object is created, referenced by str2;

        str1 = str2; //str1 points to "World". Nothing points to "Hello"
        str2 = null;  //Now,str2 is now null, but  str1 points to "World"
        str1 = null;   //Both str1 and str2 are now null, Object "World" has no reference and it is eligible for Garbage Collection
    }
}
