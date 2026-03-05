package org.leetcode.hard;


/**
 * <b>#1263 - Minimum Moves to Move a Box to Their Target Location</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Heap (Priority Queue), Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A storekeeper is a game in which the player pushes boxes around in a warehouse trying to get them to target locations.
 *
 *
 * The game is represented by an m x n grid of characters grid where each element is a wall, floor, or box.
 *
 *
 * Your task is to move the box 'B' to the target position 'T' under the following rules:
 *
 *
 * The character 'S' represents the player. The player can move up, down, left, right in grid if it is a floor (empty cell).
 *
 * The character '.' represents the floor which means a free cell to walk.
 *
 * The character '#' represents the wall which means an obstacle (impossible to walk there).
 *
 * There is only one box 'B' and one target cell 'T' in the grid.
 *
 * The box can be moved to an adjacent free cell by standing next to the box and then moving in the direction of the box. This is a push.
 *
 * The player cannot walk through the box.
 *
 * Return the minimum number of pushes to move the box to the target. If there is no way to reach the target, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [["#","#","#","#","#","#"],
 *                ["#","T","#","#","#","#"],
 *                ["#",".",".","B",".","#"],
 *                ["#",".","#","#",".","#"],
 *                ["#",".",".",".","S","#"],
 *                ["#","#","#","#","#","#"]]
 * Output: 3
 * Explanation: We return only the number of times the box is pushed.
 *
 * Example 2:
 *
 * Input: grid = [["#","#","#","#","#","#"],
 *                ["#","T","#","#","#","#"],
 *                ["#",".",".","B",".","#"],
 *                ["#","#","#","#",".","#"],
 *                ["#",".",".",".","S","#"],
 *                ["#","#","#","#","#","#"]]
 * Output: -1
 *
 * Example 3:
 *
 * Input: grid = [["#","#","#","#","#","#"],
 *                ["#","T",".",".","#","#"],
 *                ["#",".","#","B",".","#"],
 *                ["#",".",".",".",".","#"],
 *                ["#",".",".",".","S","#"],
 *                ["#","#","#","#","#","#"]]
 * Output: 5
 * Explanation: push the box down, left, left, up and up.
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m, n &lt;= 20
 *
 * grid contains only characters '.', '#', 'S', 'T', or 'B'.
 *
 * There is only one character 'S', 'B', and 'T' in the grid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We represent the search state as (player_row, player_col, box_row, box_col).
 * Hint 2: You need to count only the number of pushes. Then inside of your BFS check if the box could be pushed (in any direction) given the current position of the player.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Heap (Priority Queue), Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-move-a-box-to-their-target-location/">LeetCode #1263</a>
 */
public class MinimumMovesToMoveABoxToTheirTargetLocation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Move a Box to Their Target Location");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToMoveABoxToTheirTargetLocation ===");
        MinimumMovesToMoveABoxToTheirTargetLocation sol = new MinimumMovesToMoveABoxToTheirTargetLocation();
        System.out.println(sol.solve(null));
    }
}
