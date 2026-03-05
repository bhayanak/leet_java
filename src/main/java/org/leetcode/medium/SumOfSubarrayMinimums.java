package org.leetcode.medium;


/**
 * <b>#907 - Sum of Subarray Minimums</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr, find the sum of min(b), where b ranges over every (contiguous) subarray of arr. Since the answer may be large, return the answer modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [3,1,2,4]
 * Output: 17
 * Explanation: 
 * Subarrays are [3], [1], [2], [4], [3,1], [1,2], [2,4], [3,1,2], [1,2,4], [3,1,2,4]. 
 * Minimums are 3, 1, 2, 4, 1, 1, 2, 1, 1, 1.
 * Sum is 17.
 *
 * Example 2:
 *
 * Input: arr = [11,81,94,43,3]
 * Output: 444
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 3 * 104
 *
 * 1 &lt;= arr[i] &lt;= 3 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-subarray-minimums/">LeetCode #907</a>
 */
public class SumOfSubarrayMinimums {

    /**
     * TODO: Implement "Sum of Subarray Minimums".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Subarray Minimums");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SumOfSubarrayMinimums.java &amp;&amp; java org.leetcode.medium.SumOfSubarrayMinimums</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfSubarrayMinimums ===");
        SumOfSubarrayMinimums sol = new SumOfSubarrayMinimums();
        System.out.println(sol.solve(null));
    }
}
