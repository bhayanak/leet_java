package org.example.prime;

import java.util.List;

/**
 * Prime6n
 *
 * Problem: Generate all prime numbers up to a given number n using the 6k ± 1 optimization.
 *
 * Approach: Only numbers of the form 6k ± 1 (except 2 and 3) can be prime. For each such candidate, check divisibility by previously found primes up to sqrt(candidate).
 * This reduces the number of candidates and checks, making it more efficient than the basic and optimized methods.
 *
 * Time Complexity: O(n^1.5) but with a smaller constant factor due to fewer candidates.
 * Space Complexity: O(n) for storing the list of primes.
 */
public class Prime6n {
    // Counts the number of iterations in the inner loop for performance analysis
    private static long iterationCount = 0;

    /**
     * Generates a list of all prime numbers up to n (inclusive) using the 6k ± 1 optimization.
     * @param n the upper limit
     * @return list of primes up to n
     */
    private static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new java.util.ArrayList<>();
        // 2 and 3 are the only primes not of the form 6k ± 1
        if (n >= 2)
            primes.add(2);
        if (n >= 3)
            primes.add(3);
        // Only check numbers of the form 6k ± 1
        for (int i = 5; i <= n; i += 6) {
            if (isPrime(i, primes))
                primes.add(i);
        }
        return primes;
    }

    /**
     * Checks if a number is prime by testing divisibility by previously found primes up to sqrt(num).
     * @param num the number to check
     * @param primes the list of previously found primes
     * @return true if num is prime, false otherwise
     */
    private static boolean isPrime(int num, List<Integer> primes) {
        for (int prime : primes) {
            iterationCount++; // Count each iteration for analysis
            if (prime * prime > num)
                break; // No need to check further if prime exceeds sqrt(num)
            if (num % prime == 0)
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
        System.out.println("Prime6n: Iterations = " + iterationCount);
        System.out.println("Prime6n: Space (primes list size) = " + primes.size());
    }
}
