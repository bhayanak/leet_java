package org.leetcode.medium;


/**
 * <b>#1029 - Two City Scheduling</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti], the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.
 *
 *
 * Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: costs = [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation: 
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 *
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 *
 * Example 2:
 *
 * Input: costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
 * Output: 1859
 *
 * Example 3:
 *
 * Input: costs = [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]
 * Output: 3086
 *
 *
 *
 * Constraints:
 *
 *
 * 2 * n == costs.length
 *
 * 2 &lt;= costs.length &lt;= 100
 *
 * costs.length is even.
 *
 * 1 &lt;= aCosti, bCosti &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/two-city-scheduling/">LeetCode #1029</a>
 */
public class TwoCityScheduling {

    /**
     * TODO: Implement "Two City Scheduling".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Two City Scheduling");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac TwoCityScheduling.java &amp;&amp; java org.leetcode.medium.TwoCityScheduling</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== TwoCityScheduling ===");
        TwoCityScheduling sol = new TwoCityScheduling();
        System.out.println(sol.solve(null));
    }
}
