package org.leetcode.easy;


/**
 * <b>#1002 - Find Common Characters</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 *
 * Example 2:
 *
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-common-characters/">LeetCode #1002</a>
 */
public class FindCommonCharacters {

    public java.util.List<String> commonChars(String[] words) {
        int[] minFreq = new int[26];
        java.util.Arrays.fill(minFreq, Integer.MAX_VALUE);
        for (String w : words) {
            int[] freq = new int[26];
            for (char c : w.toCharArray()) freq[c-'a']++;
            for (int i = 0; i < 26; i++) minFreq[i] = Math.min(minFreq[i], freq[i]);
        }
        java.util.List<String> result = new java.util.ArrayList<>();
        for (int i = 0; i < 26; i++)
            for (int j = 0; j < minFreq[i]; j++)
                result.add(String.valueOf((char)('a'+i)));
        return result;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindCommonCharacters.java &amp;&amp; java org.leetcode.easy.FindCommonCharacters</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        FindCommonCharacters sol = new FindCommonCharacters();
        System.out.println("No method available");
    }
}
