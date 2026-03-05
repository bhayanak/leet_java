package org.leetcode.medium;


/**
 * <b>#2271 - Maximum White Tiles Covered by a Carpet</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array tiles where tiles[i] = [li, ri] represents that every tile j in the range li &lt;= j &lt;= ri is colored white.
 *
 *
 * You are also given an integer carpetLen, the length of a single carpet that can be placed anywhere.
 *
 *
 * Return the maximum number of white tiles that can be covered by the carpet.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tiles = [[1,5],[10,11],[12,18],[20,25],[30,32]], carpetLen = 10
 * Output: 9
 * Explanation: Place the carpet starting on tile 10. 
 * It covers 9 white tiles, so we return 9.
 * Note that there may be other places where the carpet covers 9 white tiles.
 * It can be shown that the carpet cannot cover more than 9 white tiles.
 *
 * Example 2:
 *
 * Input: tiles = [[10,11],[1,1]], carpetLen = 2
 * Output: 2
 * Explanation: Place the carpet starting on tile 10. 
 * It covers 2 white tiles, so we return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= tiles.length &lt;= 5 * 104
 *
 * tiles[i].length == 2
 *
 * 1 &lt;= li &lt;= ri &lt;= 109
 *
 * 1 &lt;= carpetLen &lt;= 109
 *
 * The tiles are non-overlapping.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about the potential placements of the carpet in an optimal solution.
 * Hint 2: Can we use Prefix Sum and Binary Search to determine how many tiles are covered for a given placement?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Greedy, Sliding Window, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-white-tiles-covered-by-a-carpet/">LeetCode #2271</a>
 */
public class MaximumWhiteTilesCoveredByACarpet {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum White Tiles Covered by a Carpet");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumWhiteTilesCoveredByACarpet ===");
        MaximumWhiteTilesCoveredByACarpet sol = new MaximumWhiteTilesCoveredByACarpet();
        System.out.println(sol.solve(null));
    }
}
