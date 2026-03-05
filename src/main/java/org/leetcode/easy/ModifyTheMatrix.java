package org.leetcode.easy;


/**
 * <b>#3033 - Modify the Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix called answer. Make answer equal to matrix, then replace each element with the value -1 with the maximum element in its respective column.
 *
 *
 * Return the matrix answer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
 * Output: [[1,2,9],[4,8,6],[7,8,9]]
 * Explanation: The diagram above shows the elements that are changed (in blue).
 * - We replace the value in the cell [1][1] with the maximum value in the column 1, that is 8.
 * - We replace the value in the cell [0][2] with the maximum value in the column 2, that is 9.
 *
 * Example 2:
 *
 * Input: matrix = [[3,-1],[5,2]]
 * Output: [[3,2],[5,2]]
 * Explanation: The diagram above shows the elements that are changed (in blue).
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
 * 2 &lt;= m, n &lt;= 50
 *
 * -1 &lt;= matrix[i][j] &lt;= 100
 *
 * The input is generated such that each column contains at least one non-negative integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/modify-the-matrix/">LeetCode #3033</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class ModifyTheMatrix {

    /**
     * Returns true if the input can Can sort array.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public boolean canSortArray(int[] nums) {
        // Can sort if each segment with same popcount is already sortable to be in order
        int n=nums.length;
        for (int i=0;i<n;i++) {
            int j=i;
            while (j<n&&Integer.bitCount(nums[j])==Integer.bitCount(nums[i])) j++;
            int[] seg=java.util.Arrays.copyOfRange(nums,i,j);
            java.util.Arrays.sort(seg);
            for (int k=0;k<seg.length;k++) nums[i+k]=seg[k];
            i=j-1;
        }
        for (int i=1;i<n;i++) if (nums[i]<nums[i-1]) return false;
        return true;
    }

    public static void main(String[] args) {
        ModifyTheMatrix sol = new ModifyTheMatrix();
        System.out.println(sol.canSortArray(new int[]{1,2,3}));
    }
}
