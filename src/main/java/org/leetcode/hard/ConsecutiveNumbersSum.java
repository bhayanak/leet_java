package org.leetcode.hard;


/**
 * <b>#829 - Consecutive Numbers Sum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return the number of ways you can write n as the sum of consecutive positive integers.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: 2
 * Explanation: 5 = 2 + 3
 *
 * Example 2:
 *
 * Input: n = 9
 * Output: 3
 * Explanation: 9 = 4 + 5 = 2 + 3 + 4
 *
 * Example 3:
 *
 * Input: n = 15
 * Output: 4
 * Explanation: 15 = 8 + 7 = 4 + 5 + 6 = 1 + 2 + 3 + 4 + 5
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
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/consecutive-numbers-sum/">LeetCode #829</a>
 */
public class ConsecutiveNumbersSum {

    /**
     * TODO: Implement "Consecutive Numbers Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Consecutive Numbers Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ConsecutiveNumbersSum.java &amp;&amp; java org.leetcode.hard.ConsecutiveNumbersSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ConsecutiveNumbersSum ===");
        ConsecutiveNumbersSum sol = new ConsecutiveNumbersSum();
        System.out.println(sol.solve(null));
    }
}
