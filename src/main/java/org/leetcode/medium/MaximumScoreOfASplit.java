package org.leetcode.medium;


/**
 * <b>#3788 - Maximum Score of a Split</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n.
 *
 *
 * Choose an index i such that 0 &lt;= i &lt; n - 1.
 *
 *
 * For a chosen split index i:
 *
 *
 * Let prefixSum(i) be the sum of nums[0] + nums[1] + ... + nums[i].
 *
 * Let suffixMin(i) be the minimum value among nums[i + 1], nums[i + 2], ..., nums[n - 1].
 *
 * The score of a split at index i is defined as:
 *
 *
 * score(i) = prefixSum(i) - suffixMin(i)
 *
 *
 * Return an integer denoting the maximum score over all valid split indices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,-1,3,-4,-5]
 *
 *
 * Output: 17
 *
 *
 * Explanation:
 *
 *
 * The optimal split is at i = 2, score(2) = prefixSum(2) - suffixMin(2) = (10 + (-1) + 3) - (-5) = 17.
 *
 * Example 2:
 *
 * Input: nums = [-7,-5,3]
 *
 *
 * Output: -2
 *
 *
 * Explanation:
 *
 *
 * The optimal split is at i = 0, score(0) = prefixSum(0) - suffixMin(0) = (-7) - (-5) = -2.
 *
 * Example 3:
 *
 * Input: nums = [1,1]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The only valid split is at i = 0, score(0) = prefixSum(0) - suffixMin(0) = 1 - 1 = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * -109​​​​​​​ &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use prefix sum and suffix minimum arrays.
 * Hint 2: Precompute the prefix sums of <code>nums</code> and the suffix minimums for all valid split positions.
 * Hint 3: For each split index <code>i</code>, compute <code>score(i) = prefixSum(i) - suffixMin(i)</code> and keep track of the maximum value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-of-a-split/">LeetCode #3788</a>
 */
public class MaximumScoreOfASplit {

    /**
     * Solves the problem: Average.
     *
     * @param salary the salary (int[])
     * @return the computed double result
     */
    public double average(int[] salary) {
        int sum=0, min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int s:salary){sum+=s;min=Math.min(min,s);max=Math.max(max,s);}
        return (double)(sum-min-max)/(salary.length-2);
    }

    public static void main(String[] args) {
        MaximumScoreOfASplit sol = new MaximumScoreOfASplit();
        System.out.println(sol.average(new int[]{1,2,3}));
    }
}
