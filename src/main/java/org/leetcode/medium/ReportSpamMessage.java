package org.leetcode.medium;


/**
 * <b>#3295 - Report Spam Message</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings message and an array of strings bannedWords.
 *
 *
 * An array of words is considered spam if there are at least two words in it that exactly match any word in bannedWords.
 *
 *
 * Return true if the array message is spam, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: message = ["hello","world","leetcode"], bannedWords = ["world","hello"]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The words "hello" and "world" from the message array both appear in the bannedWords array.
 *
 * Example 2:
 *
 * Input: message = ["hello","programming","fun"], bannedWords = ["world","programming","leetcode"]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Only one word from the message array ("programming") appears in the bannedWords array.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= message.length, bannedWords.length &lt;= 105
 *
 * 1 &lt;= message[i].length, bannedWords[i].length &lt;= 15
 *
 * message[i] and bannedWords[i] consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use hash set.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/report-spam-message/">LeetCode #3295</a>
 */
public class ReportSpamMessage {

    /**
     * Solves the problem: Report spam.
     *
     * @param message the message (String[])
     * @param bannedWords the bannedWords (String[])
     * @return the computed boolean result
     */
    public boolean reportSpam(String[] message, String[] bannedWords) {
        java.util.Set<String> banned=new java.util.HashSet<>(java.util.Arrays.asList(bannedWords));
        int cnt=0;
        for (String w:message) if (banned.contains(w)&&++cnt>=2) return true;
        return false;
    }

    public static void main(String[] args) {
        ReportSpamMessage sol = new ReportSpamMessage();
        System.out.println(sol.reportSpam(new String[]{"a","b"}, new String[]{"a","b"}));
    }
}
