package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #547: Number of Provinces
 * @see <a href="https://leetcode.com/problems/number-of-provinces/">Problem</a>
 */
public class NumberOfProvinces {

    /**
     * LeetCode #547 – Number of Provinces
     * Difficulty: MEDIUM
     * Topics: Depth-First Search, Breadth-First Search, Union-Find, Graph Theory
     *
     * There are n cities. Some of them are connected, while some are not. If city
     * a is connected directly with city b, and city b is connected directly with
     * city c, then city a is connected indirectly with city c.
     * 
     * 
     * A province is a group of directly or indirectly connected cities and no
     * other cities outside of the group.
     * 
     * 
     * You are given an n x n matrix isConnected where isConnected[i][j] = 1 if
     * the ith city and the jth city are directly connected, and isConnected[i][j]
     * = 0 otherwise.
     * 
     * 
     * Return the total number of provinces.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
     * Output: 2
     * 
     * Example 2:
     * 
     * Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
     * Output: 3
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= n &lt;= 200
     * 
     * n == isConnected.length
     * 
     * n == isConnected[i].length
     * 
     * isConnected[i][j] is 1 or 0.
     * 
     * isConnected[i][i] == 1
     * 
     * isConnected[i][j] == isConnected[j][i]
     */
    // Union-Find
    /**
     * Finds Find circle num.
     *
     * @param isConnected the isConnected (int[][])
     * @return the computed int result
     */
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        int provinces = n;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (isConnected[i][j] == 1) {
                    int pi = find(parent, i), pj = find(parent, j);
                    if (pi != pj) { parent[pi] = pj; provinces--; }
                }
            }
        }
        return provinces;
    }
    private int find(int[] parent, int x) {
        if (parent[x] != x) parent[x] = find(parent, parent[x]);
        return parent[x];
    }

    public static void main(String[] args) {
        NumberOfProvinces sol = new NumberOfProvinces();
        System.out.println(sol.findCircleNum(new int[][]{{1,2},{3,4}}));
    }
}
