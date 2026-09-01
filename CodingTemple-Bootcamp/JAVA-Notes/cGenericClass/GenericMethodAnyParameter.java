package cGenericClass;

//A generic method can operate on objects of various types while maintaining type safety.
// These methods define type parameters (inside angle brackets) before the return type in the method signature.

public class GenericMethodAnyParameter {
    public static <T> void printArray(T[]array){
        for(T element:array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,32,3,4};
        String[] strArray = {"I", "Love", "God"};

        printArray(intArray);
        printArray(strArray);
    }
}
