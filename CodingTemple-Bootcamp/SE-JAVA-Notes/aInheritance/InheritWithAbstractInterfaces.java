package aInheritance;

/*
What if we wanted to define a purely abstract class with only abstract methods?
There's a convenient way to do that! An interface in Java defines a set of methods that a class must implement, without providing default implementations (unless using default methods).
All members of an interface are implicitly public.
Interfaces can include abstract methods, default methods, static methods, and static final variables, which allow for a flexible blueprint for classes to follow while maintaining certain constants or utility methods.

Abstract Method: A method with no implementation in the interface. Classes implementing the interface must provide the method's body.
Static Method: A method that belongs to the interface itself, not the implementing classes. It can have an implementation and is called using the interface name.
Default Method: A method in an interface with a default implementation. Implementing classes can use it as-is or override it.
Static Final Variable: A constant in an interface. It must be initialized when declared and cannot be changed. It is shared across all implementations.
*/
interface  Vehicle {

    //Static final variable

    int MAX_SPEED = 120;  //Implicitly static, final, and public

    //Abstract method():Does not have a body and abstract keyword)

    void startEngine();

    //Default method: Has a body

    default void honk() {
        System.out.println("The vehicle is Honking");
    }

    //static method: has a body

    static void fuelUp(){
        System.out.println("Fueling up the vehicle");
    }

    // creating class
    //@override
    //Providing implementation to our abstract class

}

class Car implements Vehicle {

    @Override
    public void startEngine(){
        System.out.println("Car engine started");
    }

    @Override
    public void honk() {
        System.out.println("This car is honking");
    }
}


public class InheritWithAbstractInterfaces {
    public static void main(String[] args) {

        Car car = new Car();
        car.startEngine();
        car.honk();

        //calling the static method from the interface directly
        Vehicle.fuelUp();

        //Accessing the MAX SPEED

        System.out.println("THis is the max speed: "+ Vehicle.MAX_SPEED);  //The speed can't chance because is a final variable

    }
}
