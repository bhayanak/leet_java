package org.leetcode.medium;


/**
 * <b>#910 - Smallest Range II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and an integer k.
 *
 *
 * For each index i where 0 &lt;= i &lt; nums.length, change nums[i] to be either nums[i] + k or nums[i] - k.
 *
 *
 * The score of nums is the difference between the maximum and minimum elements in nums.
 *
 *
 * Return the minimum score of nums after changing the values at each index.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1], k = 0
 * Output: 0
 * Explanation: The score is max(nums) - min(nums) = 1 - 1 = 0.
 *
 * Example 2:
 *
 * Input: nums = [0,10], k = 2
 * Output: 6
 * Explanation: Change nums to be [2, 8]. The score is max(nums) - min(nums) = 8 - 2 = 6.
 *
 * Example 3:
 *
 * Input: nums = [1,3,6], k = 3
 * Output: 3
 * Explanation: Change nums to be [4, 6, 3]. The score is max(nums) - min(nums) = 6 - 3 = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 104
 *
 * 0 &lt;= nums[i] &lt;= 104
 *
 * 0 &lt;= k &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-range-ii/">LeetCode #910</a>
 */
public class SmallestRangeIi {

    /**
     * TODO: Implement "Smallest Range II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Range II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestRangeIi.java &amp;&amp; java org.leetcode.medium.SmallestRangeIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestRangeIi ===");
        SmallestRangeIi sol = new SmallestRangeIi();
        System.out.println(sol.solve(null));
    }
}
