package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

/**
 * LeetCode #684: Redundant Connection
 * @see <a href="https://leetcode.com/problems/redundant-connection/">Problem</a>
 */
public class RedundantConnection {

    /**
     * LeetCode #684 – Redundant Connection
     * Difficulty: MEDIUM
     * Topics: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
     *
     * In this problem, a tree is an undirected graph that is connected and has no
     * cycles.
     * 
     * 
     * You are given a graph that started as a tree with n nodes labeled from 1 to
     * n, with one additional edge added. The added edge has two different
     * vertices chosen from 1 to n, and was not an edge that already existed. The
     * graph is represented as an array edges of length n where edges[i] = [ai,
     * bi] indicates that there is an edge between nodes ai and bi in the graph.
     * 
     * 
     * Return an edge that can be removed so that the resulting graph is a tree of
     * n nodes. If there are multiple answers, return the answer that occurs last
     * in the input.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: edges = [[1,2],[1,3],[2,3]]
     * Output: [2,3]
     * 
     * Example 2:
     * 
     * Input: edges = [[1,2],[2,3],[3,4],[1,4],[1,5]]
     * Output: [1,4]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == edges.length
     * 
     * 3 &lt;= n &lt;= 1000
     * 
     * edges[i].length == 2
     * 
     * 1 &lt;= ai &lt; bi &lt;= edges.length
     * 
     * ai != bi
     * 
     * There are no repeated edges.
     * 
     * The given graph is connected.
     */
    // Union-Find: find the edge that creates a cycle
    /**
     * Finds Find redundant connection.
     *
     * @param edges the edges (int[][])
     * @return the computed int[] result
     */
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n+1];
        for (int i = 0; i <= n; i++) parent[i] = i;
        for (int[] e : edges) {
            int pu = find(parent, e[0]), pv = find(parent, e[1]);
            if (pu == pv) return e;
            parent[pu] = pv;
        }
        return new int[0];
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }

    public static void main(String[] args) {
        RedundantConnection sol = new RedundantConnection();
        System.out.println(sol.findRedundantConnection(new int[][]{{1,2},{3,4}}));
    }
}
