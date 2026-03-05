package org.leetcode.hard;


/**
 * <b>#1478 - Allocate Mailboxes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array houses where houses[i] is the location of the ith house along a street and an integer k, allocate k mailboxes in the street.
 *
 *
 * Return the minimum total distance between each house and its nearest mailbox.
 *
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: houses = [1,4,8,10,20], k = 3
 * Output: 5
 * Explanation: Allocate mailboxes in position 3, 9 and 20.
 * Minimum total distance from each houses to nearest mailboxes is |3-1| + |4-3| + |9-8| + |10-9| + |20-20| = 5 
 *
 * Example 2:
 *
 * Input: houses = [2,3,5,12,18], k = 2
 * Output: 9
 * Explanation: Allocate mailboxes in position 3 and 14.
 * Minimum total distance from each houses to nearest mailboxes is |2-3| + |3-3| + |5-3| + |12-14| + |18-14| = 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= houses.length &lt;= 100
 *
 * 1 &lt;= houses[i] &lt;= 104
 *
 * All the integers of houses are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If k =1, the minimum distance is obtained allocating the mailbox in the median of the array houses.
 * Hint 2: Generalize this idea, using dynamic programming allocating k mailboxes.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/allocate-mailboxes/">LeetCode #1478</a>
 */
public class AllocateMailboxes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Allocate Mailboxes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== AllocateMailboxes ===");
        AllocateMailboxes sol = new AllocateMailboxes();
        System.out.println(sol.solve(null));
    }
}
