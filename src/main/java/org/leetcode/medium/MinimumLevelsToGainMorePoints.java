package org.leetcode.medium;


/**
 * <b>#3096 - Minimum Levels to Gain More Points</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array possible of length n.
 *
 *
 * Alice and Bob are playing a game that consists of n levels. Some of the levels in the game are impossible to clear while others can always be cleared. In particular, if possible[i] == 0, then the ith level is impossible to clear for both the players. A player gains 1 point on clearing a level and loses 1 point if the player fails to clear it.
 *
 *
 * At the start of the game, Alice will play some levels in the given order starting from the 0th level, after which Bob will play for the rest of the levels.
 *
 *
 * Alice wants to know the minimum number of levels she should play to gain more points than Bob, if both players play optimally to maximize their points.
 *
 *
 * Return the minimum number of levels Alice should play to gain more points. If this is not possible, return -1.
 *
 *
 * Note that each player must play at least 1 level.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: possible = [1,0,1,0]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Let's look at all the levels that Alice can play up to:
 *
 *
 * If Alice plays only level 0 and Bob plays the rest of the levels, Alice has 1 point, while Bob has -1 + 1 - 1 = -1 point.
 *
 * If Alice plays till level 1 and Bob plays the rest of the levels, Alice has 1 - 1 = 0 points, while Bob has 1 - 1 = 0 points.
 *
 * If Alice plays till level 2 and Bob plays the rest of the levels, Alice has 1 - 1 + 1 = 1 point, while Bob has -1 point.
 *
 * Alice must play a minimum of 1 level to gain more points.
 *
 * Example 2:
 *
 * Input: possible = [1,1,1,1,1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Let's look at all the levels that Alice can play up to:
 *
 *
 * If Alice plays only level 0 and Bob plays the rest of the levels, Alice has 1 point, while Bob has 4 points.
 *
 * If Alice plays till level 1 and Bob plays the rest of the levels, Alice has 2 points, while Bob has 3 points.
 *
 * If Alice plays till level 2 and Bob plays the rest of the levels, Alice has 3 points, while Bob has 2 points.
 *
 * If Alice plays till level 3 and Bob plays the rest of the levels, Alice has 4 points, while Bob has 1 point.
 *
 * Alice must play a minimum of 3 levels to gain more points.
 *
 * Example 3:
 *
 * Input: possible = [0,0]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * The only possible way is for both players to play 1 level each. Alice plays level 0 and loses 1 point. Bob plays level 1 and loses 1 point. As both players have equal points, Alice can't gain more points than Bob.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == possible.length &lt;= 105
 *
 * possible[i] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Change all <code>0</code> in possible array into <code>-1</code>.
 * Hint 2: We need to find the shortest non-empty prefix of the new possible array such that the sum of elements in it is strictly larger than the remaining part.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/minimum-levels-to-gain-more-points/">LeetCode #3096</a>
 */
public class MinimumLevelsToGainMorePoints {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Levels to Gain More Points");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumLevelsToGainMorePoints ===");
        MinimumLevelsToGainMorePoints sol = new MinimumLevelsToGainMorePoints();
        System.out.println(sol.solve(null));
    }
}
