package org.leetcode.hard;


/**
 * <b>#1012 - Numbers With Repeated Digits</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of positive integers in the range [1, n] that have at least one repeated digit.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 20
 * Output: 1
 * Explanation: The only positive number (&lt;= 20) with at least 1 repeated digit is 11.
 *
 * Example 2:
 *
 * Input: n = 100
 * Output: 10
 * Explanation: The positive numbers (&lt;= 100) with atleast 1 repeated digit are 11, 22, 33, 44, 55, 66, 77, 88, 99, and 100.
 *
 * Example 3:
 *
 * Input: n = 1000
 * Output: 262
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many numbers with no duplicate digits?  How many numbers with K digits and no duplicates?
 * Hint 2: How many numbers with same length as N?  How many numbers with same prefix as N?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/numbers-with-repeated-digits/">LeetCode #1012</a>
 */
public class NumbersWithRepeatedDigits {

    /**
     * TODO: Implement "Numbers With Repeated Digits".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Numbers With Repeated Digits");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumbersWithRepeatedDigits.java &amp;&amp; java org.leetcode.hard.NumbersWithRepeatedDigits</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumbersWithRepeatedDigits ===");
        NumbersWithRepeatedDigits sol = new NumbersWithRepeatedDigits();
        System.out.println(sol.solve(null));
    }
}
