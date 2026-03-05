package org.leetcode.medium;


/**
 * <b>#3561 - Resulting String After Adjacent Removals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters.
 *
 *
 * You must repeatedly perform the following operation while the string s has at least two consecutive characters:
 *
 *
 * Remove the leftmost pair of adjacent characters in the string that are consecutive in the alphabet, in either order (e.g., 'a' and 'b', or 'b' and 'a').
 *
 * Shift the remaining characters to the left to fill the gap.
 *
 * Return the resulting string after no more operations can be performed.
 *
 *
 * Note: Consider the alphabet as circular, thus 'a' and 'z' are consecutive.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 *
 *
 * Output: "c"
 *
 *
 * Explanation:
 *
 *
 * Remove "ab" from the string, leaving "c" as the remaining string.
 *
 * No further operations are possible. Thus, the resulting string after all possible removals is "c".
 *
 * Example 2:
 *
 * Input: s = "adcb"
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * Remove "dc" from the string, leaving "ab" as the remaining string.
 *
 * Remove "ab" from the string, leaving "" as the remaining string.
 *
 * No further operations are possible. Thus, the resulting string after all possible removals is "".
 *
 * Example 3:
 *
 * Input: s = "zadb"
 *
 *
 * Output: "db"
 *
 *
 * Explanation:
 *
 *
 * Remove "za" from the string, leaving "db" as the remaining string.
 *
 * No further operations are possible. Thus, the resulting string after all possible removals is "db".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Traverse the string from left to right and use a stack to perform the removals.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/resulting-string-after-adjacent-removals/">LeetCode #3561</a>
 */
public class ResultingStringAfterAdjacentRemovals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Resulting String After Adjacent Removals");
    }

    public static void main(String[] args) {
        System.out.println("=== ResultingStringAfterAdjacentRemovals ===");
        ResultingStringAfterAdjacentRemovals sol = new ResultingStringAfterAdjacentRemovals();
        System.out.println(sol.solve(null));
    }
}
