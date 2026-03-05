package org.leetcode.hard;


/**
 * <b>#3797 - Count Routes to Climb a Rectangular Grid</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string array grid of size n, where each string grid[i] has length m. The character grid[i][j] is one of the following symbols:
 *
 *
 * '.': The cell is available.
 *
 * '#': The cell is blocked.
 *
 * You want to count the number of different routes to climb grid. Each route must start from any cell in the bottom row (row n - 1) and end in the top row (row 0).
 *
 *
 * However, there are some constraints on the route.
 *
 *
 * You can only move from one available cell to another available cell.
 *
 * The Euclidean distance of each move is at most d, where d is an integer parameter given to you. The Euclidean distance between two cells (r1, c1), (r2, c2) is sqrt((r1 - r2)2 + (c1 - c2)2).
 *
 * Each move either stays on the same row or moves to the row directly above (from row r to r - 1).
 *
 * You cannot stay on the same row for two consecutive turns. If you stay on the same row in a move (and this move is not the last move), your next move must go to the row above.
 *
 * Return an integer denoting the number of such routes. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = ["..","#."], d = 1
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We label the cells we visit in the routes sequentially, starting from 1. The two routes are:
 *
 * .2
 * #1
 *
 * 32
 * #1
 *
 * We can move from the cell (1, 1) to the cell (0, 1) because the Euclidean distance is sqrt((1 - 0)2 + (1 - 1)2) = sqrt(1) &lt;= d.
 *
 *
 * However, we cannot move from the cell (1, 1) to the cell (0, 0) because the Euclidean distance is sqrt((1 - 0)2 + (1 - 0)2) = sqrt(2) &gt; d.
 *
 * Example 2:
 *
 * Input: grid = ["..","#."], d = 2
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Two of the routes are given in example 1. The other two routes are:
 *
 * 2.
 * #1
 *
 * 23
 * #1
 *
 * Note that we can move from (1, 1) to (0, 0) because the Euclidean distance is sqrt(2) &lt;= d.
 *
 * Example 3:
 *
 * Input: grid = ["#"], d = 750
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We cannot choose any cell as the starting cell. Therefore, there are no routes.
 *
 * Example 4:
 *
 * Input: grid = [".."], d = 1
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The possible routes are:
 *
 * .1
 *
 * 1.
 *
 * 12
 *
 * 21
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == grid.length &lt;= 750
 *
 * 1 &lt;= m == grid[i].length &lt;= 750
 *
 * grid[i][j] is '.' or '#'.
 *
 * 1 &lt;= d &lt;= 750
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Let <code>dp[r][c][0]</code> be the number of ways to reach <code>(r, c)</code> where the last move came from row <code>r + 1</code> (moved up), and let <code>dp[r][c][1]</code> be the number of ways where the last move stayed on row <code>r</code>.
 * Hint 3: Make computations faster using prefix sums over columns to aggregate contributions from cells within Euclidean distance <code>d</code>.
 * Hint 4: Combine <code>dp[r][c][0]</code> and <code>dp[r][c][1]</code> for all columns <code>c</code> in row <code>r</code> to produce the <code>dp</code> values used for row <code>r - 1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-routes-to-climb-a-rectangular-grid/">LeetCode #3797</a>
 */
public class CountRoutesToClimbARectangularGrid {

    /**
     * Counts Count subarrays good sums.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param nums the nums (int[])
     * @param target the target (int)
     * @return the computed int result
     */
    public int countSubarraysGoodSums(int[] nums, int target) {
        // Prefix sums approach: subarray sum < target
        int cnt=0, sum=0;
        java.util.TreeMap<Integer,Integer> freq=new java.util.TreeMap<>(); freq.put(0,1);
        for (int n:nums) {
            sum+=n;
            // count prefix sums > sum-target
            cnt+=freq.tailMap(sum-target+1).values().stream().mapToInt(Integer::intValue).sum();
            freq.merge(sum,1,Integer::sum);
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountRoutesToClimbARectangularGrid sol = new CountRoutesToClimbARectangularGrid();
        System.out.println(sol.countSubarraysGoodSums(new int[]{1,2,3}, 0));
    }
}
