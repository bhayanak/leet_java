package org.leetcode.hard;


/**
 * <b>#1970 - Last Day Where You Can Still Cross</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a 1-based binary matrix where 0 represents land and 1 represents water. You are given integers row and col representing the number of rows and columns in the matrix, respectively.
 *
 *
 * Initially on day 0, the entire matrix is land. However, each day a new cell becomes flooded with water. You are given a 1-based 2D array cells, where cells[i] = [ri, ci] represents that on the ith day, the cell on the rith row and cith column (1-based coordinates) will be covered with water (i.e., changed to 1).
 *
 *
 * You want to find the last day that it is possible to walk from the top to the bottom by only walking on land cells. You can start from any cell in the top row and end at any cell in the bottom row. You can only travel in the four cardinal directions (left, right, up, and down).
 *
 *
 * Return the last day where it is possible to walk from the top to the bottom by only walking on land cells.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: row = 2, col = 2, cells = [[1,1],[2,1],[1,2],[2,2]]
 * Output: 2
 * Explanation: The above image depicts how the matrix changes each day starting from day 0.
 * The last day where it is possible to cross from top to bottom is on day 2.
 *
 * Example 2:
 *
 * Input: row = 2, col = 2, cells = [[1,1],[1,2],[2,1],[2,2]]
 * Output: 1
 * Explanation: The above image depicts how the matrix changes each day starting from day 0.
 * The last day where it is possible to cross from top to bottom is on day 1.
 *
 * Example 3:
 *
 * Input: row = 3, col = 3, cells = [[1,2],[2,1],[3,3],[2,2],[1,1],[1,3],[2,3],[3,2],[3,1]]
 * Output: 3
 * Explanation: The above image depicts how the matrix changes each day starting from day 0.
 * The last day where it is possible to cross from top to bottom is on day 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= row, col &lt;= 2 * 104
 *
 * 4 &lt;= row * col &lt;= 2 * 104
 *
 * cells.length == row * col
 *
 * 1 &lt;= ri &lt;= row
 *
 * 1 &lt;= ci &lt;= col
 *
 * All the values of cells are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What graph algorithm allows us to find whether a path exists?
 * Hint 2: Can we use binary search to help us solve the problem?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/last-day-where-you-can-still-cross/">LeetCode #1970</a>
 */
public class LastDayWhereYouCanStillCross {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Last Day Where You Can Still Cross");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LastDayWhereYouCanStillCross ===");
        LastDayWhereYouCanStillCross sol = new LastDayWhereYouCanStillCross();
        System.out.println(sol.solve(null));
    }
}
