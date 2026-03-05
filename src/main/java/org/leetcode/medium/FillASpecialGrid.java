package org.leetcode.medium;


/**
 * <b>#3537 - Fill a Special Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a non-negative integer n representing a 2n x 2n grid. You must fill the grid with integers from 0 to 22n - 1 to make it special. A grid is special if it satisfies all the following conditions:
 *
 *
 * All numbers in the top-right quadrant are smaller than those in the bottom-right quadrant.
 *
 * All numbers in the bottom-right quadrant are smaller than those in the bottom-left quadrant.
 *
 * All numbers in the bottom-left quadrant are smaller than those in the top-left quadrant.
 *
 * Each of its quadrants is also a special grid.
 *
 * Return the special 2n x 2n grid.
 *
 *
 * Note: Any 1x1 grid is special.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 0
 *
 *
 * Output: [[0]]
 *
 *
 * Explanation:
 *
 *
 * The only number that can be placed is 0, and there is only one possible position in the grid.
 *
 * Example 2:
 *
 * Input: n = 1
 *
 *
 * Output: [[3,0],[2,1]]
 *
 *
 * Explanation:
 *
 *
 * The numbers in each quadrant are:
 *
 *
 * Top-right: 0
 *
 * Bottom-right: 1
 *
 * Bottom-left: 2
 *
 * Top-left: 3
 *
 * Since 0 &lt; 1 &lt; 2 &lt; 3, this satisfies the given constraints.
 *
 * Example 3:
 *
 * Input: n = 2
 *
 *
 * Output: [[15,12,3,0],[14,13,2,1],[11,8,7,4],[10,9,6,5]]
 *
 *
 * Explanation:
 *
 * The numbers in each quadrant are:
 *
 *
 * Top-right: 3, 0, 2, 1
 *
 * Bottom-right: 7, 4, 6, 5
 *
 * Bottom-left: 11, 8, 10, 9
 *
 * Top-left: 15, 12, 14, 13
 *
 * max(3, 0, 2, 1) &lt; min(7, 4, 6, 5)
 *
 * max(7, 4, 6, 5) &lt; min(11, 8, 10, 9)
 *
 * max(11, 8, 10, 9) &lt; min(15, 12, 14, 13)
 *
 * This satisfies the first three requirements. Additionally, each quadrant is also a special grid. Thus, this is a special grid.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve the problem recursively.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/fill-a-special-grid/">LeetCode #3537</a>
 */
public class FillASpecialGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Fill a Special Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== FillASpecialGrid ===");
        FillASpecialGrid sol = new FillASpecialGrid();
        System.out.println(sol.solve(null));
    }
}
