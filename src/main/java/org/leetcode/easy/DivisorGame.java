package org.leetcode.easy;


/**
 * <b>#1025 - Divisor Game</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Brainteaser, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 *
 * Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
 *
 *
 * Choosing any integer x with 0 &lt; x &lt; n and n % x == 0.
 *
 * Replacing the number n on the chalkboard with n - x.
 *
 * Also, if a player cannot make a move, they lose the game.
 *
 *
 * Return true if and only if Alice wins the game, assuming both players play optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: true
 * Explanation: Alice chooses 1, and Bob has no more moves.
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: false
 * Explanation: Alice chooses 1, Bob chooses 1, and Alice has no more moves.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the current number is even, we can always subtract a 1 to make it odd.  If the current number is odd, we must subtract an odd number to make it even.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Brainteaser, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/divisor-game/">LeetCode #1025</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DivisorGame {

    // Math insight: Alice wins iff n is even
    /**
     * Solves the problem: Divisor game.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean divisorGame(int n) { return n % 2 == 0; }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DivisorGame.java &amp;&amp; java org.leetcode.easy.DivisorGame</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        DivisorGame sol = new DivisorGame();
                System.out.println(sol.divisorGame(2)); // true
                System.out.println(sol.divisorGame(3)); // false
                System.out.println(sol.divisorGame(4)); // true
    }
}
