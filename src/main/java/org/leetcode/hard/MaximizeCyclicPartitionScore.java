package org.leetcode.hard;


/**
 * <b>#3743 - Maximize Cyclic Partition Score</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a cyclic array nums and an integer k.
 *
 *
 * Partition nums into at most k subarrays. As nums is cyclic, these subarrays may wrap around from the end of the array back to the beginning.
 *
 *
 * The range of a subarray is the difference between its maximum and minimum values. The score of a partition is the sum of subarray ranges.
 *
 *
 * Return the maximum possible score among all cyclic partitions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,3], k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Partition nums into [2, 3] and [3, 1] (wrapped around).
 *
 * The range of [2, 3] is max(2, 3) - min(2, 3) = 3 - 2 = 1.
 *
 * The range of [3, 1] is max(3, 1) - min(3, 1) = 3 - 1 = 2.
 *
 * The score is 1 + 2 = 3.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,3], k = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Partition nums into [1, 2, 3, 3].
 *
 * The range of [1, 2, 3, 3] is max(1, 2, 3, 3) - min(1, 2, 3, 3) = 3 - 1 = 2.
 *
 * The score is 2.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,3], k = 4
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Identical to Example 1, we partition nums into [2, 3] and [3, 1]. Note that nums may be partitioned into fewer than k subarrays.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming on the number of extreme picks: allow up to <code>2 * k</code> picks (each partition can supply a + and a -), so the problem becomes choosing which elements are + or -.
 * Hint 2: Model a partition by its max (+<code>nums[i]</code>) and min (-<code>nums[i]</code>) contributions; selecting an element as a max adds +<code>nums[i]</code>, and selecting it as a min adds -<code>nums[i]</code>.
 * Hint 3: Use a DP state <code>(picks, balance)</code> where <code>picks</code> is the total number of + and - chosen so far (&lt;= <code>2 * k</code>), and <code>balance</code> represents the difference between the counts of + and - currently; at each <code>i</code>, you conceptually take +, take -, or skip.
 * Hint 4: Handle cyclicity by limiting <code>balance</code> to the range <code>[0, 2]</code>. You can show that such a balance is always achievable.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximize-cyclic-partition-score/">LeetCode #3743</a>
 */
public class MaximizeCyclicPartitionScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Cyclic Partition Score");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeCyclicPartitionScore ===");
        MaximizeCyclicPartitionScore sol = new MaximizeCyclicPartitionScore();
        System.out.println(sol.solve(null));
    }
}
