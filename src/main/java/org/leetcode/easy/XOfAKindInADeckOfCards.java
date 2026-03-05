package org.leetcode.easy;


/**
 * <b>#914 - X of a Kind in a Deck of Cards</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array deck where deck[i] represents the number written on the ith card.
 *
 *
 * Partition the cards into one or more groups such that:
 *
 *
 * Each group has exactly x cards where x &gt; 1, and
 *
 * All the cards in one group have the same integer written on them.
 *
 * Return true if such partition is possible, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: deck = [1,2,3,4,4,3,2,1]
 * Output: true
 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
 *
 * Example 2:
 *
 * Input: deck = [1,1,1,2,2,2,3,3]
 * Output: false
 * Explanation: No possible partition.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= deck.length &lt;= 104
 *
 * 0 &lt;= deck[i] &lt; 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/">LeetCode #914</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class XOfAKindInADeckOfCards {

    /**
     * Returns true if Has groups size x.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param deck the deck (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length < 2) return false;
        java.util.Map<Integer,Integer> cnt = new java.util.HashMap<>();
        for (int c : deck) cnt.merge(c, 1, Integer::sum);
        int g = 0;
        for (int v : cnt.values()) g = gcd(g, v);
        return g >= 2;
    }
    private int gcd(int a, int b) { return b == 0 ? a : gcd(b, a%b); }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac XOfAKindInADeckOfCards.java &amp;&amp; java org.leetcode.easy.XOfAKindInADeckOfCards</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        XOfAKindInADeckOfCards sol = new XOfAKindInADeckOfCards();
                System.out.println(sol.hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1})); // true
                System.out.println(sol.hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3})); // false
    }
}
