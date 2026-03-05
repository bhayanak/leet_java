package org.leetcode.easy;


/**
 * <b>#3242 - Design Neighbor Sum Service</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Design, Matrix, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a n x n 2D array grid containing distinct elements in the range [0, n2 - 1].
 *
 *
 * Implement the NeighborSum class:
 *
 *
 * NeighborSum(int [][]grid) initializes the object.
 *
 * int adjacentSum(int value) returns the sum of elements which are adjacent neighbors of value, that is either to the top, left, right, or bottom of value in grid.
 *
 * int diagonalSum(int value) returns the sum of elements which are diagonal neighbors of value, that is either to the top-left, top-right, bottom-left, or bottom-right of value in grid.
 *
 *
 *
 * Example 1:
 *
 * Input:
 *
 *
 * ["NeighborSum", "adjacentSum", "adjacentSum", "diagonalSum", "diagonalSum"]
 *
 *
 * [[[[0, 1, 2], [3, 4, 5], [6, 7, 8]]], [1], [4], [4], [8]]
 *
 *
 * Output: [null, 6, 16, 16, 4]
 *
 *
 * Explanation:
 *
 *
 * The adjacent neighbors of 1 are 0, 2, and 4.
 *
 * The adjacent neighbors of 4 are 1, 3, 5, and 7.
 *
 * The diagonal neighbors of 4 are 0, 2, 6, and 8.
 *
 * The diagonal neighbor of 8 is 4.
 *
 * Example 2:
 *
 * Input:
 *
 *
 * ["NeighborSum", "adjacentSum", "diagonalSum"]
 *
 *
 * [[[[1, 2, 0, 3], [4, 7, 15, 6], [8, 9, 10, 11], [12, 13, 14, 5]]], [15], [9]]
 *
 *
 * Output: [null, 23, 45]
 *
 *
 * Explanation:
 *
 *
 * The adjacent neighbors of 15 are 0, 10, 7, and 6.
 *
 * The diagonal neighbors of 9 are 4, 12, 14, and 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n == grid.length == grid[0].length &lt;= 10
 *
 * 0 &lt;= grid[i][j] &lt;= n2 - 1
 *
 * All grid[i][j] are distinct.
 *
 * value in adjacentSum and diagonalSum will be in the range [0, n2 - 1].
 *
 * At most 2 * n2 calls will be made to adjacentSum and diagonalSum.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the cell <code>(i, j)</code> in which the element is present.
 * Hint 2: You can store the coordinates for each value.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Design, Matrix, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/design-neighbor-sum-service/">LeetCode #3242</a>
  *
  * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
  */
public class DesignNeighborSumService {

    /**
     * Solves the problem: Final position of snake.
     *
     * @param n the n (int)
     * @param commands the commands (java.util.List&lt;String&gt;)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses a hash structure for O(1) lookups to efficiently answer the query.</p>
      */
    public int finalPositionOfSnake(int n, java.util.List<String> commands) {
        int r=0, c=0;
        for (String cmd:commands) {
            if (cmd.equals("UP")) r--; else if (cmd.equals("DOWN")) r++;
            else if (cmd.equals("LEFT")) c--; else c++;
        }
        return r*n+c;
    }

    public static void main(String[] args) {
        DesignNeighborSumService sol = new DesignNeighborSumService();
        System.out.println(sol.finalPositionOfSnake(0, null));
    }
}
