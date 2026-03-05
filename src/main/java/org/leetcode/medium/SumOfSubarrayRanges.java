package org.leetcode.medium;


/**
 * <b>#2104 - Sum of Subarray Ranges</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. The range of a subarray of nums is the difference between the largest and smallest element in the subarray.
 *
 *
 * Return the sum of all subarray ranges of nums.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 4
 * Explanation: The 6 subarrays of nums are the following:
 * [1], range = largest - smallest = 1 - 1 = 0 
 * [2], range = 2 - 2 = 0
 * [3], range = 3 - 3 = 0
 * [1,2], range = 2 - 1 = 1
 * [2,3], range = 3 - 2 = 1
 * [1,2,3], range = 3 - 1 = 2
 * So the sum of all ranges is 0 + 0 + 0 + 1 + 1 + 2 = 4.
 *
 * Example 2:
 *
 * Input: nums = [1,3,3]
 * Output: 4
 * Explanation: The 6 subarrays of nums are the following:
 * [1], range = largest - smallest = 1 - 1 = 0
 * [3], range = 3 - 3 = 0
 * [3], range = 3 - 3 = 0
 * [1,3], range = 3 - 1 = 2
 * [3,3], range = 3 - 3 = 0
 * [1,3,3], range = 3 - 1 = 2
 * So the sum of all ranges is 0 + 0 + 0 + 2 + 0 + 2 = 4.
 *
 * Example 3:
 *
 * Input: nums = [4,-2,-3,4,1]
 * Output: 59
 * Explanation: The sum of all subarray ranges of nums is 59.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * -109 &lt;= nums[i] &lt;= 109
 *
 *
 *
 * Follow-up: Could you find a solution with O(n) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you get the max/min of a certain subarray by using the max/min of a smaller subarray within it?
 * Hint 2: Notice that the max of the subarray from index i to j is equal to max of (max of the subarray from index i to j-1) and nums[j].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-subarray-ranges/">LeetCode #2104</a>
 */
public class SumOfSubarrayRanges {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Subarray Ranges");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfSubarrayRanges ===");
        SumOfSubarrayRanges sol = new SumOfSubarrayRanges();
        System.out.println(sol.solve(null));
    }
}
