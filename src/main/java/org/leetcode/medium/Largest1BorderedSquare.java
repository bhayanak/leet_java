package org.leetcode.medium;


/**
 * <b>#1139 - Largest 1-Bordered Square</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D grid of 0s and 1s, return the number of elements in the largest square subgrid that has all 1s on its border, or 0 if such a subgrid doesn't exist in the grid.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: grid = [[1,1,1],[1,0,1],[1,1,1]]
 * Output: 9
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: grid = [[1,1,0,0]]
 * Output: 1
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= grid.length &lt;= 100
 *
 * 1 &lt;= grid[0].length &lt;= 100
 *
 * grid[i][j] is 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each square, know how many ones are up, left, down, and right of this square. You can find it in O(N^2) using dynamic programming.
 * Hint 2: Now for each square ( O(N^3) ), we can evaluate whether that square is 1-bordered in O(1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-1-bordered-square/">LeetCode #1139</a>
 */
public class Largest1BorderedSquare {

    /**
     * TODO: Implement "Largest 1-Bordered Square".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest 1-Bordered Square");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac Largest1BorderedSquare.java &amp;&amp; java org.leetcode.medium.Largest1BorderedSquare</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== Largest1BorderedSquare ===");
        Largest1BorderedSquare sol = new Largest1BorderedSquare();
        System.out.println(sol.solve(null));
    }
}
