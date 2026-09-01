package aMethodsAndEncapsulation;

public class MethodOverLoadingSpecificity {

    public static void print(Integer number) {
        System.out.println("called Integer method");
    }


    public static void print(int number) {
        System.out.println("called int method");
    }


    //java will use a method with "int" data type before using one with "Integer" because int method is more specific than integer method

    public static void main(String[] args) {
        print(5);
    }
}
