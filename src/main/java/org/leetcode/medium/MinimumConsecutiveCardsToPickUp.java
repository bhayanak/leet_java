package org.leetcode.medium;


/**
 * <b>#2260 - Minimum Consecutive Cards to Pick Up</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array cards where cards[i] represents the value of the ith card. A pair of cards are matching if the cards have the same value.
 *
 *
 * Return the minimum number of consecutive cards you have to pick up to have a pair of matching cards among the picked cards. If it is impossible to have matching cards, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cards = [3,4,2,3,4,7]
 * Output: 4
 * Explanation: We can pick up the cards [3,4,2,3] which contain a matching pair of cards with value 3. Note that picking up the cards [4,2,3,4] is also optimal.
 *
 * Example 2:
 *
 * Input: cards = [1,0,5,3]
 * Output: -1
 * Explanation: There is no way to pick up a set of consecutive cards that contain a pair of matching cards.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= cards.length &lt;= 105
 *
 * 0 &lt;= cards[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the cards and store the location of the last occurrence of each number.
 * Hint 2: What data structure could you use to get the last occurrence of a number in O(1) or O(log n)?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/minimum-consecutive-cards-to-pick-up/">LeetCode #2260</a>
 */
public class MinimumConsecutiveCardsToPickUp {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Consecutive Cards to Pick Up");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumConsecutiveCardsToPickUp ===");
        MinimumConsecutiveCardsToPickUp sol = new MinimumConsecutiveCardsToPickUp();
        System.out.println(sol.solve(null));
    }
}
