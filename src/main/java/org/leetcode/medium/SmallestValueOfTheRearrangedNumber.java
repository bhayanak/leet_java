package org.leetcode.medium;


/**
 * <b>#2165 - Smallest Value of the Rearranged Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer num. Rearrange the digits of num such that its value is minimized and it does not contain any leading zeros.
 *
 *
 * Return the rearranged number with minimal value.
 *
 *
 * Note that the sign of the number does not change after rearranging the digits.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 310
 * Output: 103
 * Explanation: The possible arrangements for the digits of 310 are 013, 031, 103, 130, 301, 310. 
 * The arrangement with the smallest value that does not contain any leading zeros is 103.
 *
 * Example 2:
 *
 * Input: num = -7605
 * Output: -7650
 * Explanation: Some possible arrangements for the digits of -7605 are -7650, -6705, -5076, -0567.
 * The arrangement with the smallest value that does not contain any leading zeros is -7650.
 *
 *
 *
 * Constraints:
 *
 *
 * -1015 &lt;= num &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For positive numbers, the leading digit should be the smallest nonzero digit. Then the remaining digits follow in ascending order.
 * Hint 2: For negative numbers, the digits should be arranged in descending order.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/smallest-value-of-the-rearranged-number/">LeetCode #2165</a>
 */
public class SmallestValueOfTheRearrangedNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Value of the Rearranged Number");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestValueOfTheRearrangedNumber ===");
        SmallestValueOfTheRearrangedNumber sol = new SmallestValueOfTheRearrangedNumber();
        System.out.println(sol.solve(null));
    }
}
