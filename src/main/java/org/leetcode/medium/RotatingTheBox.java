package org.leetcode.medium;


/**
 * <b>#1861 - Rotating the Box</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one of the following:
 *
 *
 * A stone '#'
 *
 * A stationary obstacle '*'
 *
 * Empty '.'
 *
 * The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, and the inertia from the box's rotation does not affect the stones' horizontal positions.
 *
 *
 * It is guaranteed that each stone in boxGrid rests on an obstacle, another stone, or the bottom of the box.
 *
 *
 * Return an n x m matrix representing the box after the rotation described above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: boxGrid = [["#",".","#"]]
 * Output: [["."],
 *          ["#"],
 *          ["#"]]
 *
 * Example 2:
 *
 * Input: boxGrid = [["#",".","*","."],
 *               ["#","#","*","."]]
 * Output: [["#","."],
 *          ["#","#"],
 *          ["*","*"],
 *          [".","."]]
 *
 * Example 3:
 *
 * Input: boxGrid = [["#","#","*",".","*","."],
 *               ["#","#","#","*",".","."],
 *               ["#","#","#",".","#","."]]
 * Output: [[".","#","#"],
 *          [".","#","#"],
 *          ["#","#","*"],
 *          ["#","*","."],
 *          ["#",".","*"],
 *          ["#",".","."]]
 *
 *
 *
 * Constraints:
 *
 *
 * m == boxGrid.length
 *
 * n == boxGrid[i].length
 *
 * 1 &lt;= m, n &lt;= 500
 *
 * boxGrid[i][j] is either '#', '*', or '.'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Rotate the box using the relation rotatedBox[i][j] = box[m - 1 - j][i].
 * Hint 2: Start iterating from the bottom of the box and for each empty cell check if there is any stone above it with no obstacles between them.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rotating-the-box/">LeetCode #1861</a>
 */
public class RotatingTheBox {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rotating the Box");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RotatingTheBox ===");
        RotatingTheBox sol = new RotatingTheBox();
        System.out.println(sol.solve(null));
    }
}
