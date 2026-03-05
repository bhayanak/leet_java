package org.leetcode.medium;


/**
 * <b>#2662 - Minimum Cost of a Path With Special Roads</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Graph Theory, Heap (Priority Queue), Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array start where start = [startX, startY] represents your initial position (startX, startY) in a 2D space. You are also given the array target where target = [targetX, targetY] represents your target position (targetX, targetY).
 *
 *
 * The cost of going from a position (x1, y1) to any other position in the space (x2, y2) is |x2 - x1| + |y2 - y1|.
 *
 *
 * There are also some special roads. You are given a 2D array specialRoads where specialRoads[i] = [x1i, y1i, x2i, y2i, costi] indicates that the ith special road goes in one direction from (x1i, y1i) to (x2i, y2i) with a cost equal to costi. You can use each special road any number of times.
 *
 *
 * Return the minimum cost required to go from (startX, startY) to (targetX, targetY).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: start = [1,1], target = [4,5], specialRoads = [[1,2,3,3,2],[3,4,4,5,1]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * (1,1) to (1,2) with a cost of |1 - 1| + |2 - 1| = 1.
 *
 * (1,2) to (3,3). Use specialRoads[0] with the cost 2.
 *
 * (3,3) to (3,4) with a cost of |3 - 3| + |4 - 3| = 1.
 *
 * (3,4) to (4,5). Use specialRoads[1] with the cost 1.
 *
 * So the total cost is 1 + 2 + 1 + 1 = 5.
 *
 * Example 2:
 *
 * Input: start = [3,2], target = [5,7], specialRoads = [[5,7,3,2,1],[3,2,3,4,4],[3,3,5,5,5],[3,4,5,6,6]]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * It is optimal not to use any special edges and go directly from the starting to the ending position with a cost |5 - 3| + |7 - 2| = 7.
 *
 *
 * Note that the specialRoads[0] is directed from (5,7) to (3,2).
 *
 * Example 3:
 *
 * Input: start = [1,1], target = [10,4], specialRoads = [[4,2,1,1,3],[1,2,7,4,4],[10,3,6,1,2],[6,1,1,2,3]]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * (1,1) to (1,2) with a cost of |1 - 1| + |2 - 1| = 1.
 *
 * (1,2) to (7,4). Use specialRoads[1] with the cost 4.
 *
 * (7,4) to (10,4) with a cost of |10 - 7| + |4 - 4| = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * start.length == target.length == 2
 *
 * 1 &lt;= startX &lt;= targetX &lt;= 105
 *
 * 1 &lt;= startY &lt;= targetY &lt;= 105
 *
 * 1 &lt;= specialRoads.length &lt;= 200
 *
 * specialRoads[i].length == 5
 *
 * startX &lt;= x1i, x2i &lt;= targetX
 *
 * startY &lt;= y1i, y2i &lt;= targetY
 *
 * 1 &lt;= costi &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It can be proven that it is optimal to go only to the positions that are either the start or the end of a special road or the target position.
 * Hint 2: Consider all positions given to you as nodes in a graph, and the edges of the graph are the special roads.
 * Hint 3: Now the problem is equivalent to finding the shortest path in a directed graph.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Graph Theory, Heap (Priority Queue), Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-of-a-path-with-special-roads/">LeetCode #2662</a>
 */
public class MinimumCostOfAPathWithSpecialRoads {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost of a Path With Special Roads");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostOfAPathWithSpecialRoads ===");
        MinimumCostOfAPathWithSpecialRoads sol = new MinimumCostOfAPathWithSpecialRoads();
        System.out.println(sol.solve(null));
    }
}
