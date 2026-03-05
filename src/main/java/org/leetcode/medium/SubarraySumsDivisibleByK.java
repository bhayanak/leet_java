package org.leetcode.medium;


/**
 * <b>#974 - Subarray Sums Divisible by K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,5,0,-2,-3,1], k = 5
 * Output: 7
 * Explanation: There are 7 subarrays with a sum divisible by k = 5:
 * [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
 *
 * Example 2:
 *
 * Input: nums = [5], k = 9
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 3 * 104
 *
 * -104 &lt;= nums[i] &lt;= 104
 *
 * 2 &lt;= k &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/subarray-sums-divisible-by-k/">LeetCode #974</a>
 */
public class SubarraySumsDivisibleByK {

    /**
     * TODO: Implement "Subarray Sums Divisible by K".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Subarray Sums Divisible by K");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SubarraySumsDivisibleByK.java &amp;&amp; java org.leetcode.medium.SubarraySumsDivisibleByK</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SubarraySumsDivisibleByK ===");
        SubarraySumsDivisibleByK sol = new SubarraySumsDivisibleByK();
        System.out.println(sol.solve(null));
    }
}
