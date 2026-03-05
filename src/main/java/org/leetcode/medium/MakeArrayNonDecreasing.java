package org.leetcode.medium;


/**
 * <b>#3523 - Make Array Non-decreasing</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. In one operation, you can select a subarray and replace it with a single element equal to its maximum value.
 *
 *
 * Return the maximum possible size of the array after performing zero or more operations such that the resulting array is non-decreasing.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,5,3,5]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * One way to achieve the maximum size is:
 *
 *
 * Replace subarray nums[1..2] = [2, 5] with 5 → [4, 5, 3, 5].
 *
 * Replace subarray nums[2..3] = [3, 5] with 5 → [4, 5, 5].
 *
 * The final array [4, 5, 5] is non-decreasing with size 3.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * No operation is needed as the array [1,2,3] is already non-decreasing.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2 * 105
 *
 * 1 &lt;= nums[i] &lt;= 2 * 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate backwards.
 * Hint 2: Can you remove the largest element in the array? Is that ever helpful?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Stack, Greedy, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/make-array-non-decreasing/">LeetCode #3523</a>
 */
public class MakeArrayNonDecreasing {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Make Array Non-decreasing");
    }

    public static void main(String[] args) {
        System.out.println("=== MakeArrayNonDecreasing ===");
        MakeArrayNonDecreasing sol = new MakeArrayNonDecreasing();
        System.out.println(sol.solve(null));
    }
}
