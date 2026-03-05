package org.leetcode.hard;


/**
 * <b>#3320 - Count The Number of Winning Sequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob are playing a fantasy battle game consisting of n rounds where they summon one of three magical creatures each round: a Fire Dragon, a Water Serpent, or an Earth Golem. In each round, players simultaneously summon their creature and are awarded points as follows:
 *
 *
 * If one player summons a Fire Dragon and the other summons an Earth Golem, the player who summoned the Fire Dragon is awarded a point.
 *
 * If one player summons a Water Serpent and the other summons a Fire Dragon, the player who summoned the Water Serpent is awarded a point.
 *
 * If one player summons an Earth Golem and the other summons a Water Serpent, the player who summoned the Earth Golem is awarded a point.
 *
 * If both players summon the same creature, no player is awarded a point.
 *
 * You are given a string s consisting of n characters 'F', 'W', and 'E', representing the sequence of creatures Alice will summon in each round:
 *
 *
 * If s[i] == 'F', Alice summons a Fire Dragon.
 *
 * If s[i] == 'W', Alice summons a Water Serpent.
 *
 * If s[i] == 'E', Alice summons an Earth Golem.
 *
 * Bob’s sequence of moves is unknown, but it is guaranteed that Bob will never summon the same creature in two consecutive rounds. Bob beats Alice if the total number of points awarded to Bob after n rounds is strictly greater than the points awarded to Alice.
 *
 *
 * Return the number of distinct sequences Bob can use to beat Alice.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "FFF"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Bob can beat Alice by making one of the following sequences of moves: "WFW", "FWF", or "WEW". Note that other winning sequences like "WWE" or "EWW" are invalid since Bob cannot make the same move twice in a row.
 *
 * Example 2:
 *
 * Input: s = "FWEFW"
 *
 *
 * Output: 18
 *
 *
 * Explanation:
 *
 *
 * Bob can beat Alice by making one of the following sequences of moves: "FWFWF", "FWFWE", "FWEFE", "FWEWE", "FEFWF", "FEFWE", "FEFEW", "FEWFE", "WFEFE", "WFEWE", "WEFWF", "WEFWE", "WEFEF", "WEFEW", "WEWFW", "WEWFE", "EWFWE", or "EWEWE".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is one of 'F', 'W', or 'E'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: For <code>0 &lt; i &lt; n - 1</code>, <code>-n &lt; j &lt; n</code>, and <code>k</code> in <code>{'F', 'W', 'E'}</code>, let <code>dp[i][j][k]</code>  be the number of sequences consisting of the first <code>i</code> moves such that the difference between bob's points and alice's point is equal to <code>j</code> and the <code>i<sup>th</sup></code> move that Bob played is <code>k</code>.
 * Hint 3: The answer is the sum of <code>dp[n - 1][j][k]</code>over all <code>j &gt; 0</code> and over all <code>k</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-winning-sequences/">LeetCode #3320</a>
 */
public class CountTheNumberOfWinningSequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count The Number of Winning Sequences");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfWinningSequences ===");
        CountTheNumberOfWinningSequences sol = new CountTheNumberOfWinningSequences();
        System.out.println(sol.solve(null));
    }
}
