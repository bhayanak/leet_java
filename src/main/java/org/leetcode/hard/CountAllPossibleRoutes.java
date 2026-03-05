package org.leetcode.hard;


/**
 * <b>#1575 - Count All Possible Routes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of distinct positive integers locations where locations[i] represents the position of city i. You are also given integers start, finish and fuel representing the starting city, ending city, and the initial amount of fuel you have, respectively.
 *
 *
 * At each step, if you are at city i, you can pick any city j such that j != i and 0 &lt;= j &lt; locations.length and move to city j. Moving from city i to city j reduces the amount of fuel you have by |locations[i] - locations[j]|. Please notice that |x| denotes the absolute value of x.
 *
 *
 * Notice that fuel cannot become negative at any point in time, and that you are allowed to visit any city more than once (including start and finish).
 *
 *
 * Return the count of all possible routes from start to finish. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: locations = [2,3,6,8,4], start = 1, finish = 3, fuel = 5
 * Output: 4
 * Explanation: The following are all possible routes, each uses 5 units of fuel:
 * 1 -&gt; 3
 * 1 -&gt; 2 -&gt; 3
 * 1 -&gt; 4 -&gt; 3
 * 1 -&gt; 4 -&gt; 2 -&gt; 3
 *
 * Example 2:
 *
 * Input: locations = [4,3,1], start = 1, finish = 0, fuel = 6
 * Output: 5
 * Explanation: The following are all possible routes:
 * 1 -&gt; 0, used fuel = 1
 * 1 -&gt; 2 -&gt; 0, used fuel = 5
 * 1 -&gt; 2 -&gt; 1 -&gt; 0, used fuel = 5
 * 1 -&gt; 0 -&gt; 1 -&gt; 0, used fuel = 3
 * 1 -&gt; 0 -&gt; 1 -&gt; 0 -&gt; 1 -&gt; 0, used fuel = 5
 *
 * Example 3:
 *
 * Input: locations = [5,2,1], start = 0, finish = 2, fuel = 3
 * Output: 0
 * Explanation: It is impossible to get from 0 to 2 using only 3 units of fuel since the shortest route needs 4 units of fuel.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= locations.length &lt;= 100
 *
 * 1 &lt;= locations[i] &lt;= 109
 *
 * All integers in locations are distinct.
 *
 * 0 &lt;= start, finish &lt; locations.length
 *
 * 1 &lt;= fuel &lt;= 200
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to solve this problem with each state defined by the city index and fuel left.
 * Hint 2: Since the array contains distinct integers fuel will always be spent in each move and so there can be no cycles.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Memoization).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-all-possible-routes/">LeetCode #1575</a>
 */
public class CountAllPossibleRoutes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count All Possible Routes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountAllPossibleRoutes ===");
        CountAllPossibleRoutes sol = new CountAllPossibleRoutes();
        System.out.println(sol.solve(null));
    }
}
