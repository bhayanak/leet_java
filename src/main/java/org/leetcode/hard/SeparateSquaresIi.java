package org.leetcode.hard;


/**
 * <b>#3454 - Separate Squares II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Segment Tree, Sweep Line</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array squares. Each squares[i] = [xi, yi, li] represents the coordinates of the bottom-left point and the side length of a square parallel to the x-axis.
 *
 *
 * Find the minimum y-coordinate value of a horizontal line such that the total area covered by squares above the line equals the total area covered by squares below the line.
 *
 *
 * Answers within 10-5 of the actual answer will be accepted.
 *
 *
 * Note: Squares may overlap. Overlapping areas should be counted only once in this version.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: squares = [[0,0,1],[2,2,1]]
 *
 *
 * Output: 1.00000
 *
 *
 * Explanation:
 *
 * Any horizontal line between y = 1 and y = 2 results in an equal split, with 1 square unit above and 1 square unit below. The minimum y-value is 1.
 *
 * Example 2:
 *
 * Input: squares = [[0,0,2],[1,1,1]]
 *
 *
 * Output: 1.00000
 *
 *
 * Explanation:
 *
 * Since the blue square overlaps with the red square, it will not be counted again. Thus, the line y = 1 splits the squares into two equal parts.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= squares.length &lt;= 5 * 104
 *
 * squares[i] = [xi, yi, li]
 *
 * squares[i].length == 3
 *
 * 0 &lt;= xi, yi &lt;= 109
 *
 * 1 &lt;= li &lt;= 109
 *
 * The total area of all the squares will not exceed 1015.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a line sweep and a segment tree.
 * Hint 2: The line must lie in one of the squares.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Segment Tree, Sweep Line).
 *
 * @see <a href="https://leetcode.com/problems/separate-squares-ii/">LeetCode #3454</a>
 */
public class SeparateSquaresIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Separate Squares II");
    }

    public static void main(String[] args) {
        System.out.println("=== SeparateSquaresIi ===");
        SeparateSquaresIi sol = new SeparateSquaresIi();
        System.out.println(sol.solve(null));
    }
}
