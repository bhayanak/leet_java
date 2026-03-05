package org.leetcode.medium;


/**
 * <b>#2580 - Count Ways to Group Overlapping Ranges</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array ranges where ranges[i] = [starti, endi] denotes that all integers between starti and endi (both inclusive) are contained in the ith range.
 *
 *
 * You are to split ranges into two (possibly empty) groups such that:
 *
 *
 * Each range belongs to exactly one group.
 *
 * Any two overlapping ranges must belong to the same group.
 *
 * Two ranges are said to be overlapping if there exists at least one integer that is present in both ranges.
 *
 *
 * For example, [1, 3] and [2, 5] are overlapping because 2 and 3 occur in both ranges.
 *
 * Return the total number of ways to split ranges into two groups. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: ranges = [[6,10],[5,15]]
 * Output: 2
 * Explanation: 
 * The two ranges are overlapping, so they must be in the same group.
 * Thus, there are two possible ways:
 * - Put both the ranges together in group 1.
 * - Put both the ranges together in group 2.
 *
 * Example 2:
 *
 * Input: ranges = [[1,3],[10,20],[2,5],[4,8]]
 * Output: 4
 * Explanation: 
 * Ranges [1,3], and [2,5] are overlapping. So, they must be in the same group.
 * Again, ranges [2,5] and [4,8] are also overlapping. So, they must also be in the same group. 
 * Thus, there are four possible ways to group them:
 * - All the ranges in group 1.
 * - All the ranges in group 2.
 * - Ranges [1,3], [2,5], and [4,8] in group 1 and [10,20] in group 2.
 * - Ranges [1,3], [2,5], and [4,8] in group 2 and [10,20] in group 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= ranges.length &lt;= 105
 *
 * ranges[i].length == 2
 *
 * 0 &lt;= starti &lt;= endi &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use sorting here?
 * Hint 2: Sort the ranges and merge the overlapping ranges. Then count number of non-overlapping ranges.
 * Hint 3: How many ways can we group these non-overlapping ranges?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/count-ways-to-group-overlapping-ranges/">LeetCode #2580</a>
 */
public class CountWaysToGroupOverlappingRanges {

    /**
     * Counts Count ways.
     * Sorts the input first to enable efficient processing.
     *
     * @param ranges the ranges (int[][])
     * @return the computed int result
     */
    public int countWays(int[][] ranges) {
        java.util.Arrays.sort(ranges,(a,b)->a[0]-b[0]);
        int groups=1, end=ranges[0][1];
        for (int i=1;i<ranges.length;i++) {
            if (ranges[i][0]>end) { groups++; end=ranges[i][1]; }
            else end=Math.max(end,ranges[i][1]);
        }
        long res=1; int MOD=1000000007;
        for (int i=0;i<groups;i++) res=res*2%MOD;
        return (int)res;
    }

    public static void main(String[] args) {
        CountWaysToGroupOverlappingRanges sol = new CountWaysToGroupOverlappingRanges();
                System.out.println(sol.countWays(new int[][]{{1,3},{10,20},{2,5},{4,8}})); // 4
                System.out.println(sol.countWays(new int[][]{{1,2},{2,3},{4,8},{4,9}}));   // 2
    }
}
