package org.leetcode.medium;


/**
 * <b>#2240 - Number of Ways to Buy Pens and Pencils</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer total indicating the amount of money you have. You are also given two integers cost1 and cost2 indicating the price of a pen and pencil respectively. You can spend part or all of your money to buy multiple quantities (or none) of each kind of writing utensil.
 *
 *
 * Return the number of distinct ways you can buy some number of pens and pencils.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: total = 20, cost1 = 10, cost2 = 5
 * Output: 9
 * Explanation: The price of a pen is 10 and the price of a pencil is 5.
 * - If you buy 0 pens, you can buy 0, 1, 2, 3, or 4 pencils.
 * - If you buy 1 pen, you can buy 0, 1, or 2 pencils.
 * - If you buy 2 pens, you cannot buy any pencils.
 * The total number of ways to buy pens and pencils is 5 + 3 + 1 = 9.
 *
 * Example 2:
 *
 * Input: total = 5, cost1 = 10, cost2 = 10
 * Output: 1
 * Explanation: The price of both pens and pencils are 10, which cost more than total, so you cannot buy any writing utensils. Therefore, there is only 1 way: buy 0 pens and 0 pencils.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= total, cost1, cost2 &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix the number of pencils purchased and calculate the number of ways to buy pens.
 * Hint 2: Sum up the number of ways to buy pens for each amount of pencils purchased to get the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-buy-pens-and-pencils/">LeetCode #2240</a>
 */
public class NumberOfWaysToBuyPensAndPencils {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Buy Pens and Pencils");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToBuyPensAndPencils ===");
        NumberOfWaysToBuyPensAndPencils sol = new NumberOfWaysToBuyPensAndPencils();
        System.out.println(sol.solve(null));
    }
}
