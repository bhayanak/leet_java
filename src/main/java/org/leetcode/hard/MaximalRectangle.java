package org.leetcode.hard;

/**
 * <b>#85 - Maximal Rectangle</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Stack, Matrix, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
 * Output: 6
 * Explanation: The maximal rectangle is shown in the above picture.
 * 
 * Example 2:
 * 
 * Input: matrix = [["0"]]
 * Output: 0
 * 
 * Example 3:
 * 
 * Input: matrix = [["1"]]
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * rows == matrix.length
 * 	
 * cols == matrix[i].length
 * 	
 * 1 &lt;= rows, cols &lt;= 200
 * 	
 * matrix[i][j] is '0' or '1'.
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
 * @see <a href="https://leetcode.com/problems/maximal-rectangle/">LeetCode #85</a>
 */
public class MaximalRectangle {

    /**
     * TODO: Implement solution for "Maximal Rectangle".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Maximal Rectangle");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        MaximalRectangle sol = new MaximalRectangle();
        System.out.println(sol.solve(null));
    }
}
