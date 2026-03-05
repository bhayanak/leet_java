package org.leetcode.easy;


/**
 * <b>#2185 - Counting Words With a Given Prefix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words and a string pref.
 *
 *
 * Return the number of strings in words that contain pref as a prefix.
 *
 *
 * A prefix of a string s is any leading contiguous substring of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["pay","attention","practice","attend"], pref = "at"
 * Output: 2
 * Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
 *
 * Example 2:
 *
 * Input: words = ["leetcode","win","loops","success"], pref = "code"
 * Output: 0
 * Explanation: There are no strings that contain "code" as a prefix.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length, pref.length &lt;= 100
 *
 * words[i] and pref consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Go through each word in words and increment the answer if pref is a prefix of the word.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, String Matching).
 *
 * @see <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">LeetCode #2185</a>
  *
  * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class CountingWordsWithAGivenPrefix {

    /**
     * Solves the problem: Prefix count.
     *
     * @param words the words (String[])
     * @param pref the pref (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public int prefixCount(String[] words, String pref) {
        int cnt=0;
        for (String w:words) if (w.startsWith(pref)) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        CountingWordsWithAGivenPrefix sol = new CountingWordsWithAGivenPrefix();
                System.out.println(sol.prefixCount(new String[]{"pay","attention","practice","attend"},"at")); // 2
                System.out.println(sol.prefixCount(new String[]{"leetcode","win","loops","success"},"code")); // 0
    }
}
