package org.leetcode.hard;


/**
 * <b>#3695 - Maximize Alternating Sum Using Swaps</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Union-Find, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You want to maximize the alternating sum of nums, which is defined as the value obtained by adding elements at even indices and subtracting elements at odd indices. That is, nums[0] - nums[1] + nums[2] - nums[3]...
 *
 *
 * You are also given a 2D integer array swaps where swaps[i] = [pi, qi]. For each pair [pi, qi] in swaps, you are allowed to swap the elements at indices pi and qi. These swaps can be performed any number of times and in any order.
 *
 *
 * Return the maximum possible alternating sum of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], swaps = [[0,2],[1,2]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The maximum alternating sum is achieved when nums is [2, 1, 3] or [3, 1, 2]. As an example, you can obtain nums = [2, 1, 3] as follows.
 *
 *
 * Swap nums[0] and nums[2]. nums is now [3, 2, 1].
 *
 * Swap nums[1] and nums[2]. nums is now [3, 1, 2].
 *
 * Swap nums[0] and nums[2]. nums is now [2, 1, 3].
 *
 * Example 2:
 *
 * Input: nums = [1,2,3], swaps = [[1,2]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The maximum alternating sum is achieved by not performing any swaps.
 *
 * Example 3:
 *
 * Input: nums = [1,1000000000,1,1000000000,1,1000000000], swaps = []
 *
 *
 * Output: -2999999997
 *
 *
 * Explanation:
 *
 *
 * Since we cannot perform any swaps, the maximum alternating sum is achieved by not performing any swaps.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= swaps.length &lt;= 105
 *
 * swaps[i] = [pi, qi]
 *
 * 0 &lt;= pi &lt; qi &lt;= nums.length - 1
 *
 * [pi, qi] != [pj, qj]
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build connected components using a DSU (disjoint-set union).
 * Hint 2: Let <code>E</code> be the count of even indices inside that component. In each component, place the largest <code>E</code> values on the component's even indices.
 * Hint 3: The component's contribution to the alternating sum is <code>2 * sumTopE - sumAll</code>, where <code>sumTopE</code> is the sum of the largest <code>E</code> values and <code>sumAll</code> is the sum of all values in the component.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Union-Find, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-alternating-sum-using-swaps/">LeetCode #3695</a>
 */
public class MaximizeAlternatingSumUsingSwaps {

    /**
     * Solves the problem: Maximum subarray xor.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums the nums (int[])
     * @return the computed long result
     */
    public long maximumSubarrayXor(int[] nums) {
        int n=nums.length; long max=Long.MIN_VALUE;
        // XOR all subarrays = dp approach
        int[][] dp=new int[n][n];
        for (int i=0;i<n;i++) { dp[i][i]=nums[i]; max=Math.max(max,nums[i]); }
        for (int len=2;len<=n;len++) for (int i=0;i<=n-len;i++) {
            dp[i][i+len-1]=dp[i][i+len-2]^dp[i+1][i+len-1];
            max=Math.max(max,dp[i][i+len-1]);
        }
        return max;
    }

    public static void main(String[] args) {
        MaximizeAlternatingSumUsingSwaps sol = new MaximizeAlternatingSumUsingSwaps();
        System.out.println(sol.maximumSubarrayXor(new int[]{1,2,3}));
    }
}
