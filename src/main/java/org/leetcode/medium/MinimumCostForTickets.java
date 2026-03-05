package org.leetcode.medium;


/**
 * <b>#983 - Minimum Cost For Tickets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have planned some train traveling one year in advance. The days of the year in which you will travel are given as an integer array days. Each day is an integer from 1 to 365.
 *
 *
 * Train tickets are sold in three different ways:
 *
 *
 * a 1-day pass is sold for costs[0] dollars,
 *
 * a 7-day pass is sold for costs[1] dollars, and
 *
 * a 30-day pass is sold for costs[2] dollars.
 *
 * The passes allow that many days of consecutive travel.
 *
 *
 * For example, if we get a 7-day pass on day 2, then we can travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
 *
 * Return the minimum number of dollars you need to travel every day in the given list of days.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: days = [1,4,6,7,8,20], costs = [2,7,15]
 * Output: 11
 * Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
 * On day 1, you bought a 1-day pass for costs[0] = $2, which covered day 1.
 * On day 3, you bought a 7-day pass for costs[1] = $7, which covered days 3, 4, ..., 9.
 * On day 20, you bought a 1-day pass for costs[0] = $2, which covered day 20.
 * In total, you spent $11 and covered all the days of your travel.
 *
 * Example 2:
 *
 * Input: days = [1,2,3,4,5,6,7,8,9,10,30,31], costs = [2,7,15]
 * Output: 17
 * Explanation: For example, here is one way to buy passes that lets you travel your travel plan:
 * On day 1, you bought a 30-day pass for costs[2] = $15 which covered days 1, 2, ..., 30.
 * On day 31, you bought a 1-day pass for costs[0] = $2 which covered day 31.
 * In total, you spent $17 and covered all the days of your travel.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= days.length &lt;= 365
 *
 * 1 &lt;= days[i] &lt;= 365
 *
 * days is in strictly increasing order.
 *
 * costs.length == 3
 *
 * 1 &lt;= costs[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-for-tickets/">LeetCode #983</a>
 */
public class MinimumCostForTickets {

    /**
     * TODO: Implement "Minimum Cost For Tickets".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost For Tickets");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumCostForTickets.java &amp;&amp; java org.leetcode.medium.MinimumCostForTickets</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostForTickets ===");
        MinimumCostForTickets sol = new MinimumCostForTickets();
        System.out.println(sol.solve(null));
    }
}
