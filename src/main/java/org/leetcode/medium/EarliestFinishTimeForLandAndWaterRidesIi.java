package org.leetcode.medium;


/**
 * <b>#3635 - Earliest Finish Time for Land and Water Rides II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two categories of theme park attractions: land rides and water rides.
 *
 *
 * Land rides
 *
 *
 *
 *
 * landStartTime[i] – the earliest time the ith land ride can be boarded.
 *
 * landDuration[i] – how long the ith land ride lasts.
 *
 *
 *
 * Water rides
 *
 *
 *
 * waterStartTime[j] – the earliest time the jth water ride can be boarded.
 *
 * waterDuration[j] – how long the jth water ride lasts.
 *
 *
 *
 * A tourist must experience exactly one ride from each category, in either order.
 *
 *
 * A ride may be started at its opening time or any later moment.
 *
 * If a ride is started at time t, it finishes at time t + duration.
 *
 * Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.
 *
 * Return the earliest possible time at which the tourist can finish both rides.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: landStartTime = [2,8], landDuration = [4,1], waterStartTime = [6], waterDuration = [3]
 *
 *
 * Output: 9
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * Plan A (land ride 0 → water ride 0):
 *
 *
 *
 * Start land ride 0 at time landStartTime[0] = 2. Finish at 2 + landDuration[0] = 6.
 *
 * Water ride 0 opens at time waterStartTime[0] = 6. Start immediately at 6, finish at 6 + waterDuration[0] = 9.
 *
 *
 *
 * Plan B (water ride 0 → land ride 1):
 *
 *
 *
 * Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
 *
 * Land ride 1 opens at landStartTime[1] = 8. Start at time 9, finish at 9 + landDuration[1] = 10.
 *
 *
 *
 * Plan C (land ride 1 → water ride 0):
 *
 *
 *
 * Start land ride 1 at time landStartTime[1] = 8. Finish at 8 + landDuration[1] = 9.
 *
 * Water ride 0 opened at waterStartTime[0] = 6. Start at time 9, finish at 9 + waterDuration[0] = 12.
 *
 *
 *
 * Plan D (water ride 0 → land ride 0):
 *
 *
 *
 * Start water ride 0 at time waterStartTime[0] = 6. Finish at 6 + waterDuration[0] = 9.
 *
 * Land ride 0 opened at landStartTime[0] = 2. Start at time 9, finish at 9 + landDuration[0] = 13.
 *
 *
 *
 * Plan A gives the earliest finish time of 9.
 *
 * Example 2:
 *
 * Input: landStartTime = [5], landDuration = [3], waterStartTime = [1], waterDuration = [10]
 *
 *
 * Output: 14
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * Plan A (water ride 0 → land ride 0):
 *
 *
 *
 * Start water ride 0 at time waterStartTime[0] = 1. Finish at 1 + waterDuration[0] = 11.
 *
 * Land ride 0 opened at landStartTime[0] = 5. Start immediately at 11 and finish at 11 + landDuration[0] = 14.
 *
 *
 *
 * Plan B (land ride 0 → water ride 0):
 *
 *
 *
 * Start land ride 0 at time landStartTime[0] = 5. Finish at 5 + landDuration[0] = 8.
 *
 * Water ride 0 opened at waterStartTime[0] = 1. Start immediately at 8 and finish at 8 + waterDuration[0] = 18.
 *
 *
 *
 * Plan A provides the earliest finish time of 14.​​​​​​​
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 5 * 104
 *
 * landStartTime.length == landDuration.length == n
 *
 * waterStartTime.length == waterDuration.length == m
 *
 * 1 &lt;= landStartTime[i], landDuration[i], waterStartTime[j], waterDuration[j] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort each ride list by opening time and build a prefix minimum of ride durations and a suffix minimum of ride finish times (<code>start + duration</code>).
 * Hint 2: Try both orders, land then water and water then land. For each ride in the first list compute <code>finish1 = start1 + duration1</code>.
 * Hint 3: Binary‑search the second list (sorted by <code>start</code>) to split rides into those with <code>start &lt;= finish1</code> and those with <code>start &gt; finish1</code>. Use the prefix minimum duration on the early group to get an earliest finish of <code>finish1 + minDuration</code> and the suffix minimum finish time on the late group.
 * Hint 4: For each pairing take the smaller finish time and track the overall minimum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/">LeetCode #3635</a>
 */
public class EarliestFinishTimeForLandAndWaterRidesIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Earliest Finish Time for Land and Water Rides II");
    }

    public static void main(String[] args) {
        System.out.println("=== EarliestFinishTimeForLandAndWaterRidesIi ===");
        EarliestFinishTimeForLandAndWaterRidesIi sol = new EarliestFinishTimeForLandAndWaterRidesIi();
        System.out.println(sol.solve(null));
    }
}
