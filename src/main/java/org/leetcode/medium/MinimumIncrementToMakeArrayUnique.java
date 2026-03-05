package org.leetcode.medium;


/**
 * <b>#945 - Minimum Increment to Make Array Unique</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. In one move, you can pick an index i where 0 &lt;= i &lt; nums.length and increment nums[i] by 1.
 *
 *
 * Return the minimum number of moves to make every value in nums unique.
 *
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,2]
 * Output: 1
 * Explanation: After 1 move, the array could be [1, 2, 3].
 *
 * Example 2:
 *
 * Input: nums = [3,2,1,2,1,7]
 * Output: 6
 * Explanation: After 6 moves, the array could be [3, 4, 1, 2, 5, 7].
 * It can be shown that it is impossible for the array to have all unique values with 5 or less moves.
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
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-increment-to-make-array-unique/">LeetCode #945</a>
 */
public class MinimumIncrementToMakeArrayUnique {

    /**
     * TODO: Implement "Minimum Increment to Make Array Unique".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Increment to Make Array Unique");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumIncrementToMakeArrayUnique.java &amp;&amp; java org.leetcode.medium.MinimumIncrementToMakeArrayUnique</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumIncrementToMakeArrayUnique ===");
        MinimumIncrementToMakeArrayUnique sol = new MinimumIncrementToMakeArrayUnique();
        System.out.println(sol.solve(null));
    }
}
