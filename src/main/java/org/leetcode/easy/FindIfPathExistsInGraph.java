package org.leetcode.easy;


/**
 * <b>#1971 - Find if Path Exists in Graph</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Depth-First Search, Breadth-First Search, Union-Find, Graph Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
 *
 *
 * You want to determine if there is a valid path that exists from vertex source to vertex destination.
 *
 *
 * Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
 * Output: true
 * Explanation: There are two paths from vertex 0 to vertex 2:
 * - 0 → 1 → 2
 * - 0 → 2
 *
 * Example 2:
 *
 * Input: n = 6, edges = [[0,1],[0,2],[3,5],[5,4],[4,3]], source = 0, destination = 5
 * Output: false
 * Explanation: There is no path from vertex 0 to vertex 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 105
 *
 * 0 &lt;= edges.length &lt;= 2 * 105
 *
 * edges[i].length == 2
 *
 * 0 &lt;= ui, vi &lt;= n - 1
 *
 * ui != vi
 *
 * 0 &lt;= source, destination &lt;= n - 1
 *
 * There are no duplicate edges.
 *
 * There are no self edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Depth-First Search, Breadth-First Search, Union-Find, Graph Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-if-path-exists-in-graph/">LeetCode #1971</a>
 */
public class FindIfPathExistsInGraph {

    /**
     * Solves the problem: Valid path.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param n the n (int)
     * @param edges the edges (int[][])
     * @param source the source (int)
     * @param destination the destination (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] parent = new int[n];
        for (int i=0;i<n;i++) parent[i]=i;
        for (int[] e:edges) { int a=find(parent,e[0]), b=find(parent,e[1]); parent[a]=b; }
        return find(parent,source)==find(parent,destination);
    }
    private int find(int[] p, int x) { return p[x]==x?x:(p[x]=find(p,p[x])); }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FindIfPathExistsInGraph sol = new FindIfPathExistsInGraph();
                System.out.println(sol.validPath(3,new int[][]{{0,1},{1,2},{2,0}},0,2)); // true
                System.out.println(sol.validPath(6,new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}},0,5)); // false
    }
}
