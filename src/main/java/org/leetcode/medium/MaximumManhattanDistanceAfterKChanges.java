package org.leetcode.medium;


/**
 * <b>#3443 - Maximum Manhattan Distance After K Changes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of the characters 'N', 'S', 'E', and 'W', where s[i] indicates movements in an infinite grid:
 *
 *
 * 'N' : Move north by 1 unit.
 *
 * 'S' : Move south by 1 unit.
 *
 * 'E' : Move east by 1 unit.
 *
 * 'W' : Move west by 1 unit.
 *
 * Initially, you are at the origin (0, 0). You can change at most k characters to any of the four directions.
 *
 *
 * Find the maximum Manhattan distance from the origin that can be achieved at any time while performing the movements in order.
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "NWSE", k = 1
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Change s[2] from 'S' to 'N'. The string s becomes "NWNE".
 *
 *
 *
 *
 *
 * 			Movement
 * 			Position (x, y)
 * 			Manhattan Distance
 * 			Maximum
 *
 *
 *
 *
 *
 *
 * 			s[0] == 'N'
 * 			(0, 1)
 * 			0 + 1 = 1
 * 			1
 *
 *
 *
 *
 * 			s[1] == 'W'
 * 			(-1, 1)
 * 			1 + 1 = 2
 * 			2
 *
 *
 *
 *
 * 			s[2] == 'N'
 * 			(-1, 2)
 * 			1 + 2 = 3
 * 			3
 *
 *
 *
 *
 * 			s[3] == 'E'
 * 			(0, 2)
 * 			0 + 2 = 2
 * 			3
 *
 *
 *
 *
 * The maximum Manhattan distance from the origin that can be achieved is 3. Hence, 3 is the output.
 *
 * Example 2:
 *
 * Input: s = "NSWWEW", k = 3
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Change s[1] from 'S' to 'N', and s[4] from 'E' to 'W'. The string s becomes "NNWWWW".
 *
 *
 * The maximum Manhattan distance from the origin that can be achieved is 6. Hence, 6 is the output.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 0 &lt;= k &lt;= s.length
 *
 * s consists of only 'N', 'S', 'E', and 'W'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can brute force all the possible directions (NE, NW, SE, SW).
 * Hint 2: Change up to <code>k</code> characters to maximize the distance in the chosen direction.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-manhattan-distance-after-k-changes/">LeetCode #3443</a>
 */
public class MaximumManhattanDistanceAfterKChanges {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Manhattan Distance After K Changes");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumManhattanDistanceAfterKChanges ===");
        MaximumManhattanDistanceAfterKChanges sol = new MaximumManhattanDistanceAfterKChanges();
        System.out.println(sol.solve(null));
    }
}
