package org.leetcode.hard;


/**
 * <b>#3245 - Alternating Groups III</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Indexed Tree, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are some red and blue tiles arranged circularly. You are given an array of integers colors and a 2D integers array queries.
 *
 *
 * The color of tile i is represented by colors[i]:
 *
 *
 * colors[i] == 0 means that tile i is red.
 *
 * colors[i] == 1 means that tile i is blue.
 *
 * An alternating group is a contiguous subset of tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its adjacent tiles in the group).
 *
 *
 * You have to process queries of two types:
 *
 *
 * queries[i] = [1, sizei], determine the count of alternating groups with size sizei.
 *
 * queries[i] = [2, indexi, colori], change colors[indexi] to colori.
 *
 * Return an array answer containing the results of the queries of the first type in order.
 *
 *
 * Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: colors = [0,1,1,0,1], queries = [[2,1,0],[1,4]]
 *
 *
 * Output: [2]
 *
 *
 * Explanation:
 *
 * First query:
 *
 *
 * Change colors[1] to 0.
 *
 * Second query:
 *
 *
 * Count of the alternating groups with size 4:
 *
 * Example 2:
 *
 * Input: colors = [0,0,1,0,1,1], queries = [[1,3],[2,3,0],[1,5]]
 *
 *
 * Output: [2,0]
 *
 *
 * Explanation:
 *
 * First query:
 *
 *
 * Count of the alternating groups with size 3:
 *
 * Second query: colors will not change.
 *
 *
 * Third query: There is no alternating group with size 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= colors.length &lt;= 5 * 104
 *
 * 0 &lt;= colors[i] &lt;= 1
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * queries[i][0] == 1 or queries[i][0] == 2
 *
 * For all i that:
 *
 *
 *
 * queries[i][0] == 1: queries[i].length == 2, 3 &lt;= queries[i][1] &lt;= colors.length - 1
 *
 * queries[i][0] == 2: queries[i].length == 3, 0 &lt;= queries[i][1] &lt;= colors.length - 1, 0 &lt;= queries[i][2] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try using a segment tree to store the maximal alternating groups.
 * Hint 2: Store the sizes of these maximal alternating groups in another data structure.
 * Hint 3: Find the count of the alternating groups of size <code>k</code> with having the count of maximal alternating groups with size greater than or equal to <code>k</code> and the sum of their sizes.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Indexed Tree, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/alternating-groups-iii/">LeetCode #3245</a>
 */
public class AlternatingGroupsIii {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Alternating Groups III");
    }

    public static void main(String[] args) {
        System.out.println("=== AlternatingGroupsIii ===");
        AlternatingGroupsIii sol = new AlternatingGroupsIii();
        System.out.println(sol.solve(null));
    }
}
