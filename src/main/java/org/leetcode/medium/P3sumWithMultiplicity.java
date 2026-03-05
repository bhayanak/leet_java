package org.leetcode.medium;


/**
 * <b>#923 - 3Sum With Multiplicity</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, and an integer target, return the number of tuples i, j, k such that i &lt; j &lt; k and arr[i] + arr[j] + arr[k] == target.
 *
 *
 * As the answer can be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,1,2,2,3,3,4,4,5,5], target = 8
 * Output: 20
 * Explanation: 
 * Enumerating by the values (arr[i], arr[j], arr[k]):
 * (1, 2, 5) occurs 8 times;
 * (1, 3, 4) occurs 8 times;
 * (2, 2, 4) occurs 2 times;
 * (2, 3, 3) occurs 2 times.
 *
 * Example 2:
 *
 * Input: arr = [1,1,2,2,2,2], target = 5
 * Output: 12
 * Explanation: 
 * arr[i] = 1, arr[j] = arr[k] = 2 occurs 12 times:
 * We choose one 1 from [1,1] in 2 ways,
 * and two 2s from [2,2,2,2] in 6 ways.
 *
 * Example 3:
 *
 * Input: arr = [2,1,3], target = 6
 * Output: 1
 * Explanation: (1, 2, 3) occured one time in the array so we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= arr.length &lt;= 3000
 *
 * 0 &lt;= arr[i] &lt;= 100
 *
 * 0 &lt;= target &lt;= 300
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/3sum-with-multiplicity/">LeetCode #923</a>
 */
public class P3sumWithMultiplicity {

    /**
     * TODO: Implement "3Sum With Multiplicity".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: 3Sum With Multiplicity");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac P3sumWithMultiplicity.java &amp;&amp; java org.leetcode.medium.P3sumWithMultiplicity</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== P3sumWithMultiplicity ===");
        P3sumWithMultiplicity sol = new P3sumWithMultiplicity();
        System.out.println(sol.solve(null));
    }
}
