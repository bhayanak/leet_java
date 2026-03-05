package org.leetcode.medium;


/**
 * <b>#3446 - Sort Matrix by Diagonals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an n x n square matrix of integers grid. Return the matrix such that:
 *
 *
 * The diagonals in the bottom-left triangle (including the middle diagonal) are sorted in non-increasing order.
 *
 * The diagonals in the top-right triangle are sorted in non-decreasing order.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,7,3],[9,8,2],[4,5,6]]
 *
 *
 * Output: [[8,2,3],[9,6,7],[4,5,1]]
 *
 *
 * Explanation:
 *
 * The diagonals with a black arrow (bottom-left triangle) should be sorted in non-increasing order:
 *
 *
 * [1, 8, 6] becomes [8, 6, 1].
 *
 * [9, 5] and [4] remain unchanged.
 *
 * The diagonals with a blue arrow (top-right triangle) should be sorted in non-decreasing order:
 *
 *
 * [7, 2] becomes [2, 7].
 *
 * [3] remains unchanged.
 *
 * Example 2:
 *
 * Input: grid = [[0,1],[1,2]]
 *
 *
 * Output: [[2,1],[1,0]]
 *
 *
 * Explanation:
 *
 * The diagonals with a black arrow must be non-increasing, so [0, 2] is changed to [2, 0]. The other diagonals are already in the correct order.
 *
 * Example 3:
 *
 * Input: grid = [[1]]
 *
 *
 * Output: [[1]]
 *
 *
 * Explanation:
 *
 *
 * Diagonals with exactly one element are already in order, so no changes are needed.
 *
 *
 *
 * Constraints:
 *
 *
 * grid.length == grid[i].length == n
 *
 * 1 &lt;= n &lt;= 10
 *
 * -105 &lt;= grid[i][j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a data structure to store all values in each diagonal.
 * Hint 2: Sort and replace them in the matrix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/sort-matrix-by-diagonals/">LeetCode #3446</a>
 */
public class SortMatrixByDiagonals {

    /**
     * Sorts Sort array by moving items to empty space.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int sortArrayByMovingItemsToEmptySpace(int[] nums) {
        // Count cycles
        int n=nums.length;
        // sorted target: nums[i]=i
        boolean[] visited=new boolean[n]; int nonfix=0;
        for (int i=0;i<n;i++) if (!visited[i]&&nums[i]!=i) {
            nonfix++; int j=i;
            while (!visited[j]){visited[j]=true;j=nums[j];}
        }
        return nonfix;
    }

    public static void main(String[] args) {
        SortMatrixByDiagonals sol = new SortMatrixByDiagonals();
        System.out.println(sol.sortArrayByMovingItemsToEmptySpace(new int[]{1,2,3}));
    }
}
