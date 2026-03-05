package org.leetcode.medium;


/**
 * <b>#3192 - Minimum Operations to Make Binary Array Elements Equal to One II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums.
 *
 *
 * You can do the following operation on the array any number of times (possibly zero):
 *
 *
 * Choose any index i from the array and flip all the elements from index i to the end of the array.
 *
 * Flipping an element means changing its value from 0 to 1, and from 1 to 0.
 *
 *
 * Return the minimum number of operations required to make all elements in nums equal to 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,1,0,1]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 * We can do the following operations:
 *
 *
 * Choose the index i = 1. The resulting array will be nums = [0,0,0,1,0].
 *
 * Choose the index i = 0. The resulting array will be nums = [1,1,1,0,1].
 *
 * Choose the index i = 4. The resulting array will be nums = [1,1,1,0,0].
 *
 * Choose the index i = 3. The resulting array will be nums = [1,1,1,1,1].
 *
 * Example 2:
 *
 * Input: nums = [1,0,0,0]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * We can do the following operation:
 *
 *
 * Choose the index i = 1. The resulting array will be nums = [1,1,1,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The only way to change <code>nums[0]</code> to 1 is by performing an operation with index <code>i = 0</code>.
 * Hint 2: Iterate from left to right and perform an operation at each index i where nums[i] is 0, and keep track of how many operations are currently performed on the suffix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-ii/">LeetCode #3192</a>
 */
public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Binary Array Elements Equal to One II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeBinaryArrayElementsEqualToOneIi ===");
        MinimumOperationsToMakeBinaryArrayElementsEqualToOneIi sol = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneIi();
        System.out.println(sol.solve(null));
    }
}
