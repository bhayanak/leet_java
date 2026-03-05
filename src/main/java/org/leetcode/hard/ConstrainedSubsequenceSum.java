package org.leetcode.hard;


/**
 * <b>#1425 - Constrained Subsequence Sum</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i &lt; j, the condition j - i &lt;= k is satisfied.
 *
 *
 * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,2,-10,5,20], k = 2
 * Output: 37
 * Explanation: The subsequence is [10, 2, 5, 20].
 *
 * Example 2:
 *
 * Input: nums = [-1,-2,-3], k = 1
 * Output: -1
 * Explanation: The subsequence must be non-empty, so we choose the largest number.
 *
 * Example 3:
 *
 * Input: nums = [10,-2,-10,-5,20], k = 2
 * Output: 23
 * Explanation: The subsequence is [10, -2, -5, 20].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 105
 *
 * -104 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let dp[i] be the solution for the prefix of the array that ends at index i, if the element at index i is in the subsequence.
 * Hint 3: dp[i] = nums[i] + max(0, dp[i-k], dp[i-k+1], ..., dp[i-1])
 * Hint 4: Use a heap with the sliding window technique to optimize the dp.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Queue, Sliding Window, Heap (Priority Queue), Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/constrained-subsequence-sum/">LeetCode #1425</a>
 */
public class ConstrainedSubsequenceSum {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Constrained Subsequence Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ConstrainedSubsequenceSum ===");
        ConstrainedSubsequenceSum sol = new ConstrainedSubsequenceSum();
        System.out.println(sol.solve(null));
    }
}
