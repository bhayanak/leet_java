package org.leetcode.medium;


/**
 * <b>#1162 - As Far from Land as Possible</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n grid containing only values 0 and 1, where 0 represents water and 1 represents land, find a water cell such that its distance to the nearest land cell is maximized, and return the distance. If no land or water exists in the grid, return -1.
 *
 *
 * The distance used in this problem is the Manhattan distance: the distance between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,1],[0,0,0],[1,0,1]]
 * Output: 2
 * Explanation: The cell (1, 1) is as far as possible from all the land with distance 2.
 *
 * Example 2:
 *
 * Input: grid = [[1,0,0],[0,0,0],[0,0,0]]
 * Output: 4
 * Explanation: The cell (2, 2) is as far as possible from all the land with distance 4.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * grid[i][j] is 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you think of this problem in a backwards way ?
 * Hint 2: Imagine expanding outward from each land cell. What kind of search does that ?
 * Hint 3: Use BFS starting from all land cells in the same time.
 * Hint 4: When do you reach the furthest water cell?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/as-far-from-land-as-possible/">LeetCode #1162</a>
 */
public class AsFarFromLandAsPossible {

    /**
     * TODO: Implement "As Far from Land as Possible".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: As Far from Land as Possible");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AsFarFromLandAsPossible.java &amp;&amp; java org.leetcode.medium.AsFarFromLandAsPossible</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AsFarFromLandAsPossible ===");
        AsFarFromLandAsPossible sol = new AsFarFromLandAsPossible();
        System.out.println(sol.solve(null));
    }
}
