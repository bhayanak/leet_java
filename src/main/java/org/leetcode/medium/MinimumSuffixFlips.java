package org.leetcode.medium;


/**
 * <b>#1529 - Minimum Suffix Flips</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed binary string target of length n. You have another binary string s of length n that is initially set to all zeros. You want to make s equal to target.
 *
 *
 * In one operation, you can pick an index i where 0 &lt;= i &lt; n and flip all bits in the inclusive range [i, n - 1]. Flip means changing '0' to '1' and '1' to '0'.
 *
 *
 * Return the minimum number of operations needed to make s equal to target.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = "10111"
 * Output: 3
 * Explanation: Initially, s = "00000".
 * Choose index i = 2: "00000" -&gt; "00111"
 * Choose index i = 0: "00111" -&gt; "11000"
 * Choose index i = 1: "11000" -&gt; "10111"
 * We need at least 3 flip operations to form target.
 *
 * Example 2:
 *
 * Input: target = "101"
 * Output: 3
 * Explanation: Initially, s = "000".
 * Choose index i = 0: "000" -&gt; "111"
 * Choose index i = 1: "111" -&gt; "100"
 * Choose index i = 2: "100" -&gt; "101"
 * We need at least 3 flip operations to form target.
 *
 * Example 3:
 *
 * Input: target = "00000"
 * Output: 0
 * Explanation: We do not need any operations since the initial s already equals target.
 *
 *
 *
 * Constraints:
 *
 *
 * n == target.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * target[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider a strategy where the choice of bulb with number i is increasing. In such a strategy, you no longer need to worry about bulbs that have been set to the left.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-suffix-flips/">LeetCode #1529</a>
 */
public class MinimumSuffixFlips {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Suffix Flips");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumSuffixFlips ===");
        MinimumSuffixFlips sol = new MinimumSuffixFlips();
        System.out.println(sol.solve(null));
    }
}
