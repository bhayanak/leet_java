package org.leetcode.medium;


/**
 * <b>#1186 - Maximum Subarray Sum with One Deletion</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers, return the maximum sum for a non-empty subarray (contiguous elements) with at most one element deletion. In other words, you want to choose a subarray and optionally delete one element from it so that there is still at least one element left and the sum of the remaining elements is maximum possible.
 *
 *
 * Note that the subarray needs to be non-empty after deleting one element.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,-2,0,3]
 * Output: 4
 * Explanation: Because we can choose [1, -2, 0, 3] and drop -2, thus the subarray [1, 0, 3] becomes the maximum value.
 *
 * Example 2:
 *
 * Input: arr = [1,-2,-2,3]
 * Output: 3
 * Explanation: We just choose [3] and it's the maximum sum.
 *
 * Example 3:
 *
 * Input: arr = [-1,-1,-1,-1]
 * Output: -1
 * Explanation: The final subarray needs to be non-empty. You can't choose [-1] and delete -1 from it, then get an empty subarray to make the sum equals to 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 105
 *
 * -104 &lt;= arr[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to solve this problem if no deletions are allowed ?
 * Hint 2: Try deleting each element and find the maximum subarray sum to both sides of that element.
 * Hint 3: To do that efficiently, use the idea of Kadane's algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/">LeetCode #1186</a>
 */
public class MaximumSubarraySumWithOneDeletion {

    /**
     * TODO: Implement "Maximum Subarray Sum with One Deletion".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Subarray Sum with One Deletion");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumSubarraySumWithOneDeletion.java &amp;&amp; java org.leetcode.medium.MaximumSubarraySumWithOneDeletion</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSubarraySumWithOneDeletion ===");
        MaximumSubarraySumWithOneDeletion sol = new MaximumSubarraySumWithOneDeletion();
        System.out.println(sol.solve(null));
    }
}
