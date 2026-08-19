package chapter22ImprovedFindingPrimeNumbers;
import java.util.Scanner;


public class TheSieveElatostheneFindPrimeNumbers {

	public static void main(String[] args) {

		  // Read the upper limit
        Scanner input = new Scanner(System.in);

        System.out.print("Find all prime numbers <= n, enter n: ");
        int n = input.nextInt();

        // Array to keep track of prime numbers.
        // Index = number
        // Value = true (possibly prime), false (not prime)
        boolean[] primes = new boolean[n + 1];

        // Initially assume every number is prime
        for (int i = 0; i < primes.length; i++) {
            primes[i] = true;
        }

        // Cross out composite numbers
        for (int k = 2; k <= n / k; k++) {

            // Only process numbers still marked as prime
            if (primes[k]) {

                // Mark every multiple of k as not prime
                for (int i = k; i <= n / k; i++) {
                    primes[k * i] = false;
                }
            }
        }

        // Display 10 numbers per line
        final int NUMBER_PER_LINE = 10;

        int count = 0;

        // Print all numbers still marked as prime
        for (int i = 2; i < primes.length; i++) {

            if (primes[i]) {

                count++;

                if (count % NUMBER_PER_LINE == 0)
                    System.out.printf("%7d\n", i);
                else
                    System.out.printf("%7d", i);
            }
        }

        System.out.println("\n" + count +
                " prime(s) less than or equal to " + n);

        input.close();
	}

}
