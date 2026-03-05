package org.leetcode.medium;


/**
 * <b>#849 - Maximize Distance to Closest Person</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array representing a row of seats where seats[i] = 1 represents a person sitting in the ith seat, and seats[i] = 0 represents that the ith seat is empty (0-indexed).
 *
 *
 * There is at least one empty seat, and at least one person sitting.
 *
 *
 * Alex wants to sit in the seat such that the distance between him and the closest person to him is maximized. 
 *
 *
 * Return that maximum distance to the closest person.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: seats = [1,0,0,0,1,0,1]
 * Output: 2
 * Explanation: 
 * If Alex sits in the second open seat (i.e. seats[2]), then the closest person has distance 2.
 * If Alex sits in any other open seat, the closest person has distance 1.
 * Thus, the maximum distance to the closest person is 2.
 *
 * Example 2:
 *
 * Input: seats = [1,0,0,0]
 * Output: 3
 * Explanation: 
 * If Alex sits in the last seat (i.e. seats[3]), the closest person is 3 seats away.
 * This is the maximum distance possible, so the answer is 3.
 *
 * Example 3:
 *
 * Input: seats = [0,1]
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= seats.length &lt;= 2 * 104
 *
 * seats[i] is 0 or 1.
 *
 * At least one seat is empty.
 *
 * At least one seat is occupied.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximize-distance-to-closest-person/">LeetCode #849</a>
 */
public class MaximizeDistanceToClosestPerson {

    /**
     * TODO: Implement "Maximize Distance to Closest Person".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Distance to Closest Person");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximizeDistanceToClosestPerson.java &amp;&amp; java org.leetcode.medium.MaximizeDistanceToClosestPerson</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximizeDistanceToClosestPerson ===");
        MaximizeDistanceToClosestPerson sol = new MaximizeDistanceToClosestPerson();
        System.out.println(sol.solve(null));
    }
}
