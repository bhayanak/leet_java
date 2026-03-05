package org.leetcode.medium;


/**
 * <b>#3413 - Maximum Coins From K Consecutive Bags</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are an infinite amount of bags on a number line, one bag for each coordinate. Some of these bags contain coins.
 *
 *
 * You are given a 2D array coins, where coins[i] = [li, ri, ci] denotes that every bag from li to ri contains ci coins.
 *
 *
 * The segments that coins contain are non-overlapping.
 *
 *
 * You are also given an integer k.
 *
 *
 * Return the maximum amount of coins you can obtain by collecting k consecutive bags.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coins = [[8,10,1],[1,3,2],[5,6,4]], k = 4
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * Selecting bags at positions [3, 4, 5, 6] gives the maximum number of coins: 2 + 0 + 4 + 4 = 10.
 *
 * Example 2:
 *
 * Input: coins = [[1,10,3]], k = 2
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Selecting bags at positions [1, 2] gives the maximum number of coins: 3 + 3 = 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= coins.length &lt;= 105
 *
 * 1 &lt;= k &lt;= 109
 *
 * coins[i] == [li, ri, ci]
 *
 * 1 &lt;= li &lt;= ri &lt;= 109
 *
 * 1 &lt;= ci &lt;= 1000
 *
 * The given segments are non-overlapping.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: An optimal starting position for <code>k</code> consecutive bags will be either <code>l<sub>i</sub></code> or <code>r<sub>i</sub> - k + 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-coins-from-k-consecutive-bags/">LeetCode #3413</a>
 */
public class MaximumCoinsFromKConsecutiveBags {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Coins From K Consecutive Bags");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumCoinsFromKConsecutiveBags ===");
        MaximumCoinsFromKConsecutiveBags sol = new MaximumCoinsFromKConsecutiveBags();
        System.out.println(sol.solve(null));
    }
}
