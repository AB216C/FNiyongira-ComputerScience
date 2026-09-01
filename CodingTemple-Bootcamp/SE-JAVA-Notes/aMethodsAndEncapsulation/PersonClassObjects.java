package aMethodsAndEncapsulation;

public class PersonClassObjects {
    public static void main(String[] args) {
        PersonClass person = new PersonClass("Alice", 20, "405 N Avenue", 342233222);

//Public field and public method
        System.out.println("Person's name:" + person.name);
        person.displayName();


     // Trying to access private method and attributes
//        System.out.println("Person's age" + person.age); It doesn't work out because age is private
//        person.displayAge();   It doesn't work out

        //Using public method to access our private method;

        person.showPersonInfo();    //It works out


        //Accessing protected attributes

        System.out.println("Person's address:"+person.address);

        // Accessing another public attribute

        System.out.println("Person's address:" + person.phoneNumber);

    }
}
