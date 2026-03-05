package org.leetcode.medium;


/**
 * <b>#1871 - Jump Game VII</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed binary string s and two integers minJump and maxJump. In the beginning, you are standing at index 0, which is equal to '0'. You can move from index i to index j if the following conditions are fulfilled:
 *
 *
 * i + minJump &lt;= j &lt;= min(i + maxJump, s.length - 1), and
 *
 * s[j] == '0'.
 *
 * Return true if you can reach index s.length - 1 in s, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "011010", minJump = 2, maxJump = 3
 * Output: true
 * Explanation:
 * In the first step, move from index 0 to index 3. 
 * In the second step, move from index 3 to index 5.
 *
 * Example 2:
 *
 * Input: s = "01101110", minJump = 2, maxJump = 3
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 105
 *
 * s[i] is either '0' or '1'.
 *
 * s[0] == '0'
 *
 * 1 &lt;= minJump &lt;= maxJump &lt; s.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider for each reachable index i the interval [i + a, i + b].
 * Hint 2: Use partial sums to mark the intervals as reachable.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/jump-game-vii/">LeetCode #1871</a>
 */
public class JumpGameVii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game VII");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameVii ===");
        JumpGameVii sol = new JumpGameVii();
        System.out.println(sol.solve(null));
    }
}
