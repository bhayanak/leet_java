package org.leetcode.medium;


/**
 * <b>#1015 - Smallest Integer Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer k, you need to find the length of the smallest positive integer n such that n is divisible by k, and n only contains the digit 1.
 *
 *
 * Return the length of n. If there is no such n, return -1.
 *
 *
 * Note: n may not fit in a 64-bit signed integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 1
 * Output: 1
 * Explanation: The smallest answer is n = 1, which has length 1.
 *
 * Example 2:
 *
 * Input: k = 2
 * Output: -1
 * Explanation: There is no such positive integer n divisible by 2.
 *
 * Example 3:
 *
 * Input: k = 3
 * Output: 3
 * Explanation: The smallest answer is n = 111, which has length 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: 11111 = 1111 * 10 + 1
We only need to store remainders modulo K.
 * Hint 2: If we never get a remainder of 0, why would that happen, and how would we know that?
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-integer-divisible-by-k/">LeetCode #1015</a>
 */
public class SmallestIntegerDivisibleByK {

    /**
     * TODO: Implement "Smallest Integer Divisible by K".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Integer Divisible by K");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestIntegerDivisibleByK.java &amp;&amp; java org.leetcode.medium.SmallestIntegerDivisibleByK</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestIntegerDivisibleByK ===");
        SmallestIntegerDivisibleByK sol = new SmallestIntegerDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
