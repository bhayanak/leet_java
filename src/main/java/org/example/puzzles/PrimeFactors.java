package org.example.puzzles;

import java.util.ArrayList;
import java.util.List;

/**
 * PrimeFactors
 *
 * Problem: Write a method to return prime factors of a given number.
 *
 * Approach: Divide the number by 2 until it is odd, then check odd divisors up to sqrt(n).
 * This is a classic number theory problem, useful for cryptography and integer factorization.
 *
 * Example:
 *   getPrimeFactors(84) -&gt; [2, 2, 3, 7]
 */
public class PrimeFactors {
    /**
     * Returns the list of prime factors of n.
     * @param n the number
     * @return list of prime factors
     */
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        // Try dividing n by every integer from 2 up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            // While i divides n, add i and divide n
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        // If n is still greater than 1, it is prime
        if (n > 1) factors.add(n);
        return factors;
    }

    /**
     * Main method to demonstrate prime factorization.
     */
    public static void main(String[] args) {
        System.out.println(getPrimeFactors(84)); // [2, 2, 3, 7]
    }
}
