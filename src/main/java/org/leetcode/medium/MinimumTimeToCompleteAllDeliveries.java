package org.leetcode.medium;


/**
 * <b>#3733 - Minimum Time to Complete All Deliveries</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays of size 2: d = [d1, d2] and r = [r1, r2].
 *
 *
 * Two delivery drones are tasked with completing a specific number of deliveries. Drone i must complete di deliveries.
 *
 *
 * Each delivery takes exactly one hour and only one drone can make a delivery at any given hour.
 *
 *
 * Additionally, both drones require recharging at specific intervals during which they cannot make deliveries. Drone i must recharge every ri hours (i.e. at hours that are multiples of ri).
 *
 *
 * Return an integer denoting the minimum total time (in hours) required to complete all deliveries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: d = [3,1], r = [2,3]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The first drone delivers at hours 1, 3, 5 (recharges at hours 2, 4).
 *
 * The second drone delivers at hour 2 (recharges at hour 3).
 *
 * Example 2:
 *
 * Input: d = [1,3], r = [2,2]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * The first drone delivers at hour 3 (recharges at hours 2, 4, 6).
 *
 * The second drone delivers at hours 1, 5, 7 (recharges at hours 2, 4, 6).
 *
 * Example 3:
 *
 * Input: d = [2,1], r = [3,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The first drone delivers at hours 1, 2 (recharges at hour 3).
 *
 * The second drone delivers at hour 3.
 *
 *
 *
 * Constraints:
 *
 *
 * d = [d1, d2]
 *
 * 1 &lt;= di &lt;= 109
 *
 * r = [r1, r2]
 *
 * 2 &lt;= ri &lt;= 3 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use binary search on the total time <code>T</code>.
 * Hint 2: At hours divisible by <code>lcm(r1, r2)</code>, both drones are recharging (unavailable).
 * Hint 3: For a fixed <code>T</code>, recharge counts are <code>floor(T / r1)</code> and <code>floor(T / r2)</code>.
 * Hint 4: Available hours: <code>c1 = T - floor(T / r1)</code>, <code>c2 = T - floor(T / r2)</code>; shared hours = <code>T - floor(T / r1) - floor(T / r2) + floor(T / lcm(r1,r2))</code>.
 * Hint 5: Assign each drone its exclusive/available hours first; remaining deliveries must fit into the <code>shared</code> hours.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-complete-all-deliveries/">LeetCode #3733</a>
 */
public class MinimumTimeToCompleteAllDeliveries {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Complete All Deliveries");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToCompleteAllDeliveries ===");
        MinimumTimeToCompleteAllDeliveries sol = new MinimumTimeToCompleteAllDeliveries();
        System.out.println(sol.solve(null));
    }
}
