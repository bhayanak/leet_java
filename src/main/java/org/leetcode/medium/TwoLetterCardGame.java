package org.leetcode.medium;


/**
 * <b>#3664 - Two-Letter Card Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a deck of cards represented by a string array cards, and each card displays two lowercase letters.
 *
 *
 * You are also given a letter x. You play a game with the following rules:
 *
 *
 * Start with 0 points.
 *
 * On each turn, you must find two compatible cards from the deck that both contain the letter x in any position.
 *
 * Remove the pair of cards and earn 1 point.
 *
 * The game ends when you can no longer find a pair of compatible cards.
 *
 * Return the maximum number of points you can gain with optimal play.
 *
 *
 * Two cards are compatible if the strings differ in exactly 1 position.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cards = ["aa","ab","ba","ac"], x = "a"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * On the first turn, select and remove cards "ab" and "ac", which are compatible because they differ at only index 1.
 *
 * On the second turn, select and remove cards "aa" and "ba", which are compatible because they differ at only index 0.
 *
 * Because there are no more compatible pairs, the total score is 2.
 *
 * Example 2:
 *
 * Input: cards = ["aa","ab","ba"], x = "a"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * On the first turn, select and remove cards "aa" and "ba".
 *
 * Because there are no more compatible pairs, the total score is 1.
 *
 * Example 3:
 *
 * Input: cards = ["aa","ab","ba","ac"], x = "b"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The only cards that contain the character 'b' are "ab" and "ba". However, they differ in both indices, so they are not compatible. Thus, the output is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= cards.length &lt;= 105
 *
 * cards[i].length == 2
 *
 * Each cards[i] is composed of only lowercase English letters between 'a' and 'j'.
 *
 * x is a lowercase English letter between 'a' and 'j'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compute <code>both</code>, <code>cnt1</code>[c], <code>cnt2</code>[c] as the counts of cards with <code>x</code> in both positions, only the first position (other letter <code>c</code>), and only the second position.
 * Hint 2: Let <code>solve(cnt, have)</code> be the maximum pairs you can form from one‐sided counts <code>cnt</code> plus <code>have</code> two‐sided cards by sorting <code>cnt</code>, computing the total, and applying the same logic as in the solution.
 * Hint 3: Return the maximum over <code>i = 0..both</code> of <code>solve(cnt1, i) + solve(cnt2, both - i)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/two-letter-card-game/">LeetCode #3664</a>
 */
public class TwoLetterCardGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Two-Letter Card Game");
    }

    public static void main(String[] args) {
        System.out.println("=== TwoLetterCardGame ===");
        TwoLetterCardGame sol = new TwoLetterCardGame();
        System.out.println(sol.solve(null));
    }
}
