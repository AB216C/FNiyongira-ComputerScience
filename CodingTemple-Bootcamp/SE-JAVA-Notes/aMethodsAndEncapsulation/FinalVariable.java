package aMethodsAndEncapsulation;

public class FinalVariable {
    final int MAX_VALUE = 100;

    public void displayMaxValue() {
        System.out.println("Maximum value is " + MAX_VALUE);
    }

    public static void main(String[] args) {
        FinalVariable example = new FinalVariable();
        example.displayMaxValue();

        //trying to change final variable will cause a compiler error!
        //example.Max_VALUE = 2000
    }
}
