package org.leetcode.medium;


/**
 * <b>#3607 - Power Grid Maintenance</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Heap (Priority Queue), Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer c representing c power stations, each with a unique identifier id from 1 to c (1‑based indexing).
 *
 *
 * These stations are interconnected via n bidirectional cables, represented by a 2D array connections, where each element connections[i] = [ui, vi] indicates a connection between station ui and station vi. Stations that are directly or indirectly connected form a power grid.
 *
 *
 * Initially, all stations are online (operational).
 *
 *
 * You are also given a 2D array queries, where each query is one of the following two types:
 *
 *
 *
 *
 * [1, x]: A maintenance check is requested for station x. If station x is online, it resolves the check by itself. If station x is offline, the check is resolved by the operational station with the smallest id in the same power grid as x. If no operational station exists in that grid, return -1.
 *
 *
 *
 *
 * [2, x]: Station x goes offline (i.e., it becomes non-operational).
 *
 *
 * Return an array of integers representing the results of each query of type [1, x] in the order they appear.
 *
 *
 * Note: The power grid preserves its structure; an offline (non‑operational) node remains part of its grid and taking it offline does not alter connectivity.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: c = 5, connections = [[1,2],[2,3],[3,4],[4,5]], queries = [[1,3],[2,1],[1,1],[2,2],[1,2]]
 *
 *
 * Output: [3,2,3]
 *
 *
 * Explanation:
 *
 *
 * Initially, all stations {1, 2, 3, 4, 5} are online and form a single power grid.
 *
 * Query [1,3]: Station 3 is online, so the maintenance check is resolved by station 3.
 *
 * Query [2,1]: Station 1 goes offline. The remaining online stations are {2, 3, 4, 5}.
 *
 * Query [1,1]: Station 1 is offline, so the check is resolved by the operational station with the smallest id among {2, 3, 4, 5}, which is station 2.
 *
 * Query [2,2]: Station 2 goes offline. The remaining online stations are {3, 4, 5}.
 *
 * Query [1,2]: Station 2 is offline, so the check is resolved by the operational station with the smallest id among {3, 4, 5}, which is station 3.
 *
 * Example 2:
 *
 * Input: c = 3, connections = [], queries = [[1,1],[2,1],[1,1]]
 *
 *
 * Output: [1,-1]
 *
 *
 * Explanation:
 *
 *
 * There are no connections, so each station is its own isolated grid.
 *
 * Query [1,1]: Station 1 is online in its isolated grid, so the maintenance check is resolved by station 1.
 *
 * Query [2,1]: Station 1 goes offline.
 *
 * Query [1,1]: Station 1 is offline and there are no other stations in its grid, so the result is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= c &lt;= 105
 *
 * 0 &lt;= n == connections.length &lt;= min(105, c * (c - 1) / 2)
 *
 * connections[i].length == 2
 *
 * 1 &lt;= ui, vi &lt;= c
 *
 * ui != vi
 *
 * 1 &lt;= queries.length &lt;= 2 * 105
 *
 * queries[i].length == 2
 *
 * queries[i][0] is either 1 or 2.
 *
 * 1 &lt;= queries[i][1] &lt;= c
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DFS or BFS to assign each station a component ID
 * Hint 2: For each component, maintain a sorted set of online station IDs
 * Hint 3: For query <code>[2, x]</code>, remove <code>x</code> from the set of its component
 * Hint 4: For query <code>[1, x]</code>, if <code>x</code> is in its component’s set return <code>x</code>; otherwise if the set is non-empty return its smallest element; else return <code>-1</code>
 * Hint 5: Precompute all components and then handle each query in O(log n) time using the sorted sets
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Depth-First Search, Breadth-First Search, Union-Find, Graph Theory, Heap (Priority Queue), Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/power-grid-maintenance/">LeetCode #3607</a>
 */
public class PowerGridMaintenance {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Power Grid Maintenance");
    }

    public static void main(String[] args) {
        System.out.println("=== PowerGridMaintenance ===");
        PowerGridMaintenance sol = new PowerGridMaintenance();
        System.out.println(sol.solve(null));
    }
}
