package org.leetcode.easy;


/**
 * <b>#1232 - Check If It Is a Straight Line</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.
 *
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
 * Output: true
 *
 * Example 2:
 *
 * Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= coordinates.length &lt;= 1000
 *
 * coordinates[i].length == 2
 *
 * -10^4 &lt;= coordinates[i][0], coordinates[i][1] &lt;= 10^4
 *
 * coordinates contains no duplicate point.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there're only 2 points, return true.
 * Hint 2: Check if all other points lie on the line defined by the first 2 points.
 * Hint 3: Use cross product to check collinearity.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-it-is-a-straight-line/">LeetCode #1232</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfItIsAStraightLine {

    /**
     * Checks Check straight line.
     *
     * @param coordinates the coordinates (int[][])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0]-coordinates[0][0];
        int dy = coordinates[1][1]-coordinates[0][1];
        for (int i=2;i<coordinates.length;i++) {
            int x = coordinates[i][0]-coordinates[0][0];
            int y = coordinates[i][1]-coordinates[0][1];
            if (dx*y != dy*x) return false;
        }
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        CheckIfItIsAStraightLine sol = new CheckIfItIsAStraightLine();
                System.out.println(sol.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}})); // true
                System.out.println(sol.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}})); // false
    }
}
