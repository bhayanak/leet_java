package org.leetcode.medium;


/**
 * <b>#1833 - Maximum Ice Cream Bars</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Counting Sort</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * It is a sweltering summer day, and a boy wants to buy some ice cream bars.
 *
 *
 * At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 
 *
 *
 * Note: The boy can buy the ice cream bars in any order.
 *
 *
 * Return the maximum number of ice cream bars the boy can buy with coins coins.
 *
 *
 * You must solve the problem by counting sort.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: costs = [1,3,2,4,1], coins = 7
 * Output: 4
 * Explanation: The boy can buy ice cream bars at indices 0,1,2,4 for a total price of 1 + 3 + 2 + 1 = 7.
 *
 * Example 2:
 *
 * Input: costs = [10,6,8,7,7,8], coins = 5
 * Output: 0
 * Explanation: The boy cannot afford any of the ice cream bars.
 *
 * Example 3:
 *
 * Input: costs = [1,6,3,1,2,5], coins = 20
 * Output: 6
 * Explanation: The boy can buy all the ice cream bars for a total price of 1 + 6 + 3 + 1 + 2 + 5 = 18.
 *
 *
 *
 * Constraints:
 *
 *
 * costs.length == n
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= costs[i] &lt;= 105
 *
 * 1 &lt;= coins &lt;= 108
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is always optimal to buy the least expensive ice cream bar first.
 * Hint 2: Sort the prices so that the cheapest ice cream bar comes first.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Counting Sort).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-ice-cream-bars/">LeetCode #1833</a>
 */
public class MaximumIceCreamBars {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Ice Cream Bars");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumIceCreamBars ===");
        MaximumIceCreamBars sol = new MaximumIceCreamBars();
        System.out.println(sol.solve(null));
    }
}
