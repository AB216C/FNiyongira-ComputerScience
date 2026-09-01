package cAdvancedExceptionAndAssertion;

public class AssertionExample {
    public static void main(String[] args) {
        int age = -1;

        assert age >=0: "Age must be positive";

        System.out.println("Age is: " + age);
    }
}
