package org.leetcode.medium;


/**
 * <b>#2352 - Equal Row and Column Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
 *
 *
 * A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[3,2,1],[1,7,6],[2,7,7]]
 * Output: 1
 * Explanation: There is 1 equal row and column pair:
 * - (Row 2, Column 1): [2,7,7]
 *
 * Example 2:
 *
 * Input: grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]
 * Output: 3
 * Explanation: There are 3 equal row and column pairs:
 * - (Row 0, Column 0): [3,1,2,2]
 * - (Row 2, Column 2): [2,4,2,2]
 * - (Row 3, Column 2): [2,4,2,2]
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == grid[i].length
 *
 * 1 &lt;= n &lt;= 200
 *
 * 1 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use nested loops to compare every row against every column.
 * Hint 2: Another loop is necessary to compare the row and column element by element.
 * Hint 3: It is also possible to hash the arrays and compare the hashed values instead.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/equal-row-and-column-pairs/">LeetCode #2352</a>
 */
public class EqualRowAndColumnPairs {

    /**
     * Solves the problem: Equal pairs.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param grid the grid (int[][])
     * @return the computed int result
     */
    public int equalPairs(int[][] grid) {
        java.util.Map<String,Integer> rowMap=new java.util.HashMap<>();
        int n=grid.length;
        for (int[] row:grid) rowMap.merge(java.util.Arrays.toString(row),1,Integer::sum);
        int count=0;
        for (int j=0;j<n;j++) {
            int[] col=new int[n];
            for (int i=0;i<n;i++) col[i]=grid[i][j];
            count+=rowMap.getOrDefault(java.util.Arrays.toString(col),0);
        }
        return count;
    }

    public static void main(String[] args) {
        EqualRowAndColumnPairs sol = new EqualRowAndColumnPairs();
                System.out.println(sol.equalPairs(new int[][]{{3,2,1},{1,7,6},{2,7,7}})); // 1
                System.out.println(sol.equalPairs(new int[][]{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}})); // 3
    }
}
