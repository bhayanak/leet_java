package org.leetcode.medium;


/**
 * <b>#1438 - Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Queue, Sliding Window, Heap (Priority Queue), Ordered Set, Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums and an integer limit, return the size of the longest non-empty subarray such that the absolute difference between any two elements of this subarray is less than or equal to limit.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,2,4,7], limit = 4
 * Output: 2 
 * Explanation: All subarrays are: 
 * [8] with maximum absolute diff |8-8| = 0 &lt;= 4.
 * [8,2] with maximum absolute diff |8-2| = 6 &gt; 4. 
 * [8,2,4] with maximum absolute diff |8-2| = 6 &gt; 4.
 * [8,2,4,7] with maximum absolute diff |8-2| = 6 &gt; 4.
 * [2] with maximum absolute diff |2-2| = 0 &lt;= 4.
 * [2,4] with maximum absolute diff |2-4| = 2 &lt;= 4.
 * [2,4,7] with maximum absolute diff |2-7| = 5 &gt; 4.
 * [4] with maximum absolute diff |4-4| = 0 &lt;= 4.
 * [4,7] with maximum absolute diff |4-7| = 3 &lt;= 4.
 * [7] with maximum absolute diff |7-7| = 0 &lt;= 4. 
 * Therefore, the size of the longest subarray is 2.
 *
 * Example 2:
 *
 * Input: nums = [10,1,2,4,7,2], limit = 5
 * Output: 4 
 * Explanation: The subarray [2,4,7,2] is the longest since the maximum absolute diff is |2-7| = 5 &lt;= 5.
 *
 * Example 3:
 *
 * Input: nums = [4,2,2,2,4,4,2,2], limit = 0
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 0 &lt;= limit &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a sliding window approach keeping the maximum and minimum value using a data structure like a multiset from STL in C++.
 * Hint 2: More specifically, use the two pointer technique, moving the right pointer as far as possible to the right until the subarray is not valid (maxValue - minValue &gt; limit), then moving the left pointer until the subarray is valid again (maxValue - minValue &lt;= limit). Keep repeating this process.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Queue, Sliding Window, Heap (Priority Queue), Ordered Set, Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/">LeetCode #1438</a>
 */
public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit ===");
        LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit sol = new LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit();
        System.out.println(sol.solve(null));
    }
}
