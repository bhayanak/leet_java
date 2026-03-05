package org.leetcode.easy;

/**
 * <b>#819 - MostCommonWord</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>Given a string paragraph and a string array of banned words, return the most frequent word not in the banned list.</pre>
 *
 * <h2>Approach</h2>
 * <p>See method Javadoc and @Explanation for the detailed algorithm.</p>
 *
 * <h2>Complexity</h2>
 * <p>See @Explanation in the method for time and space analysis.</p>
 *
 * @see <a href="https://leetcode.com/problems/mostcommonword-/">LeetCode #819</a>
 */
public class MostCommonWord {
    /**
     * Returns the most common word that is not in the banned list.
     *
     * @param paragraph text to search
     * @param banned    words that must be excluded
     * @return the most frequent non-banned word (lowercase, no punctuation)
     *
     * <p><b>Explanation:</b> Normalises the paragraph to lowercase letters, splits on</p>
     *   non-letter characters, counts word frequency in a HashMap, ignores
     *   banned words and returns the word with the highest count. Time O(n), Space O(n).
     */
    public String mostCommonWord(String paragraph, String[] banned) {
        java.util.Set<String> ban = new java.util.HashSet<>(java.util.Arrays.asList(banned));
        java.util.Map<String, Integer> freq = new java.util.HashMap<>();
        for (String word : paragraph.toLowerCase().split("[^a-z]+")) {
            if (!word.isEmpty() && !ban.contains(word))
                freq.merge(word, 1, Integer::sum);
        }
        return java.util.Collections.max(freq.entrySet(),
            java.util.Map.Entry.comparingByValue()).getKey();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MostCommonWord.java &amp;&amp; java org.leetcode.easy.MostCommonWord</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== MostCommonWord ===");
        MostCommonWord sol = new MostCommonWord();
        System.out.println(sol.mostCommonWord("hello", new String[]{"a","b"}));
    }
}
