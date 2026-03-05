package org.leetcode.medium;


/**
 * <b>#3084 - Count Substrings Starting and Ending with Given Character</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and a character c. Return the total number of substrings of s that start and end with c.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abada", c = "a"
 *
 *
 * Output: 6
 *
 *
 * Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada", "abada".
 *
 * Example 2:
 *
 * Input: s = "zzz", c = "z"
 *
 *
 * Output: 6
 *
 *
 * Explanation: There are a total of 6 substrings in s and all start and end with "z".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s and c consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the number of characters <code>'c'</code> in string <code>s</code>, let’s call it <code>m</code>.
 * Hint 2: We can select <code>2</code> numbers <code>i</code> and <code>j</code> such that <code>i &lt;= j</code> are the start and end indices of substring. Note that <code>i</code> and <code>j</code> can be the same.
 * Hint 3: The answer is <code>m * (m + 1) / 2</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-starting-and-ending-with-given-character/">LeetCode #3084</a>
 */
public class CountSubstringsStartingAndEndingWithGivenCharacter {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Substrings Starting and Ending with Given Character");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubstringsStartingAndEndingWithGivenCharacter ===");
        CountSubstringsStartingAndEndingWithGivenCharacter sol = new CountSubstringsStartingAndEndingWithGivenCharacter();
        System.out.println(sol.solve(null));
    }
}
