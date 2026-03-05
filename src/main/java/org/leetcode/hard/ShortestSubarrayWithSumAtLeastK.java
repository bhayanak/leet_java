package org.leetcode.hard;


/**
 * <b>#862 - Shortest Subarray with Sum at Least K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Queue, Sliding Window, Heap (Priority Queue), Prefix Sum, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1], k = 1
 * Output: 1
 *
 *
 * Example 2:
 *
 * Input: nums = [1,2], k = 4
 * Output: -1
 *
 *
 * Example 3:
 *
 * Input: nums = [2,-1,2], k = 3
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -105 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Queue, Sliding Window, Heap (Priority Queue), Prefix Sum, Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/">LeetCode #862</a>
 */
public class ShortestSubarrayWithSumAtLeastK {

    /**
     * TODO: Implement "Shortest Subarray with Sum at Least K".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Subarray with Sum at Least K");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestSubarrayWithSumAtLeastK.java &amp;&amp; java org.leetcode.hard.ShortestSubarrayWithSumAtLeastK</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestSubarrayWithSumAtLeastK ===");
        ShortestSubarrayWithSumAtLeastK sol = new ShortestSubarrayWithSumAtLeastK();
        System.out.println(sol.solve(null));
    }
}
