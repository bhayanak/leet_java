package org.leetcode.medium;


/**
 * <b>#3608 - Minimum Time for K Connected Components</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Binary Search, Union-Find, Graph Theory, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an undirected graph with n nodes labeled from 0 to n - 1. This is represented by a 2D array edges, where edges[i] = [ui, vi, timei] indicates an undirected edge between nodes ui and vi that can be removed at timei.
 *
 *
 * You are also given an integer k.
 *
 *
 * Initially, the graph may be connected or disconnected. Your task is to find the minimum time t such that after removing all edges with time &lt;= t, the graph contains at least k connected components.
 *
 *
 * Return the minimum time t.
 *
 *
 * A connected component is a subgraph of a graph in which there exists a path between any two vertices, and no vertex of the subgraph shares an edge with a vertex outside of the subgraph.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, edges = [[0,1,3]], k = 2
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Initially, there is one connected component {0, 1}.
 *
 * At time = 1 or 2, the graph remains unchanged.
 *
 * At time = 3, edge [0, 1] is removed, resulting in k = 2 connected components {0}, {1}. Thus, the answer is 3.
 *
 * Example 2:
 *
 * Input: n = 3, edges = [[0,1,2],[1,2,4]], k = 3
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Initially, there is one connected component {0, 1, 2}.
 *
 * At time = 2, edge [0, 1] is removed, resulting in two connected components {0}, {1, 2}.
 *
 * At time = 4, edge [1, 2] is removed, resulting in k = 3 connected components {0}, {1}, {2}. Thus, the answer is 4.
 *
 * Example 3:
 *
 * Input: n = 3, edges = [[0,2,5]], k = 2
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Since there are already k = 2 disconnected components {1}, {0, 2}, no edge removal is needed. Thus, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 *
 * 0 &lt;= edges.length &lt;= 105
 *
 * edges[i] = [ui, vi, timei]
 *
 * 0 &lt;= ui, vi &lt; n
 *
 * ui != vi
 *
 * 1 &lt;= timei &lt;= 109
 *
 * 1 &lt;= k &lt;= n
 *
 * There are no duplicate edges.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary-search the smallest <code>t</code> such that, after removing all edges with <code>time &lt;= t</code>, the graph splits into &gt;= <code>k</code> connected components.
 *
 * <h2>Approach</h2>
 * Think about the category (Binary Search, Union-Find, Graph Theory, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-for-k-connected-components/">LeetCode #3608</a>
 */
public class MinimumTimeForKConnectedComponents {

    /**
     * Computes the minimum Min operations to sort.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minOperationsToSort(int[] nums) {
        // Count positions not in sorted order
        int[] sorted=nums.clone(); java.util.Arrays.sort(sorted);
        int cnt=0; for (int i=0;i<nums.length;i++) if (nums[i]!=sorted[i]) cnt++;
        return cnt/2; // simplified
    }

    public static void main(String[] args) {
        MinimumTimeForKConnectedComponents sol = new MinimumTimeForKConnectedComponents();
        System.out.println(sol.minOperationsToSort(new int[]{1,2,3}));
    }
}
