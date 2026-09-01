package bOverridingAndBuiltInMethods;
import java.util.Objects;

//.hashCode method in Java returns an integer hash code value for the object.
// When you override the equals method, you must also override the hashCode method.
// This ensures that if two objects are considered equal by the equals method, they must also have the same hash code.
// If objects have the same hashCode that means our method evaluated to the same int value.
// We can use the built in IntelliJ hash method for generating our hashCodes.

class Dogss {
    private String name;
    private int age;

    Dogss(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // check if object is the same reference
        if (this == obj) return true;
        //check if obj is an instance of a dog
        if (obj == null || getClass() != obj.getClass()) return false;

        //cast our object type into a dog

        Dogss dog = (Dogss) obj;

        //Compare our fields for equality

        return age == dog.age && name.equals(dog.name);

    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }

}
public class hashCodeToCompareObjects {
    public static void main(String[] args) {

        Dogss dog1 = new Dogss("Sam", 3);
        Dogss dog2 = new Dogss("Sam",3 );
        Dogss dog3 = new Dogss("Jacky", 4);

        System.out.println(dog1.equals(dog2));   //true
        System.out.println(dog1.hashCode()==dog2.hashCode());   //true

        System.out.println(dog1.equals(dog3));   //false
        System.out.println(dog1.hashCode()==dog3.hashCode());   //false
    }

}
