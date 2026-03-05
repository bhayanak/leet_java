package org.leetcode.medium;


/**
 * <b>#1042 - Flower Planting With No Adjacent</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You have n gardens, labeled from 1 to n, and an array paths where paths[i] = [xi, yi] describes a bidirectional path between garden xi to garden yi. In each garden, you want to plant one of 4 types of flowers.
 *
 *
 * All gardens have at most 3 paths coming into or leaving it.
 *
 *
 * Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.
 *
 *
 * Return any such a choice as an array answer, where answer[i] is the type of flower planted in the (i+1)th garden. The flower types are denoted 1, 2, 3, or 4. It is guaranteed an answer exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, paths = [[1,2],[2,3],[3,1]]
 * Output: [1,2,3]
 * Explanation:
 * Gardens 1 and 2 have different types.
 * Gardens 2 and 3 have different types.
 * Gardens 3 and 1 have different types.
 * Hence, [1,2,3] is a valid answer. Other valid answers include [1,2,4], [1,4,2], and [3,2,1].
 *
 * Example 2:
 *
 * Input: n = 4, paths = [[1,2],[3,4]]
 * Output: [1,2,1,2]
 *
 * Example 3:
 *
 * Input: n = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]
 * Output: [1,2,3,4]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 *
 * 0 &lt;= paths.length &lt;= 2 * 104
 *
 * paths[i].length == 2
 *
 * 1 &lt;= xi, yi &lt;= n
 *
 * xi != yi
 *
 * Every garden has at most 3 paths coming into or leaving it.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since each garden is connected to at most 3 gardens, there's always an available color for each garden.  For example, if one garden is next to gardens with colors 1, 3, 4,  then color #2 is available.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/flower-planting-with-no-adjacent/">LeetCode #1042</a>
 */
public class FlowerPlantingWithNoAdjacent {

    /**
     * TODO: Implement "Flower Planting With No Adjacent".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flower Planting With No Adjacent");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FlowerPlantingWithNoAdjacent.java &amp;&amp; java org.leetcode.medium.FlowerPlantingWithNoAdjacent</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FlowerPlantingWithNoAdjacent ===");
        FlowerPlantingWithNoAdjacent sol = new FlowerPlantingWithNoAdjacent();
        System.out.println(sol.solve(null));
    }
}
