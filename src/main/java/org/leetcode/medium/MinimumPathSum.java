package org.leetcode.medium;

/**
 * <b>#64 - Minimum Path Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
 * 
 * 
 * Note: You can only move either down or right at any point in time.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
 * 
 * Example 2:
 * 
 * Input: grid = [[1,2,3],[4,5,6]]
 * Output: 12
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
 * 1 &lt;= m, n &lt;= 200
 * 	
 * 0 &lt;= grid[i][j] &lt;= 200
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/minimum-path-sum/">LeetCode #64</a>
 */
public class MinimumPathSum {

    /**
     * TODO: Implement solution for "Minimum Path Sum".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Minimum Path Sum");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        MinimumPathSum sol = new MinimumPathSum();
        System.out.println(sol.solve(null));
    }
}
