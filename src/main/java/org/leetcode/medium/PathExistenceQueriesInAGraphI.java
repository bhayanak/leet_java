package org.leetcode.medium;


/**
 * <b>#3532 - Path Existence Queries in a Graph I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing the number of nodes in a graph, labeled from 0 to n - 1.
 *
 *
 * You are also given an integer array nums of length n sorted in non-decreasing order, and an integer maxDiff.
 *
 *
 * An undirected edge exists between nodes i and j if the absolute difference between nums[i] and nums[j] is at most maxDiff (i.e., |nums[i] - nums[j]| &lt;= maxDiff).
 *
 *
 * You are also given a 2D integer array queries. For each queries[i] = [ui, vi], determine whether there exists a path between nodes ui and vi.
 *
 *
 * Return a boolean array answer, where answer[i] is true if there exists a path between ui and vi in the ith query and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, nums = [1,3], maxDiff = 1, queries = [[0,0],[0,1]]
 *
 *
 * Output: [true,false]
 *
 *
 * Explanation:
 *
 *
 * Query [0,0]: Node 0 has a trivial path to itself.
 *
 * Query [0,1]: There is no edge between Node 0 and Node 1 because |nums[0] - nums[1]| = |1 - 3| = 2, which is greater than maxDiff.
 *
 * Thus, the final answer after processing all the queries is [true, false].
 *
 * Example 2:
 *
 * Input: n = 4, nums = [2,5,6,8], maxDiff = 2, queries = [[0,1],[0,2],[1,3],[2,3]]
 *
 *
 * Output: [false,false,true,true]
 *
 *
 * Explanation:
 *
 *
 * The resulting graph is:
 *
 *
 * Query [0,1]: There is no edge between Node 0 and Node 1 because |nums[0] - nums[1]| = |2 - 5| = 3, which is greater than maxDiff.
 *
 * Query [0,2]: There is no edge between Node 0 and Node 2 because |nums[0] - nums[2]| = |2 - 6| = 4, which is greater than maxDiff.
 *
 * Query [1,3]: There is a path between Node 1 and Node 3 through Node 2 since |nums[1] - nums[2]| = |5 - 6| = 1 and |nums[2] - nums[3]| = |6 - 8| = 2, both of which are within maxDiff.
 *
 * Query [2,3]: There is an edge between Node 2 and Node 3 because |nums[2] - nums[3]| = |6 - 8| = 2, which is equal to maxDiff.
 *
 * Thus, the final answer after processing all the queries is [false, false, true, true].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 105
 *
 * nums is sorted in non-decreasing order.
 *
 * 0 &lt;= maxDiff &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * queries[i] == [ui, vi]
 *
 * 0 &lt;= ui, vi &lt; n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How do the connected components look? Do they appear in segments (i.e., are they continuous)?
 * Hint 2: Preprocess the connected components.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Union-Find, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/path-existence-queries-in-a-graph-i/">LeetCode #3532</a>
 */
public class PathExistenceQueriesInAGraphI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Path Existence Queries in a Graph I");
    }

    public static void main(String[] args) {
        System.out.println("=== PathExistenceQueriesInAGraphI ===");
        PathExistenceQueriesInAGraphI sol = new PathExistenceQueriesInAGraphI();
        System.out.println(sol.solve(null));
    }
}
