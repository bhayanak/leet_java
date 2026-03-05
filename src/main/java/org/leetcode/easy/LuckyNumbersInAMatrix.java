package org.leetcode.easy;


/**
 * <b>#1380 - Lucky Numbers in a Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 *
 *
 * A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 2:
 *
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 *
 * Example 3:
 *
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 * Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
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
 * 1 &lt;= n, m &lt;= 50
 *
 * 1 &lt;= matrix[i][j] &lt;= 105.
 *
 * All elements in the matrix are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find out and save the minimum of each row and maximum of each column in two lists.
 * Hint 2: Then scan through the whole matrix to identify the elements that satisfy the criteria.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/lucky-numbers-in-a-matrix/">LeetCode #1380</a>
 */
public class LuckyNumbersInAMatrix {

    public java.util.List<Integer> luckyNumbers(int[][] matrix) {
        java.util.List<Integer> res = new java.util.ArrayList<>();
        int m=matrix.length, n=matrix[0].length;
        for (int i=0;i<m;i++) {
            int minVal=matrix[i][0], minCol=0;
            for (int j=1;j<n;j++) if (matrix[i][j]<minVal) { minVal=matrix[i][j]; minCol=j; }
            // Check if it's max in its column
            boolean isMax=true;
            for (int r=0;r<m;r++) if (matrix[r][minCol]>minVal) { isMax=false; break; }
            if (isMax) res.add(minVal);
        }
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        LuckyNumbersInAMatrix sol = new LuckyNumbersInAMatrix();
        System.out.println("No method available");
    }
}
