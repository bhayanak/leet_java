package org.leetcode.easy;


/**
 * <b>#2500 - Delete Greatest Value in Each Row</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue), Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n matrix grid consisting of positive integers.
 *
 *
 * Perform the following operation until grid becomes empty:
 *
 *
 * Delete the element with the greatest value from each row. If multiple such elements exist, delete any of them.
 *
 * Add the maximum of deleted elements to the answer.
 *
 * Note that the number of columns decreases by one after each operation.
 *
 *
 * Return the answer after performing the operations described above.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,4],[3,3,1]]
 * Output: 8
 * Explanation: The diagram above shows the removed values in each step.
 * - In the first operation, we remove 4 from the first row and 3 from the second row (notice that, there are two cells with value 3 and we can remove any of them). We add 4 to the answer.
 * - In the second operation, we remove 2 from the first row and 3 from the second row. We add 3 to the answer.
 * - In the third operation, we remove 1 from the first row and 1 from the second row. We add 1 to the answer.
 * The final answer = 4 + 3 + 1 = 8.
 *
 * Example 2:
 *
 * Input: grid = [[10]]
 * Output: 10
 * Explanation: The diagram above shows the removed values in each step.
 * - In the first operation, we remove 10 from the first row. We add 10 to the answer.
 * The final answer = 10.
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
 * 1 &lt;= m, n &lt;= 50
 *
 * 1 &lt;= grid[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate from the first to the last row and if there exist some unmarked cells, take a maximum from them and mark that cell as visited.
 * Hint 2: Add a maximum of newly marked cells to answer and repeat that operation until the whole matrix becomes marked.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue), Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/delete-greatest-value-in-each-row/">LeetCode #2500</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class DeleteGreatestValueInEachRow {

    /**
     * Solves the problem: Delete greatest value.
     * Sorts the input first to enable efficient processing.
     *
     * @param grid the grid (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int deleteGreatestValue(int[][] grid) {
        for (int[] row:grid) java.util.Arrays.sort(row);
        int total=0, m=grid.length, n=grid[0].length;
        for (int j=n-1;j>=0;j--) {
            int max=0;
            for (int[] row:grid) max=Math.max(max,row[j]);
            total+=max;
        }
        return total;
    }

    public static void main(String[] args) {
        DeleteGreatestValueInEachRow sol = new DeleteGreatestValueInEachRow();
                System.out.println(sol.deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}})); // 8
                System.out.println(sol.deleteGreatestValue(new int[][]{{10}})); // 10
    }
}
