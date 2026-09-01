package bOverridingAndBuiltInMethods;

class Dog {
    private String name;
    private int age;


    public Dog(String name, int age) {
        this.age = age;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Dogs' name: "+ name + ", age:" + age;
    }
}

//The toString() method is overridden in the Dog class to provide a readable description of the object when it is printed or referenced as a string.
//Without overriding toString(), the default implementation from the Object class would return something like Dog@15db9742, which is less informative.


public class toStringMethod {
    public static void main(String[] args) {

        Dog mydog = new Dog("Makasi", 23);
        System.out.println(mydog);


    }

}
