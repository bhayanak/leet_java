package org.leetcode.medium;


/**
 * <b>#3324 - Find the Sequence of Strings Appeared on the Screen</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string target.
 *
 *
 * Alice is going to type target on her computer using a special keyboard that has only two keys:
 *
 *
 * Key 1 appends the character "a" to the string on the screen.
 *
 * Key 2 changes the last character of the string on the screen to its next character in the English alphabet. For example, "c" changes to "d" and "z" changes to "a".
 *
 * Note that initially there is an empty string "" on the screen, so she can only press key 1.
 *
 *
 * Return a list of all strings that appear on the screen as Alice types target, in the order they appear, using the minimum key presses.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = "abc"
 *
 *
 * Output: ["a","aa","ab","aba","abb","abc"]
 *
 *
 * Explanation:
 *
 *
 * The sequence of key presses done by Alice are:
 *
 *
 * Press key 1, and the string on the screen becomes "a".
 *
 * Press key 1, and the string on the screen becomes "aa".
 *
 * Press key 2, and the string on the screen becomes "ab".
 *
 * Press key 1, and the string on the screen becomes "aba".
 *
 * Press key 2, and the string on the screen becomes "abb".
 *
 * Press key 2, and the string on the screen becomes "abc".
 *
 * Example 2:
 *
 * Input: target = "he"
 *
 *
 * Output: ["a","b","c","d","e","f","g","h","ha","hb","hc","hd","he"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target.length &lt;= 400
 *
 * target consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Append the character <code>'a'</code> using key 1.
 * Hint 2: Convert it to the required character using key 2.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-the-sequence-of-strings-appeared-on-the-screen/">LeetCode #3324</a>
 */
public class FindTheSequenceOfStringsAppearedOnTheScreen {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Sequence of Strings Appeared on the Screen");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheSequenceOfStringsAppearedOnTheScreen ===");
        FindTheSequenceOfStringsAppearedOnTheScreen sol = new FindTheSequenceOfStringsAppearedOnTheScreen();
        System.out.println(sol.solve(null));
    }
}
