package org.leetcode.medium;


/**
 * <b>#3001 - Minimum Moves to Capture The Queen</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a 1-indexed 8 x 8 chessboard containing 3 pieces.
 *
 *
 * You are given 6 integers a, b, c, d, e, and f where:
 *
 *
 * (a, b) denotes the position of the white rook.
 *
 * (c, d) denotes the position of the white bishop.
 *
 * (e, f) denotes the position of the black queen.
 *
 * Given that you can only move the white pieces, return the minimum number of moves required to capture the black queen.
 *
 *
 * Note that:
 *
 *
 * Rooks can move any number of squares either vertically or horizontally, but cannot jump over other pieces.
 *
 * Bishops can move any number of squares diagonally, but cannot jump over other pieces.
 *
 * A rook or a bishop can capture the queen if it is located in a square that they can move to.
 *
 * The queen does not move.
 *
 *
 *
 * Example 1:
 *
 * Input: a = 1, b = 1, c = 8, d = 8, e = 2, f = 3
 * Output: 2
 * Explanation: We can capture the black queen in two moves by moving the white rook to (1, 3) then to (2, 3).
 * It is impossible to capture the black queen in less than two moves since it is not being attacked by any of the pieces at the beginning.
 *
 * Example 2:
 *
 * Input: a = 5, b = 3, c = 3, d = 4, e = 5, f = 2
 * Output: 1
 * Explanation: We can capture the black queen in a single move by doing one of the following: 
 * - Move the white rook to (5, 2).
 * - Move the white bishop to (5, 2).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a, b, c, d, e, f &lt;= 8
 *
 * No two pieces are on the same square.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The minimum number of moves can be either <code>1</code> or <code>2</code>.
 * Hint 2: The answer will be <code>1</code> if the queen is on the path of the rook or bishop and none of them is in between.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-capture-the-queen/">LeetCode #3001</a>
 */
public class MinimumMovesToCaptureTheQueen {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Capture The Queen");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToCaptureTheQueen ===");
        MinimumMovesToCaptureTheQueen sol = new MinimumMovesToCaptureTheQueen();
        System.out.println(sol.solve(null));
    }
}
