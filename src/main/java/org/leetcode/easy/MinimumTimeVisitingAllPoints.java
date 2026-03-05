package org.leetcode.easy;


/**
 * <b>#1266 - Minimum Time Visiting All Points</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * On a 2D plane, there are n points with integer coordinates points[i] = [xi, yi]. Return the minimum time in seconds to visit all the points in the order given by points.
 *
 *
 * You can move according to these rules:
 *
 *
 * In 1 second, you can either:
 *
 *
 *
 *
 * move vertically by one unit,
 *
 * move horizontally by one unit, or
 *
 * move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
 *
 *
 *
 * You have to visit the points in the same order as they appear in the array.
 *
 * You are allowed to pass through points that appear later in the order, but these do not count as visits.
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,1],[3,4],[-1,0]]
 * Output: 7
 * Explanation: One optimal path is [1,1] -&gt; [2,2] -&gt; [3,3] -&gt; [3,4] -&gt; [2,3] -&gt; [1,2] -&gt; [0,1] -&gt; [-1,0]   
 * Time from [1,1] to [3,4] = 3 seconds 
 * Time from [3,4] to [-1,0] = 4 seconds
 * Total time = 7 seconds
 *
 * Example 2:
 *
 * Input: points = [[3,2],[-2,2]]
 * Output: 5
 *
 *
 *
 * Constraints:
 *
 *
 * points.length == n
 *
 * 1 &lt;= n &lt;= 100
 *
 * points[i].length == 2
 *
 * -1000 &lt;= points[i][0], points[i][1] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To walk from point A to point B there will be an optimal strategy to walk ?
 * Hint 2: Advance in diagonal as possible then after that go in straight line.
 * Hint 3: Repeat the process until visiting all the points.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-visiting-all-points/">LeetCode #1266</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class MinimumTimeVisitingAllPoints {

    /**
     * Computes the minimum Min time to visit all points.
     *
     * @param points the points (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0;
        for (int i=1;i<points.length;i++) {
            time += Math.max(Math.abs(points[i][0]-points[i-1][0]),
                             Math.abs(points[i][1]-points[i-1][1]));
        }
        return time;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        MinimumTimeVisitingAllPoints sol = new MinimumTimeVisitingAllPoints();
                System.out.println(sol.minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}})); // 7
                System.out.println(sol.minTimeToVisitAllPoints(new int[][]{{3,2},{-2,2}}));       // 5
    }
}
