package chapter22ImprovedFindingPrimeNumbers;

public class FindPrimeNumbersBruteForce2 {

	// Method that prints all prime numbers <= n
    public static void printPrimeNumbers(int n) {

        // Display 10 numbers per line
        final int NUMBER_PER_LINE = 10;

        int count = 0;      // Count the number of prime numbers found
        int number = 2;     // A number to be tested for primeness

        System.out.println("The prime numbers are");

        // Repeatedly find prime numbers
        while (number <= n) {

            // Assume the number is prime
            boolean isPrime = true;

            // Test whether number is prime
            // Test divisibility from 2 to the square root of number
            for (int divisor = 2;
                 divisor <= (int)(Math.sqrt(number));
                 divisor++) {

                // If divisible, it is not prime
                if (number % divisor == 0) {
                    isPrime = false;
                    break;      // Exit the loop immediately
                }
            }

            // Display the prime number and increase the count
            if (isPrime) {

                count++;

                if (count % NUMBER_PER_LINE == 0)
                    System.out.printf("%7d\n", number);
                else
                    System.out.printf("%7d", number);
            }

            // Check the next number
            number++;
        }

        System.out.println("\n" + count
                + " prime(s) less than or equal to " + n);
    }


}
