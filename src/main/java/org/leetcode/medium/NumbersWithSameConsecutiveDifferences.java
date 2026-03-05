package org.leetcode.medium;


/**
 * <b>#967 - Numbers With Same Consecutive Differences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Backtracking, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers n and k, return an array of all the integers of length n where the difference between every two consecutive digits is k. You may return the answer in any order.
 *
 *
 * Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 7
 * Output: [181,292,707,818,929]
 * Explanation: Note that 070 is not a valid number, because it has leading zeroes.
 *
 * Example 2:
 *
 * Input: n = 2, k = 1
 * Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 9
 *
 * 0 &lt;= k &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Backtracking, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/numbers-with-same-consecutive-differences/">LeetCode #967</a>
 */
public class NumbersWithSameConsecutiveDifferences {

    /**
     * TODO: Implement "Numbers With Same Consecutive Differences".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Numbers With Same Consecutive Differences");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumbersWithSameConsecutiveDifferences.java &amp;&amp; java org.leetcode.medium.NumbersWithSameConsecutiveDifferences</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumbersWithSameConsecutiveDifferences ===");
        NumbersWithSameConsecutiveDifferences sol = new NumbersWithSameConsecutiveDifferences();
        System.out.println(sol.solve(null));
    }
}
