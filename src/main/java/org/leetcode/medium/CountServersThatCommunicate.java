package org.leetcode.medium;


/**
 * <b>#1267 - Count Servers that Communicate</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a map of a server center, represented as a m * n integer matrix grid, where 1 means that on that cell there is a server and 0 means that it is no server. Two servers are said to communicate if they are on the same row or on the same column.
 *
 * Return the number of servers that communicate with any other server.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0],[0,1]]
 * Output: 0
 * Explanation: No servers can communicate with others.
 *
 * Example 2:
 *
 * Input: grid = [[1,0],[1,1]]
 * Output: 3
 * Explanation: All three servers can communicate with at least one other server.
 *
 * Example 3:
 *
 * Input: grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
 * Output: 4
 * Explanation: The two servers in the first row can communicate with each other. The two servers in the third column can communicate with each other. The server at right bottom corner can't communicate with any other server.
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m &lt;= 250
 *
 * 1 &lt;= n &lt;= 250
 *
 * grid[i][j] == 0 or 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Store number of computer in each row and column.
 * Hint 2: Count all servers that are not isolated.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-servers-that-communicate/">LeetCode #1267</a>
 */
public class CountServersThatCommunicate {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Servers that Communicate");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountServersThatCommunicate ===");
        CountServersThatCommunicate sol = new CountServersThatCommunicate();
        System.out.println(sol.solve(null));
    }
}
