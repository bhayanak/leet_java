package org.leetcode.hard;


/**
 * <b>#891 - Sum of Subsequence Widths</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The width of a sequence is the difference between the maximum and minimum elements in the sequence.
 *
 *
 * Given an array of integers nums, return the sum of the widths of all the non-empty subsequences of nums. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * A subsequence is a sequence that can be derived from an array by deleting some or no elements without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,3]
 * Output: 6
 * Explanation: The subsequences are [1], [2], [3], [2,1], [2,3], [1,3], [2,1,3].
 * The corresponding widths are 0, 0, 0, 1, 1, 2, 2.
 * The sum of these widths is 6.
 *
 * Example 2:
 *
 * Input: nums = [2]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-subsequence-widths/">LeetCode #891</a>
 */
public class SumOfSubsequenceWidths {

    /**
     * TODO: Implement "Sum of Subsequence Widths".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Subsequence Widths");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SumOfSubsequenceWidths.java &amp;&amp; java org.leetcode.hard.SumOfSubsequenceWidths</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SumOfSubsequenceWidths ===");
        SumOfSubsequenceWidths sol = new SumOfSubsequenceWidths();
        System.out.println(sol.solve(null));
    }
}
