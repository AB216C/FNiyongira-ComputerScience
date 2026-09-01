package cGenericClass;
//Generics in Java allow the creation of classes, interfaces, and methods with type parameters.
// Generics enable code reusability and type safety by specifying the type of data a class or method will handle at runtime,
// while ensuring compile-time checks.
// Generic class with a type parameter T

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class GenericClassExampleOneParamenter{
    public static void main(String[] args) {
        //Using box with integer type

        Box<Integer> intBox = new Box<>();

        intBox.setItem(123);

        System.out.println("Integer value: "+ intBox.getItem());

        // Using box

        Box<String> strBox = new Box<>();

        strBox.setItem("Hello");

        System.out.println("Integer value: " + strBox.getItem());

    }
}
