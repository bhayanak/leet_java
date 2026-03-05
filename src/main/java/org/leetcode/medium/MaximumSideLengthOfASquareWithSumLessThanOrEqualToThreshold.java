package org.leetcode.medium;


/**
 * <b>#1292 - Maximum Side Length of a Square with Sum Less than or Equal to Threshold</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m x n matrix mat and an integer threshold, return the maximum side-length of a square with a sum less than or equal to threshold or return 0 if there is no such square.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,1,3,2,4,3,2],[1,1,3,2,4,3,2],[1,1,3,2,4,3,2]], threshold = 4
 * Output: 2
 * Explanation: The maximum side length of square with sum less than or equal to 4 is 2 as shown.
 *
 * Example 2:
 *
 * Input: mat = [[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2],[2,2,2,2,2]], threshold = 1
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n == mat[i].length
 *
 * 1 &lt;= m, n &lt;= 300
 *
 * 0 &lt;= mat[i][j] &lt;= 104
 *
 * 0 &lt;= threshold &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store prefix sum of all grids in another 2D array.
 * Hint 2: Try all possible solutions and if you cannot find one return 0.
 * Hint 3: If x is a valid answer then any y &lt; x is also valid answer. Use binary search to find answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Matrix, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/">LeetCode #1292</a>
 */
public class MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Side Length of a Square with Sum Less than or Equal to Threshold");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold ===");
        MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold sol = new MaximumSideLengthOfASquareWithSumLessThanOrEqualToThreshold();
        System.out.println(sol.solve(null));
    }
}
