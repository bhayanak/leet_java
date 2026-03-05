package org.leetcode.medium;


/**
 * <b>#3473 - Sum of K Subarrays With Length at Least M</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and two integers, k and m.
 *
 *
 * Return the maximum sum of k non-overlapping subarrays of nums, where each subarray has a length of at least m.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,-1,3,3,4], k = 2, m = 2
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 * The optimal choice is:
 *
 *
 * Subarray nums[3..5] with sum 3 + 3 + 4 = 10 (length is 3 &gt;= m).
 *
 * Subarray nums[0..1] with sum 1 + 2 = 3 (length is 2 &gt;= m).
 *
 * The total sum is 10 + 3 = 13.
 *
 * Example 2:
 *
 * Input: nums = [-10,3,-1,-2], k = 4, m = 1
 *
 *
 * Output: -10
 *
 *
 * Explanation:
 *
 *
 * The optimal choice is choosing each element as a subarray. The output is (-10) + 3 + (-1) + (-2) = -10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2000
 *
 * -104 &lt;= nums[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= floor(nums.length / m)
 *
 * 1 &lt;= m &lt;= 3
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Dynamic Programming
 * Hint 2: Prefix Sum
 * Hint 3: Let <code>dp[i][j]</code> be the maximum sum with <code>i</code> subarrays for the first <code>j</code> elements
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-k-subarrays-with-length-at-least-m/">LeetCode #3473</a>
 */
public class SumOfKSubarraysWithLengthAtLeastM {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of K Subarrays With Length at Least M");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfKSubarraysWithLengthAtLeastM ===");
        SumOfKSubarraysWithLengthAtLeastM sol = new SumOfKSubarraysWithLengthAtLeastM();
        System.out.println(sol.solve(null));
    }
}
