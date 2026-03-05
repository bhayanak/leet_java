package org.leetcode.medium;


/**
 * <b>#1140 - Stone Game II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Prefix Sum, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob continue their games with piles of stones. There are a number of piles arranged in a row, and each pile has a positive integer number of stones piles[i]. The objective of the game is to end with the most stones.
 *
 *
 * Alice and Bob take turns, with Alice starting first.
 *
 *
 * On each player's turn, that player can take all the stones in the first X remaining piles, where 1 &lt;= X &lt;= 2M. Then, we set M = max(M, X). Initially, M = 1.
 *
 *
 * The game continues until all the stones have been taken.
 *
 *
 * Assuming Alice and Bob play optimally, return the maximum number of stones Alice can get.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [2,7,9,4,4]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * If Alice takes one pile at the beginning, Bob takes two piles, then Alice takes 2 piles again. Alice can get 2 + 4 + 4 = 10 stones in total.
 *
 * If Alice takes two piles at the beginning, then Bob can take all three piles left. In this case, Alice get 2 + 7 = 9 stones in total.
 *
 * So we return 10 since it's larger.
 *
 * Example 2:
 *
 * Input: piles = [1,2,3,4,5,100]
 *
 *
 * Output: 104
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= piles.length &lt;= 100
 *
 * 1 &lt;= piles[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming: the states are (i, m) for the answer of piles[i:] and that given m.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Prefix Sum, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game-ii/">LeetCode #1140</a>
 */
public class StoneGameIi {

    /**
     * TODO: Implement "Stone Game II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac StoneGameIi.java &amp;&amp; java org.leetcode.medium.StoneGameIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGameIi ===");
        StoneGameIi sol = new StoneGameIi();
        System.out.println(sol.solve(null));
    }
}
