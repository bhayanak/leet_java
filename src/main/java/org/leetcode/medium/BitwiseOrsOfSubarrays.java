package org.leetcode.medium;


/**
 * <b>#898 - Bitwise ORs of Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, return the number of distinct bitwise ORs of all the non-empty subarrays of arr.
 *
 *
 * The bitwise OR of a subarray is the bitwise OR of each integer in the subarray. The bitwise OR of a subarray of one integer is that integer.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [0]
 * Output: 1
 * Explanation: There is only one possible result: 0.
 *
 * Example 2:
 *
 * Input: arr = [1,1,2]
 * Output: 3
 * Explanation: The possible subarrays are [1], [1], [2], [1, 1], [1, 2], [1, 1, 2].
 * These yield the results 1, 1, 2, 1, 3, 3.
 * There are 3 unique values, so the answer is 3.
 *
 * Example 3:
 *
 * Input: arr = [1,2,4]
 * Output: 6
 * Explanation: The possible results are 1, 2, 3, 4, 6, and 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 5 * 104
 *
 * 0 &lt;= arr[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the the subarrays that end at index <code>i</code>. The number of unique bitwise OR for these subarrays is limited.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/bitwise-ors-of-subarrays/">LeetCode #898</a>
 */
public class BitwiseOrsOfSubarrays {

    /**
     * TODO: Implement "Bitwise ORs of Subarrays".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Bitwise ORs of Subarrays");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BitwiseOrsOfSubarrays.java &amp;&amp; java org.leetcode.medium.BitwiseOrsOfSubarrays</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BitwiseOrsOfSubarrays ===");
        BitwiseOrsOfSubarrays sol = new BitwiseOrsOfSubarrays();
        System.out.println(sol.solve(null));
    }
}
