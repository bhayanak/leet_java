package org.leetcode.medium;


/**
 * <b>#2830 - Maximize the Profit as the Salesman</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing the number of houses on a number line, numbered from 0 to n - 1.
 *
 *
 * Additionally, you are given a 2D integer array offers where offers[i] = [starti, endi, goldi], indicating that ith buyer wants to buy all the houses from starti to endi for goldi amount of gold.
 *
 *
 * As a salesman, your goal is to maximize your earnings by strategically selecting and selling houses to buyers.
 *
 *
 * Return the maximum amount of gold you can earn.
 *
 *
 * Note that different buyers can't buy the same house, and some houses may remain unsold.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, offers = [[0,0,1],[0,2,2],[1,3,2]]
 * Output: 3
 * Explanation: There are 5 houses numbered from 0 to 4 and there are 3 purchase offers.
 * We sell houses in the range [0,0] to 1st buyer for 1 gold and houses in the range [1,3] to 3rd buyer for 2 golds.
 * It can be proven that 3 is the maximum amount of gold we can achieve.
 *
 * Example 2:
 *
 * Input: n = 5, offers = [[0,0,1],[0,2,10],[1,3,2]]
 * Output: 10
 * Explanation: There are 5 houses numbered from 0 to 4 and there are 3 purchase offers.
 * We sell houses in the range [0,2] to 2nd buyer for 10 golds.
 * It can be proven that 10 is the maximum amount of gold we can achieve.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= offers.length &lt;= 105
 *
 * offers[i].length == 3
 *
 * 0 &lt;= starti &lt;= endi &lt;= n - 1
 *
 * 1 &lt;= goldi &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">The intended solution uses a dynamic programming approach to solve the problem.</div>
 * Hint 2: <div class="_1l1MA">Sort the array offers by <code>start<sub>i</sub></code>.</div>
 * Hint 3: <div class="_1l1MA">Let <code>dp[i]</code> = { the maximum amount of gold if the sold houses are in the range <code>[0 … i]</code> }.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Dynamic Programming, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-profit-as-the-salesman/">LeetCode #2830</a>
 */
public class MaximizeTheProfitAsTheSalesman {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Profit as the Salesman");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheProfitAsTheSalesman ===");
        MaximizeTheProfitAsTheSalesman sol = new MaximizeTheProfitAsTheSalesman();
        System.out.println(sol.solve(null));
    }
}
