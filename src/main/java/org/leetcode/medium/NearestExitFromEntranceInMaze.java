package org.leetcode.medium;


/**
 * <b>#1926 - Nearest Exit from Entrance in Maze</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix maze (0-indexed) with empty cells (represented as '.') and walls (represented as '+'). You are also given the entrance of the maze, where entrance = [entrancerow, entrancecol] denotes the row and column of the cell you are initially standing at.
 *
 *
 * In one step, you can move one cell up, down, left, or right. You cannot step into a cell with a wall, and you cannot step outside the maze. Your goal is to find the nearest exit from the entrance. An exit is defined as an empty cell that is at the border of the maze. The entrance does not count as an exit.
 *
 *
 * Return the number of steps in the shortest path from the entrance to the nearest exit, or -1 if no such path exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: maze = [["+","+",".","+"],[".",".",".","+"],["+","+","+","."]], entrance = [1,2]
 * Output: 1
 * Explanation: There are 3 exits in this maze at [1,0], [0,2], and [2,3].
 * Initially, you are at the entrance cell [1,2].
 * - You can reach [1,0] by moving 2 steps left.
 * - You can reach [0,2] by moving 1 step up.
 * It is impossible to reach [2,3] from the entrance.
 * Thus, the nearest exit is [0,2], which is 1 step away.
 *
 * Example 2:
 *
 * Input: maze = [["+","+","+"],[".",".","."],["+","+","+"]], entrance = [1,0]
 * Output: 2
 * Explanation: There is 1 exit in this maze at [1,2].
 * [1,0] does not count as an exit since it is the entrance cell.
 * Initially, you are at the entrance cell [1,0].
 * - You can reach [1,2] by moving 2 steps right.
 * Thus, the nearest exit is [1,2], which is 2 steps away.
 *
 * Example 3:
 *
 * Input: maze = [[".","+"]], entrance = [0,0]
 * Output: -1
 * Explanation: There are no exits in this maze.
 *
 *
 *
 * Constraints:
 *
 *
 * maze.length == m
 *
 * maze[i].length == n
 *
 * 1 &lt;= m, n &lt;= 100
 *
 * maze[i][j] is either '.' or '+'.
 *
 * entrance.length == 2
 *
 * 0 &lt;= entrancerow &lt; m
 *
 * 0 &lt;= entrancecol &lt; n
 *
 * entrance will always be an empty cell.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which type of traversal lets you find the distance from a point?
 * Hint 2: Try using a Breadth First Search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/">LeetCode #1926</a>
 */
public class NearestExitFromEntranceInMaze {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Nearest Exit from Entrance in Maze");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NearestExitFromEntranceInMaze ===");
        NearestExitFromEntranceInMaze sol = new NearestExitFromEntranceInMaze();
        System.out.println(sol.solve(null));
    }
}
