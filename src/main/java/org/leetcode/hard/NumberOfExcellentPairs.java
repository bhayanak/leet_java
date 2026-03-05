package org.leetcode.hard;


/**
 * <b>#2354 - Number of Excellent Pairs</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed positive integer array nums and a positive integer k.
 *
 *
 * A pair of numbers (num1, num2) is called excellent if the following conditions are satisfied:
 *
 *
 * Both the numbers num1 and num2 exist in the array nums.
 *
 * The sum of the number of set bits in num1 OR num2 and num1 AND num2 is greater than or equal to k, where OR is the bitwise OR operation and AND is the bitwise AND operation.
 *
 * Return the number of distinct excellent pairs.
 *
 *
 * Two pairs (a, b) and (c, d) are considered distinct if either a != c or b != d. For example, (1, 2) and (2, 1) are distinct.
 *
 *
 * Note that a pair (num1, num2) such that num1 == num2 can also be excellent if you have at least one occurrence of num1 in the array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1], k = 3
 * Output: 5
 * Explanation: The excellent pairs are the following:
 * - (3, 3). (3 AND 3) and (3 OR 3) are both equal to (11) in binary. The total number of set bits is 2 + 2 = 4, which is greater than or equal to k = 3.
 * - (2, 3) and (3, 2). (2 AND 3) is equal to (10) in binary, and (2 OR 3) is equal to (11) in binary. The total number of set bits is 1 + 2 = 3.
 * - (1, 3) and (3, 1). (1 AND 3) is equal to (01) in binary, and (1 OR 3) is equal to (11) in binary. The total number of set bits is 1 + 2 = 3.
 * So the number of excellent pairs is 5.
 *
 * Example 2:
 *
 * Input: nums = [5,1,1], k = 10
 * Output: 0
 * Explanation: There are no excellent pairs for this array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 60
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you find a different way to describe the second condition?
 * Hint 2: The sum of the number of set bits in (num1 OR num2) and (num1 AND num2) is equal to the sum of the number of set bits in num1 and num2.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/number-of-excellent-pairs/">LeetCode #2354</a>
 */
public class NumberOfExcellentPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Excellent Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfExcellentPairs ===");
        NumberOfExcellentPairs sol = new NumberOfExcellentPairs();
        System.out.println(sol.solve(null));
    }
}
