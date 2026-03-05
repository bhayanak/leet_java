package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #743: Network Delay Time
 * @see <a href="https://leetcode.com/problems/network-delay-time/">Problem</a>
 */
public class NetworkDelayTime {

    /**
     * LeetCode #743 – Network Delay Time
     * Difficulty: MEDIUM
     * Topics: Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path
     *
     * You are given a network of n nodes, labeled from 1 to n. You are also given
     * times, a list of travel times as directed edges times[i] = (ui, vi, wi),
     * where ui is the source node, vi is the target node, and wi is the time it
     * takes for a signal to travel from source to target.
     * 
     * 
     * We will send a signal from a given node k. Return the minimum time it takes
     * for all the n nodes to receive the signal. If it is impossible for all the
     * n nodes to receive the signal, return -1.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
     * Output: 2
     * 
     * Example 2:
     * 
     * Input: times = [[1,2,1]], n = 2, k = 1
     * Output: 1
     * 
     * Example 3:
     * 
     * Input: times = [[1,2,1]], n = 2, k = 2
     * Output: -1
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= k &lt;= n &lt;= 100
     * 
     * 1 &lt;= times.length &lt;= 6000
     * 
     * times[i].length == 3
     * 
     * 1 &lt;= ui, vi &lt;= n
     * 
     * ui != vi
     * 
     * 0 &lt;= wi &lt;= 100
     * 
     * All the pairs (ui, vi) are unique. (i.e., no multiple edges.)
     */
    // TODO: Implement solution for Network Delay Time
    // Difficulty: MEDIUM | Topics: Depth-First Search, Breadth-First Search, Graph Theory, Heap (Priority Queue), Shortest Path
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        NetworkDelayTime sol = new NetworkDelayTime();
        System.out.println(sol.solve());
    }
}
