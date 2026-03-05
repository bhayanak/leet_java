package org.leetcode.hard;


/**
 * <b>#805 - Split Array With Same Average</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You should move each element of nums into one of the two arrays A and B such that A and B are non-empty, and average(A) == average(B).
 *
 *
 * Return true if it is possible to achieve that and false otherwise.
 *
 *
 * Note that for an array arr, average(arr) is the sum of all the elements of arr over the length of arr.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6,7,8]
 * Output: true
 * Explanation: We can split the array into [1,4,5,8] and [2,3,6,7], and both of them have an average of 4.5.
 *
 * Example 2:
 *
 * Input: nums = [3,1]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 30
 *
 * 0 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/split-array-with-same-average/">LeetCode #805</a>
 */
public class SplitArrayWithSameAverage {

    /**
     * TODO: Implement "Split Array With Same Average".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split Array With Same Average");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SplitArrayWithSameAverage.java &amp;&amp; java org.leetcode.hard.SplitArrayWithSameAverage</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SplitArrayWithSameAverage ===");
        SplitArrayWithSameAverage sol = new SplitArrayWithSameAverage();
        System.out.println(sol.solve(null));
    }
}
