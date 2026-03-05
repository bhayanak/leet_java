package org.leetcode.medium;


/**
 * <b>#2187 - Minimum Time to Complete Trips</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array time where time[i] denotes the time taken by the ith bus to complete one trip.
 *
 *
 * Each bus can make multiple trips successively; that is, the next trip can start immediately after completing the current trip. Also, each bus operates independently; that is, the trips of one bus do not influence the trips of any other bus.
 *
 *
 * You are also given an integer totalTrips, which denotes the number of trips all buses should make in total. Return the minimum time required for all buses to complete at least totalTrips trips.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: time = [1,2,3], totalTrips = 5
 * Output: 3
 * Explanation:
 * - At time t = 1, the number of trips completed by each bus are [1,0,0]. 
 *   The total number of trips completed is 1 + 0 + 0 = 1.
 * - At time t = 2, the number of trips completed by each bus are [2,1,0]. 
 *   The total number of trips completed is 2 + 1 + 0 = 3.
 * - At time t = 3, the number of trips completed by each bus are [3,1,1]. 
 *   The total number of trips completed is 3 + 1 + 1 = 5.
 * So the minimum time needed for all buses to complete at least 5 trips is 3.
 *
 * Example 2:
 *
 * Input: time = [2], totalTrips = 1
 * Output: 2
 * Explanation:
 * There is only one bus, and it will complete its first trip at t = 2.
 * So the minimum time needed to complete 1 trip is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= time.length &lt;= 105
 *
 * 1 &lt;= time[i], totalTrips &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a given amount of time, how can we count the total number of trips completed by all buses within that time?
 * Hint 2: Consider using binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/minimum-time-to-complete-trips/">LeetCode #2187</a>
 */
public class MinimumTimeToCompleteTrips {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Time to Complete Trips");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumTimeToCompleteTrips ===");
        MinimumTimeToCompleteTrips sol = new MinimumTimeToCompleteTrips();
        System.out.println(sol.solve(null));
    }
}
