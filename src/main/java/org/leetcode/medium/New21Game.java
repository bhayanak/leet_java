package org.leetcode.medium;


/**
 * <b>#837 - New 21 Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Sliding Window, Probability and Statistics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice plays the following game, loosely based on the card game "21".
 *
 *
 * Alice starts with 0 points and draws numbers while she has less than k points. During each draw, she gains an integer number of points randomly from the range [1, maxPts], where maxPts is an integer. Each draw is independent and the outcomes have equal probabilities.
 *
 *
 * Alice stops drawing numbers when she gets k or more points.
 *
 *
 * Return the probability that Alice has n or fewer points.
 *
 *
 * Answers within 10-5 of the actual answer are considered accepted.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10, k = 1, maxPts = 10
 * Output: 1.00000
 * Explanation: Alice gets a single card, then stops.
 *
 * Example 2:
 *
 * Input: n = 6, k = 1, maxPts = 10
 * Output: 0.60000
 * Explanation: Alice gets a single card, then stops.
 * In 6 out of 10 possibilities, she is at or below 6 points.
 *
 * Example 3:
 *
 * Input: n = 21, k = 17, maxPts = 10
 * Output: 0.73278
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= k &lt;= n &lt;= 104
 *
 * 1 &lt;= maxPts &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Sliding Window, Probability and Statistics).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/new-21-game/">LeetCode #837</a>
 */
public class New21Game {

    /**
     * TODO: Implement "New 21 Game".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: New 21 Game");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac New21Game.java &amp;&amp; java org.leetcode.medium.New21Game</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== New21Game ===");
        New21Game sol = new New21Game();
        System.out.println(sol.solve(null));
    }
}
