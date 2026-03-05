package org.leetcode.medium;


/**
 * <b>#1717 - Maximum Score From Removing Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and two integers x and y. You can perform two types of operations any number of times.
 *
 *
 * Remove substring "ab" and gain x points.
 *
 *
 *
 *
 * For example, when removing "ab" from "cabxbae" it becomes "cxbae".
 *
 *
 *
 * Remove substring "ba" and gain y points.
 *
 *
 *
 * For example, when removing "ba" from "cabxbae" it becomes "cabxe".
 *
 *
 *
 * Return the maximum points you can gain after applying the above operations on s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "cdbcbbaaabab", x = 4, y = 5
 * Output: 19
 * Explanation:
 * - Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
 * - Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
 * - Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
 * - Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
 * Total score = 5 + 4 + 5 + 5 = 19.
 *
 * Example 2:
 *
 * Input: s = "aabbaaxybbaabb", x = 5, y = 4
 * Output: 20
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * 1 &lt;= x, y &lt;= 104
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that it is always more optimal to take one type of substring before another
 * Hint 2: You can use a stack to handle erasures
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-from-removing-substrings/">LeetCode #1717</a>
 */
public class MaximumScoreFromRemovingSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score From Removing Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumScoreFromRemovingSubstrings ===");
        MaximumScoreFromRemovingSubstrings sol = new MaximumScoreFromRemovingSubstrings();
        System.out.println(sol.solve(null));
    }
}
