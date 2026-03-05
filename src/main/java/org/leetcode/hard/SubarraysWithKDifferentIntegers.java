package org.leetcode.hard;


/**
 * <b>#992 - Subarrays with K Different Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 *
 *
 * A good array is an array where the number of different integers in that array is exactly k.
 *
 *
 * For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,2,3], k = 2
 * Output: 7
 * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 *
 * Example 2:
 *
 * Input: nums = [1,2,1,3,4], k = 3
 * Output: 3
 * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2 * 104
 *
 * 1 &lt;= nums[i], k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try generating all possible subarrays and check for the number of unique integers. Increment the count accordingly.
 * Hint 2: How about using a map to store the count of integers?
 * Hint 3: Think about the Sliding Window and 2-pointer approach.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/subarrays-with-k-different-integers/">LeetCode #992</a>
 */
public class SubarraysWithKDifferentIntegers {

    /**
     * TODO: Implement "Subarrays with K Different Integers".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Subarrays with K Different Integers");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SubarraysWithKDifferentIntegers.java &amp;&amp; java org.leetcode.hard.SubarraysWithKDifferentIntegers</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SubarraysWithKDifferentIntegers ===");
        SubarraysWithKDifferentIntegers sol = new SubarraysWithKDifferentIntegers();
        System.out.println(sol.solve(null));
    }
}
