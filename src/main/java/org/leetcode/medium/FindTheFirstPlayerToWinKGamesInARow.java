package org.leetcode.medium;


/**
 * <b>#3175 - Find The First Player to win K Games in a Row</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A competition consists of n players numbered from 0 to n - 1.
 *
 *
 * You are given an integer array skills of size n and a positive integer k, where skills[i] is the skill level of player i. All integers in skills are unique.
 *
 *
 * All players are standing in a queue in order from player 0 to player n - 1.
 *
 *
 * The competition process is as follows:
 *
 *
 * The first two players in the queue play a game, and the player with the higher skill level wins.
 *
 * After the game, the winner stays at the beginning of the queue, and the loser goes to the end of it.
 *
 * The winner of the competition is the first player who wins k games in a row.
 *
 *
 * Return the initial index of the winning player.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: skills = [4,2,6,3,9], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Initially, the queue of players is [0,1,2,3,4]. The following process happens:
 *
 *
 * Players 0 and 1 play a game, since the skill of player 0 is higher than that of player 1, player 0 wins. The resulting queue is [0,2,3,4,1].
 *
 * Players 0 and 2 play a game, since the skill of player 2 is higher than that of player 0, player 2 wins. The resulting queue is [2,3,4,1,0].
 *
 * Players 2 and 3 play a game, since the skill of player 2 is higher than that of player 3, player 2 wins. The resulting queue is [2,4,1,0,3].
 *
 * Player 2 won k = 2 games in a row, so the winner is player 2.
 *
 * Example 2:
 *
 * Input: skills = [2,5,4], k = 3
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Initially, the queue of players is [0,1,2]. The following process happens:
 *
 *
 * Players 0 and 1 play a game, since the skill of player 1 is higher than that of player 0, player 1 wins. The resulting queue is [1,2,0].
 *
 * Players 1 and 2 play a game, since the skill of player 1 is higher than that of player 2, player 1 wins. The resulting queue is [1,0,2].
 *
 * Players 1 and 0 play a game, since the skill of player 1 is higher than that of player 0, player 1 wins. The resulting queue is [1,2,0].
 *
 * Player 1 won k = 3 games in a row, so the winner is player 1.
 *
 *
 *
 * Constraints:
 *
 *
 * n == skills.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= k &lt;= 109
 *
 * 1 &lt;= skills[i] &lt;= 106
 *
 * All integers in skills are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Suppose that <code>k ≥ n</code>, there is exactly one player who can win <code>k</code> games in a row. Who is it?
 * Hint 2: In case <code>k &lt; n</code>, you can simulate the competition process described.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row/">LeetCode #3175</a>
 */
public class FindTheFirstPlayerToWinKGamesInARow {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find The First Player to win K Games in a Row");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheFirstPlayerToWinKGamesInARow ===");
        FindTheFirstPlayerToWinKGamesInARow sol = new FindTheFirstPlayerToWinKGamesInARow();
        System.out.println(sol.solve(null));
    }
}
