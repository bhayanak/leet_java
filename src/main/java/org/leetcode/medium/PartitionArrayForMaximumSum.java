package org.leetcode.medium;


/**
 * <b>#1043 - Partition Array for Maximum Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, partition the array into (contiguous) subarrays of length at most k. After partitioning, each subarray has their values changed to become the maximum value of that subarray.
 *
 *
 * Return the largest sum of the given array after partitioning. Test cases are generated so that the answer fits in a 32-bit integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,15,7,9,2,5,10], k = 3
 * Output: 84
 * Explanation: arr becomes [15,15,15,9,10,10,10]
 *
 * Example 2:
 *
 * Input: arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4
 * Output: 83
 *
 * Example 3:
 *
 * Input: arr = [1], k = 1
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 500
 *
 * 0 &lt;= arr[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think dynamic programming:  dp[i] will be the answer for array A[0], ..., A[i-1].
 * Hint 2: For j = 1 .. k that keeps everything in bounds, dp[i] is the maximum of dp[i-j] + max(A[i-1], ..., A[i-j]) * j .
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/partition-array-for-maximum-sum/">LeetCode #1043</a>
 */
public class PartitionArrayForMaximumSum {

    /**
     * TODO: Implement "Partition Array for Maximum Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partition Array for Maximum Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PartitionArrayForMaximumSum.java &amp;&amp; java org.leetcode.medium.PartitionArrayForMaximumSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PartitionArrayForMaximumSum ===");
        PartitionArrayForMaximumSum sol = new PartitionArrayForMaximumSum();
        System.out.println(sol.solve(null));
    }
}
