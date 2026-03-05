package org.leetcode.hard;


/**
 * <b>#1240 - Tiling a Rectangle with the Fewest Squares</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a rectangle of size n x m, return the minimum number of integer-sided squares that tile the rectangle.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, m = 3
 * Output: 3
 * Explanation: 3 squares are necessary to cover the rectangle.
 * 2 (squares of 1x1)
 * 1 (square of 2x2)
 *
 * Example 2:
 *
 * Input: n = 5, m = 8
 * Output: 5
 *
 * Example 3:
 *
 * Input: n = 11, m = 13
 * Output: 6
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 13
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you use backtracking to solve this problem ?.
 * Hint 2: Suppose you've placed a bunch of squares. Where is the natural spot to place the next square ?.
 * Hint 3: The maximum number of squares to be placed will be ≤ max(n,m).
 *
 * <h2>Approach</h2>
 * Think about the category (Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/tiling-a-rectangle-with-the-fewest-squares/">LeetCode #1240</a>
 */
public class TilingARectangleWithTheFewestSquares {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Tiling a Rectangle with the Fewest Squares");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TilingARectangleWithTheFewestSquares ===");
        TilingARectangleWithTheFewestSquares sol = new TilingARectangleWithTheFewestSquares();
        System.out.println(sol.solve(null));
    }
}
