package org.leetcode.medium;


/**
 * <b>#1222 - Queens That Can Attack the King</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * On a 0-indexed 8 x 8 chessboard, there can be multiple black queens and one white king.
 *
 *
 * You are given a 2D integer array queens where queens[i] = [xQueeni, yQueeni] represents the position of the ith black queen on the chessboard. You are also given an integer array king of length 2 where king = [xKing, yKing] represents the position of the white king.
 *
 *
 * Return the coordinates of the black queens that can directly attack the king. You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queens = [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]], king = [0,0]
 * Output: [[0,1],[1,0],[3,3]]
 * Explanation: The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
 *
 * Example 2:
 *
 * Input: queens = [[0,0],[1,1],[2,2],[3,4],[3,5],[4,4],[4,5]], king = [3,3]
 * Output: [[2,2],[3,4],[4,4]]
 * Explanation: The diagram above shows the three queens that can directly attack the king and the three queens that cannot attack the king (i.e., marked with red dashes).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queens.length &lt; 64
 *
 * queens[i].length == king.length == 2
 *
 * 0 &lt;= xQueeni, yQueeni, xKing, yKing &lt; 8
 *
 * All the given positions are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check 8 directions around the King.
 * Hint 2: Find the nearest queen in each direction.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/queens-that-can-attack-the-king/">LeetCode #1222</a>
 */
public class QueensThatCanAttackTheKing {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Queens That Can Attack the King");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== QueensThatCanAttackTheKing ===");
        QueensThatCanAttackTheKing sol = new QueensThatCanAttackTheKing();
        System.out.println(sol.solve(null));
    }
}
