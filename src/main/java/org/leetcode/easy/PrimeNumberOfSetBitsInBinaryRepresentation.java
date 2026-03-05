package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode #762: Prime Number of Set Bits in Binary Representation
 * @see <a href="https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/">Problem</a>
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {

    /**
     * LeetCode #762 – Prime Number of Set Bits in Binary Representation
     * Difficulty: EASY
     * Topics: Math, Bit Manipulation
     *
     * Given two integers left and right, return the count of numbers in the
     * inclusive range [left, right] having a prime number of set bits in their
     * binary representation.
     * 
     * 
     * Recall that the number of set bits an integer has is the number of 1's
     * present when written in binary.
     * 
     * 
     * For example, 21 written in binary is 10101, which has 3 set bits.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: left = 6, right = 10
     * Output: 4
     * Explanation:
     * 6  -&gt; 110 (2 set bits, 2 is prime)
     * 7  -&gt; 111 (3 set bits, 3 is prime)
     * 8  -&gt; 1000 (1 set bit, 1 is not prime)
     * 9  -&gt; 1001 (2 set bits, 2 is prime)
     * 10 -&gt; 1010 (2 set bits, 2 is prime)
     * 4 numbers have a prime number of set bits.
     * 
     * Example 2:
     * 
     * Input: left = 10, right = 15
     * Output: 5
     * Explanation:
     * 10 -&gt; 1010 (2 set bits, 2 is prime)
     * 11 -&gt; 1011 (3 set bits, 3 is prime)
     * 12 -&gt; 1100 (2 set bits, 2 is prime)
     * 13 -&gt; 1101 (3 set bits, 3 is prime)
     * 14 -&gt; 1110 (3 set bits, 3 is prime)
     * 15 -&gt; 1111 (4 set bits, 4 is not prime)
     * 5 numbers have a prime number of set bits.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= left &lt;= right &lt;= 106
     * 
     * 0 &lt;= right - left &lt;= 104
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation.</p>
      */
    public int countPrimeSetBits(int left, int right) {
        Set<Integer> primes = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17,19));
        int count = 0;
        for (int n = left; n <= right; n++)
            if (primes.contains(Integer.bitCount(n))) count++;
        return count;
    }

    public static void main(String[] args) {
        PrimeNumberOfSetBitsInBinaryRepresentation sol = new PrimeNumberOfSetBitsInBinaryRepresentation();
        System.out.println(sol.countPrimeSetBits(0, 0));
    }
}
