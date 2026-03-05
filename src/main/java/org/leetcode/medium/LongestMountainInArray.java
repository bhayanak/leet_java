package org.leetcode.medium;


/**
 * <b>#845 - Longest Mountain in Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Dynamic Programming, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You may recall that an array arr is a mountain array if and only if:
 *
 *
 * arr.length &gt;= 3
 *
 * There exists some index i (0-indexed) with 0 &lt; i &lt; arr.length - 1 such that:
 *
 *
 *
 * arr[0] &lt; arr[1] &lt; ... &lt; arr[i - 1] &lt; arr[i]
 *
 * arr[i] &gt; arr[i + 1] &gt; ... &gt; arr[arr.length - 1]
 *
 *
 *
 * Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,1,4,7,3,2,5]
 * Output: 5
 * Explanation: The largest mountain is [1,4,7,3,2] which has length 5.
 *
 * Example 2:
 *
 * Input: arr = [2,2,2]
 * Output: 0
 * Explanation: There is no mountain.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 104
 *
 * 0 &lt;= arr[i] &lt;= 104
 *
 *
 *
 * Follow up:
 *
 *
 * Can you solve it using only one pass?
 *
 * Can you solve it in O(1) space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Dynamic Programming, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-mountain-in-array/">LeetCode #845</a>
 */
public class LongestMountainInArray {

    /**
     * TODO: Implement "Longest Mountain in Array".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Mountain in Array");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestMountainInArray.java &amp;&amp; java org.leetcode.medium.LongestMountainInArray</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestMountainInArray ===");
        LongestMountainInArray sol = new LongestMountainInArray();
        System.out.println(sol.solve(null));
    }
}
