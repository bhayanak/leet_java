package org.leetcode.medium;


/**
 * <b>#2110 - Number of Smooth Descent Periods of a Stock</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Two Pointers, Dynamic Programming, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array prices representing the daily price history of a stock, where prices[i] is the stock price on the ith day.
 *
 *
 * A smooth descent period of a stock consists of one or more contiguous days such that the price on each day is lower than the price on the preceding day by exactly 1. The first day of the period is exempted from this rule.
 *
 *
 * Return the number of smooth descent periods.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [3,2,1,4]
 * Output: 7
 * Explanation: There are 7 smooth descent periods:
 * [3], [2], [1], [4], [3,2], [2,1], and [3,2,1]
 * Note that a period with one day is a smooth descent period by the definition.
 *
 * Example 2:
 *
 * Input: prices = [8,6,7,7]
 * Output: 4
 * Explanation: There are 4 smooth descent periods: [8], [6], [7], and [7]
 * Note that [8,6] is not a smooth descent period as 8 - 6 ≠ 1.
 *
 * Example 3:
 *
 * Input: prices = [1]
 * Output: 1
 * Explanation: There is 1 smooth descent period: [1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= prices.length &lt;= 105
 *
 * 1 &lt;= prices[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Any array is a series of adjacent longest possible smooth descent periods. For example, [5,3,2,1,7,6] is [5] + [3,2,1] + [7,6].
 * Hint 2: Think of a 2-pointer approach to traverse the array and find each longest possible period.
 * Hint 3: Suppose you found the longest possible period with a length of k. How many periods are within that period? How can you count them quickly? Think of the formula to calculate the sum of 1, 2, 3, ..., k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Two Pointers, Dynamic Programming, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/number-of-smooth-descent-periods-of-a-stock/">LeetCode #2110</a>
 */
public class NumberOfSmoothDescentPeriodsOfAStock {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Smooth Descent Periods of a Stock");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfSmoothDescentPeriodsOfAStock ===");
        NumberOfSmoothDescentPeriodsOfAStock sol = new NumberOfSmoothDescentPeriodsOfAStock();
        System.out.println(sol.solve(null));
    }
}
