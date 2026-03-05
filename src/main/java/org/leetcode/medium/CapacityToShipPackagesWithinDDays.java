package org.leetcode.medium;


/**
 * <b>#1011 - Capacity To Ship Packages Within D Days</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A conveyor belt has packages that must be shipped from one port to another within days days.
 *
 *
 * The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
 *
 *
 * Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
 * Output: 15
 * Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
 * 1st day: 1, 2, 3, 4, 5
 * 2nd day: 6, 7
 * 3rd day: 8
 * 4th day: 9
 * 5th day: 10
 *
 * Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
 *
 * Example 2:
 *
 * Input: weights = [3,2,2,4,1,4], days = 3
 * Output: 6
 * Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
 * 1st day: 3, 2
 * 2nd day: 2, 4
 * 3rd day: 1, 4
 *
 * Example 3:
 *
 * Input: weights = [1,2,3,1,1], days = 4
 * Output: 3
 * Explanation:
 * 1st day: 1
 * 2nd day: 2
 * 3rd day: 3
 * 4th day: 1, 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= days &lt;= weights.length &lt;= 5 * 104
 *
 * 1 &lt;= weights[i] &lt;= 500
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary search on the answer.  We need a function possible(capacity) which returns true if and only if we can do the task in D days.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/">LeetCode #1011</a>
 */
public class CapacityToShipPackagesWithinDDays {

    /**
     * Solves the problem: Ship within days.
     * Uses binary search for O(log n) lookup.
     *
     * @param weights the weights (int[])
     * @param days the days (int)
     * @return the computed int result
     */
    public int shipWithinDays(int[] weights, int days) {
        int lo = 0, hi = 0;
        for (int w : weights) { lo = Math.max(lo, w); hi += w; }
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canShip(weights, days, mid)) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }
    private boolean canShip(int[] w, int days, int cap) {
        int d = 1, cur = 0;
        for (int wt : w) { if (cur + wt > cap) { d++; cur = 0; } cur += wt; }
        return d <= days;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CapacityToShipPackagesWithinDDays.java &amp;&amp; java org.leetcode.medium.CapacityToShipPackagesWithinDDays</pre>
     */
    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays sol = new CapacityToShipPackagesWithinDDays();
                System.out.println(sol.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5)); // 15
                System.out.println(sol.shipWithinDays(new int[]{3,2,2,4,1,4}, 3)); // 6
                System.out.println(sol.shipWithinDays(new int[]{1,2,3,1,1}, 4)); // 3
    }
}
