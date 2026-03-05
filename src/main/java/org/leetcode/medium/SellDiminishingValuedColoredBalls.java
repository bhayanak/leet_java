package org.leetcode.medium;


/**
 * <b>#1648 - Sell Diminishing-Valued Colored Balls</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Binary Search, Greedy, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have an inventory of different colored balls, and there is a customer that wants orders balls of any color.
 *
 *
 * The customer weirdly values the colored balls. Each colored ball's value is the number of balls of that color you currently have in your inventory. For example, if you own 6 yellow balls, the customer would pay 6 for the first yellow ball. After the transaction, there are only 5 yellow balls left, so the next yellow ball is then valued at 5 (i.e., the value of the balls decreases as you sell more to the customer).
 *
 *
 * You are given an integer array, inventory, where inventory[i] represents the number of balls of the ith color that you initially own. You are also given an integer orders, which represents the total number of balls that the customer wants. You can sell the balls in any order.
 *
 *
 * Return the maximum total value that you can attain after selling orders colored balls. As the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: inventory = [2,5], orders = 4
 * Output: 14
 * Explanation: Sell the 1st color 1 time (2) and the 2nd color 3 times (5 + 4 + 3).
 * The maximum total value is 2 + 5 + 4 + 3 = 14.
 *
 * Example 2:
 *
 * Input: inventory = [3,5], orders = 6
 * Output: 19
 * Explanation: Sell the 1st color 2 times (3 + 2) and the 2nd color 4 times (5 + 4 + 3 + 2).
 * The maximum total value is 3 + 2 + 5 + 4 + 3 + 2 = 19.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= inventory.length &lt;= 105
 *
 * 1 &lt;= inventory[i] &lt;= 109
 *
 * 1 &lt;= orders &lt;= min(sum(inventory[i]), 109)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Greedily sell the most expensive ball.
 * Hint 2: There is some value k where all balls of value &gt; k are sold, and some, (maybe 0) of balls of value k are sold.
 * Hint 3: Use binary search to find this value k, and use maths to find the total sum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Search, Greedy, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sell-diminishing-valued-colored-balls/">LeetCode #1648</a>
 */
public class SellDiminishingValuedColoredBalls {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sell Diminishing-Valued Colored Balls");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SellDiminishingValuedColoredBalls ===");
        SellDiminishingValuedColoredBalls sol = new SellDiminishingValuedColoredBalls();
        System.out.println(sol.solve(null));
    }
}
