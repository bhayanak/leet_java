package org.leetcode.medium;


/**
 * <b>#1738 - Find Kth Largest XOR Coordinate Value</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Bit Manipulation, Sorting, Heap (Priority Queue), Matrix, Prefix Sum, Quickselect</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D matrix of size m x n, consisting of non-negative integers. You are also given an integer k.
 *
 *
 * The value of coordinate (a, b) of the matrix is the XOR of all matrix[i][j] where 0 &lt;= i &lt;= a &lt; m and 0 &lt;= j &lt;= b &lt; n (0-indexed).
 *
 *
 * Find the kth largest value (1-indexed) of all the coordinates of matrix.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[5,2],[1,6]], k = 1
 * Output: 7
 * Explanation: The value of coordinate (0,1) is 5 XOR 2 = 7, which is the largest value.
 *
 * Example 2:
 *
 * Input: matrix = [[5,2],[1,6]], k = 2
 * Output: 5
 * Explanation: The value of coordinate (0,0) is 5 = 5, which is the 2nd largest value.
 *
 * Example 3:
 *
 * Input: matrix = [[5,2],[1,6]], k = 3
 * Output: 4
 * Explanation: The value of coordinate (1,0) is 5 XOR 1 = 4, which is the 3rd largest value.
 *
 *
 *
 * Constraints:
 *
 *
 * m == matrix.length
 *
 * n == matrix[i].length
 *
 * 1 &lt;= m, n &lt;= 1000
 *
 * 0 &lt;= matrix[i][j] &lt;= 106
 *
 * 1 &lt;= k &lt;= m * n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a 2D prefix sum to precalculate the xor-sum of the upper left submatrix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Bit Manipulation, Sorting, Heap (Priority Queue), Matrix, Prefix Sum, Quickselect).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-kth-largest-xor-coordinate-value/">LeetCode #1738</a>
 */
public class FindKthLargestXorCoordinateValue {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Kth Largest XOR Coordinate Value");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindKthLargestXorCoordinateValue ===");
        FindKthLargestXorCoordinateValue sol = new FindKthLargestXorCoordinateValue();
        System.out.println(sol.solve(null));
    }
}
