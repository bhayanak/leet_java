package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LeetCode #417: Pacific Atlantic Water Flow
 * @see <a href="https://leetcode.com/problems/pacific-atlantic-water-flow/">Problem</a>
 */
public class PacificAtlanticWaterFlow {

    /**
     * LeetCode #417 – Pacific Atlantic Water Flow
     * Difficulty: MEDIUM
     * Topics: Array, Depth-First Search, Breadth-First Search, Matrix
     *
     * There is an m x n rectangular island that borders both the Pacific Ocean
     * and Atlantic Ocean. The Pacific Ocean touches the island's left and top
     * edges, and the Atlantic Ocean touches the island's right and bottom edges.
     * 
     * 
     * The island is partitioned into a grid of square cells. You are given an m x
     * n integer matrix heights where heights[r][c] represents the height above
     * sea level of the cell at coordinate (r, c).
     * 
     * 
     * The island receives a lot of rain, and the rain water can flow to
     * neighboring cells directly north, south, east, and west if the neighboring
     * cell's height is less than or equal to the current cell's height. Water can
     * flow from any cell adjacent to an ocean into the ocean.
     * 
     * 
     * Return a 2D list of grid coordinates result where result[i] = [ri, ci]
     * denotes that rain water can flow from cell (ri, ci) to both the Pacific and
     * Atlantic oceans.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: heights =
     * [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
     * Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
     * Explanation: The following cells can flow to the Pacific and Atlantic
     * oceans, as shown below:
     * [0,4]: [0,4] -&gt; Pacific Ocean
     *        [0,4] -&gt; Atlantic Ocean
     * [1,3]: [1,3] -&gt; [0,3] -&gt; Pacific Ocean
     *        [1,3] -&gt; [1,4] -&gt; Atlantic Ocean
     * [1,4]: [1,4] -&gt; [1,3] -&gt; [0,3] -&gt; Pacific Ocean
     *        [1,4] -&gt; Atlantic Ocean
     * [2,2]: [2,2] -&gt; [1,2] -&gt; [0,2] -&gt; Pacific Ocean
     *        [2,2] -&gt; [2,3] -&gt; [2,4] -&gt; Atlantic Ocean
     * [3,0]: [3,0] -&gt; Pacific Ocean
     *        [3,0] -&gt; [4,0] -&gt; Atlantic Ocean
     * [3,1]: [3,1
     */
    // BFS from ocean borders inward (water flows uphill from ocean perspective)
    /**
     * Solves the problem: Pacific atlantic.
     * Uses Breadth-First Search (BFS) traversal.
     *
     * @param heights the heights (int[][])
     * @return the computed List&lt;List&lt;Integer&gt;&gt; result
     */
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pac = new boolean[m][n], atl = new boolean[m][n];
        Queue<int[]> pq = new LinkedList<>(), aq = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            pq.add(new int[]{i,0}); pac[i][0] = true;
            aq.add(new int[]{i,n-1}); atl[i][n-1] = true;
        }
        for (int j = 0; j < n; j++) {
            pq.add(new int[]{0,j}); pac[0][j] = true;
            aq.add(new int[]{m-1,j}); atl[m-1][j] = true;
        }
        bfs(heights, pq, pac, m, n);
        bfs(heights, aq, atl, m, n);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (pac[i][j] && atl[i][j]) result.add(Arrays.asList(i, j));
        return result;
    }
    private void bfs(int[][] h, Queue<int[]> q, boolean[][] visited, int m, int n) {
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            for (int[] d : dirs) {
                int r = cur[0]+d[0], c = cur[1]+d[1];
                if (r<0||r>=m||c<0||c>=n||visited[r][c]||h[r][c]<h[cur[0]][cur[1]]) continue;
                visited[r][c] = true;
                q.add(new int[]{r,c});
            }
        }
    }

    public static void main(String[] args) {
        PacificAtlanticWaterFlow sol = new PacificAtlanticWaterFlow();
        System.out.println(sol.pacificAtlantic(new int[][]{{1,2},{3,4}}));
    }
}
