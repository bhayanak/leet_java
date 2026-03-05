package org.leetcode.medium;


/**
 * <b>#1027 - Longest Arithmetic Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 *
 *
 * Note that:
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 * A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 &lt;= i &lt; seq.length - 1).
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,6,9,12]
 * Output: 4
 * Explanation:  The whole array is an arithmetic sequence with steps of length = 3.
 *
 * Example 2:
 *
 * Input: nums = [9,4,7,2,10]
 * Output: 3
 * Explanation:  The longest arithmetic subsequence is [4,7,10].
 *
 * Example 3:
 *
 * Input: nums = [20,1,15,3,10,5,8]
 * Output: 4
 * Explanation:  The longest arithmetic subsequence is [20,15,10,5].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-arithmetic-subsequence/">LeetCode #1027</a>
 */
public class LongestArithmeticSubsequence {

    /**
     * TODO: Implement "Longest Arithmetic Subsequence".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Arithmetic Subsequence");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestArithmeticSubsequence.java &amp;&amp; java org.leetcode.medium.LongestArithmeticSubsequence</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestArithmeticSubsequence ===");
        LongestArithmeticSubsequence sol = new LongestArithmeticSubsequence();
        System.out.println(sol.solve(null));
    }
}
