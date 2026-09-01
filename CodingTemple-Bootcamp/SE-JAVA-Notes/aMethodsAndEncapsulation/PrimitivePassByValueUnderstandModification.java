package aMethodsAndEncapsulation;

public class PrimitivePassByValueUnderstandModification {
    public static int modifyPrimitive(int num) {
        System.out.println("Before modify Primitive: " + num); //output =5
        num = 10;
        System.out.println("After changing the num or x value: "+ num);  //output = 10
        return num;
    }

    public static void main(String[] args) {
        int x = 5;
       x=modifyPrimitive(x);  //By setting a modifyPrimitive(x) method to x, we are able to modify x by modifying num in the modifyPrimitive method
        System.out.println("After modify Primitive: " + x);    //output = 10
    }
}
