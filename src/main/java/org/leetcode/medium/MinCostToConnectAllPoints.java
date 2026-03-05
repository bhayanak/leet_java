package org.leetcode.medium;


/**
 * <b>#1584 - Min Cost to Connect All Points</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Union-Find, Graph Theory, Minimum Spanning Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array points representing integer coordinates of some points on a 2D-plane, where points[i] = [xi, yi].
 *
 *
 * The cost of connecting two points [xi, yi] and [xj, yj] is the manhattan distance between them: |xi - xj| + |yi - yj|, where |val| denotes the absolute value of val.
 *
 *
 * Return the minimum cost to make all points connected. All points are connected if there is exactly one simple path between any two points.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
 * Output: 20
 * Explanation: 
 *
 * We can connect the points as shown above to get the minimum cost of 20.
 * Notice that there is a unique path between every pair of points.
 *
 * Example 2:
 *
 * Input: points = [[3,12],[-2,5],[-4,1]]
 * Output: 18
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 1000
 *
 * -106 &lt;= xi, yi &lt;= 106
 *
 * All pairs (xi, yi) are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Connect each pair of points with a weighted edge, the weight being the manhattan distance between those points.
 * Hint 2: The problem is now the cost of minimum spanning tree in graph with above edges.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Union-Find, Graph Theory, Minimum Spanning Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/min-cost-to-connect-all-points/">LeetCode #1584</a>
 */
public class MinCostToConnectAllPoints {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Min Cost to Connect All Points");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinCostToConnectAllPoints ===");
        MinCostToConnectAllPoints sol = new MinCostToConnectAllPoints();
        System.out.println(sol.solve(null));
    }
}
