package bLambdaAndFunctionalInterface;

interface NumberChecker{
    boolean check(int number);
}

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        //NumberChecker is designed to check if a certain number meets certain criteria that we define when
        //utilizing our functional interface

        NumberChecker isPrime = num -> {
            if(num<=1) {
                return false;
            }
            for (int i = 2; i<Math.sqrt(num); i++) {
                if(num%i==0) {
                    return false;
                }
            }
            return true;
        };

        NumberChecker isOdd = num -> num%2!=0;

        NumberChecker isEven = num ->num%2==0;

        System.out.println("is 14 Prime? " + isPrime.check(14));
        System.out.println("is 14 odd?" + isEven.check(14));
        System.out.println("is 14 Even?" + isOdd.check(14));

    }
}
