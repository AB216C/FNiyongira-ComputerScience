package aMethodsAndEncapsulation;

public class PrimitivePassByValue {

    public static void modifyPrimitive(int num) {
        System.out.println("Before modify Primitive: " + num);   //output = 5

        //Changing num value to 10.
        //Before changing num value, current num value = current x value in the main method
        //num value here is a copy of x value in the main method;
        //Means, changing num value won't change x value

        num = 10;
        System.out.println("After changing the num or x value: "+ num);  //output = 10
    }

    public static void main(String[] args) {
        int x = 5;
        modifyPrimitive(x);
        System.out.println("After modify Primitive: " + x);   //output = 5
    }
}
