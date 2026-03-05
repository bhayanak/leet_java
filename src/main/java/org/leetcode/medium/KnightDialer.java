package org.leetcode.medium;


/**
 * <b>#935 - Knight Dialer</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The chess knight has a unique movement, it may move two squares vertically and one square horizontally, or two squares horizontally and one square vertically (with both forming the shape of an L). The possible movements of chess knight are shown in this diagram:
 *
 *
 * A chess knight can move as indicated in the chess diagram below:
 *
 *
 * We have a chess knight and a phone pad as shown below, the knight can only stand on a numeric cell (i.e. blue cell).
 *
 *
 * Given an integer n, return how many distinct phone numbers of length n we can dial.
 *
 *
 * You are allowed to place the knight on any numeric cell initially and then you should perform n - 1 jumps to dial a number of length n. All jumps should be valid knight jumps.
 *
 *
 * As the answer may be very large, return the answer modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 10
 * Explanation: We need to dial a number of length 1, so placing the knight over any numeric cell of the 10 cells is sufficient.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 20
 * Explanation: All the valid number we can dial are [04, 06, 16, 18, 27, 29, 34, 38, 40, 43, 49, 60, 61, 67, 72, 76, 81, 83, 92, 94]
 *
 * Example 3:
 *
 * Input: n = 3131
 * Output: 136006598
 * Explanation: Please take care of the mod.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/knight-dialer/">LeetCode #935</a>
 */
public class KnightDialer {

    /**
     * TODO: Implement "Knight Dialer".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Knight Dialer");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac KnightDialer.java &amp;&amp; java org.leetcode.medium.KnightDialer</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== KnightDialer ===");
        KnightDialer sol = new KnightDialer();
        System.out.println(sol.solve(null));
    }
}
