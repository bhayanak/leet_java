package org.leetcode.medium;


/**
 * <b>#2380 - Time Needed to Rearrange a Binary String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Dynamic Programming, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s. In one second, all occurrences of "01" are simultaneously replaced with "10". This process repeats until no occurrences of "01" exist.
 *
 *
 * Return the number of seconds needed to complete this process.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0110101"
 * Output: 4
 * Explanation: 
 * After one second, s becomes "1011010".
 * After another second, s becomes "1101100".
 * After the third second, s becomes "1110100".
 * After the fourth second, s becomes "1111000".
 * No occurrence of "01" exists any longer, and the process needed 4 seconds to complete,
 * so we return 4.
 *
 * Example 2:
 *
 * Input: s = "11100"
 * Output: 0
 * Explanation:
 * No occurrence of "01" exists in s, and the processes needed 0 seconds to complete,
 * so we return 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is either '0' or '1'.
 *
 *
 *
 * Follow up:
 *
 *
 * Can you solve this problem in O(n) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try replicating the steps from the problem statement.
 * Hint 2: Perform the replacements simultaneously, and return the number of times the process repeats.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/time-needed-to-rearrange-a-binary-string/">LeetCode #2380</a>
 */
public class TimeNeededToRearrangeABinaryString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Time Needed to Rearrange a Binary String");
    }

    public static void main(String[] args) {
        System.out.println("=== TimeNeededToRearrangeABinaryString ===");
        TimeNeededToRearrangeABinaryString sol = new TimeNeededToRearrangeABinaryString();
        System.out.println(sol.solve(null));
    }
}
