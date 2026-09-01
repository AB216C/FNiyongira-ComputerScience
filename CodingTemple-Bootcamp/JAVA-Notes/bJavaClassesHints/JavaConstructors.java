package bJavaClassesHints;

public class JavaConstructors {

    String name;
    int age;


//
//    //INSTANCE INITIALIZER BLOCK
//    {
//        System.out.println("Instance initializer");
//        System.out.println("Student created");
//        this.age =100;
//    }

    //In StudentRunner, name is defaulted to nul and age to zero in case "public JavaConstructors" was not used.

    public JavaConstructors() {
        //When we instantiate our Object, the constructor runs

        name = "Jimmy";
        age = 20;

    }
   // The following constructors are intended to make Student B,C to infinity exist. Without them, there will be a compiler errors
    //StudentA can survive without this  constructor
    public JavaConstructors(String name, int age) {
      this.name = name;
      this.age = age;
    }



    //INSTANCE INITIALIZER BLOCK
    //Always run when object is instantiated
    //Runs before the constructor regardless of where block is placed in the class
    {
        System.out.println("Instance initializer");
        System.out.println("Student created");
        this.age =100;
    }


}
