package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #787: Cheapest Flights Within K Stops
 * @see <a href="https://leetcode.com/problems/cheapest-flights-within-k-stops/">Problem</a>
 */
public class CheapestFlightsWithinKStops {

    /**
     * LeetCode #787 – Cheapest Flights Within K Stops
     * Difficulty: MEDIUM
     * Topics: Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path
     *
     * There are n cities connected by some number of flights. You are given an
     * array flights where flights[i] = [fromi, toi, pricei] indicates that there
     * is a flight from city fromi to city toi with cost pricei.
     * 
     * 
     * You are also given three integers src, dst, and k, return the cheapest
     * price from src to dst with at most k stops. If there is no such route,
     * return -1.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: n = 4, flights =
     * [[0,1,100],[1,2,100],[2,0,100],[1,3,600],[2,3,200]], src = 0, dst = 3, k =
     * 1
     * Output: 700
     * Explanation:
     * The graph is shown above.
     * The optimal path with at most 1 stop from city 0 to 3 is marked in red and
     * has cost 100 + 600 = 700.
     * Note that the path through cities [0,1,2,3] is cheaper but is invalid
     * because it uses 2 stops.
     * 
     * Example 2:
     * 
     * Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2,
     * k = 1
     * Output: 200
     * Explanation:
     * The graph is shown above.
     * The optimal path with at most 1 stop from city 0 to 2 is marked in red and
     * has cost 100 + 100 = 200.
     * 
     * Example 3:
     * 
     * Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2,
     * k = 0
     * Output: 500
     * Explanation:
     * The graph is shown above.
     * The optimal path with no stops from city 0 to 2 is marked in red and has
     * cost 500.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 2 &lt;= n &lt;= 100
     * 
     * 0 &lt;= flights.length &lt;= (n * (n - 1) / 2)
     * 
     * flights[i].length == 3
     * 
     * 0 &lt;= fromi, toi &lt; n
     * 
     * fromi != toi
     * 
     * 1 &lt;= pricei &lt;= 104
     * 
     * There will not be any multiple flights between two cities.
     * 
     * 0 &lt;= src, dst, k &lt; n
     * 
     * src != dst
     */
    // TODO: Implement solution for Cheapest Flights Within K Stops
    // Difficulty: MEDIUM | Topics: Dynamic Programming, Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path
    /**
     * Solves the problem and Solve.
     * Uses a heap/priority queue for efficient ordering.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        CheapestFlightsWithinKStops sol = new CheapestFlightsWithinKStops();
        System.out.println(sol.solve());
    }
}
