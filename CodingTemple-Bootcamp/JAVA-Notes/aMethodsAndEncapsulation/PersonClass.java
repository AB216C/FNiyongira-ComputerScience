package aMethodsAndEncapsulation;

public class PersonClass {
    public String name;    //Accessible from anywhere
    private int age;      //Accessible only within this class
    protected String address;   //Accessible within the same package or subclass
    int phoneNumber; //Default or package-private. Accessible within the same package;



    public PersonClass(String name, int age, String address, int phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //public method to display "name"


    public void displayName(){
        System.out.println("Name:" + name);
    }

    //private method to get age

    public void displayAge() {
        System.out.println("Age:" + age);
    }


    //public method that calls private method

    public void showPersonInfo() {
        displayAge();
    }
}
