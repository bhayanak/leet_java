package org.leetcode.medium;


/**
 * <b>#820 - Short Encoding of Words</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A valid encoding of an array of words is any reference string s and array of indices indices such that:
 *
 *
 * words.length == indices.length
 *
 * The reference string s ends with the '#' character.
 *
 * For each index indices[i], the substring of s starting from indices[i] and up to (but not including) the next '#' character is equal to words[i].
 *
 * Given an array of words, return the length of the shortest reference string s possible of any valid encoding of words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["time", "me", "bell"]
 * Output: 10
 * Explanation: A valid encoding would be s = "time#bell#" and indices = [0, 2, 5].
 * words[0] = "time", the substring of s starting from indices[0] = 0 to the next '#' is underlined in "time#bell#"
 * words[1] = "me", the substring of s starting from indices[1] = 2 to the next '#' is underlined in "time#bell#"
 * words[2] = "bell", the substring of s starting from indices[2] = 5 to the next '#' is underlined in "time#bell#"
 *
 * Example 2:
 *
 * Input: words = ["t"]
 * Output: 2
 * Explanation: A valid encoding would be s = "t#" and indices = [0].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 2000
 *
 * 1 &lt;= words[i].length &lt;= 7
 *
 * words[i] consists of only lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Trie).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/short-encoding-of-words/">LeetCode #820</a>
 */
public class ShortEncodingOfWords {

    /**
     * Solves the problem: Minimum length encoding.
     *
     * @param words the words (String[])
     * @return the computed int result
     */
    public int minimumLengthEncoding(String[] words) {
        java.util.Set<String> good = new java.util.HashSet<>(java.util.Arrays.asList(words));
        for (String word : words)
            for (int k = 1; k < word.length(); k++)
                good.remove(word.substring(k));
        int len = 0;
        for (String w : good) len += w.length() + 1;
        return len;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortEncodingOfWords.java &amp;&amp; java org.leetcode.medium.ShortEncodingOfWords</pre>
     */
    public static void main(String[] args) {
        ShortEncodingOfWords sol = new ShortEncodingOfWords();
                System.out.println(sol.minimumLengthEncoding(new String[]{"time","me","bell"})); // 10
                System.out.println(sol.minimumLengthEncoding(new String[]{"t"})); // 2
    }
}
