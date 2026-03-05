package org.leetcode.easy;


/**
 * <b>#2965 - Find Missing and Repeated Values</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer matrix grid of size n * n with values in the range [1, n2]. Each integer appears exactly once except a which appears twice and b which is missing. The task is to find the repeating and missing numbers a and b.
 *
 *
 * Return a 0-indexed integer array ans of size 2 where ans[0] equals to a and ans[1] equals to b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,3],[2,2]]
 * Output: [2,4]
 * Explanation: Number 2 is repeated and number 4 is missing so the answer is [2,4].
 *
 * Example 2:
 *
 * Input: grid = [[9,1,7],[8,9,2],[3,4,6]]
 * Output: [9,5]
 * Explanation: Number 9 is repeated and number 5 is missing so the answer is [9,5].
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n == grid.length == grid[i].length &lt;= 50
 *
 * 1 &lt;= grid[i][j] &lt;= n * n
 *
 * For all x that 1 &lt;= x &lt;= n * n there is exactly one x that is not equal to any of the grid members.
 *
 * For all x that 1 &lt;= x &lt;= n * n there is exactly one x that is equal to exactly two of the grid members.
 *
 * For all x that 1 &lt;= x &lt;= n * n except two of them there is exactly one pair of i, j that 0 &lt;= i, j &lt;= n - 1 and grid[i][j] == x.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/find-missing-and-repeated-values/">LeetCode #2965</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class FindMissingAndRepeatedValues {

    /**
     * Finds Find missing and repeated values.
     *
     * @param grid the grid (int[][])
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length; int[] cnt=new int[n*n+1];
        for (int[] row:grid) for (int v:row) cnt[v]++;
        int a=-1, b=-1;
        for (int i=1;i<=n*n;i++) { if (cnt[i]==2) a=i; if (cnt[i]==0) b=i; }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        FindMissingAndRepeatedValues sol = new FindMissingAndRepeatedValues();
                System.out.println(java.util.Arrays.toString(sol.findMissingAndRepeatedValues(new int[][]{{1,3},{2,2}}))); // [2,4]
                System.out.println(java.util.Arrays.toString(sol.findMissingAndRepeatedValues(new int[][]{{9,1,7},{8,9,2},{3,4,6}}))); // [9,5]
    }
}
