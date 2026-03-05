package org.leetcode.hard;


/**
 * <b>#3351 - Sum of Good Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. A good subsequence is defined as a subsequence of nums where the absolute difference between any two consecutive elements in the subsequence is exactly 1.
 *
 *
 * Return the sum of all possible good subsequences of nums.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * Note that a subsequence of size 1 is considered good by definition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1]
 *
 *
 * Output: 14
 *
 *
 * Explanation:
 *
 *
 * Good subsequences are: [1], [2], [1], [1,2], [2,1], [1,2,1].
 *
 * The sum of elements in these subsequences is 14.
 *
 * Example 2:
 *
 * Input: nums = [3,4,5]
 *
 *
 * Output: 40
 *
 *
 * Explanation:
 *
 *
 * Good subsequences are: [3], [4], [5], [3,4], [4,5], [3,4,5].
 *
 * The sum of elements in these subsequences is 40.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider counting how many times each element occurs in all possible good subsequences. This can help you derive the final answer more easily.
 * Hint 2: Use dynamic programming to track both the count and the sum of subsequences where the last element is <code>nums[i]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-good-subsequences/">LeetCode #3351</a>
 */
public class SumOfGoodSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Good Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfGoodSubsequences ===");
        SumOfGoodSubsequences sol = new SumOfGoodSubsequences();
        System.out.println(sol.solve(null));
    }
}
