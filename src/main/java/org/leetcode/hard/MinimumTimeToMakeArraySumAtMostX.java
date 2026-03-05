package org.leetcode.hard;


/**
 * <b>#2809 - Minimum Time to Make Array Sum At Most x</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer arrays nums1 and nums2 of equal length. Every second, for all indices 0 &lt;= i &lt; nums1.length, value of nums1[i] is incremented by nums2[i]. After this is done, you can do the following operation:
 *
 *
 * Choose an index 0 &lt;= i &lt; nums1.length and make nums1[i] = 0.
 *
 * You are also given an integer x.
 *
 *
 * Return the minimum time in which you can make the sum of all elements of nums1 to be less than or equal to x, or -1 if this is not possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3], nums2 = [1,2,3], x = 4
 * Output: 3
 * Explanation: 
 * For the 1st second, we apply the operation on i = 0. Therefore nums1 = [0,2+2,3+3] = [0,4,6]. 
 * For the 2nd second, we apply the operation on i = 1. Therefore nums1 = [0+1,0,6+3] = [1,0,9]. 
 * For the 3rd second, we apply the operation on i = 2. Therefore nums1 = [1+1,0+2,0] = [2,2,0]. 
 * Now sum of nums1 = 4. It can be shown that these operations are optimal, so we return 3.
 *
 * Example 2:
 *
 * Input: nums1 = [1,2,3], nums2 = [3,3,3], x = 4
 * Output: -1
 * Explanation: It can be shown that the sum of nums1 will always be greater than x, no matter which operations are performed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length &lt;= 103
 *
 * 1 &lt;= nums1[i] &lt;= 103
 *
 * 0 &lt;= nums2[i] &lt;= 103
 *
 * nums1.length == nums2.length
 *
 * 0 &lt;= x &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">It can be proven that in the optimal solution, for each index <code>i</code>, we only need to set <code>nums1[i]</code> to <code>0</code> at most once. (If we have to set it twice, we can simply remove the earlier set and all the operations “shift left” by <code>1</code>.)</div>
 * Hint 2: <div class="_1l1MA">It can also be proven that if we select several indexes <code>i<sub>1</sub>, i<sub>2</sub>, ..., i<sub>k</sub></code> and set <code>nums1[i<sub>1</sub>], nums1[i<sub>2</sub>], ..., nums1[i<sub>k</sub>]</code> to <code>0</code>, it’s always optimal to set them in the order of <code>nums2[i<sub>1</sub>] &lt;= nums2[i<sub>2</sub>] &lt;= ... &lt;= nums2[i<sub>k</sub>]</code> (the larger the increase is, the later we should set it to <code>0</code>).</div>
 * Hint 3: <div class="_1l1MA">Let’s sort all the values by <code>nums2</code> (in non-decreasing order). Let <code>dp[i][j]</code> represent the maximum total value that can be reduced if we do <code>j</code> operations on the first <code>i</code> elements. Then we have <code>dp[i][0] = 0</code> (for all <code>i = 0, 1, ..., n</code>) and <code>dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - 1] + nums2[i - 1] * j + nums1[i - 1])</code> (for <code>1 &lt;= i &lt;= n</code> and <code>1 &lt;= j &lt;= i</code>).</div>
 * Hint 4: <div class="_1l1MA">The answer is the minimum value of <code>t</code>, such that <code>0 &lt;= t &lt;= n</code> and <code>sum(nums1) + sum(nums2) * t - dp[n][t] &lt;= x</code>, or <code>-1</code> if it doesn’t exist.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-make-array-sum-at-most-x/">LeetCode #2809</a>
 */
public class MinimumTimeToMakeArraySumAtMostX {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Make Array Sum At Most x");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToMakeArraySumAtMostX ===");
        MinimumTimeToMakeArraySumAtMostX sol = new MinimumTimeToMakeArraySumAtMostX();
        System.out.println(sol.solve(null));
    }
}
