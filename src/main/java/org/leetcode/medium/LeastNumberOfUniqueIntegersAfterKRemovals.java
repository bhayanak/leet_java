package org.leetcode.medium;


/**
 * <b>#1481 - Least Number of Unique Integers after K Removals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
 *
 *
 *
 *
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: arr = [5,5,4], k = 1
 * Output: 1
 * Explanation: Remove the single 4, only 5 is left.
 *
 *
 * Example 2:
 *
 *
 *
 * Input: arr = [4,3,1,1,3,3,2], k = 3
 * Output: 2
 * Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= arr.length &lt;= 10^5
 *
 * 1 &lt;= arr[i] &lt;= 10^9
 *
 * 0 &lt;= k &lt;= arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a map to count the frequencies of the numbers in the array.
 * Hint 2: An optimal strategy is to remove the numbers with the smallest count first.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/">LeetCode #1481</a>
 */
public class LeastNumberOfUniqueIntegersAfterKRemovals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Least Number of Unique Integers after K Removals");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LeastNumberOfUniqueIntegersAfterKRemovals ===");
        LeastNumberOfUniqueIntegersAfterKRemovals sol = new LeastNumberOfUniqueIntegersAfterKRemovals();
        System.out.println(sol.solve(null));
    }
}
