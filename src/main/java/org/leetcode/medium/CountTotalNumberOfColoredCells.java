package org.leetcode.medium;


/**
 * <b>#2579 - Count Total Number of Colored Cells</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n, indicating that you must do the following routine for n minutes:
 *
 *
 * At the first minute, color any arbitrary unit cell blue.
 *
 * Every minute thereafter, color blue every uncolored cell that touches a blue cell.
 *
 * Below is a pictorial representation of the state of the grid after minutes 1, 2, and 3.
 *
 *
 * Return the number of colored cells at the end of n minutes.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 1
 * Output: 1
 * Explanation: After 1 minute, there is only 1 blue cell, so we return 1.
 *
 * Example 2:
 *
 * Input: n = 2
 * Output: 5
 * Explanation: After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Derive a mathematical relation between total number of colored cells and the time elapsed in minutes.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/count-total-number-of-colored-cells/">LeetCode #2579</a>
 */
public class CountTotalNumberOfColoredCells {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Total Number of Colored Cells");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTotalNumberOfColoredCells ===");
        CountTotalNumberOfColoredCells sol = new CountTotalNumberOfColoredCells();
        System.out.println(sol.solve(null));
    }
}
