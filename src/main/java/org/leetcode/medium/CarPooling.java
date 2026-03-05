package org.leetcode.medium;


/**
 * <b>#1094 - Car Pooling</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).
 *
 *
 * You are given the integer capacity and an array trips where trips[i] = [numPassengersi, fromi, toi] indicates that the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi respectively. The locations are given as the number of kilometers due east from the car's initial location.
 *
 *
 * Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 4
 * Output: false
 *
 * Example 2:
 *
 * Input: trips = [[2,1,5],[3,3,7]], capacity = 5
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= trips.length &lt;= 1000
 *
 * trips[i].length == 3
 *
 * 1 &lt;= numPassengersi &lt;= 100
 *
 * 0 &lt;= fromi &lt; toi &lt;= 1000
 *
 * 1 &lt;= capacity &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the pickup and dropoff events by location, then process them in order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue), Simulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/car-pooling/">LeetCode #1094</a>
 */
public class CarPooling {

    /**
     * TODO: Implement "Car Pooling".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Car Pooling");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CarPooling.java &amp;&amp; java org.leetcode.medium.CarPooling</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CarPooling ===");
        CarPooling sol = new CarPooling();
        System.out.println(sol.solve(null));
    }
}
