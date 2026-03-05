package org.leetcode.medium;


/**
 * <b>#1277 - Count Square Submatrices with All Ones</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix =
 * [
 *   [0,1,1,1],
 *   [1,1,1,1],
 *   [0,1,1,1]
 * ]
 * Output: 15
 * Explanation: 
 * There are 10 squares of side 1.
 * There are 4 squares of side 2.
 * There is  1 square of side 3.
 * Total number of squares = 10 + 4 + 1 = 15.
 *
 * Example 2:
 *
 * Input: matrix = 
 * [
 *   [1,0,1],
 *   [1,1,0],
 *   [1,1,0]
 * ]
 * Output: 7
 * Explanation: 
 * There are 6 squares of side 1.  
 * There is 1 square of side 2. 
 * Total number of squares = 6 + 1 = 7.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 300
 *
 * 1 &lt;= arr[0].length &lt;= 300
 *
 * 0 &lt;= arr[i][j] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create an additive table that counts the sum of elements of submatrix with the superior corner at (0,0).
 * Hint 2: Loop over all subsquares in O(n^3) and check if the sum make the whole array to be ones, if it checks then add 1 to the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-square-submatrices-with-all-ones/">LeetCode #1277</a>
 */
public class CountSquareSubmatricesWithAllOnes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Square Submatrices with All Ones");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSquareSubmatricesWithAllOnes ===");
        CountSquareSubmatricesWithAllOnes sol = new CountSquareSubmatricesWithAllOnes();
        System.out.println(sol.solve(null));
    }
}
