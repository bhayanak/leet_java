package org.leetcode.medium;


/**
 * <b>#2483 - Minimum Penalty for a Shop</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':
 *
 *
 * if the ith character is 'Y', it means that customers come at the ith hour
 *
 * whereas 'N' indicates that no customers come at the ith hour.
 *
 * If the shop closes at the jth hour (0 &lt;= j &lt;= n), the penalty is calculated as follows:
 *
 *
 * For every hour when the shop is open and no customers come, the penalty increases by 1.
 *
 * For every hour when the shop is closed and customers come, the penalty increases by 1.
 *
 * Return the earliest hour at which the shop must be closed to incur a minimum penalty.
 *
 *
 * Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: customers = "YYNY"
 * Output: 2
 * Explanation: 
 * - Closing the shop at the 0th hour incurs in 1+1+0+1 = 3 penalty.
 * - Closing the shop at the 1st hour incurs in 0+1+0+1 = 2 penalty.
 * - Closing the shop at the 2nd hour incurs in 0+0+0+1 = 1 penalty.
 * - Closing the shop at the 3rd hour incurs in 0+0+1+1 = 2 penalty.
 * - Closing the shop at the 4th hour incurs in 0+0+1+0 = 1 penalty.
 * Closing the shop at 2nd or 4th hour gives a minimum penalty. Since 2 is earlier, the optimal closing time is 2.
 *
 * Example 2:
 *
 * Input: customers = "NNNNN"
 * Output: 0
 * Explanation: It is best to close the shop at the 0th hour as no customers arrive.
 *
 * Example 3:
 *
 * Input: customers = "YYYY"
 * Output: 4
 * Explanation: It is best to close the shop at the 4th hour as customers arrive at each hour.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= customers.length &lt;= 105
 *
 * customers consists only of characters 'Y' and 'N'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: At any index, the penalty is the sum of prefix count of ‘N’ and suffix count of ‘Y’.
 * Hint 2: Enumerate all indices and find the minimum such value.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-penalty-for-a-shop/">LeetCode #2483</a>
 */
public class MinimumPenaltyForAShop {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Penalty for a Shop");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumPenaltyForAShop ===");
        MinimumPenaltyForAShop sol = new MinimumPenaltyForAShop();
        System.out.println(sol.solve(null));
    }
}
