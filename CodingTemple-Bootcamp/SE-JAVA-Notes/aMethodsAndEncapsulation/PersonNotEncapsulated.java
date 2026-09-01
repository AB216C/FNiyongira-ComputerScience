package aMethodsAndEncapsulation;

public class PersonNotEncapsulated {
    //public fields directly accessible

   public int age;
   public String name;

    //constructor
    public PersonNotEncapsulated(int age, String name) {
        this.name = name;
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        PersonNotEncapsulated person = new PersonNotEncapsulated( 20,"Alice");

        //Being able to change age from 20 to -1 shows the code is not protected!
        //That's why Encapusulation has to come in place to enforce rules
        System.out.println(person.name);
        person.age = -1;
        System.out.println(person.age);

    }

    /*
    Without any protection of this class, here are our main cons:
        No Control Over Data: Fields can be modified directly, which might lead to invalid states or inconsistencies.
        No Validation: There’s no way to enforce rules for setting values (e.g., ensuring age is non-negative).
        Reduced Maintainability: Any changes to fields or requirements might necessitate changes across many places in the code.
   */


}