package org.leetcode.easy;


/**
 * <b>#3360 - Stone Removal Game</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob are playing a game where they take turns removing stones from a pile, with Alice going first.
 *
 *
 * Alice starts by removing exactly 10 stones on her first turn.
 *
 * For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
 *
 * The player who cannot make a move loses the game.
 *
 *
 * Given a positive integer n, return true if Alice wins the game and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 12
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Alice removes 10 stones on her first turn, leaving 2 stones for Bob.
 *
 * Bob cannot remove 9 stones, so Alice wins.
 *
 * Example 2:
 *
 * Input: n = 1
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Alice cannot remove 10 stones, so Alice loses.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small enough that a brute-force solution is feasible.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/stone-removal-game/">LeetCode #3360</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class StoneRemovalGame {

    /**
     * Solves the problem: Stone game i x.
     *
     * @param stones the stones (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int stoneGameIX(int[] stones) {
        int[] mod={0,0,0};
        for (int s:stones) mod[s%3]++;
        if (mod[0]%2==0) return mod[1]>0&&mod[2]>0?1:0;
        return Math.abs(mod[1]-mod[2])>=3?1:0;
    }

    public static void main(String[] args) {
        StoneRemovalGame sol = new StoneRemovalGame();
        System.out.println(sol.stoneGameIX(new int[]{1,2,3}));
    }
}
