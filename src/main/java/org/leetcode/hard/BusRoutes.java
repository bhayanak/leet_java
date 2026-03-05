package org.leetcode.hard;


/**
 * <b>#815 - Bus Routes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.
 *
 *
 * For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -&gt; 5 -&gt; 7 -&gt; 1 -&gt; 5 -&gt; 7 -&gt; 1 -&gt; ... forever.
 *
 * You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target. You can travel between bus stops by buses only.
 *
 *
 * Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: routes = [[1,2,7],[3,6,7]], source = 1, target = 6
 * Output: 2
 * Explanation: The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.
 *
 * Example 2:
 *
 * Input: routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12
 * Output: -1
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= routes.length &lt;= 500.
 *
 * 1 &lt;= routes[i].length &lt;= 105
 *
 * All the values of routes[i] are unique.
 *
 * sum(routes[i].length) &lt;= 105
 *
 * 0 &lt;= routes[i][j] &lt; 106
 *
 * 0 &lt;= source, target &lt; 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/bus-routes/">LeetCode #815</a>
 */
public class BusRoutes {

    /**
     * TODO: Implement "Bus Routes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Bus Routes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BusRoutes.java &amp;&amp; java org.leetcode.hard.BusRoutes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== BusRoutes ===");
        BusRoutes sol = new BusRoutes();
        System.out.println(sol.solve(null));
    }
}
