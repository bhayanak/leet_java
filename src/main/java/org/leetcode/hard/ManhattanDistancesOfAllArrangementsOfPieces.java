package org.leetcode.hard;


/**
 * <b>#3426 - Manhattan Distances of All Arrangements of Pieces</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers m, n, and k.
 *
 *
 * There is a rectangular grid of size m × n containing k identical pieces. Return the sum of Manhattan distances between every pair of pieces over all valid arrangements of pieces.
 *
 *
 * A valid arrangement is a placement of all k pieces on the grid with at most one piece per cell.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: m = 2, n = 2, k = 2
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * The valid arrangements of pieces on the board are:
 *
 *
 * In the first 4 arrangements, the Manhattan distance between the two pieces is 1.
 *
 * In the last 2 arrangements, the Manhattan distance between the two pieces is 2.
 *
 * Thus, the total Manhattan distance across all valid arrangements is 1 + 1 + 1 + 1 + 2 + 2 = 8.
 *
 * Example 2:
 *
 * Input: m = 1, n = 4, k = 3
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * The valid arrangements of pieces on the board are:
 *
 *
 * The first and last arrangements have a total Manhattan distance of 1 + 1 + 2 = 4.
 *
 * The middle two arrangements have a total Manhattan distance of 1 + 2 + 3 = 6.
 *
 * The total Manhattan distance between all pairs of pieces across all arrangements is 4 + 6 + 6 + 4 = 20.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 2 &lt;= m * n &lt;= 105
 *
 * 2 &lt;= k &lt;= m * n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Fix two pieces in two specific locations and find the number of boards where this can happen.
 * Hint 2: A particular pair of positions will be counted exactly <code>C(m * n - 2, k - 2)</code> times. Calculate the total distance for all pairs of positions and multiply it with <code>C(m * n - 2, k - 2)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/manhattan-distances-of-all-arrangements-of-pieces/">LeetCode #3426</a>
 */
public class ManhattanDistancesOfAllArrangementsOfPieces {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Manhattan Distances of All Arrangements of Pieces");
    }

    public static void main(String[] args) {
        System.out.println("=== ManhattanDistancesOfAllArrangementsOfPieces ===");
        ManhattanDistancesOfAllArrangementsOfPieces sol = new ManhattanDistancesOfAllArrangementsOfPieces();
        System.out.println(sol.solve(null));
    }
}
