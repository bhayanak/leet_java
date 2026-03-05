package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode #785: Is Graph Bipartite?
 * @see <a href="https://leetcode.com/problems/is-graph-bipartite/">Problem</a>
 */
public class IsGraphBipartite {

    /**
     * LeetCode #785 – Is Graph Bipartite?
     * Difficulty: MEDIUM
     * Topics: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
     *
     * There is an undirected graph with n nodes, where each node is numbered
     * between 0 and n - 1. You are given a 2D array graph, where graph[u] is an
     * array of nodes that node u is adjacent to. More formally, for each v in
     * graph[u], there is an undirected edge between node u and node v. The graph
     * has the following properties:
     * 
     * 
     * There are no self-edges (graph[u] does not contain u).
     * 
     * There are no parallel edges (graph[u] does not contain duplicate values).
     * 
     * If v is in graph[u], then u is in graph[v] (the graph is undirected).
     * 
     * The graph may not be connected, meaning there may be two nodes u and v such
     * that there is no path between them.
     * 
     * A graph is bipartite if the nodes can be partitioned into two independent
     * sets A and B such that every edge in the graph connects a node in set A and
     * a node in set B.
     * 
     * 
     * Return true if and only if it is bipartite.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
     * Output: false
     * Explanation: There is no way to partition the nodes into two independent
     * sets such that every edge connects a node in one and a node in the other.
     * 
     * Example 2:
     * 
     * Input: graph = [[1,3],[0,2],[1,3],[0,2]]
     * Output: true
     * Explanation: We can partition the nodes into two sets: {0, 2} and {1, 3}.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * graph.length == n
     * 
     * 1 &lt;= n &lt;= 100
     * 
     * 0 &lt;= graph[u].length &lt; n
     * 
     * 0 &lt;= graph[u][i] &lt;= n - 1
     * 
     * graph[u] does not contain u.
     * 
     * All the values of graph[u] are unique.
     * 
     * If graph[u] contains v, then graph[v] contains u.
     */
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n]; // 0: uncolored, 1: red, -1: blue
        for (int i = 0; i < n; i++) {
            if (color[i] == 0 && !bfs(graph, i, color)) return false;
        }
        return true;
    }
    private boolean bfs(int[][] graph, int start, int[] color) {
        Queue<Integer> q = new LinkedList<>();
        color[start] = 1; q.offer(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : graph[node]) {
                if (color[neighbor] == 0) { color[neighbor] = -color[node]; q.offer(neighbor); }
                else if (color[neighbor] == color[node]) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsGraphBipartite sol = new IsGraphBipartite();
        System.out.println(sol.isBipartite(new int[][]{{1,2},{3,4}}));
    }
}
