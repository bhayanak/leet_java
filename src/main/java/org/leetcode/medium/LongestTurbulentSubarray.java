package org.leetcode.medium;


/**
 * <b>#978 - Longest Turbulent Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, return the length of a maximum size turbulent subarray of arr.
 *
 *
 * A subarray is turbulent if the comparison sign flips between each adjacent pair of elements in the subarray.
 *
 *
 * More formally, a subarray [arr[i], arr[i + 1], ..., arr[j]] of arr is said to be turbulent if and only if:
 *
 *
 * For i &lt;= k &lt; j:
 *
 *
 *
 *
 * arr[k] &gt; arr[k + 1] when k is odd, and
 *
 * arr[k] &lt; arr[k + 1] when k is even.
 *
 *
 *
 * Or, for i &lt;= k &lt; j:
 *
 *
 *
 * arr[k] &gt; arr[k + 1] when k is even, and
 *
 * arr[k] &lt; arr[k + 1] when k is odd.
 *
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [9,4,2,10,7,8,8,1,9]
 * Output: 5
 * Explanation: arr[1] &gt; arr[2] &lt; arr[3] &gt; arr[4] &lt; arr[5]
 *
 * Example 2:
 *
 * Input: arr = [4,8,12,16]
 * Output: 2
 *
 * Example 3:
 *
 * Input: arr = [100]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 4 * 104
 *
 * 0 &lt;= arr[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-turbulent-subarray/">LeetCode #978</a>
 */
public class LongestTurbulentSubarray {

    /**
     * TODO: Implement "Longest Turbulent Subarray".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Turbulent Subarray");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestTurbulentSubarray.java &amp;&amp; java org.leetcode.medium.LongestTurbulentSubarray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestTurbulentSubarray ===");
        LongestTurbulentSubarray sol = new LongestTurbulentSubarray();
        System.out.println(sol.solve(null));
    }
}
