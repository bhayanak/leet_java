package org.leetcode.easy;


/**
 * <b>#884 - Uncommon Words from Two Sentences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence is a string of single-space separated words where each word consists only of lowercase letters.
 *
 *
 * A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.
 *
 *
 * Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 *
 *
 * Output: ["sweet","sour"]
 *
 *
 * Explanation:
 *
 *
 * The word "sweet" appears only in s1, while the word "sour" appears only in s2.
 *
 * Example 2:
 *
 * Input: s1 = "apple apple", s2 = "banana"
 *
 *
 * Output: ["banana"]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s1.length, s2.length &lt;= 200
 *
 * s1 and s2 consist of lowercase English letters and spaces.
 *
 * s1 and s2 do not have leading or trailing spaces.
 *
 * All the words in s1 and s2 are separated by a single space.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">LeetCode #884</a>
  *
  * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
  */
public class UncommonWordsFromTwoSentences {

    /**
     * Solves the problem: Uncommon from sentences.
     * Uses a hash map to track occurrences or cache results.
     *
     * @param s1 the s1 (String)
     * @param s2 the s2 (String)
     * @return the computed String[] result
      *
      * <p><b>Explanation:</b> Uses a HashMap for O(1) average-time lookups, mapping values to indices/counts.</p>
      */
    public String[] uncommonFromSentences(String s1, String s2) {
        java.util.Map<String,Integer> count = new java.util.HashMap<>();
        for (String w : (s1 + " " + s2).split(" "))
            count.merge(w, 1, Integer::sum);
        return count.entrySet().stream()
            .filter(e -> e.getValue() == 1)
            .map(java.util.Map.Entry::getKey)
            .toArray(String[]::new);
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UncommonWordsFromTwoSentences.java &amp;&amp; java org.leetcode.easy.UncommonWordsFromTwoSentences</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        UncommonWordsFromTwoSentences sol = new UncommonWordsFromTwoSentences();
                System.out.println(java.util.Arrays.toString(
                    sol.uncommonFromSentences("this apple is sweet","this apple is sour")));
                // [sweet, sour]
    }
}
