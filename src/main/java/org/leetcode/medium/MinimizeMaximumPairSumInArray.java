package org.leetcode.medium;


/**
 * <b>#1877 - Minimize Maximum Pair Sum in Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The pair sum of a pair (a,b) is equal to a + b. The maximum pair sum is the largest pair sum in a list of pairs.
 *
 *
 *
 *
 * For example, if we have pairs (1,5), (2,3), and (4,4), the maximum pair sum would be max(1+5, 2+3, 4+4) = max(6, 5, 8) = 8.
 *
 *
 *
 * Given an array nums of even length n, pair up the elements of nums into n / 2 pairs such that:
 *
 *
 *
 *
 * Each element of nums is in exactly one pair, and
 *
 * The maximum pair sum is minimized.
 *
 *
 *
 * Return the minimized maximum pair sum after optimally pairing up the elements.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: nums = [3,5,2,3]
 * Output: 7
 * Explanation: The elements can be paired up into pairs (3,3) and (5,2).
 * The maximum pair sum is max(3+3, 5+2) = max(6, 7) = 7.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: nums = [3,5,4,2,4,6]
 * Output: 8
 * Explanation: The elements can be paired up into pairs (3,5), (4,4), and (6,2).
 * The maximum pair sum is max(3+5, 4+4, 6+2) = max(8, 8, 8) = 8.
 *
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
 * n == nums.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * n is even.
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Would sorting help find the optimal order?
 * Hint 2: Given a specific element, how would you minimize its specific pairwise sum?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/">LeetCode #1877</a>
 */
public class MinimizeMaximumPairSumInArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize Maximum Pair Sum in Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimizeMaximumPairSumInArray ===");
        MinimizeMaximumPairSumInArray sol = new MinimizeMaximumPairSumInArray();
        System.out.println(sol.solve(null));
    }
}
