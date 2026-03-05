package org.leetcode.hard;


/**
 * <b>#2172 - Maximum AND Sum of Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an integer numSlots such that 2 * numSlots &gt;= n. There are numSlots slots numbered from 1 to numSlots.
 *
 *
 * You have to place all n integers into the slots such that each slot contains at most two numbers. The AND sum of a given placement is the sum of the bitwise AND of every number with its respective slot number.
 *
 *
 * For example, the AND sum of placing the numbers [1, 3] into slot 1 and [4, 6] into slot 2 is equal to (1 AND 1) + (3 AND 1) + (4 AND 2) + (6 AND 2) = 1 + 1 + 0 + 2 = 4.
 *
 * Return the maximum possible AND sum of nums given numSlots slots.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5,6], numSlots = 3
 * Output: 9
 * Explanation: One possible placement is [1, 4] into slot 1, [2, 6] into slot 2, and [3, 5] into slot 3. 
 * This gives the maximum AND sum of (1 AND 1) + (4 AND 1) + (2 AND 2) + (6 AND 2) + (3 AND 3) + (5 AND 3) = 1 + 0 + 2 + 2 + 3 + 1 = 9.
 *
 * Example 2:
 *
 * Input: nums = [1,3,10,4,7,1], numSlots = 9
 * Output: 24
 * Explanation: One possible placement is [1, 1] into slot 1, [3] into slot 3, [4] into slot 4, [7] into slot 7, and [10] into slot 9.
 * This gives the maximum AND sum of (1 AND 1) + (1 AND 1) + (3 AND 3) + (4 AND 4) + (7 AND 7) + (10 AND 9) = 1 + 1 + 3 + 4 + 7 + 8 = 24.
 * Note that slots 2, 5, 6, and 8 are empty which is permitted.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= numSlots &lt;= 9
 *
 * 1 &lt;= n &lt;= 2 * numSlots
 *
 * 1 &lt;= nums[i] &lt;= 15
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you think of a dynamic programming solution to this problem?
 * Hint 2: Can you use a bitmask to represent the state of the slots?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/maximum-and-sum-of-array/">LeetCode #2172</a>
 */
public class MaximumAndSumOfArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum AND Sum of Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumAndSumOfArray ===");
        MaximumAndSumOfArray sol = new MaximumAndSumOfArray();
        System.out.println(sol.solve(null));
    }
}
