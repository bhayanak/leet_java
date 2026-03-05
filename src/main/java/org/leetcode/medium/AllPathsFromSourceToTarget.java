package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode #797: All Paths From Source to Target
 * @see <a href="https://leetcode.com/problems/all-paths-from-source-to-target/">Problem</a>
 */
public class AllPathsFromSourceToTarget {

    /**
     * LeetCode #797 – All Paths From Source to Target
     * Difficulty: MEDIUM
     * Topics: Backtracking, Depth-First Search, Breadth-First Search, Graph Theory
     *
     * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to n - 1,
     * find all possible paths from node 0 to node n - 1 and return them in any
     * order.
     * 
     * 
     * The graph is given as follows: graph[i] is a list of all nodes you can
     * visit from node i (i.e., there is a directed edge from node i to node
     * graph[i][j]).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: graph = [[1,2],[3],[3],[]]
     * Output: [[0,1,3],[0,2,3]]
     * Explanation: There are two paths: 0 -&gt; 1 -&gt; 3 and 0 -&gt; 2 -&gt; 3.
     * 
     * Example 2:
     * 
     * Input: graph = [[4,3,1],[3,2,4],[3],[4],[]]
     * Output: [[0,4],[0,3,4],[0,1,3,4],[0,1,2,3,4],[0,1,4]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == graph.length
     * 
     * 2 &lt;= n &lt;= 15
     * 
     * 0 &lt;= graph[i][j] &lt; n
     * 
     * graph[i][j] != i (i.e., there will be no self-loops).
     * 
     * All the elements of graph[i] are unique.
     * 
     * The input graph is guaranteed to be a DAG.
     */
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, path, result);
        return result;
    }
    private void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> result) {
        if (node == graph.length - 1) { result.add(new ArrayList<>(path)); return; }
        for (int next : graph[node]) {
            path.add(next);
            dfs(graph, next, path, result);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args) {
        AllPathsFromSourceToTarget sol = new AllPathsFromSourceToTarget();
        System.out.println(sol.allPathsSourceTarget(new int[][]{{1,2},{3,4}}));
    }
}
