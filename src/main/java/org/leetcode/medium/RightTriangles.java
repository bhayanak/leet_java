package org.leetcode.medium;


/**
 * <b>#3128 - Right Triangles</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Combinatorics, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D boolean matrix grid.
 *
 *
 * A collection of 3 elements of grid is a right triangle if one of its elements is in the same row with another element and in the same column with the third element. The 3 elements may not be next to each other.
 *
 *
 * Return an integer that is the number of right triangles that can be made with 3 elements of grid such that all of them have a value of 1.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * 			0
 * 			1
 * 			1
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * 			0
 * 			1
 * 			1
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * 			0
 * 			1
 * 			1
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 *
 *
 *
 *
 * Input: grid = [[0,1,0],[0,1,1],[0,1,0]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are two right triangles with elements of the value 1. Notice that the blue ones do not form a right triangle because the 3 elements are in the same column.
 *
 * Example 2:
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 * 			0
 *
 *
 *
 *
 * 			0
 * 			1
 * 			0
 * 			1
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 * 			0
 *
 *
 *
 *
 * Input: grid = [[1,0,0,0],[0,1,0,1],[1,0,0,0]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no right triangles with elements of the value 1.  Notice that the blue ones do not form a right triangle.
 *
 * Example 3:
 *
 *
 *
 *
 * 			1
 * 			0
 * 			1
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 *
 *
 *
 *
 *
 *
 *
 * 			1
 * 			0
 * 			1
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 *
 *
 *
 *
 * 			1
 * 			0
 * 			0
 *
 *
 *
 *
 * Input: grid = [[1,0,1],[1,0,0],[1,0,0]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are two right triangles with elements of the value 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length &lt;= 1000
 *
 * 1 &lt;= grid[i].length &lt;= 1000
 *
 * 0 &lt;= grid[i][j] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>grid[x][y]</code> is 1, it can form a right triangle with an element of <code>grid</code> with value 1 in the same row and an element of <code>grid</code> with value 1 in the same column.
 * Hint 2: So we just need to count the number of 1s in each row and column.
 * Hint 3: For each <code>x, y</code> with <code>grid[x][y] = 1</code> if there are <code>row[x]</code> 1s in the row <code>x</code> and <code>col[y]</code> 1s in column <code>y</code>, the answer should be added by <code>(row[x] - 1) * (col[y] - 1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Combinatorics, Counting).
 *
 * @see <a href="https://leetcode.com/problems/right-triangles/">LeetCode #3128</a>
 */
public class RightTriangles {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Right Triangles");
    }

    public static void main(String[] args) {
        System.out.println("=== RightTriangles ===");
        RightTriangles sol = new RightTriangles();
        System.out.println(sol.solve(null));
    }
}
