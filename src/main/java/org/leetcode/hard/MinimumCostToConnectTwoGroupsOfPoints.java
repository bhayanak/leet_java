package org.leetcode.hard;


/**
 * <b>#1595 - Minimum Cost to Connect Two Groups of Points</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two groups of points where the first group has size1 points, the second group has size2 points, and size1 &gt;= size2.
 *
 *
 * The cost of the connection between any two points are given in an size1 x size2 matrix where cost[i][j] is the cost of connecting point i of the first group and point j of the second group. The groups are connected if each point in both groups is connected to one or more points in the opposite group. In other words, each point in the first group must be connected to at least one point in the second group, and each point in the second group must be connected to at least one point in the first group.
 *
 *
 * Return the minimum cost it takes to connect the two groups.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cost = [[15, 96], [36, 2]]
 * Output: 17
 * Explanation: The optimal way of connecting the groups is:
 * 1--A
 * 2--B
 * This results in a total cost of 17.
 *
 * Example 2:
 *
 * Input: cost = [[1, 3, 5], [4, 1, 1], [1, 5, 3]]
 * Output: 4
 * Explanation: The optimal way of connecting the groups is:
 * 1--A
 * 2--B
 * 2--C
 * 3--A
 * This results in a total cost of 4.
 * Note that there are multiple points connected to point 2 in the first group and point A in the second group. This does not matter as there is no limit to the number of points that can be connected. We only care about the minimum total cost.
 *
 * Example 3:
 *
 * Input: cost = [[2, 5, 1], [3, 4, 7], [8, 1, 2], [6, 2, 4], [3, 8, 8]]
 * Output: 10
 *
 *
 *
 * Constraints:
 *
 *
 * size1 == cost.length
 *
 * size2 == cost[i].length
 *
 * 1 &lt;= size1, size2 &lt;= 12
 *
 * size1 &gt;= size2
 *
 * 0 &lt;= cost[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each point on the left would either be connected to exactly point already connected to some left node, or a subset of the nodes on the right which are not connected to any node
 * Hint 2: Use dynamic programming with bitmasking, where the state will be (number of points assigned in first group, bitmask of points assigned in second group).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Matrix, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-connect-two-groups-of-points/">LeetCode #1595</a>
 */
public class MinimumCostToConnectTwoGroupsOfPoints {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Connect Two Groups of Points");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToConnectTwoGroupsOfPoints ===");
        MinimumCostToConnectTwoGroupsOfPoints sol = new MinimumCostToConnectTwoGroupsOfPoints();
        System.out.println(sol.solve(null));
    }
}
