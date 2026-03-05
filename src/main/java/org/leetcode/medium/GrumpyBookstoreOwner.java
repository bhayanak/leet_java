package org.leetcode.medium;


/**
 * <b>#1052 - Grumpy Bookstore Owner</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a bookstore owner that has a store open for n minutes. You are given an integer array customers of length n where customers[i] is the number of the customers that enter the store at the start of the ith minute and all those customers leave after the end of that minute.
 *
 *
 * During certain minutes, the bookstore owner is grumpy. You are given a binary array grumpy where grumpy[i] is 1 if the bookstore owner is grumpy during the ith minute, and is 0 otherwise.
 *
 *
 * When the bookstore owner is grumpy, the customers entering during that minute are not satisfied. Otherwise, they are satisfied.
 *
 *
 * The bookstore owner knows a secret technique to remain not grumpy for minutes consecutive minutes, but this technique can only be used once.
 *
 *
 * Return the maximum number of customers that can be satisfied throughout the day.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: customers = [1,0,1,2,1,1,7,5], grumpy = [0,1,0,1,0,1,0,1], minutes = 3
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * The bookstore owner keeps themselves not grumpy for the last 3 minutes.
 *
 *
 * The maximum number of customers that can be satisfied = 1 + 1 + 1 + 1 + 7 + 5 = 16.
 *
 * Example 2:
 *
 * Input: customers = [1], grumpy = [0], minutes = 1
 *
 *
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * n == customers.length == grumpy.length
 *
 * 1 &lt;= minutes &lt;= n &lt;= 2 * 104
 *
 * 0 &lt;= customers[i] &lt;= 1000
 *
 * grumpy[i] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Say the store owner uses their power in minute 1 to X and we have some answer A.  If they instead use their power from minute 2 to X+1, we only have to use data from minutes 1, 2, X and X+1 to update our answer A.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/grumpy-bookstore-owner/">LeetCode #1052</a>
 */
public class GrumpyBookstoreOwner {

    /**
     * TODO: Implement "Grumpy Bookstore Owner".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Grumpy Bookstore Owner");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac GrumpyBookstoreOwner.java &amp;&amp; java org.leetcode.medium.GrumpyBookstoreOwner</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== GrumpyBookstoreOwner ===");
        GrumpyBookstoreOwner sol = new GrumpyBookstoreOwner();
        System.out.println(sol.solve(null));
    }
}
