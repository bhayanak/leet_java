package org.leetcode.medium;


/**
 * <b>#2831 - Find the Longest Equal Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer k.
 *
 *
 * A subarray is called equal if all of its elements are equal. Note that the empty subarray is an equal subarray.
 *
 *
 * Return the length of the longest possible equal subarray after deleting at most k elements from nums.
 *
 *
 * A subarray is a contiguous, possibly empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,3,1,3], k = 3
 * Output: 3
 * Explanation: It's optimal to delete the elements at index 2 and index 4.
 * After deleting them, nums becomes equal to [1, 3, 3, 3].
 * The longest equal subarray starts at i = 1 and ends at j = 3 with length equal to 3.
 * It can be proven that no longer equal subarrays can be created.
 *
 * Example 2:
 *
 * Input: nums = [1,1,2,2,1,1], k = 2
 * Output: 4
 * Explanation: It's optimal to delete the elements at index 2 and index 3.
 * After deleting them, nums becomes equal to [1, 1, 1, 1].
 * The array itself is an equal subarray, so the answer is 4.
 * It can be proven that no longer equal subarrays can be created.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= nums.length
 *
 * 0 &lt;= k &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">For each number <code>x</code> in <code>nums</code>, create a sorted list <code>indices<sub>x</sub></code> of all indices <code>i</code> such that <code>nums[i] == x</code>.</div>
 * Hint 2: <div class="_1l1MA">On every <code>indices<sub>x</sub></code>, execute a sliding window technique.</div>
 * Hint 3: <div class="_1l1MA">For each <code>indices<sub>x</sub></code>, find <code>i, j</code> such that <code>(indices<sub>x</sub>[j] - indices<sub>x</sub>[i]) - (j - i) &lt;= k</code> and <code>j - i + 1</code> is maximized.</div>
 * Hint 4: <div class="_1l1MA">The answer would be the maximum of <code>j - i + 1</code> for all <code>indices<sub>x</sub></code>.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-longest-equal-subarray/">LeetCode #2831</a>
 */
public class FindTheLongestEqualSubarray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Longest Equal Subarray");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheLongestEqualSubarray ===");
        FindTheLongestEqualSubarray sol = new FindTheLongestEqualSubarray();
        System.out.println(sol.solve(null));
    }
}
