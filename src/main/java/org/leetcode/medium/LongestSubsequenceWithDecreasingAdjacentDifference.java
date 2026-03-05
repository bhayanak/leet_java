package org.leetcode.medium;


/**
 * <b>#3409 - Longest Subsequence With Decreasing Adjacent Difference</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums.
 *
 *
 * Your task is to find the length of the longest subsequence seq of nums, such that the absolute differences between consecutive elements form a non-increasing sequence of integers. In other words, for a subsequence seq0, seq1, seq2, ..., seqm of nums, |seq1 - seq0| &gt;= |seq2 - seq1| &gt;= ... &gt;= |seqm - seqm - 1|.
 *
 *
 * Return the length of such a subsequence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [16,6,3]
 *
 *
 * Output: 3
 *
 *
 * Explanation: 
 *
 *
 * The longest subsequence is [16, 6, 3] with the absolute adjacent differences [10, 3].
 *
 * Example 2:
 *
 * Input: nums = [6,5,3,4,2,1]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The longest subsequence is [6, 4, 2, 1] with the absolute adjacent differences [2, 2, 1].
 *
 * Example 3:
 *
 * Input: nums = [10,20,10,19,10,20]
 *
 *
 * Output: 5
 *
 *
 * Explanation: 
 *
 *
 * The longest subsequence is [10, 20, 10, 19, 10] with the absolute adjacent differences [10, 10, 9, 9].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 104
 *
 * 1 &lt;= nums[i] &lt;= 300
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Store the maximum answer for each index and every possible difference.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-subsequence-with-decreasing-adjacent-difference/">LeetCode #3409</a>
 */
public class LongestSubsequenceWithDecreasingAdjacentDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Subsequence With Decreasing Adjacent Difference");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSubsequenceWithDecreasingAdjacentDifference ===");
        LongestSubsequenceWithDecreasingAdjacentDifference sol = new LongestSubsequenceWithDecreasingAdjacentDifference();
        System.out.println(sol.solve(null));
    }
}
