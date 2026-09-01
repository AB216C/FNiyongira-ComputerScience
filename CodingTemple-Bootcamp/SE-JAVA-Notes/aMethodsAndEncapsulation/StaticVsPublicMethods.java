package aMethodsAndEncapsulation;

public class StaticVsPublicMethods {


    //static variable
    public static int staticCount = 0;

    //instance variable
    public int instanceCount = 0;

    //Static method

    public static void staticMethod() {
        //access static variable is allowed
        staticCount ++;
        System.out.println("Static count:"+ staticCount);

        //access public or instance variable is not allowed
        //instanceCount++ will cause compiler error once uncommented

    }

    //instance method

    public void instanceMethod() {
        //Access static variable is allowed
        staticCount++;
        System.out.println("Static count: " + staticCount);


        //Access instance variable is allowed
        instanceCount++;
        System.out.println("Instance count: " + instanceCount);

    }

    public static void main(String[] args) {
        StaticVsPublicMethods.staticMethod();   //Calling static method

        StaticVsPublicMethods obj = new StaticVsPublicMethods(); //Calling public or instance method
        obj.instanceMethod();

        //Accessing static method and variable via an instance
        //This is allowed but not recommended as it maybe misleading

        obj.staticMethod();
        System.out.println("static count after instance method:" + StaticVsPublicMethods.staticCount);

    }





}
