package org.example.prime;

import java.util.List;

/**
 * PrimeSOE
 *
 * Problem: Generate all prime numbers up to a given number n using the Sieve of Eratosthenes.
 *
 * Approach: Use a boolean array to mark numbers as prime or not. Initially, all numbers are assumed prime.
 * Starting from 2, mark all multiples of each prime as non-prime. Continue until sqrt(n).
 * Finally, collect all numbers still marked as prime. This method is much more efficient than
 * checking divisibility for each number individually.
 *
 * Time Complexity: O(n log log n), which is close to linear and significantly faster than the naive approach.
 * Space Complexity: O(n) for the boolean array and the list of primes.
 */
public class PrimeSOE {
    // Counts the number of iterations in the inner marking loop for performance analysis
    private static long iterationCount = 0;

    /**
     * Generates a list of all prime numbers up to n (inclusive) using the Sieve of Eratosthenes.
     * @param n the upper limit
     * @return list of primes up to n
     */
    private static List<Integer> generatePrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        // Assume all numbers are prime initially
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Eliminate non-primes by marking multiples of each prime
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p as not prime
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    iterationCount++; // Count each marking iteration
                    isPrime[multiple] = false;
                }
            }
        }

        // Collect all numbers that remain marked as prime
        List<Integer> primes = new java.util.ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Main method to demonstrate prime generation and print performance stats.
     */
    public static void main(String[] args) {
        int N = 100;
        List<Integer> primes = generatePrimes(N);
        System.out.println(primes);
        System.out.println("PrimeSOE: Iterations = " + iterationCount);
        System.out.println("PrimeSOE: Space (primes list size) = " + primes.size());
    }
}
