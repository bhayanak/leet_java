package org.leetcode.easy;

/**
 * <b>UniqueMorseCodeWords</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Array, HashSet, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of words, return the number of unique Morse code representations among them.
 * Each letter maps to a standard Morse code string.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>For each word, convert it to Morse code by mapping each character, then store the result in a HashSet to count unique encodings.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(n * L), where n is the number of words and L is the average word length.</li>
 *   <li>Space: O(n) for the HashSet.</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Converts each word to Morse code and counts distinct encodings using a HashSet.</p>
 */
public class UniqueMorseCodeWords {
    /**
     * Returns the number of unique Morse code representations of words.
     *
     * @param words array of lowercase words
     * @return count of unique Morse encodings
     *
     * <p><b>Explanation:</b> Converts each word to its Morse code by mapping each character</p>
     *   using the standard Morse table, then stores all encodings in a HashSet to
     *   count distinct ones. Time O(n * L), Space O(n).
     */
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."};
        java.util.Set<String> seen = new java.util.HashSet<>();
        for (String w : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : w.toCharArray()) sb.append(morse[c - 'a']);
            seen.add(sb.toString());
        }
        return seen.size();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UniqueMorseCodeWords.java &amp;&amp; java org.leetcode.easy.UniqueMorseCodeWords</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== UniqueMorseCodeWords ===");
        UniqueMorseCodeWords sol = new UniqueMorseCodeWords();
        System.out.println(sol.uniqueMorseRepresentations(new String[]{"a","b"}));
    }
}
