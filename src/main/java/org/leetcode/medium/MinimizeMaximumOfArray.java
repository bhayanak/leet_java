package org.leetcode.medium;


/**
 * <b>#2439 - Minimize Maximum of Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums comprising of n non-negative integers.
 *
 *
 * In one operation, you must:
 *
 *
 * Choose an integer i such that 1 &lt;= i &lt; n and nums[i] &gt; 0.
 *
 * Decrease nums[i] by 1.
 *
 * Increase nums[i - 1] by 1.
 *
 * Return the minimum possible value of the maximum integer of nums after performing any number of operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,7,1,6]
 * Output: 5
 * Explanation:
 * One set of optimal operations is as follows:
 * 1. Choose i = 1, and nums becomes [4,6,1,6].
 * 2. Choose i = 3, and nums becomes [4,6,2,5].
 * 3. Choose i = 1, and nums becomes [5,5,2,5].
 * The maximum integer of nums is 5. It can be shown that the maximum number cannot be less than 5.
 * Therefore, we return 5.
 *
 * Example 2:
 *
 * Input: nums = [10,1]
 * Output: 10
 * Explanation:
 * It is optimal to leave nums as is, and since 10 is the maximum value, we return 10.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try a binary search approach.
 * Hint 2: Perform a binary search over the minimum value that can be achieved for the maximum number of the array.
 * Hint 3: In each binary search iteration, iterate through the array backwards, greedily decreasing the current element until it is within the limit.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Dynamic Programming, Greedy, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimize-maximum-of-array/">LeetCode #2439</a>
 */
public class MinimizeMaximumOfArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize Maximum of Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeMaximumOfArray ===");
        MinimizeMaximumOfArray sol = new MinimizeMaximumOfArray();
        System.out.println(sol.solve(null));
    }
}
