package org.leetcode.hard;


/**
 * <b>#3826 - Minimum Partition Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Dynamic Programming, Queue, Prefix Sum, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Your task is to partition nums into exactly k subarrays and return an integer denoting the minimum possible score among all valid partitions.
 *
 *
 * The score of a partition is the sum of the values of all its subarrays.
 *
 *
 * The value of a subarray is defined as sumArr * (sumArr + 1) / 2, where sumArr is the sum of its elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,1,2,1], k = 2
 *
 *
 * Output: 25
 *
 *
 * Explanation:
 *
 *
 * We must partition the array into k = 2 subarrays. One optimal partition is [5] and [1, 2, 1].
 *
 * The first subarray has sumArr = 5 and value = 5 × 6 / 2 = 15.
 *
 * The second subarray has sumArr = 1 + 2 + 1 = 4 and value = 4 × 5 / 2 = 10.
 *
 * The score of this partition is 15 + 10 = 25, which is the minimum possible score.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4], k = 1
 *
 *
 * Output: 55
 *
 *
 * Explanation:
 *
 *
 * Since we must partition the array into k = 1 subarray, all elements belong to the same subarray: [1, 2, 3, 4].
 *
 * This subarray has sumArr = 1 + 2 + 3 + 4 = 10 and value = 10 × 11 / 2 = 55.​​​​​​​
 *
 * The score of this partition is 55, which is the minimum possible score.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1], k = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * We must partition the array into k = 3 subarrays. The only valid partition is [1], [1], [1].
 *
 * Each subarray has sumArr = 1 and value = 1 × 2 / 2 = 1.
 *
 * The score of this partition is 1 + 1 + 1 = 3, which is the minimum possible score.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[k][i]</code> be the minimum score to partition the first <code>i</code> elements into <code>k</code> subarrays. The transition is <code>dp[k][i] = min(dp[k-1][j] + value(subarray nums[j...i-1]))</code> for <code>j &lt; i</code>.
 * Hint 2: The naive DP approach takes <code>O(K*N<sup>2</sup>)</code>, which is too slow. Look for optimizations applicable to partitioning problems.
 * Hint 3: The cost function is convex. This suggests that the optimal splitting point satisfies the Quadrangle Inequality, enabling Divide and Conquer Optimization to reduce the complexity.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Dynamic Programming, Queue, Prefix Sum, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/minimum-partition-score/">LeetCode #3826</a>
 */
public class MinimumPartitionScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Partition Score");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumPartitionScore ===");
        MinimumPartitionScore sol = new MinimumPartitionScore();
        System.out.println(sol.solve(null));
    }
}
