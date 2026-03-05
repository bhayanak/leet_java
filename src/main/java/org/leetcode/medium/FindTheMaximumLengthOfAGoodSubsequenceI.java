package org.leetcode.medium;


/**
 * <b>#3176 - Find the Maximum Length of a Good Subsequence I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a non-negative integer k. A sequence of integers seq is called good if there are at most k indices i in the range [0, seq.length - 2] such that seq[i] != seq[i + 1].
 *
 *
 * Return the maximum possible length of a good subsequence of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,1,3], k = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The maximum length subsequence is [1,2,1,1,3].
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5,1], k = 0
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The maximum length subsequence is [1,2,3,4,5,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 500
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= k &lt;= min(nums.length, 25)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The absolute values in <code>nums</code> don’t really matter. So we can remap the set of values to the range <code>[0, n - 1]</code>.
 * Hint 2: Let <code>dp[i][j]</code> be the length of the longest subsequence till index <code>j</code> with at most <code>i</code> positions such that <code>seq[i] != seq[i + 1]</code>.
 * Hint 3: For each value <code>x</code> from left to right, update <code>dp[i][x] = max(dp[i][x] + 1, dp[i - 1][y] + 1)</code>, where <code>y != x</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-length-of-a-good-subsequence-i/">LeetCode #3176</a>
 */
public class FindTheMaximumLengthOfAGoodSubsequenceI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Length of a Good Subsequence I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumLengthOfAGoodSubsequenceI ===");
        FindTheMaximumLengthOfAGoodSubsequenceI sol = new FindTheMaximumLengthOfAGoodSubsequenceI();
        System.out.println(sol.solve(null));
    }
}
