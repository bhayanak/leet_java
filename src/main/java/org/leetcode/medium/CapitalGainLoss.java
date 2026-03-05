package org.leetcode.medium;


/**
 * <b>#1393 - Capital Gain/Loss</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Stocks
 *
 * +---------------+---------+
 * | Column Name   | Type    |
 * +---------------+---------+
 * | stock_name    | varchar |
 * | operation     | enum    |
 * | operation_day | int     |
 * | price         | int     |
 * +---------------+---------+
 * (stock_name, operation_day) is the primary key (combination of columns with unique values) for this table.
 * The operation column is an ENUM (category) of type ('Sell', 'Buy')
 * Each row of this table indicates that the stock which has stock_name had an operation on the day operation_day with the price.
 * It is guaranteed that each 'Sell' operation for a stock has a corresponding 'Buy' operation in a previous day. It is also guaranteed that each 'Buy' operation for a stock has a corresponding 'Sell' operation in an upcoming day.
 *
 *
 *
 *
 * Write a solution to report the Capital gain/loss for each stock.
 *
 *
 * The Capital gain/loss of a stock is the total gain or loss after buying and selling the stock one or many times.
 *
 *
 * Return the result table in any order.
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * Stocks table:
 * +---------------+-----------+---------------+--------+
 * | stock_name    | operation | operation_day | price  |
 * +---------------+-----------+---------------+--------+
 * | Leetcode      | Buy       | 1             | 1000   |
 * | Corona Masks  | Buy       | 2             | 10     |
 * | Leetcode      | Sell      | 5             | 9000   |
 * | Handbags      | Buy       | 17            | 30000  |
 * | Corona Masks  | Sell      | 3             | 1010   |
 * | Corona Masks  | Buy       | 4             | 1000   |
 * | Corona Masks  | Sell      | 5             | 500    |
 * | Corona Masks  | Buy       | 6             | 1000   |
 * | Handbags      | Sell      | 29            | 7000   |
 * | Corona Masks  | Sell      | 10            | 10000  |
 * +---------------+-----------+---------------+--------+
 * Output: 
 * +---------------+-------------------+
 * | stock_name    | capital_gain_loss |
 * +---------------+-------------------+
 * | Corona Masks  | 9500              |
 * | Leetcode      | 8000              |
 * | Handbags      | -23000            |
 * +---------------+-------------------+
 * Explanation: 
 * Leetcode stock was bought at day 1 for 1000$ and was sold at day 5 for 9000$. Capital gain = 9000 - 1000 = 8000$.
 * Handbags stock was bought at day 17 for 30000$ and was sold at day 29 for 7000$. Capital loss = 7000 - 30000 = -23000$.
 * Corona Masks stock was bought at day 1 for 10$ and was sold at day 3 for 1010$. It was bought again at day 4 for 1000$ and was sold at day 5 for 500$. At last, it was bought at day 6 for 1000$ and was sold at day 10 for 10000$. Capital gain/loss is the sum of capital gains/losses for each ('Buy' --&gt; 'Sell') operation = (1010 - 10) + (500 - 1000) + (10000 - 1000) = 1000 - 500 + 9000 = 9500$.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Database).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/capital-gainloss/">LeetCode #1393</a>
 */
public class CapitalGainLoss {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Capital Gain/Loss");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CapitalGainLoss ===");
        CapitalGainLoss sol = new CapitalGainLoss();
        System.out.println(sol.solve(null));
    }
}
