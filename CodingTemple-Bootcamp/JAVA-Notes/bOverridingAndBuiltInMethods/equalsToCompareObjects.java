package bOverridingAndBuiltInMethods;

//The equals() method first checks if the two objects are the same reference (this == obj).
// Then, it ensures that obj is not null and is of the same class as the current object.
// If both conditions are met, it casts obj to the Dog type and compares the name and age fields.
// This method allows us to compare Dog objects based on their content rather than memory references.
class Dogs {
    private String name;
    private int age;

    Dogs(String name, int age) {
        this.name=name;
        this.age=age;
    }

    //We Override equals so we can compare the fields of our Objects

    @Override
    public boolean equals(Object obj){
        // check if object is the same reference
        if(this==obj) return true;
        //check if obj is an instance of a dog
        if(this==null || getClass()!=obj.getClass()) return false;

        //cast our object type into a dog

        Dogs dogs = (Dogs)obj;

        //Compare our fields for equality

        return this.age == dogs.age && this.name.equals(dogs.name);

    }
}
public class equalsToCompareObjects {
    public static void main(String[] args) {

        Dogs dog1 = new Dogs("Sam", 3);
        Dogs dog2 = new Dogs("Sam",3 );
        Dogs dog3 = new Dogs("Jacky", 4);

        System.out.println(dog1.equals(dog2));   //true
        System.out.println(dog1.equals(dog1));   //true
        System.out.println(dog1.equals(dog3));    //false

    }

}
