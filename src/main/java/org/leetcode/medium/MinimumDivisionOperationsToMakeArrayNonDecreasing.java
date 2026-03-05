package org.leetcode.medium;


/**
 * <b>#3326 - Minimum Division Operations to Make Array Non Decreasing</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Any positive divisor of a natural number x that is strictly less than x is called a proper divisor of x. For example, 2 is a proper divisor of 4, while 6 is not a proper divisor of 6.
 *
 *
 * You are allowed to perform an operation any number of times on nums, where in each operation you select any one element from nums and divide it by its greatest proper divisor.
 *
 *
 * Return the minimum number of operations required to make the array non-decreasing.
 *
 *
 * If it is not possible to make the array non-decreasing using any number of operations, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [25,7]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Using a single operation, 25 gets divided by 5 and nums becomes [5, 7].
 *
 * Example 2:
 *
 * Input: nums = [7,7,6]
 *
 *
 * Output: -1
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,1]
 *
 *
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate backward from the last index.
 * Hint 2: Each number can be divided by its largest proper divisor to yield its smallest prime divisor.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-division-operations-to-make-array-non-decreasing/">LeetCode #3326</a>
 */
public class MinimumDivisionOperationsToMakeArrayNonDecreasing {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Division Operations to Make Array Non Decreasing");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumDivisionOperationsToMakeArrayNonDecreasing ===");
        MinimumDivisionOperationsToMakeArrayNonDecreasing sol = new MinimumDivisionOperationsToMakeArrayNonDecreasing();
        System.out.println(sol.solve(null));
    }
}
