package org.leetcode.hard;


/**
 * <b>#1210 - Minimum Moves to Reach Target with Rotations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In an n*n grid, there is a snake that spans 2 cells and starts moving from the top left corner at (0, 0) and (0, 1). The grid has empty cells represented by zeros and blocked cells represented by ones. The snake wants to reach the lower right corner at (n-1, n-2) and (n-1, n-1).
 *
 *
 * In one move the snake can:
 *
 *
 * Move one cell to the right if there are no blocked cells there. This move keeps the horizontal/vertical position of the snake as it is.
 *
 * Move down one cell if there are no blocked cells there. This move keeps the horizontal/vertical position of the snake as it is.
 *
 * Rotate clockwise if it's in a horizontal position and the two cells under it are both empty. In that case the snake moves from (r, c) and (r, c+1) to (r, c) and (r+1, c).
 *
 *
 *
 * Rotate counterclockwise if it's in a vertical position and the two cells to its right are both empty. In that case the snake moves from (r, c) and (r+1, c) to (r, c) and (r, c+1).
 *
 *
 *
 * Return the minimum number of moves to reach the target.
 *
 *
 * If there is no way to reach the target, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,0,0,0,0,1],
 *                [1,1,0,0,1,0],
 *                [0,0,0,0,1,1],
 *                [0,0,1,0,1,0],
 *                [0,1,1,0,0,0],
 *                [0,1,1,0,0,0]]
 * Output: 11
 * Explanation:
 * One possible solution is [right, right, rotate clockwise, right, down, down, down, down, rotate counterclockwise, right, down].
 *
 * Example 2:
 *
 * Input: grid = [[0,0,1,1,1,1],
 *                [0,0,0,0,1,1],
 *                [1,1,0,0,0,1],
 *                [1,1,1,0,0,1],
 *                [1,1,1,0,0,1],
 *                [1,1,1,0,0,0]]
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 100
 *
 * 0 &lt;= grid[i][j] &lt;= 1
 *
 * It is guaranteed that the snake starts at empty cells.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use BFS to find the answer.
 * Hint 2: The state of the BFS is the position (x, y) along with a binary value that specifies if the position is horizontal or vertical.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-reach-target-with-rotations/">LeetCode #1210</a>
 */
public class MinimumMovesToReachTargetWithRotations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Reach Target with Rotations");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToReachTargetWithRotations ===");
        MinimumMovesToReachTargetWithRotations sol = new MinimumMovesToReachTargetWithRotations();
        System.out.println(sol.solve(null));
    }
}
