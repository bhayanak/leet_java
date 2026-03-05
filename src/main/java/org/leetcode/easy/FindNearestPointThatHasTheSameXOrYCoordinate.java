package org.leetcode.easy;


/**
 * <b>#1779 - Find Nearest Point That Has the Same X or Y Coordinate</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y). You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi). A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.
 *
 *
 * Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location. If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.
 *
 *
 * The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: x = 3, y = 4, points = [[1,2],[3,1],[2,4],[2,3],[4,4]]
 * Output: 2
 * Explanation: Of all the points, only [3,1], [2,4] and [4,4] are valid. Of the valid points, [2,4] and [4,4] have the smallest Manhattan distance from your current location, with a distance of 1. [2,4] has the smallest index, so return 2.
 *
 * Example 2:
 *
 * Input: x = 3, y = 4, points = [[3,4]]
 * Output: 0
 * Explanation: The answer is allowed to be on the same location as your current location.
 *
 * Example 3:
 *
 * Input: x = 3, y = 4, points = [[2,3]]
 * Output: -1
 * Explanation: There are no valid points.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 104
 *
 * points[i].length == 2
 *
 * 1 &lt;= x, y, ai, bi &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through each point, and keep track of the current point with the smallest Manhattan distance from your current location.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/">LeetCode #1779</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class FindNearestPointThatHasTheSameXOrYCoordinate {

    /**
     * Solves the problem: Nearest valid point.
     *
     * @param x the x (int)
     * @param y the y (int)
     * @param points the points (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int nearestValidPoint(int x, int y, int[][] points) {
        int best=-1, minDist=Integer.MAX_VALUE;
        for (int i=0;i<points.length;i++) {
            int px=points[i][0], py=points[i][1];
            if (px==x || py==y) {
                int d=Math.abs(px-x)+Math.abs(py-y);
                if (d<minDist) { minDist=d; best=i; }
            }
        }
        return best;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FindNearestPointThatHasTheSameXOrYCoordinate sol = new FindNearestPointThatHasTheSameXOrYCoordinate();
                System.out.println(sol.nearestValidPoint(3,4,new int[][]{{1,2},{3,1},{2,4},{2,3},{4,4}})); // 2
                System.out.println(sol.nearestValidPoint(3,4,new int[][]{{2,3}})); // -1
    }
}
