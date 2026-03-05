package org.leetcode.medium;


/**
 * <b>#2711 - Difference of Number of Distinct Values on Diagonals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D grid of size m x n, you should find the matrix answer of size m x n.
 *
 *
 * The cell answer[r][c] is calculated by looking at the diagonal values of the cell grid[r][c]:
 *
 *
 * Let leftAbove[r][c] be the number of distinct values on the diagonal to the left and above the cell grid[r][c] not including the cell grid[r][c] itself.
 *
 * Let rightBelow[r][c] be the number of distinct values on the diagonal to the right and below the cell grid[r][c], not including the cell grid[r][c] itself.
 *
 * Then answer[r][c] = |leftAbove[r][c] - rightBelow[r][c]|.
 *
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until the end of the matrix is reached.
 *
 *
 * For example, in the below diagram the diagonal is highlighted using the cell with indices (2, 3) colored gray:
 *
 *
 *
 *
 * Red-colored cells are left and above the cell.
 *
 * Blue-colored cells are right and below the cell.
 *
 *
 *
 * Return the matrix answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2,3],[3,1,5],[3,2,1]]
 *
 *
 * Output: Output: [[1,1,0],[1,0,1],[0,1,1]]
 *
 *
 * Explanation:
 *
 *
 * To calculate the answer cells:
 *
 *
 *
 *
 *
 * 			answer
 * 			left-above elements
 * 			leftAbove
 * 			right-below elements
 * 			rightBelow
 * 			|leftAbove - rightBelow|
 *
 *
 *
 *
 *
 *
 * 			[0][0]
 * 			[]
 * 			0
 * 			[grid[1][1], grid[2][2]]
 * 			|{1, 1}| = 1
 * 			1
 *
 *
 *
 *
 * 			[0][1]
 * 			[]
 * 			0
 * 			[grid[1][2]]
 * 			|{5}| = 1
 * 			1
 *
 *
 *
 *
 * 			[0][2]
 * 			[]
 * 			0
 * 			[]
 * 			0
 * 			0
 *
 *
 *
 *
 * 			[1][0]
 * 			[]
 * 			0
 * 			[grid[2][1]]
 * 			|{2}| = 1
 * 			1
 *
 *
 *
 *
 * 			[1][1]
 * 			[grid[0][0]]
 * 			|{1}| = 1
 * 			[grid[2][2]]
 * 			|{1}| = 1
 * 			0
 *
 *
 *
 *
 * 			[1][2]
 * 			[grid[0][1]]
 * 			|{2}| = 1
 * 			[]
 * 			0
 * 			1
 *
 *
 *
 *
 * 			[2][0]
 * 			[]
 * 			0
 * 			[]
 * 			0
 * 			0
 *
 *
 *
 *
 * 			[2][1]
 * 			[grid[1][0]]
 * 			|{3}| = 1
 * 			[]
 * 			0
 * 			1
 *
 *
 *
 *
 * 			[2][2]
 * 			[grid[0][0], grid[1][1]]
 * 			|{1, 1}| = 1
 * 			[]
 * 			0
 * 			1
 *
 *
 *
 *
 * Example 2:
 *
 * Input: grid = [[1]]
 *
 *
 * Output: Output: [[0]]
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
 * 1 &lt;= m, n, grid[i][j] &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the set to count the number of distinct elements on diagonals.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/difference-of-number-of-distinct-values-on-diagonals/">LeetCode #2711</a>
 */
public class DifferenceOfNumberOfDistinctValuesOnDiagonals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Difference of Number of Distinct Values on Diagonals");
    }

    public static void main(String[] args) {
        System.out.println("=== DifferenceOfNumberOfDistinctValuesOnDiagonals ===");
        DifferenceOfNumberOfDistinctValuesOnDiagonals sol = new DifferenceOfNumberOfDistinctValuesOnDiagonals();
        System.out.println(sol.solve(null));
    }
}
