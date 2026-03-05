package org.leetcode.hard;


/**
 * <b>#1851 - Minimum Interval to Include Each Query</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Sweep Line, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array intervals, where intervals[i] = [lefti, righti] describes the ith interval starting at lefti and ending at righti (inclusive). The size of an interval is defined as the number of integers it contains, or more formally righti - lefti + 1.
 *
 *
 * You are also given an integer array queries. The answer to the jth query is the size of the smallest interval i such that lefti &lt;= queries[j] &lt;= righti. If no such interval exists, the answer is -1.
 *
 *
 * Return an array containing the answers to the queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: intervals = [[1,4],[2,4],[3,6],[4,4]], queries = [2,3,4,5]
 * Output: [3,3,1,4]
 * Explanation: The queries are processed as follows:
 * - Query = 2: The interval [2,4] is the smallest interval containing 2. The answer is 4 - 2 + 1 = 3.
 * - Query = 3: The interval [2,4] is the smallest interval containing 3. The answer is 4 - 2 + 1 = 3.
 * - Query = 4: The interval [4,4] is the smallest interval containing 4. The answer is 4 - 4 + 1 = 1.
 * - Query = 5: The interval [3,6] is the smallest interval containing 5. The answer is 6 - 3 + 1 = 4.
 *
 * Example 2:
 *
 * Input: intervals = [[2,3],[2,5],[1,8],[20,25]], queries = [2,19,5,22]
 * Output: [2,-1,4,6]
 * Explanation: The queries are processed as follows:
 * - Query = 2: The interval [2,3] is the smallest interval containing 2. The answer is 3 - 2 + 1 = 2.
 * - Query = 19: None of the intervals contain 19. The answer is -1.
 * - Query = 5: The interval [2,5] is the smallest interval containing 5. The answer is 5 - 2 + 1 = 4.
 * - Query = 22: The interval [20,25] is the smallest interval containing 22. The answer is 25 - 20 + 1 = 6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= intervals.length &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * intervals[i].length == 2
 *
 * 1 &lt;= lefti &lt;= righti &lt;= 107
 *
 * 1 &lt;= queries[j] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is there a way to order the intervals and queries such that it takes less time to query?
 * Hint 2: Is there a way to add and remove intervals by going from the smallest query to the largest query to find the minimum size?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sweep Line, Sorting, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-interval-to-include-each-query/">LeetCode #1851</a>
 */
public class MinimumIntervalToIncludeEachQuery {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Interval to Include Each Query");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumIntervalToIncludeEachQuery ===");
        MinimumIntervalToIncludeEachQuery sol = new MinimumIntervalToIncludeEachQuery();
        System.out.println(sol.solve(null));
    }
}
