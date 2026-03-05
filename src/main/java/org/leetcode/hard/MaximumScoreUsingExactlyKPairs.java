package org.leetcode.hard;


/**
 * <b>#3836 - Maximum Score Using Exactly K Pairs</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2 of lengths n and m respectively, and an integer k.
 *
 *
 * You must choose exactly k pairs of indices (i1, j1), (i2, j2), ..., (ik, jk) such that:
 *
 *
 * 0 &lt;= i1 &lt; i2 &lt; ... &lt; ik &lt; n
 *
 * 0 &lt;= j1 &lt; j2 &lt; ... &lt; jk &lt; m
 *
 * For each chosen pair (i, j), you gain a score of nums1[i] * nums2[j].
 *
 *
 * The total score is the sum of the products of all selected pairs.
 *
 *
 * Return an integer representing the maximum achievable total score.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,3,2], nums2 = [4,5,1], k = 2
 *
 *
 * Output: 22
 *
 *
 * Explanation:
 *
 *
 * One optimal choice of index pairs is:
 *
 *
 * (i1, j1) = (1, 0) which scores 3 * 4 = 12
 *
 * (i2, j2) = (2, 1) which scores 2 * 5 = 10
 *
 * This gives a total score of 12 + 10 = 22.
 *
 * Example 2:
 *
 * Input: nums1 = [-2,0,5], nums2 = [-3,4,-1,2], k = 2
 *
 *
 * Output: 26
 *
 *
 * Explanation:
 *
 *
 * One optimal choice of index pairs is:
 *
 *
 * (i1, j1) = (0, 0) which scores -2 * -3 = 6
 *
 * (i2, j2) = (2, 1) which scores 5 * 4 = 20
 *
 * The total score is 6 + 20 = 26.
 *
 * Example 3:
 *
 * Input: nums1 = [-3,-2], nums2 = [1,2], k = 2
 *
 *
 * Output: -7
 *
 *
 * Explanation:
 *
 *
 * The optimal choice of index pairs is:
 *
 *
 * (i1, j1) = (0, 0) which scores -3 * 1 = -3
 *
 * (i2, j2) = (1, 1) which scores -2 * 2 = -4
 *
 * The total score is -3 + (-4) = -7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums1.length &lt;= 100
 *
 * 1 &lt;= m == nums2.length &lt;= 100
 *
 * -106 &lt;= nums1[i], nums2[i] &lt;= 106
 *
 * 1 &lt;= k &lt;= min(n, m)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming
 * Hint 2: Let dynamic programming states <code>dp(i, j, k)</code>, denote the maximum <code>k-th</code> pair sum you can get from the first <code>nums1[0..i]</code> and <code>nums2[0..j]</code>
 * Hint 3: Transition: <code>dp(i, j, t) = max(dp(i - 1, j, t), dp(i, j - 1, t), dp(i - 1, j - 1, t - 1) + nums1[i] * nums2[j])</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-using-exactly-k-pairs/">LeetCode #3836</a>
 */
public class MaximumScoreUsingExactlyKPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score Using Exactly K Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumScoreUsingExactlyKPairs ===");
        MaximumScoreUsingExactlyKPairs sol = new MaximumScoreUsingExactlyKPairs();
        System.out.println(sol.solve(null));
    }
}
