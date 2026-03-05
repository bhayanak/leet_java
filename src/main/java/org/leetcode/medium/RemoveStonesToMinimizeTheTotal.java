package org.leetcode.medium;


/**
 * <b>#1962 - Remove Stones to Minimize the Total</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array piles, where piles[i] represents the number of stones in the ith pile, and an integer k. You should apply the following operation exactly k times:
 *
 *
 * Choose any piles[i] and remove floor(piles[i] / 2) stones from it.
 *
 * Notice that you can apply the operation on the same pile more than once.
 *
 *
 * Return the minimum possible total number of stones remaining after applying the k operations.
 *
 *
 * floor(x) is the largest integer that is smaller than or equal to x (i.e., rounds x down).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [5,4,9], k = 2
 * Output: 12
 * Explanation: Steps of a possible scenario are:
 * - Apply the operation on pile 2. The resulting piles are [5,4,5].
 * - Apply the operation on pile 0. The resulting piles are [3,4,5].
 * The total number of stones in [3,4,5] is 12.
 *
 * Example 2:
 *
 * Input: piles = [4,3,6,7], k = 3
 * Output: 12
 * Explanation: Steps of a possible scenario are:
 * - Apply the operation on pile 2. The resulting piles are [4,3,3,7].
 * - Apply the operation on pile 3. The resulting piles are [4,3,3,4].
 * - Apply the operation on pile 0. The resulting piles are [2,3,3,4].
 * The total number of stones in [2,3,3,4] is 12.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= piles.length &lt;= 105
 *
 * 1 &lt;= piles[i] &lt;= 104
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Choose the pile with the maximum number of stones each time.
 * Hint 2: Use a data structure that helps you find the mentioned pile each time efficiently.
 * Hint 3: One such data structure is a Priority Queue.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-stones-to-minimize-the-total/">LeetCode #1962</a>
 */
public class RemoveStonesToMinimizeTheTotal {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove Stones to Minimize the Total");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RemoveStonesToMinimizeTheTotal ===");
        RemoveStonesToMinimizeTheTotal sol = new RemoveStonesToMinimizeTheTotal();
        System.out.println(sol.solve(null));
    }
}
