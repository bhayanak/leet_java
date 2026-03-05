package org.leetcode.hard;


/**
 * <b>#871 - Minimum Number of Refueling Stops</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A car travels from a starting position to a destination which is target miles east of the starting position.
 *
 *
 * There are gas stations along the way. The gas stations are represented as an array stations where stations[i] = [positioni, fueli] indicates that the ith gas station is positioni miles east of the starting position and has fueli liters of gas.
 *
 *
 * The car starts with an infinite tank of gas, which initially has startFuel liters of fuel in it. It uses one liter of gas per one mile that it drives. When the car reaches a gas station, it may stop and refuel, transferring all the gas from the station into the car.
 *
 *
 * Return the minimum number of refueling stops the car must make in order to reach its destination. If it cannot reach the destination, return -1.
 *
 *
 * Note that if the car reaches a gas station with 0 fuel left, the car can still refuel there. If the car reaches the destination with 0 fuel left, it is still considered to have arrived.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = 1, startFuel = 1, stations = []
 * Output: 0
 * Explanation: We can reach the target without refueling.
 *
 * Example 2:
 *
 * Input: target = 100, startFuel = 1, stations = [[10,100]]
 * Output: -1
 * Explanation: We can not reach the target (or even the first gas station).
 *
 * Example 3:
 *
 * Input: target = 100, startFuel = 10, stations = [[10,60],[20,30],[30,30],[60,40]]
 * Output: 2
 * Explanation: We start with 10 liters of fuel.
 * We drive to position 10, expending 10 liters of fuel.  We refuel from 0 liters to 60 liters of gas.
 * Then, we drive from position 10 to position 60 (expending 50 liters of fuel),
 * and refuel from 10 liters to 50 liters of gas.  We then drive to and reach the target.
 * We made 2 refueling stops along the way, so we return 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target, startFuel &lt;= 109
 *
 * 0 &lt;= stations.length &lt;= 500
 *
 * 1 &lt;= positioni &lt; positioni+1 &lt; target
 *
 * 1 &lt;= fueli &lt; 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-refueling-stops/">LeetCode #871</a>
 */
public class MinimumNumberOfRefuelingStops {

    /**
     * TODO: Implement "Minimum Number of Refueling Stops".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Refueling Stops");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumNumberOfRefuelingStops.java &amp;&amp; java org.leetcode.hard.MinimumNumberOfRefuelingStops</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfRefuelingStops ===");
        MinimumNumberOfRefuelingStops sol = new MinimumNumberOfRefuelingStops();
        System.out.println(sol.solve(null));
    }
}
