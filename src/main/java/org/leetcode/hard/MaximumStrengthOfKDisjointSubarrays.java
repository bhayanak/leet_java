package org.leetcode.hard;


/**
 * <b>#3077 - Maximum Strength of K Disjoint Subarrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums with length n, and a positive odd integer k.
 *
 *
 * Select exactly k disjoint subarrays sub1, sub2, ..., subk from nums such that the last element of subi appears before the first element of sub{i+1} for all 1 &lt;= i &lt;= k-1. The goal is to maximize their combined strength.
 *
 *
 * The strength of the selected subarrays is defined as:
 *
 *
 * strength = k * sum(sub1)- (k - 1) * sum(sub2) + (k - 2) * sum(sub3) - ... - 2 * sum(sub{k-1}) + sum(subk)
 *
 *
 * where sum(subi) is the sum of the elements in the i-th subarray.
 *
 *
 * Return the maximum possible strength that can be obtained from selecting exactly k disjoint subarrays from nums.
 *
 *
 * Note that the chosen subarrays don't need to cover the entire array.
 *
 *
 *
 *
 * Example 1:
 *
 *
 * Input: nums = [1,2,3,-1,2], k = 3
 *
 *
 * Output: 22
 *
 *
 * Explanation:
 *
 *
 * The best possible way to select 3 subarrays is: nums[0..2], nums[3..3], and nums[4..4]. The strength is calculated as follows:
 *
 *
 * strength = 3 * (1 + 2 + 3) - 2 * (-1) + 2 = 22
 *
 *
 *
 *
 *
 * Example 2:
 *
 *
 * Input: nums = [12,-2,-2,-2,-2], k = 5
 *
 *
 * Output: 64
 *
 *
 * Explanation:
 *
 *
 * The only possible way to select 5 disjoint subarrays is: nums[0..0], nums[1..1], nums[2..2], nums[3..3], and nums[4..4]. The strength is calculated as follows:
 *
 *
 * strength = 5 * 12 - 4 * (-2) + 3 * (-2) - 2 * (-2) + (-2) = 64
 *
 *
 * Example 3:
 *
 *
 * Input: nums = [-1,-2,-3], k = 1
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * The best possible way to select 1 subarray is: nums[0..0]. The strength is -1.
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 *
 * -109 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= n
 *
 * 1 &lt;= n * k &lt;= 106
 *
 * k is odd.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i][j][x == 0/1]</code> be the maximum strength to select <code>j</code> disjoint subarrays from the original array’s suffix (<code>nums[i..(n - 1)]</code>), x denotes whether we select the element or not.
 * Hint 2: Initially <code>dp[n][0][0] == 0</code>.
 * Hint 3: We have 
<code>dp[i][j][1] = nums[i] * get(j) + max(dp[i + 1][j - 1][0], dp[i + 1][j][1])</code> where <code>get(j) = j</code> if <code>j</code> is odd, otherwise <code>-j</code>.
 * Hint 4: We can select <code>nums[i]</code> as a separate subarray or select at least <code>nums[i]</code> and <code>nums[i + 1]</code> as the first subarray.
<code>dp[i][j][0] = max(dp[i + 1][j][0], dp[i][j][1])</code>.
 * Hint 5: The answer is <code>dp[0][k][0]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-strength-of-k-disjoint-subarrays/">LeetCode #3077</a>
 */
public class MaximumStrengthOfKDisjointSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Strength of K Disjoint Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumStrengthOfKDisjointSubarrays ===");
        MaximumStrengthOfKDisjointSubarrays sol = new MaximumStrengthOfKDisjointSubarrays();
        System.out.println(sol.solve(null));
    }
}
