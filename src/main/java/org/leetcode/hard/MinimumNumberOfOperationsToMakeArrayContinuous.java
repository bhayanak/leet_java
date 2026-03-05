package org.leetcode.hard;


/**
 * <b>#2009 - Minimum Number of Operations to Make Array Continuous</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
 *
 *
 * nums is considered continuous if both of the following conditions are fulfilled:
 *
 *
 * All elements in nums are unique.
 *
 * The difference between the maximum element and the minimum element in nums equals nums.length - 1.
 *
 * For example, nums = [4, 2, 5, 3] is continuous, but nums = [1, 2, 3, 5, 6] is not continuous.
 *
 *
 * Return the minimum number of operations to make nums continuous.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,5,3]
 * Output: 0
 * Explanation: nums is already continuous.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,5,6]
 * Output: 1
 * Explanation: One possible solution is to change the last element to 4.
 * The resulting array is [1,2,3,5,4], which is continuous.
 *
 * Example 3:
 *
 * Input: nums = [1,10,100,1000]
 * Output: 3
 * Explanation: One possible solution is to:
 * - Change the second element to 2.
 * - Change the third element to 3.
 * - Change the fourth element to 4.
 * The resulting array is [1,2,3,4], which is continuous.
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
 * Hint 1: Sort the array.
 * Hint 2: For every index do a binary search to get the possible right end of the window and calculate the possible answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/">LeetCode #2009</a>
 */
public class MinimumNumberOfOperationsToMakeArrayContinuous {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Operations to Make Array Continuous");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfOperationsToMakeArrayContinuous ===");
        MinimumNumberOfOperationsToMakeArrayContinuous sol = new MinimumNumberOfOperationsToMakeArrayContinuous();
        System.out.println(sol.solve(null));
    }
}
