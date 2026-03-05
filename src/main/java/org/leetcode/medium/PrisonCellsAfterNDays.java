package org.leetcode.medium;


/**
 * <b>#957 - Prison Cells After N Days</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are 8 prison cells in a row and each cell is either occupied or vacant.
 *
 *
 * Each day, whether the cell is occupied or vacant changes according to the following rules:
 *
 *
 * If a cell has two adjacent neighbors that are both occupied or both vacant, then the cell becomes occupied.
 *
 * Otherwise, it becomes vacant.
 *
 * Note that because the prison is a row, the first and the last cells in the row can't have two adjacent neighbors.
 *
 *
 * You are given an integer array cells where cells[i] == 1 if the ith cell is occupied and cells[i] == 0 if the ith cell is vacant, and you are given an integer n.
 *
 *
 * Return the state of the prison after n days (i.e., n such changes described above).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cells = [0,1,0,1,1,0,0,1], n = 7
 * Output: [0,0,1,1,0,0,0,0]
 * Explanation: The following table summarizes the state of the prison on each day:
 * Day 0: [0, 1, 0, 1, 1, 0, 0, 1]
 * Day 1: [0, 1, 1, 0, 0, 0, 0, 0]
 * Day 2: [0, 0, 0, 0, 1, 1, 1, 0]
 * Day 3: [0, 1, 1, 0, 0, 1, 0, 0]
 * Day 4: [0, 0, 0, 0, 0, 1, 0, 0]
 * Day 5: [0, 1, 1, 1, 0, 1, 0, 0]
 * Day 6: [0, 0, 1, 0, 1, 1, 0, 0]
 * Day 7: [0, 0, 1, 1, 0, 0, 0, 0]
 *
 * Example 2:
 *
 * Input: cells = [1,0,0,1,0,0,1,0], n = 1000000000
 * Output: [0,0,1,1,1,1,1,0]
 *
 *
 *
 * Constraints:
 *
 *
 * cells.length == 8
 *
 * cells[i] is either 0 or 1.
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/prison-cells-after-n-days/">LeetCode #957</a>
 */
public class PrisonCellsAfterNDays {

    /**
     * TODO: Implement "Prison Cells After N Days".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Prison Cells After N Days");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac PrisonCellsAfterNDays.java &amp;&amp; java org.leetcode.medium.PrisonCellsAfterNDays</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== PrisonCellsAfterNDays ===");
        PrisonCellsAfterNDays sol = new PrisonCellsAfterNDays();
        System.out.println(sol.solve(null));
    }
}
