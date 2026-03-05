package org.leetcode.medium;


/**
 * <b>#3208 - Alternating Groups II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:
 *
 *
 * colors[i] == 0 means that tile i is red.
 *
 * colors[i] == 1 means that tile i is blue.
 *
 * An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).
 *
 *
 * Return the number of alternating groups.
 *
 *
 * Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: colors = [0,1,0,1,0], k = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * Alternating groups:
 *
 * Example 2:
 *
 * Input: colors = [0,1,0,0,1,0,1], k = 6
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * Alternating groups:
 *
 * Example 3:
 *
 * Input: colors = [1,1,0,1], k = 4
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= colors.length &lt;= 105
 *
 * 0 &lt;= colors[i] &lt;= 1
 *
 * 3 &lt;= k &lt;= colors.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to find a tile that has the same color as its next tile (if it exists).
 * Hint 2: Then try to find maximal alternating groups by starting a single for loop from that tile.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/alternating-groups-ii/">LeetCode #3208</a>
 */
public class AlternatingGroupsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Alternating Groups II");
    }

    public static void main(String[] args) {
        System.out.println("=== AlternatingGroupsIi ===");
        AlternatingGroupsIi sol = new AlternatingGroupsIi();
        System.out.println(sol.solve(null));
    }
}
