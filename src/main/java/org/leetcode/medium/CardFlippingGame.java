package org.leetcode.medium;


/**
 * <b>#822 - Card Flipping Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed integer arrays fronts and backs of length n, where the ith card has the positive integer fronts[i] printed on the front and backs[i] printed on the back. Initially, each card is placed on a table such that the front number is facing up and the other is facing down. You may flip over any number of cards (possibly zero).
 *
 *
 * After flipping the cards, an integer is considered good if it is facing down on some card and not facing up on any card.
 *
 *
 * Return the minimum possible good integer after flipping the cards. If there are no good integers, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
 * Output: 2
 * Explanation:
 * If we flip the second card, the face up numbers are [1,3,4,4,7] and the face down are [1,2,4,1,3].
 * 2 is the minimum good integer as it appears facing down but not facing up.
 * It can be shown that 2 is the minimum possible good integer obtainable after flipping some cards.
 *
 * Example 2:
 *
 * Input: fronts = [1], backs = [1]
 * Output: 0
 * Explanation:
 * There are no good integers no matter how we flip the cards, so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == fronts.length == backs.length
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= fronts[i], backs[i] &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/card-flipping-game/">LeetCode #822</a>
 */
public class CardFlippingGame {

    /**
     * TODO: Implement "Card Flipping Game".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Card Flipping Game");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CardFlippingGame.java &amp;&amp; java org.leetcode.medium.CardFlippingGame</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CardFlippingGame ===");
        CardFlippingGame sol = new CardFlippingGame();
        System.out.println(sol.solve(null));
    }
}
