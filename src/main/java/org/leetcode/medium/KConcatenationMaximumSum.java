package org.leetcode.medium;


/**
 * <b>#1191 - K-Concatenation Maximum Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr and an integer k, modify the array by repeating it k times.
 *
 *
 * For example, if arr = [1, 2] and k = 3 then the modified array will be [1, 2, 1, 2, 1, 2].
 *
 *
 * Return the maximum sub-array sum in the modified array. Note that the length of the sub-array can be 0 and its sum in that case is 0.
 *
 *
 * As the answer can be very large, return the answer modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2], k = 3
 * Output: 9
 *
 * Example 2:
 *
 * Input: arr = [1,-2,1], k = 5
 * Output: 2
 *
 * Example 3:
 *
 * Input: arr = [-1,-2], k = 7
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * 1 &lt;= k &lt;= 105
 *
 * -104 &lt;= arr[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to solve the problem for k=1 ?
 * Hint 2: Use Kadane's algorithm for k=1.
 * Hint 3: What are the possible cases for the answer ?
 * Hint 4: The answer is the maximum between, the answer for k=1, the sum of the whole array multiplied by k, or the maximum suffix sum plus the maximum prefix sum plus (k-2) multiplied by the whole array sum for k &gt; 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/k-concatenation-maximum-sum/">LeetCode #1191</a>
 */
public class KConcatenationMaximumSum {

    /**
     * TODO: Implement "K-Concatenation Maximum Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: K-Concatenation Maximum Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KConcatenationMaximumSum.java &amp;&amp; java org.leetcode.medium.KConcatenationMaximumSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KConcatenationMaximumSum ===");
        KConcatenationMaximumSum sol = new KConcatenationMaximumSum();
        System.out.println(sol.solve(null));
    }
}
