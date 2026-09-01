package bMethodReference;
import java.util.function.Function;
class Persona {

    String name;

    public Persona(String name){
        this.name = name;
    }

}
public class ConstructorReference {
    public static void main(String[] args) {
        Function<String,Person> personCreator = Person::new;
        Person person = personCreator.apply("Jane");
        System.out.println(person.name);
    }
}
