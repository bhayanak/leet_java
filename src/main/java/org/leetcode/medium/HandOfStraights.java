package org.leetcode.medium;


/**
 * <b>#846 - Hand of Straights</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size groupSize, and consists of groupSize consecutive cards.
 *
 *
 * Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize, return true if she can rearrange the cards, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
 * Output: true
 * Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]
 *
 * Example 2:
 *
 * Input: hand = [1,2,3,4,5], groupSize = 4
 * Output: false
 * Explanation: Alice's hand can not be rearranged into groups of 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= hand.length &lt;= 104
 *
 * 0 &lt;= hand[i] &lt;= 109
 *
 * 1 &lt;= groupSize &lt;= hand.length
 *
 *
 *
 * Note: This question is the same as 1296: https://leetcode.com/problems/divide-array-in-sets-of-k-consecutive-numbers/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/hand-of-straights/">LeetCode #846</a>
 */
public class HandOfStraights {

    /**
     * TODO: Implement "Hand of Straights".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Hand of Straights");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac HandOfStraights.java &amp;&amp; java org.leetcode.medium.HandOfStraights</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== HandOfStraights ===");
        HandOfStraights sol = new HandOfStraights();
        System.out.println(sol.solve(null));
    }
}
