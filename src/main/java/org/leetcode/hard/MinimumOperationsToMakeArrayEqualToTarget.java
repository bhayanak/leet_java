package org.leetcode.hard;


/**
 * <b>#3229 - Minimum Operations to Make Array Equal to Target</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integer arrays nums and target, of the same length.
 *
 *
 * In a single operation, you can select any subarray of nums and increment each element within that subarray by 1 or decrement each element within that subarray by 1.
 *
 *
 * Return the minimum number of operations required to make nums equal to the array target.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,5,1,2], target = [4,6,2,4]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We will perform the following operations to make nums equal to target:
 *
 * - Increment nums[0..3] by 1, nums = [4,6,2,3].
 *
 * - Increment nums[3..3] by 1, nums = [4,6,2,4].
 *
 * Example 2:
 *
 * Input: nums = [1,3,2], target = [2,1,4]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * We will perform the following operations to make nums equal to target:
 *
 * - Increment nums[0..0] by 1, nums = [2,3,2].
 *
 * - Decrement nums[1..1] by 1, nums = [2,2,2].
 *
 * - Decrement nums[1..1] by 1, nums = [2,1,2].
 *
 * - Increment nums[2..2] by 1, nums = [2,1,3].
 *
 * - Increment nums[2..2] by 1, nums = [2,1,4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length == target.length &lt;= 105
 *
 * 1 &lt;= nums[i], target[i] &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Change <code>nums'[i] = nums[i] - target[i]</code>, so our goal is to make <code>nums'</code> into all 0s.
 * Hint 2: Divide and conquer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Stack, Greedy, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-array-equal-to-target/">LeetCode #3229</a>
 */
public class MinimumOperationsToMakeArrayEqualToTarget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Array Equal to Target");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeArrayEqualToTarget ===");
        MinimumOperationsToMakeArrayEqualToTarget sol = new MinimumOperationsToMakeArrayEqualToTarget();
        System.out.println(sol.solve(null));
    }
}
