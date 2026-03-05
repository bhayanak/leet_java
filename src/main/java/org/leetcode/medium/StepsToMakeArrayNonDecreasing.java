package org.leetcode.medium;


/**
 * <b>#2289 - Steps to Make Array Non-decreasing</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Linked List, Dynamic Programming, Stack, Monotonic Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. In one step, remove all elements nums[i] where nums[i - 1] &gt; nums[i] for all 0 &lt; i &lt; nums.length.
 *
 *
 * Return the number of steps performed until nums becomes a non-decreasing array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,3,4,4,7,3,6,11,8,5,11]
 * Output: 3
 * Explanation: The following are the steps performed:
 * - Step 1: [5,3,4,4,7,3,6,11,8,5,11] becomes [5,4,4,7,6,11,11]
 * - Step 2: [5,4,4,7,6,11,11] becomes [5,4,7,11,11]
 * - Step 3: [5,4,7,11,11] becomes [5,7,11,11]
 * [5,7,11,11] is a non-decreasing array. Therefore, we return 3.
 *
 * Example 2:
 *
 * Input: nums = [4,5,7,7,13]
 * Output: 0
 * Explanation: nums is already a non-decreasing array. Therefore, we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that an element will be removed if and only if there exists a strictly greater element to the left of it in the array.
 * Hint 2: For each element, we need to find the number of rounds it will take for it to be removed. The answer is the maximum number of rounds for all elements. Build an array dp to hold this information where the answer is the maximum value of dp.
 * Hint 3: Use a stack of the indices. While processing element nums[i], remove from the stack all the indices of elements that are smaller than nums[i]. dp[i] should be set to the maximum of dp[i] + 1 and dp[removed index].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Linked List, Dynamic Programming, Stack, Monotonic Stack, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/steps-to-make-array-non-decreasing/">LeetCode #2289</a>
 */
public class StepsToMakeArrayNonDecreasing {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Steps to Make Array Non-decreasing");
    }

    public static void main(String[] args) {
        System.out.println("=== StepsToMakeArrayNonDecreasing ===");
        StepsToMakeArrayNonDecreasing sol = new StepsToMakeArrayNonDecreasing();
        System.out.println(sol.solve(null));
    }
}
