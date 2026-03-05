package org.example.prime;

import java.util.List;

/**
 * PrimeOpti
 *
 * Problem: Generate all prime numbers up to a given number n using an optimized method.
 *
 * Approach: For each number from 2 to n, check if it is prime by testing divisibility only by previously found primes up to sqrt(n).
 * This reduces the number of checks compared to the basic method, as non-prime divisors are skipped.
 *
 * Time Complexity: O(n^1.5) in theory, but with a smaller constant factor than the basic method.
 * Space Complexity: O(n) for storing the list of primes.
 */
public class PrimeOpti {
    // Counts the number of iterations in the inner loop for performance analysis
    private static long iterationCount = 0;

    /**
     * Generates a list of all prime numbers up to n (inclusive) using previously found primes for divisibility checks.
     * @param n the upper limit
     * @return list of primes up to n
     */
    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new java.util.ArrayList<>();
        // Loop through all numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            // If i is prime, add to the list
            if (isPrime(i, primes)) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Checks if a number is prime by testing divisibility only by previously found primes up to sqrt(n).
     * @param n the number to check
     * @param primes the list of previously found primes
     * @return true if n is prime, false otherwise
     */
    private static boolean isPrime(int n, List<Integer> primes) {
        if (n <= 1)
            return false;
        // Test divisibility only by primes up to sqrt(n)
        for (int i: primes) {
            iterationCount++; // Count each iteration for analysis
            if(n%i == 0) return false; // Not prime if divisible
            if(i*i > n) break; // No need to check further if i exceeds sqrt(n)
        }
        return true;
    }

    /**
     * Main method to demonstrate prime generation and print performance stats.
     */
    public static void main(String[] args) {
        int N = 100;
        List<Integer> primes = generatePrimes(N);
        System.out.println(primes);
        System.out.println("PrimeOpti: Iterations = " + iterationCount);
        System.out.println("PrimeOpti: Space (primes list size) = " + primes.size());
    }
}
