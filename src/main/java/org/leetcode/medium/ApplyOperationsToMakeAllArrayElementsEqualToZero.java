package org.leetcode.medium;


/**
 * <b>#2772 - Apply Operations to Make All Array Elements Equal to Zero</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and a positive integer k.
 *
 *
 * You can apply the following operation on the array any number of times:
 *
 *
 * Choose any subarray of size k from the array and decrease all its elements by 1.
 *
 * Return true if you can make all the array elements equal to 0, or false otherwise.
 *
 *
 * A subarray is a contiguous non-empty part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,3,1,1,0], k = 3
 * Output: true
 * Explanation: We can do the following operations:
 * - Choose the subarray [2,2,3]. The resulting array will be nums = [1,1,2,1,1,0].
 * - Choose the subarray [2,1,1]. The resulting array will be nums = [1,1,1,0,0,0].
 * - Choose the subarray [1,1,1]. The resulting array will be nums = [0,0,0,0,0,0].
 *
 * Example 2:
 *
 * Input: nums = [1,3,1,1], k = 2
 * Output: false
 * Explanation: It is not possible to make all the array elements equal to 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In case it is possible, then how can you do the operations? which subarrays do you choose and in what order?
 * Hint 2: The order of the chosen subarrays should be from the left to the right of the array
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/apply-operations-to-make-all-array-elements-equal-to-zero/">LeetCode #2772</a>
 */
public class ApplyOperationsToMakeAllArrayElementsEqualToZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Apply Operations to Make All Array Elements Equal to Zero");
    }

    public static void main(String[] args) {
        System.out.println("=== ApplyOperationsToMakeAllArrayElementsEqualToZero ===");
        ApplyOperationsToMakeAllArrayElementsEqualToZero sol = new ApplyOperationsToMakeAllArrayElementsEqualToZero();
        System.out.println(sol.solve(null));
    }
}
