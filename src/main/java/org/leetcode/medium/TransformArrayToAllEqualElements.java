package org.leetcode.medium;


/**
 * <b>#3576 - Transform Array to All Equal Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of size n containing only 1 and -1, and an integer k.
 *
 *
 * You can perform the following operation at most k times:
 *
 *
 *
 *
 * Choose an index i (0 &lt;= i &lt; n - 1), and multiply both nums[i] and nums[i + 1] by -1.
 *
 *
 * Note that you can choose the same index i more than once in different operations.
 *
 *
 * Return true if it is possible to make all elements of the array equal after at most k operations, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-1,1,-1,1], k = 3
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * We can make all elements in the array equal in 2 operations as follows:
 *
 *
 * Choose index i = 1, and multiply both nums[1] and nums[2] by -1. Now nums = [1,1,-1,-1,1].
 *
 * Choose index i = 2, and multiply both nums[2] and nums[3] by -1. Now nums = [1,1,1,1,1].
 *
 * Example 2:
 *
 * Input: nums = [-1,-1,-1,1,1,1], k = 5
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * It is not possible to make all array elements equal in at most 5 operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * nums[i] is either -1 or 1.
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try converting all elements to 1 and separately to -1. For each case, calculate the minimum number of operations needed.
 * Hint 2: Use a greedy approach: scan the array from left to right and apply an operation only when needed to fix mismatches.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/transform-array-to-all-equal-elements/">LeetCode #3576</a>
 */
public class TransformArrayToAllEqualElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Transform Array to All Equal Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== TransformArrayToAllEqualElements ===");
        TransformArrayToAllEqualElements sol = new TransformArrayToAllEqualElements();
        System.out.println(sol.solve(null));
    }
}
