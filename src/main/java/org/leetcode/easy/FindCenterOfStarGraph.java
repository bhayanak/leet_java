package org.leetcode.easy;

/** FindCenterOfStarGraph solution. */
public class FindCenterOfStarGraph {
    /**
     * Finds the center node of a star graph.
     *
     * @param edges array of [u, v] edges in the star graph
     * @return the center node (appears in every edge)
     *
     * <p><b>Explanation:</b> The center appears in both the first and second edges.</p>
     *   Check which node from edges[0] is shared with edges[1]. Time O(1), Space O(1).
     */
    public int findCenter(int[][] edges) {
        return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1])
                ? edges[0][0] : edges[0][1];
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== FindCenterOfStarGraph ===");
        FindCenterOfStarGraph sol = new FindCenterOfStarGraph();
        System.out.println(sol.findCenter(new int[][]{{1,2},{3,4}}));
    }
}
