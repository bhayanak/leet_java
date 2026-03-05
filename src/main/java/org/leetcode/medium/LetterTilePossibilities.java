package org.leetcode.medium;


/**
 * <b>#1079 - Letter Tile Possibilities</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Backtracking, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n  tiles, where each tile has one letter tiles[i] printed on it.
 *
 *
 * Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tiles = "AAB"
 * Output: 8
 * Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
 *
 * Example 2:
 *
 * Input: tiles = "AAABBC"
 * Output: 188
 *
 * Example 3:
 *
 * Input: tiles = "V"
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= tiles.length &lt;= 7
 *
 * tiles consists of uppercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to build the string with a backtracking DFS by considering what you can put in every position.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Backtracking, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/letter-tile-possibilities/">LeetCode #1079</a>
 */
public class LetterTilePossibilities {

    /**
     * TODO: Implement "Letter Tile Possibilities".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Letter Tile Possibilities");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LetterTilePossibilities.java &amp;&amp; java org.leetcode.medium.LetterTilePossibilities</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LetterTilePossibilities ===");
        LetterTilePossibilities sol = new LetterTilePossibilities();
        System.out.println(sol.solve(null));
    }
}
