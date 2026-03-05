package org.leetcode.medium;


/**
 * <b>#2100 - Find Good Days to Rob the Bank</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You and a gang of thieves are planning on robbing a bank. You are given a 0-indexed integer array security, where security[i] is the number of guards on duty on the ith day. The days are numbered starting from 0. You are also given an integer time.
 *
 *
 * The ith day is a good day to rob the bank if:
 *
 *
 * There are at least time days before and after the ith day,
 *
 * The number of guards at the bank for the time days before i are non-increasing, and
 *
 * The number of guards at the bank for the time days after i are non-decreasing.
 *
 * More formally, this means day i is a good day to rob the bank if and only if security[i - time] &gt;= security[i - time + 1] &gt;= ... &gt;= security[i] &lt;= ... &lt;= security[i + time - 1] &lt;= security[i + time].
 *
 *
 * Return a list of all days (0-indexed) that are good days to rob the bank. The order that the days are returned in does not matter.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: security = [5,3,3,3,5,6,2], time = 2
 * Output: [2,3]
 * Explanation:
 * On day 2, we have security[0] &gt;= security[1] &gt;= security[2] &lt;= security[3] &lt;= security[4].
 * On day 3, we have security[1] &gt;= security[2] &gt;= security[3] &lt;= security[4] &lt;= security[5].
 * No other days satisfy this condition, so days 2 and 3 are the only good days to rob the bank.
 *
 * Example 2:
 *
 * Input: security = [1,1,1,1,1], time = 0
 * Output: [0,1,2,3,4]
 * Explanation:
 * Since time equals 0, every day is a good day to rob the bank, so return every day.
 *
 * Example 3:
 *
 * Input: security = [1,2,3,4,5,6], time = 2
 * Output: []
 * Explanation:
 * No day has 2 days before it that have a non-increasing number of guards.
 * Thus, no day is a good day to rob the bank, so return an empty list.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= security.length &lt;= 105
 *
 * 0 &lt;= security[i], time &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The trivial solution is to check the time days before and after each day. There are a lot of repeated operations using this solution. How could we optimize this solution?
 * Hint 2: We can use precomputation to make the solution faster.
 * Hint 3: Use an array to store the number of days before the i<sup>th</sup> day that is non-increasing, and another array to store the number of days after the i<sup>th</sup> day that is non-decreasing.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-good-days-to-rob-the-bank/">LeetCode #2100</a>
 */
public class FindGoodDaysToRobTheBank {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Good Days to Rob the Bank");
    }

    public static void main(String[] args) {
        System.out.println("=== FindGoodDaysToRobTheBank ===");
        FindGoodDaysToRobTheBank sol = new FindGoodDaysToRobTheBank();
        System.out.println(sol.solve(null));
    }
}
