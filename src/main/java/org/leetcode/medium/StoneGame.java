package org.leetcode.medium;


/**
 * <b>#877 - Stone Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob play a game with piles of stones. There are an even number of piles arranged in a row, and each pile has a positive integer number of stones piles[i].
 *
 *
 * The objective of the game is to end with the most stones. The total number of stones across all the piles is odd, so there are no ties.
 *
 *
 * Alice and Bob take turns, with Alice starting first. Each turn, a player takes the entire pile of stones either from the beginning or from the end of the row. This continues until there are no more piles left, at which point the person with the most stones wins.
 *
 *
 * Assuming Alice and Bob play optimally, return true if Alice wins the game, or false if Bob wins.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [5,3,4,5]
 * Output: true
 * Explanation: 
 * Alice starts first, and can only take the first 5 or the last 5.
 * Say she takes the first 5, so that the row becomes [3, 4, 5].
 * If Bob takes 3, then the board is [4, 5], and Alice takes 5 to win with 10 points.
 * If Bob takes the last 5, then the board is [3, 4], and Alice takes 4 to win with 9 points.
 * This demonstrated that taking the first 5 was a winning move for Alice, so we return true.
 *
 * Example 2:
 *
 * Input: piles = [3,7,2,3]
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= piles.length &lt;= 500
 *
 * piles.length is even.
 *
 * 1 &lt;= piles[i] &lt;= 500
 *
 * sum(piles[i]) is odd.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game/">LeetCode #877</a>
 */
public class StoneGame {

    /**
     * TODO: Implement "Stone Game".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac StoneGame.java &amp;&amp; java org.leetcode.medium.StoneGame</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGame ===");
        StoneGame sol = new StoneGame();
        System.out.println(sol.solve(null));
    }
}
