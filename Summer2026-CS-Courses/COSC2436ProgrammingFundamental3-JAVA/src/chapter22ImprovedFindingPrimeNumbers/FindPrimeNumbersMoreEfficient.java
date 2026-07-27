package chapter22ImprovedFindingPrimeNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class FindPrimeNumbersMoreEfficient {
    // Method that prints all prime numbers <= n
    public static void printPrimeNumbers(int n) {

        // A list to store prime numbers
        List<Integer> list = new ArrayList<>();

        // Display 10 numbers per line
        final int NUMBER_PER_LINE = 10;

        int count = 0;          // Count the number of prime numbers found
        int number = 2;         // A number to be tested for primeness
        int squareRoot = 1;     // Current square root of number

        System.out.println("The prime numbers are");

        // Repeatedly find prime numbers
        while (number <= n) {

            // Assume the number is prime
            boolean isPrime = true;

            // Recompute squareRoot if necessary
            if (squareRoot * squareRoot < number)
                squareRoot++;

            // Test whether number is prime
            // Test divisibility by previously found prime numbers
            for (int k = 0;
                 k < list.size()
                 && list.get(k) <= squareRoot;
                 k++) {

                // If divisible by any previous prime,
                // then number is not prime
                if (number % list.get(k) == 0) {
                    isPrime = false;
                    break;      // Exit the loop immediately
                }
            }

            // Display the prime number and store it in the list
            if (isPrime) {

                count++;

                list.add(number);   // Save this prime for future tests

                if (count % NUMBER_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }

            // Check the next number
            number++;
        }

        System.out.println("\n" + count
                + " prime(s) less than or equal to " + n);
    }
}
