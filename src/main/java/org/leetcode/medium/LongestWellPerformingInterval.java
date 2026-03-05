package org.leetcode.medium;


/**
 * <b>#1124 - Longest Well-Performing Interval</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Stack, Monotonic Stack, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We are given hours, a list of the number of hours worked per day for a given employee.
 *
 *
 * A day is considered to be a tiring day if and only if the number of hours worked is (strictly) greater than 8.
 *
 *
 * A well-performing interval is an interval of days for which the number of tiring days is strictly larger than the number of non-tiring days.
 *
 *
 * Return the length of the longest well-performing interval.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hours = [9,9,6,0,6,6,9]
 * Output: 3
 * Explanation: The longest well-performing interval is [9,9,6].
 *
 * Example 2:
 *
 * Input: hours = [6,6,6]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hours.length &lt;= 104
 *
 * 0 &lt;= hours[i] &lt;= 16
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Make a new array A of +1/-1s corresponding to if hours[i] is &gt; 8 or not. The goal is to find the longest subarray with positive sum.
 * Hint 2: Using prefix sums (PrefixSum[i+1] = A[0] + A[1] + ... + A[i]), you need to find for each j, the smallest i &lt; j with PrefixSum[i] + 1 == PrefixSum[j].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Stack, Monotonic Stack, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-well-performing-interval/">LeetCode #1124</a>
 */
public class LongestWellPerformingInterval {

    /**
     * TODO: Implement "Longest Well-Performing Interval".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Well-Performing Interval");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestWellPerformingInterval.java &amp;&amp; java org.leetcode.medium.LongestWellPerformingInterval</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestWellPerformingInterval ===");
        LongestWellPerformingInterval sol = new LongestWellPerformingInterval();
        System.out.println(sol.solve(null));
    }
}
