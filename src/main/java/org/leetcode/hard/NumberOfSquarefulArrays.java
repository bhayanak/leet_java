package org.leetcode.hard;


/**
 * <b>#996 - Number of Squareful Arrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An array is squareful if the sum of every pair of adjacent elements is a perfect square.
 *
 *
 * Given an integer array nums, return the number of permutations of nums that are squareful.
 *
 *
 * Two permutations perm1 and perm2 are different if there is some index i such that perm1[i] != perm2[i].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,17,8]
 * Output: 2
 * Explanation: [1,8,17] and [17,8,1] are the valid permutations.
 *
 * Example 2:
 *
 * Input: nums = [2,2,2]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 12
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Dynamic Programming, Backtracking, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-squareful-arrays/">LeetCode #996</a>
 */
public class NumberOfSquarefulArrays {

    /**
     * TODO: Implement "Number of Squareful Arrays".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Squareful Arrays");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfSquarefulArrays.java &amp;&amp; java org.leetcode.hard.NumberOfSquarefulArrays</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSquarefulArrays ===");
        NumberOfSquarefulArrays sol = new NumberOfSquarefulArrays();
        System.out.println(sol.solve(null));
    }
}
