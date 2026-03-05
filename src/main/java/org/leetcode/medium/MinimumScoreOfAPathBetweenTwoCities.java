package org.leetcode.medium;


/**
 * <b>#2492 - Minimum Score of a Path Between Two Cities</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n representing n cities numbered from 1 to n. You are also given a 2D array roads where roads[i] = [ai, bi, distancei] indicates that there is a bidirectional road between cities ai and bi with a distance equal to distancei. The cities graph is not necessarily connected.
 *
 *
 * The score of a path between two cities is defined as the minimum distance of a road in this path.
 *
 *
 * Return the minimum possible score of a path between cities 1 and n.
 *
 *
 * Note:
 *
 *
 * A path is a sequence of roads between two cities.
 *
 * It is allowed for a path to contain the same road multiple times, and you can visit cities 1 and n multiple times along the path.
 *
 * The test cases are generated such that there is at least one path between 1 and n.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, roads = [[1,2,9],[2,3,6],[2,4,5],[1,4,7]]
 * Output: 5
 * Explanation: The path from city 1 to 4 with the minimum score is: 1 -&gt; 2 -&gt; 4. The score of this path is min(9,5) = 5.
 * It can be shown that no other path has less score.
 *
 * Example 2:
 *
 * Input: n = 4, roads = [[1,2,2],[1,3,4],[3,4,7]]
 * Output: 2
 * Explanation: The path from city 1 to 4 with the minimum score is: 1 -&gt; 2 -&gt; 1 -&gt; 3 -&gt; 4. The score of this path is min(2,2,4,7) = 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= roads.length &lt;= 105
 *
 * roads[i].length == 3
 *
 * 1 &lt;= ai, bi &lt;= n
 *
 * ai != bi
 *
 * 1 &lt;= distancei &lt;= 104
 *
 * There are no repeated edges.
 *
 * There is at least one path between 1 and n.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you solve the problem if the whole graph is connected?
 * Hint 2: Notice that if the graph is connected, you can always use any edge of the graph in your path.
 * Hint 3: How to solve the general problem in a similar way? Remove all the nodes that are not connected to 1 and n, then apply the previous solution in the new graph.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/">LeetCode #2492</a>
 */
public class MinimumScoreOfAPathBetweenTwoCities {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Score of a Path Between Two Cities");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumScoreOfAPathBetweenTwoCities ===");
        MinimumScoreOfAPathBetweenTwoCities sol = new MinimumScoreOfAPathBetweenTwoCities();
        System.out.println(sol.solve(null));
    }
}
