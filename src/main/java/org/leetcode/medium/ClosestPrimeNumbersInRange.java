package org.leetcode.medium;


/**
 * <b>#2523 - Closest Prime Numbers in Range</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two positive integers left and right, find the two integers num1 and num2 such that:
 *
 *
 * left &lt;= num1 &lt; num2 &lt;= right .
 *
 * Both num1 and num2 are prime numbers.
 *
 * num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
 *
 * Return the positive integer array ans = [num1, num2]. If there are multiple pairs satisfying these conditions, return the one with the smallest num1 value. If no such numbers exist, return [-1, -1].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: left = 10, right = 19
 * Output: [11,13]
 * Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
 * The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
 * Since 11 is smaller than 17, we return the first pair.
 *
 * Example 2:
 *
 * Input: left = 4, right = 6
 * Output: [-1,-1]
 * Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= left &lt;= right &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Sieve of Eratosthenes to mark numbers that are primes.
 * Hint 2: Iterate from right to left and find pair with the minimum distance between marked numbers.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/closest-prime-numbers-in-range/">LeetCode #2523</a>
 */
public class ClosestPrimeNumbersInRange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Closest Prime Numbers in Range");
    }

    public static void main(String[] args) {
        System.out.println("=== ClosestPrimeNumbersInRange ===");
        ClosestPrimeNumbersInRange sol = new ClosestPrimeNumbersInRange();
        System.out.println(sol.solve(null));
    }
}
