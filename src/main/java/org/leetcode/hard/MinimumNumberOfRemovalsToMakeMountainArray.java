package org.leetcode.hard;


/**
 * <b>#1671 - Minimum Number of Removals to Make Mountain Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Greedy</p>
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
 * Given an integer array nums​​​, return the minimum number of elements to remove to make nums​​​ a mountain array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,1]
 * Output: 0
 * Explanation: The array itself is a mountain array so we do not need to remove any elements.
 *
 * Example 2:
 *
 * Input: nums = [2,1,1,5,6,2,3,1]
 * Output: 3
 * Explanation: One solution is to remove the elements at indices 0, 1, and 5, making the array nums = [1,5,6,3,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * It is guaranteed that you can make a mountain array out of nums.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think the opposite direction instead of minimum elements to remove the maximum mountain subsequence
 * Hint 2: Think of LIS it's kind of close
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/">LeetCode #1671</a>
 */
public class MinimumNumberOfRemovalsToMakeMountainArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Removals to Make Mountain Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfRemovalsToMakeMountainArray ===");
        MinimumNumberOfRemovalsToMakeMountainArray sol = new MinimumNumberOfRemovalsToMakeMountainArray();
        System.out.println(sol.solve(null));
    }
}
