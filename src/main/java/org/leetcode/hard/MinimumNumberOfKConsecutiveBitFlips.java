package org.leetcode.hard;


/**
 * <b>#995 - Minimum Number of K Consecutive Bit Flips</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums and an integer k.
 *
 *
 * A k-bit flip is choosing a subarray of length k from nums and simultaneously changing every 0 in the subarray to 1, and every 1 in the subarray to 0.
 *
 *
 * Return the minimum number of k-bit flips required so that there is no 0 in the array. If it is not possible, return -1.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0], k = 1
 * Output: 2
 * Explanation: Flip nums[0], then flip nums[2].
 *
 * Example 2:
 *
 * Input: nums = [1,1,0], k = 2
 * Output: -1
 * Explanation: No matter how we flip subarrays of size 2, we cannot make the array become [1,1,1].
 *
 * Example 3:
 *
 * Input: nums = [0,0,0,1,0,1,1,0], k = 3
 * Output: 3
 * Explanation: 
 * Flip nums[0],nums[1],nums[2]: nums becomes [1,1,1,1,0,1,1,0]
 * Flip nums[4],nums[5],nums[6]: nums becomes [1,1,1,1,1,0,0,0]
 * Flip nums[5],nums[6],nums[7]: nums becomes [1,1,1,1,1,1,1,1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/">LeetCode #995</a>
 */
public class MinimumNumberOfKConsecutiveBitFlips {

    /**
     * TODO: Implement "Minimum Number of K Consecutive Bit Flips".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of K Consecutive Bit Flips");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumNumberOfKConsecutiveBitFlips.java &amp;&amp; java org.leetcode.hard.MinimumNumberOfKConsecutiveBitFlips</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfKConsecutiveBitFlips ===");
        MinimumNumberOfKConsecutiveBitFlips sol = new MinimumNumberOfKConsecutiveBitFlips();
        System.out.println(sol.solve(null));
    }
}
