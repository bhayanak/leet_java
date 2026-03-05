package org.leetcode.hard;


/**
 * <b>#3027 - Find the Number of Ways to Place People II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Geometry, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array points of size n x 2 representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].
 *
 *
 * We define the right direction as positive x-axis (increasing x-coordinate) and the left direction as negative x-axis (decreasing x-coordinate). Similarly, we define the up direction as positive y-axis (increasing y-coordinate) and the down direction as negative y-axis (decreasing y-coordinate)
 *
 *
 * You have to place n people, including Alice and Bob, at these points such that there is exactly one person at every point. Alice wants to be alone with Bob, so Alice will build a rectangular fence with Alice's position as the upper left corner and Bob's position as the lower right corner of the fence (Note that the fence might not enclose any area, i.e. it can be a line). If any person other than Alice and Bob is either inside the fence or on the fence, Alice will be sad.
 *
 *
 * Return the number of pairs of points where you can place Alice and Bob, such that Alice does not become sad on building the fence.
 *
 *
 * Note that Alice can only build a fence with Alice's position as the upper left corner, and Bob's position as the lower right corner. For example, Alice cannot build either of the fences in the picture below with four corners (1, 1), (1, 3), (3, 1), and (3, 3), because:
 *
 *
 * With Alice at (3, 3) and Bob at (1, 1), Alice's position is not the upper left corner and Bob's position is not the lower right corner of the fence.
 *
 * With Alice at (1, 3) and Bob at (1, 1) (as the rectangle shown in the image instead of a line), Bob's position is not the lower right corner of the fence.
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,1],[2,2],[3,3]]
 * Output: 0
 * Explanation: There is no way to place Alice and Bob such that Alice can build a fence with Alice's position as the upper left corner and Bob's position as the lower right corner. Hence we return 0. 
 *
 * Example 2:
 *
 * Input: points = [[6,2],[4,4],[2,6]]
 * Output: 2
 * Explanation: There are two ways to place Alice and Bob such that Alice will not be sad:
 * - Place Alice at (4, 4) and Bob at (6, 2).
 * - Place Alice at (2, 6) and Bob at (4, 4).
 * You cannot place Alice at (2, 6) and Bob at (6, 2) because the person at (4, 4) will be inside the fence.
 *
 * Example 3:
 *
 * Input: points = [[3,1],[1,3],[1,1]]
 * Output: 2
 * Explanation: There are two ways to place Alice and Bob such that Alice will not be sad:
 * - Place Alice at (1, 1) and Bob at (3, 1).
 * - Place Alice at (1, 3) and Bob at (1, 1).
 * You cannot place Alice at (1, 3) and Bob at (3, 1) because the person at (1, 1) will be on the fence.
 * Note that it does not matter if the fence encloses any area, the first and second fences in the image are valid.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 1000
 *
 * points[i].length == 2
 *
 * -109 &lt;= points[i][0], points[i][1] &lt;= 109
 *
 * All points[i] are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the points by x-coordinate in non-decreasing order and break the tie by sorting the y-coordinate in non-increasing order.
 * Hint 2: Now consider two points upper-left corner <code>points[i]</code> and lower-right corner <code>points[j]</code>, such that <code>i &lt; j</code> and <code>points[i][0] &lt;= points[j][0]</code> and <code>points[i][1] &gt;= points[j][1]</code>.
 * Hint 3: Instead of brute force looping, we can save the largest y-coordinate that is no larger than <code>points[i][1]</code> when looping on <code>j</code>, say the value is <code>m</code>. And if <code>m &lt; points[j][1]</code>, the upper-left and lower-right corner pair is valid.
 * Hint 4: The actual values don’t matter, we can compress all x-coordinates and y-coordinates to the range <code>[1, n]</code>. Can we use prefix sum now?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-ways-to-place-people-ii/">LeetCode #3027</a>
 */
public class FindTheNumberOfWaysToPlacePeopleIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Ways to Place People II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfWaysToPlacePeopleIi ===");
        FindTheNumberOfWaysToPlacePeopleIi sol = new FindTheNumberOfWaysToPlacePeopleIi();
        System.out.println(sol.solve(null));
    }
}
