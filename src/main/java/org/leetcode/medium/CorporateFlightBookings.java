package org.leetcode.medium;


/**
 * <b>#1109 - Corporate Flight Bookings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n flights that are labeled from 1 to n.
 *
 *
 * You are given an array of flight bookings bookings, where bookings[i] = [firsti, lasti, seatsi] represents a booking for flights firsti through lasti (inclusive) with seatsi seats reserved for each flight in the range.
 *
 *
 * Return an array answer of length n, where answer[i] is the total number of seats reserved for flight i.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
 * Output: [10,55,45,25,25]
 * Explanation:
 * Flight labels:        1   2   3   4   5
 * Booking 1 reserved:  10  10
 * Booking 2 reserved:      20  20
 * Booking 3 reserved:      25  25  25  25
 * Total seats:         10  55  45  25  25
 * Hence, answer = [10,55,45,25,25]
 *
 * Example 2:
 *
 * Input: bookings = [[1,2,10],[2,2,15]], n = 2
 * Output: [10,25]
 * Explanation:
 * Flight labels:        1   2
 * Booking 1 reserved:  10  10
 * Booking 2 reserved:      15
 * Total seats:         10  25
 * Hence, answer = [10,25]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * 1 &lt;= bookings.length &lt;= 2 * 104
 *
 * bookings[i].length == 3
 *
 * 1 &lt;= firsti &lt;= lasti &lt;= n
 *
 * 1 &lt;= seatsi &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/corporate-flight-bookings/">LeetCode #1109</a>
 */
public class CorporateFlightBookings {

    /**
     * TODO: Implement "Corporate Flight Bookings".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Corporate Flight Bookings");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CorporateFlightBookings.java &amp;&amp; java org.leetcode.medium.CorporateFlightBookings</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CorporateFlightBookings ===");
        CorporateFlightBookings sol = new CorporateFlightBookings();
        System.out.println(sol.solve(null));
    }
}
