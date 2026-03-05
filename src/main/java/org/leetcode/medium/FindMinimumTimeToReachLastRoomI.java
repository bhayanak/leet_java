package org.leetcode.medium;


/**
 * <b>#3341 - Find Minimum Time to Reach Last Room I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a dungeon with n x m rooms arranged as a grid.
 *
 *
 * You are given a 2D array moveTime of size n x m, where moveTime[i][j] represents the minimum time in seconds after which the room opens and can be moved to. You start from the room (0, 0) at time t = 0 and can move to an adjacent room. Moving between adjacent rooms takes exactly one second.
 *
 *
 * Return the minimum time to reach the room (n - 1, m - 1).
 *
 *
 * Two rooms are adjacent if they share a common wall, either horizontally or vertically.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: moveTime = [[0,4],[4,4]]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The minimum time required is 6 seconds.
 *
 *
 * At time t == 4, move from room (0, 0) to room (1, 0) in one second.
 *
 * At time t == 5, move from room (1, 0) to room (1, 1) in one second.
 *
 * Example 2:
 *
 * Input: moveTime = [[0,0,0],[0,0,0]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The minimum time required is 3 seconds.
 *
 *
 * At time t == 0, move from room (0, 0) to room (1, 0) in one second.
 *
 * At time t == 1, move from room (1, 0) to room (1, 1) in one second.
 *
 * At time t == 2, move from room (1, 1) to room (1, 2) in one second.
 *
 * Example 3:
 *
 * Input: moveTime = [[0,1],[1,2]]
 *
 *
 * Output: 3
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == moveTime.length &lt;= 50
 *
 * 2 &lt;= m == moveTime[i].length &lt;= 50
 *
 * 0 &lt;= moveTime[i][j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use shortest path algorithms.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/find-minimum-time-to-reach-last-room-i/">LeetCode #3341</a>
 */
public class FindMinimumTimeToReachLastRoomI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Minimum Time to Reach Last Room I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMinimumTimeToReachLastRoomI ===");
        FindMinimumTimeToReachLastRoomI sol = new FindMinimumTimeToReachLastRoomI();
        System.out.println(sol.solve(null));
    }
}
