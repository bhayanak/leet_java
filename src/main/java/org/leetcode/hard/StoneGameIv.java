package org.leetcode.hard;


/**
 * <b>#1510 - Stone Game IV</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 *
 * Initially, there are n stones in a pile. On each player's turn, that player makes a move consisting of removing any non-zero square number of stones in the pile.
 *
 *
 * Also, if a player cannot make a move, he/she loses the game.
 *
 *
 * Given a positive integer n, return true if and only if Alice wins the game otherwise return false, assuming both players play optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: true
 * Explanation: Alice can remove 1 stone winning the game because Bob doesn't have any moves.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: false
 * Explanation: Alice can only remove 1 stone, after that Bob removes the last one winning the game (2 -&gt; 1 -&gt; 0).
 *
 * Example 3:
 *
 * Input: n = 4
 * Output: true
 * Explanation: n is already a perfect square, Alice can win with one move, removing 4 stones (4 -&gt; 0).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to keep track of winning and losing states. Given some number of stones, Alice can win if she can force Bob onto a losing state.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game-iv/">LeetCode #1510</a>
 */
public class StoneGameIv {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game IV");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGameIv ===");
        StoneGameIv sol = new StoneGameIv();
        System.out.println(sol.solve(null));
    }
}
