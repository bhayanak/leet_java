package org.leetcode.medium;


/**
 * <b>#3202 - Find the Maximum Length of Valid Subsequence II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k.
 *
 * A subsequence sub of nums with length x is called valid if it satisfies:
 *
 *
 * (sub[0] + sub[1]) % k == (sub[1] + sub[2]) % k == ... == (sub[x - 2] + sub[x - 1]) % k.
 *
 * Return the length of the longest valid subsequence of nums.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5], k = 2
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The longest valid subsequence is [1, 2, 3, 4, 5].
 *
 * Example 2:
 *
 * Input: nums = [1,4,2,3,1,4], k = 3
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The longest valid subsequence is [1, 4, 1, 4].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 103
 *
 * 1 &lt;= nums[i] &lt;= 107
 *
 * 1 &lt;= k &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix the value of <code>(subs[0] + subs[1]) % k</code> from the <code>k</code> possible values. Let it be <code>val</code>.
 * Hint 2: Let <code>dp[i]</code> store the maximum length of a subsequence with its last element <code>x</code> such that <code>x % k == i</code>.
 * Hint 3: Answer for a subsequence ending at index <code>y</code> is <code>dp[(k + val - (y % k)) % k] + 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-length-of-valid-subsequence-ii/">LeetCode #3202</a>
 */
public class FindTheMaximumLengthOfValidSubsequenceIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Length of Valid Subsequence II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumLengthOfValidSubsequenceIi ===");
        FindTheMaximumLengthOfValidSubsequenceIi sol = new FindTheMaximumLengthOfValidSubsequenceIi();
        System.out.println(sol.solve(null));
    }
}
