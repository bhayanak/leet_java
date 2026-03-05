package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #600: Non-negative Integers without Consecutive Ones
 * @see <a href="https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/">Problem</a>
 */
public class NonNegativeIntegersWithoutConsecutiveOnes {

    /**
     * LeetCode #600 – Non-negative Integers without Consecutive Ones
     * Difficulty: HARD
     * Topics: Dynamic Programming
     *
     * Given a positive integer n, return the number of the integers in the range
     * [0, n] whose binary representations do not contain consecutive ones.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 5
     * Output: 5
     * Explanation:
     * Here are the non-negative integers &lt;= 5 with their corresponding binary
     * representations:
     * 0 : 0
     * 1 : 1
     * 2 : 10
     * 3 : 11
     * 4 : 100
     * 5 : 101
     * Among them, only integer 3 disobeys the rule (two consecutive ones) and the
     * other 5 satisfy the rule.
     * 
     * Example 2:
     * 
     * Input: n = 1
     * Output: 2
     * 
     * Example 3:
     * 
     * Input: n = 2
     * Output: 3
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= n &lt;= 109
     */
    // Count binary numbers up to n without consecutive 1s using DP (digit DP / Fibonacci)
    /**
     * Finds Find integers.
     *
     * @param n the n (int)
     * @return the computed int result
     */
    public int findIntegers(int n) {
        // Precompute Fibonacci: fib[i] = count of valid i-bit numbers starting with 0
        int[] fib = new int[32];
        fib[0] = 1; fib[1] = 2;
        for (int i = 2; i < 32; i++) fib[i] = fib[i-1] + fib[i-2];
        int result = 0, prevBit = 0;
        for (int i = 30; i >= 0; i--) {
            if ((n & (1 << i)) != 0) {
                result += fib[i];
                if (prevBit == 1) { result--; break; }  // consecutive 1s hit limit
                prevBit = 1;
            } else {
                prevBit = 0;
            }
            if (i == 0) result++;  // count n itself if valid
        }
        return result;
    }

    public static void main(String[] args) {
        NonNegativeIntegersWithoutConsecutiveOnes sol = new NonNegativeIntegersWithoutConsecutiveOnes();
        System.out.println(sol.findIntegers(0));
    }
}
