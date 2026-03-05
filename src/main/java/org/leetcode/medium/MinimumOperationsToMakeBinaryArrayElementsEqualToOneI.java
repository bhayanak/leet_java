package org.leetcode.medium;


/**
 * <b>#3191 - Minimum Operations to Make Binary Array Elements Equal to One I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums.
 *
 *
 * You can do the following operation on the array any number of times (possibly zero):
 *
 *
 * Choose any 3 consecutive elements from the array and flip all of them.
 *
 * Flipping an element means changing its value from 0 to 1, and from 1 to 0.
 *
 *
 * Return the minimum number of operations required to make all elements in nums equal to 1. If it is impossible, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,1,1,0,0]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * We can do the following operations:
 *
 *
 * Choose the elements at indices 0, 1 and 2. The resulting array is nums = [1,0,0,1,0,0].
 *
 * Choose the elements at indices 1, 2 and 3. The resulting array is nums = [1,1,1,0,0,0].
 *
 * Choose the elements at indices 3, 4 and 5. The resulting array is nums = [1,1,1,1,1,1].
 *
 * Example 2:
 *
 * Input: nums = [0,1,1,1]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 * It is impossible to make all elements equal to 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>nums[0]</code> is 0, then the only way to change it to 1 is by doing an operation on the first 3 elements of the array.
 * Hint 2: After Changing <code>nums[0]</code> to 1, use the same logic on the remaining array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Queue, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/">LeetCode #3191</a>
 */
public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make Binary Array Elements Equal to One I");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeBinaryArrayElementsEqualToOneI ===");
        MinimumOperationsToMakeBinaryArrayElementsEqualToOneI sol = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
        System.out.println(sol.solve(null));
    }
}
