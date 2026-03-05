package org.leetcode.medium;


/**
 * <b>#2059 - Minimum Operations to Convert Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums containing distinct numbers, an integer start, and an integer goal. There is an integer x that is initially set to start, and you want to perform operations on x such that it is converted to goal. You can perform the following operation repeatedly on the number x:
 *
 *
 * If 0 &lt;= x &lt;= 1000, then for any index i in the array (0 &lt;= i &lt; nums.length), you can set x to any of the following:
 *
 *
 * x + nums[i]
 *
 * x - nums[i]
 *
 * x ^ nums[i] (bitwise-XOR)
 *
 * Note that you can use each nums[i] any number of times in any order. Operations that set x to be out of the range 0 &lt;= x &lt;= 1000 are valid, but no more operations can be done afterward.
 *
 *
 * Return the minimum number of operations needed to convert x = start into goal, and -1 if it is not possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,12], start = 2, goal = 12
 * Output: 2
 * Explanation: We can go from 2 → 14 → 12 with the following 2 operations.
 * - 2 + 12 = 14
 * - 14 - 2 = 12
 *
 * Example 2:
 *
 * Input: nums = [3,5,7], start = 0, goal = -4
 * Output: 2
 * Explanation: We can go from 0 → 3 → -4 with the following 2 operations. 
 * - 0 + 3 = 3
 * - 3 - 7 = -4
 * Note that the last operation sets x out of the range 0 &lt;= x &lt;= 1000, which is valid.
 *
 * Example 3:
 *
 * Input: nums = [2,8,16], start = 0, goal = 1
 * Output: -1
 * Explanation: There is no way to convert 0 into 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * -109 &lt;= nums[i], goal &lt;= 109
 *
 * 0 &lt;= start &lt;= 1000
 *
 * start != goal
 *
 * All the integers in nums are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Once x drops below 0 or goes above 1000, is it possible to continue performing operations on x?
 * Hint 2: How can you use BFS to find the minimum operations?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-convert-number/">LeetCode #2059</a>
 */
public class MinimumOperationsToConvertNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Convert Number");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToConvertNumber ===");
        MinimumOperationsToConvertNumber sol = new MinimumOperationsToConvertNumber();
        System.out.println(sol.solve(null));
    }
}
