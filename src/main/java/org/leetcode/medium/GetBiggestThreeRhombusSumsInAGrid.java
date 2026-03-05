package org.leetcode.medium;


/**
 * <b>#1878 - Get Biggest Three Rhombus Sums in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Sorting, Heap (Priority Queue), Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix grid​​​.
 *
 *
 * A rhombus sum is the sum of the elements that form the border of a regular rhombus shape in grid​​​. The rhombus must have the shape of a square rotated 45 degrees with each of the corners centered in a grid cell. Below is an image of four valid rhombus shapes with the corresponding colored cells that should be included in each rhombus sum:
 *
 *
 * Note that the rhombus can have an area of 0, which is depicted by the purple rhombus in the bottom right corner.
 *
 *
 * Return the biggest three distinct rhombus sums in the grid in descending order. If there are less than three distinct values, return all of them.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[3,4,5,1,3],[3,3,4,2,3],[20,30,200,40,10],[1,5,5,4,1],[4,3,2,2,5]]
 * Output: [228,216,211]
 * Explanation: The rhombus shapes for the three biggest distinct rhombus sums are depicted above.
 * - Blue: 20 + 3 + 200 + 5 = 228
 * - Red: 200 + 2 + 10 + 4 = 216
 * - Green: 5 + 200 + 4 + 2 = 211
 *
 * Example 2:
 *
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]]
 * Output: [20,9,8]
 * Explanation: The rhombus shapes for the three biggest distinct rhombus sums are depicted above.
 * - Blue: 4 + 2 + 6 + 8 = 20
 * - Red: 9 (area 0 rhombus in the bottom right corner)
 * - Green: 8 (area 0 rhombus in the bottom middle)
 *
 * Example 3:
 *
 * Input: grid = [[7,7,7]]
 * Output: [7]
 * Explanation: All three possible rhombus sums are the same, so return [7].
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
 * 1 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You need to maintain only the biggest 3 distinct sums
 * Hint 2: The limits are small enough for you to iterate over all rhombus sizes then iterate over all possible borders to get the sums
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sorting, Heap (Priority Queue), Matrix, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/get-biggest-three-rhombus-sums-in-a-grid/">LeetCode #1878</a>
 */
public class GetBiggestThreeRhombusSumsInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Get Biggest Three Rhombus Sums in a Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== GetBiggestThreeRhombusSumsInAGrid ===");
        GetBiggestThreeRhombusSumsInAGrid sol = new GetBiggestThreeRhombusSumsInAGrid();
        System.out.println(sol.solve(null));
    }
}
