package org.leetcode.medium;


/**
 * <b>#1493 - Longest Subarray of 1's After Deleting One Element</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary array nums, you should delete one element from it.
 *
 *
 * Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,1,0,1]
 * Output: 3
 * Explanation: After deleting the number in position 2, [1,1,1] contains 3 numbers with value of 1's.
 *
 * Example 2:
 *
 * Input: nums = [0,1,1,1,0,1,1,0,1]
 * Output: 5
 * Explanation: After deleting the number in position 4, [0,1,1,1,1,1,0,1] longest subarray with value of 1's is [1,1,1,1,1].
 *
 * Example 3:
 *
 * Input: nums = [1,1,1]
 * Output: 2
 * Explanation: You must delete one element.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * nums[i] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Maintain a sliding window where there is at most one zero in it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/">LeetCode #1493</a>
 */
public class LongestSubarrayOf1SAfterDeletingOneElement {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Subarray of 1's After Deleting One Element");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestSubarrayOf1SAfterDeletingOneElement ===");
        LongestSubarrayOf1SAfterDeletingOneElement sol = new LongestSubarrayOf1SAfterDeletingOneElement();
        System.out.println(sol.solve(null));
    }
}
