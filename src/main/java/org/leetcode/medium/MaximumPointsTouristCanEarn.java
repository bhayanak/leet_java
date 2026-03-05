package org.leetcode.medium;


/**
 * <b>#3332 - Maximum Points Tourist Can Earn</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers, n and k, along with two 2D integer arrays, stayScore and travelScore.
 *
 *
 * A tourist is visiting a country with n cities, where each city is directly connected to every other city. The tourist's journey consists of exactly k 0-indexed days, and they can choose any city as their starting point.
 *
 *
 * Each day, the tourist has two choices:
 *
 *
 * Stay in the current city: If the tourist stays in their current city curr during day i, they will earn stayScore[i][curr] points.
 *
 * Move to another city: If the tourist moves from their current city curr to city dest, they will earn travelScore[curr][dest] points.
 *
 * Return the maximum possible points the tourist can earn.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, k = 1, stayScore = [[2,3]], travelScore = [[0,2],[1,0]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The tourist earns the maximum number of points by starting in city 1 and staying in that city.
 *
 * Example 2:
 *
 * Input: n = 3, k = 2, stayScore = [[3,4,2],[2,1,2]], travelScore = [[0,2,1],[2,0,4],[3,2,0]]
 *
 *
 * Output: 8
 *
 *
 * Explanation:
 *
 *
 * The tourist earns the maximum number of points by starting in city 1, staying in that city on day 0, and traveling to city 2 on day 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 200
 *
 * 1 &lt;= k &lt;= 200
 *
 * n == travelScore.length == travelScore[i].length == stayScore[i].length
 *
 * k == stayScore.length
 *
 * 1 &lt;= stayScore[i][j] &lt;= 100
 *
 * 0 &lt;= travelScore[i][j] &lt;= 100
 *
 * travelScore[i][i] == 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DP.
 * Hint 2: <code>dp[i][j]</code> is the maximum score that you can achieve in your last <code>i</code> actions by starting from city <code>j</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-points-tourist-can-earn/">LeetCode #3332</a>
 */
public class MaximumPointsTouristCanEarn {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Points Tourist Can Earn");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumPointsTouristCanEarn ===");
        MaximumPointsTouristCanEarn sol = new MaximumPointsTouristCanEarn();
        System.out.println(sol.solve(null));
    }
}
