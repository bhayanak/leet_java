package org.leetcode.easy;


/**
 * <b>#1252 - Cells with Odd Values in a Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on the matrix.
 *
 *
 * For each location indices[i], do both of the following:
 *
 *
 * Increment all the cells on row ri.
 *
 * Increment all the cells on column ci.
 *
 * Given m, n, and indices, return the number of odd-valued cells in the matrix after applying the increment to all locations in indices.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: m = 2, n = 3, indices = [[0,1],[1,1]]
 * Output: 6
 * Explanation: Initial matrix = [[0,0,0],[0,0,0]].
 * After applying first increment it becomes [[1,2,1],[0,1,0]].
 * The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
 *
 * Example 2:
 *
 * Input: m = 2, n = 2, indices = [[1,1],[0,0]]
 * Output: 0
 * Explanation: Final matrix = [[2,2],[2,2]]. There are no odd numbers in the final matrix.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m, n &lt;= 50
 *
 * 1 &lt;= indices.length &lt;= 100
 *
 * 0 &lt;= ri &lt; m
 *
 * 0 &lt;= ci &lt; n
 *
 *
 *
 * Follow up: Could you solve this in O(n + m + indices.length) time with only O(n + m) extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulation : With small constraints, it is possible to apply changes to each row and column and count odd cells after applying it.
 * Hint 2: You can accumulate the number you should add to each row and column and then you can count the number of odd cells.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/">LeetCode #1252</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class CellsWithOddValuesInAMatrix {

    /**
     * Solves the problem: Odd cells.
     *
     * @param m the m (int)
     * @param n the n (int)
     * @param indices the indices (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m], cols = new int[n];
        for (int[] idx : indices) { rows[idx[0]]++; cols[idx[1]]++; }
        int count = 0;
        for (int r : rows) for (int c : cols) if ((r+c)%2==1) count++;
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        CellsWithOddValuesInAMatrix sol = new CellsWithOddValuesInAMatrix();
                System.out.println(sol.oddCells(2,3,new int[][]{{0,1},{1,1}})); // 6
                System.out.println(sol.oddCells(2,2,new int[][]{{1,1},{0,0}})); // 0
    }
}
