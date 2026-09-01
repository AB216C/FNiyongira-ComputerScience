package bJavaClassesHints;

public class MyClass {

    int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println(value);
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass (10);
                obj.displayValue();
    }
}
