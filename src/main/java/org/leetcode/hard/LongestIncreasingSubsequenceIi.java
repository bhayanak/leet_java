package org.leetcode.hard;


/**
 * <b>#2407 - Longest Increasing Subsequence II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Dynamic Programming, Binary Indexed Tree, Segment Tree, Queue, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * Find the longest subsequence of nums that meets the following requirements:
 *
 *
 * The subsequence is strictly increasing and
 *
 * The difference between adjacent elements in the subsequence is at most k.
 *
 * Return the length of the longest subsequence that meets the requirements.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,1,4,3,4,5,8,15], k = 3
 * Output: 5
 * Explanation:
 * The longest subsequence that meets the requirements is [1,3,4,5,8].
 * The subsequence has a length of 5, so we return 5.
 * Note that the subsequence [1,3,4,5,8,15] does not meet the requirements because 15 - 8 = 7 is larger than 3.
 *
 * Example 2:
 *
 * Input: nums = [7,4,5,1,8,12,4,7], k = 5
 * Output: 4
 * Explanation:
 * The longest subsequence that meets the requirements is [4,5,8,12].
 * The subsequence has a length of 4, so we return 4.
 *
 * Example 3:
 *
 * Input: nums = [1,5], k = 1
 * Output: 1
 * Explanation:
 * The longest subsequence that meets the requirements is [1].
 * The subsequence has a length of 1, so we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i], k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use dynamic programming. Let dp[i][val] be the answer using only the first i + 1 elements, and the last element in the subsequence is equal to val.
 * Hint 2: The only value that might change between dp[i - 1] and dp[i] are dp[i - 1][val] and dp[i][val].
 * Hint 3: Try using dp[i - 1] and the fact that the second last element in the subsequence has to fall within a range to calculate dp[i][val].
 * Hint 4: We can use a segment tree to find the maximum value in dp[i - 1] within a certain range.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Dynamic Programming, Binary Indexed Tree, Segment Tree, Queue, Monotonic Queue).
 *
 * @see <a href="https://leetcode.com/problems/longest-increasing-subsequence-ii/">LeetCode #2407</a>
 */
public class LongestIncreasingSubsequenceIi {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Increasing Subsequence II");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestIncreasingSubsequenceIi ===");
        LongestIncreasingSubsequenceIi sol = new LongestIncreasingSubsequenceIi();
        System.out.println(sol.solve(null));
    }
}
