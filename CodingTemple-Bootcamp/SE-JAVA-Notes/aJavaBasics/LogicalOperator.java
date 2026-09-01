package aJavaBasics;
public class LogicalOperator {
    public static void main(String[] args) {

        int number =150;

        if(number%3==0 && number%5==0) {
            System.out.println("fizzbuzz");
        }
        else if(number%3==0) {
            System.out.println("fizz");
        }else if(number%5==0){
            System.out.println("buzz");
        }else {
            System.out.println("Not applicable");
        }
    }
}
