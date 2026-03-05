package org.leetcode.medium;


/**
 * <b>#2087 - Minimum Cost Homecoming of a Robot in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an m x n grid, where (0, 0) is the top-left cell and (m - 1, n - 1) is the bottom-right cell. You are given an integer array startPos where startPos = [startrow, startcol] indicates that initially, a robot is at the cell (startrow, startcol). You are also given an integer array homePos where homePos = [homerow, homecol] indicates that its home is at the cell (homerow, homecol).
 *
 *
 * The robot needs to go to its home. It can move one cell in four directions: left, right, up, or down, and it can not move outside the boundary. Every move incurs some cost. You are further given two 0-indexed integer arrays: rowCosts of length m and colCosts of length n.
 *
 *
 * If the robot moves up or down into a cell whose row is r, then this move costs rowCosts[r].
 *
 * If the robot moves left or right into a cell whose column is c, then this move costs colCosts[c].
 *
 * Return the minimum total cost for this robot to return home.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: startPos = [1, 0], homePos = [2, 3], rowCosts = [5, 4, 3], colCosts = [8, 2, 6, 7]
 * Output: 18
 * Explanation: One optimal path is that:
 * Starting from (1, 0)
 * -&gt; It goes down to (2, 0). This move costs rowCosts[2] = 3.
 * -&gt; It goes right to (2, 1). This move costs colCosts[1] = 2.
 * -&gt; It goes right to (2, 2). This move costs colCosts[2] = 6.
 * -&gt; It goes right to (2, 3). This move costs colCosts[3] = 7.
 * The total cost is 3 + 2 + 6 + 7 = 18
 *
 * Example 2:
 *
 * Input: startPos = [0, 0], homePos = [0, 0], rowCosts = [5], colCosts = [26]
 * Output: 0
 * Explanation: The robot is already at its home. Since no moves occur, the total cost is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * m == rowCosts.length
 *
 * n == colCosts.length
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 0 &lt;= rowCosts[r], colCosts[c] &lt;= 104
 *
 * startPos.length == 2
 *
 * homePos.length == 2
 *
 * 0 &lt;= startrow, homerow &lt; m
 *
 * 0 &lt;= startcol, homecol &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Irrespective of what path the robot takes, it will have to traverse all the rows between startRow and homeRow and all the columns between startCol and homeCol.
 * Hint 2: Hence, making any other move other than traversing the required rows and columns will potentially incur more cost which can be avoided.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-homecoming-of-a-robot-in-a-grid/">LeetCode #2087</a>
 */
public class MinimumCostHomecomingOfARobotInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost Homecoming of a Robot in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostHomecomingOfARobotInAGrid ===");
        MinimumCostHomecomingOfARobotInAGrid sol = new MinimumCostHomecomingOfARobotInAGrid();
        System.out.println(sol.solve(null));
    }
}
