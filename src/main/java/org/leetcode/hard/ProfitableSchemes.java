package org.leetcode.hard;


/**
 * <b>#879 - Profitable Schemes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a group of n members, and a list of various crimes they could commit. The ith crime generates a profit[i] and requires group[i] members to participate in it. If a member participates in one crime, that member can't participate in another crime.
 *
 *
 * Let's call a profitable scheme any subset of these crimes that generates at least minProfit profit, and the total number of members participating in that subset of crimes is at most n.
 *
 *
 * Return the number of schemes that can be chosen. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, minProfit = 3, group = [2,2], profit = [2,3]
 * Output: 2
 * Explanation: To make a profit of at least 3, the group could either commit crimes 0 and 1, or just crime 1.
 * In total, there are 2 schemes.
 *
 * Example 2:
 *
 * Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
 * Output: 7
 * Explanation: To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
 * There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 0 &lt;= minProfit &lt;= 100
 *
 * 1 &lt;= group.length &lt;= 100
 *
 * 1 &lt;= group[i] &lt;= 100
 *
 * profit.length == group.length
 *
 * 0 &lt;= profit[i] &lt;= 100
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
 * @see <a href="https://leetcode.com/problems/profitable-schemes/">LeetCode #879</a>
 */
public class ProfitableSchemes {

    /**
     * TODO: Implement "Profitable Schemes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Profitable Schemes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ProfitableSchemes.java &amp;&amp; java org.leetcode.hard.ProfitableSchemes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ProfitableSchemes ===");
        ProfitableSchemes sol = new ProfitableSchemes();
        System.out.println(sol.solve(null));
    }
}
