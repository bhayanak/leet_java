package org.leetcode.medium;

/**
 * <b>#74 - Search a 2D Matrix</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer matrix matrix with the following two properties:
 * 
 * 	
 * Each row is sorted in non-decreasing order.
 * 	
 * The first integer of each row is greater than the last integer of the previous row.
 * 
 * Given an integer target, return true if target is in matrix or false otherwise.
 * 
 * 
 * You must write a solution in O(log(m * n)) time complexity.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
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
 * 1 &lt;= m, n &lt;= 100
 * 	
 * -104 &lt;= matrix[i][j], target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Treat the matrix as a 1-D sorted array; map index mid to (mid/n, mid%n).
 * Standard binary search gives O(log(m·n)).
 *
 * <h2>Complexity</h2>
* Time: O(log(m·n))  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/search-a-2d-matrix/">LeetCode #74</a>
 */
public class SearchA2dMatrix {

    /**
     * Searches for target in an m×n matrix where each row and column is sorted.
     *
     * @param matrix m×n sorted matrix (each row sorted, first element &gt; last row's last)
     * @param target value to find
     * @return       true if target exists
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int lo = 0, hi = m * n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int val = matrix[mid / n][mid % n];
            if (val == target) return true;
            if (val < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SearchA2dMatrix ===");
        System.out.println("See class methods for usage.");
    }
}
