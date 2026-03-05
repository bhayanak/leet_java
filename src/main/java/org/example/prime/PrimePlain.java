package org.example.prime;

import java.util.List;

/**
 * PrimePlain
 *
 * Problem: Generate all prime numbers up to a given number n using the most basic method.
 *
 * Approach: For each number from 2 to n, check if it is prime by testing divisibility by all numbers from 2 up to sqrt(n).
 * This is the most straightforward (but not the most efficient) way to find primes, and is useful for understanding the basics of primality testing.
 *
 * Time Complexity: O(n^1.5) due to the nested loop structure.
 * Space Complexity: O(n) for storing the list of primes.
 */
public class PrimePlain {
    // Counts the number of iterations in the inner loop for performance analysis
    private static long iterationCount = 0;

    /**
     * Generates a list of all prime numbers up to n (inclusive).
     * @param n the upper limit
     * @return list of primes up to n
     */
    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new java.util.ArrayList<>();
        // Loop through all numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            // If i is prime, add to the list
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    /**
     * Checks if a number is prime by testing divisibility from 2 up to sqrt(n).
     * @param n the number to check
     * @return true if n is prime, false otherwise
     */
    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        // Test divisibility by all numbers from 2 up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            iterationCount++; // Count each iteration for analysis
            if (n % i == 0)
                return false; // Not prime if divisible
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
        System.out.println("PrimePlain: Iterations = " + iterationCount);
        System.out.println("PrimePlain: Space (primes list size) = " + primes.size());
    }
}
