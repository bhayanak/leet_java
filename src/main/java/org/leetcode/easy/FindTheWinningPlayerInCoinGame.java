package org.leetcode.easy;


/**
 * <b>#3222 - Find the Winning Player in Coin Game</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers x and y, denoting the number of coins with values 75 and 10 respectively.
 *
 *
 * Alice and Bob are playing a game. Each turn, starting with Alice, the player must pick up coins with a total value 115. If the player is unable to do so, they lose the game.
 *
 *
 * Return the name of the player who wins the game if both players play optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: x = 2, y = 7
 *
 *
 * Output: "Alice"
 *
 *
 * Explanation:
 *
 *
 * The game ends in a single turn:
 *
 *
 * Alice picks 1 coin with a value of 75 and 4 coins with a value of 10.
 *
 * Example 2:
 *
 * Input: x = 4, y = 11
 *
 *
 * Output: "Bob"
 *
 *
 * Explanation:
 *
 *
 * The game ends in 2 turns:
 *
 *
 * Alice picks 1 coin with a value of 75 and 4 coins with a value of 10.
 *
 * Bob picks 1 coin with a value of 75 and 4 coins with a value of 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= x, y &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The only way to make 115 is to use one coin of value 75 and four coins of value 10. Each turn uses up these many coins.
 * Hint 2: Hence the number of turns is <code>min(x, y / 4)</code>.
 * Hint 3: Determine the winner from its parity.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation, Game Theory).
 *
 * @see <a href="https://leetcode.com/problems/find-the-winning-player-in-coin-game/">LeetCode #3222</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class FindTheWinningPlayerInCoinGame {

    /**
     * Solves the problem: Number of special chars.
     *
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numberOfSpecialChars(String word) {
        boolean[] lower=new boolean[26], upper=new boolean[26];
        for (char c:word.toCharArray()) {
            if (Character.isLowerCase(c)) lower[c-'a']=true;
            else upper[c-'A']=true;
        }
        int cnt=0; for (int i=0;i<26;i++) if (lower[i]&&upper[i]) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        FindTheWinningPlayerInCoinGame sol = new FindTheWinningPlayerInCoinGame();
        System.out.println(sol.numberOfSpecialChars("hello"));
    }
}
