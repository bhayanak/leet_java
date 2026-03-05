package org.leetcode.easy;


/**
 * <b>#824 - Goat Latin</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
 *
 *
 * We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
 *
 *
 * If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
 *
 *
 *
 *
 * For example, the word "apple" becomes "applema".
 *
 *
 *
 * If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
 *
 *
 *
 * For example, the word "goat" becomes "oatgma".
 *
 *
 *
 * Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
 *
 *
 *
 * For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
 *
 *
 *
 * Return the final sentence representing the conversion from sentence to Goat Latin.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 *
 *
 * Example 2:
 *
 * Input: sentence = "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence.length &lt;= 150
 *
 * sentence consists of English letters and spaces.
 *
 * sentence has no leading or trailing spaces.
 *
 * All the words in sentence are separated by a single space.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/goat-latin/">LeetCode #824</a>
  *
  * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class GoatLatin {

    /**
     * Solves the problem: To goat latin.
     *
     * @param sentence the sentence (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses a HashSet to detect duplicates or track seen elements in O(1) per operation. Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String toGoatLatin(String sentence) {
        java.util.Set<Character> vowels = new java.util.HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) vowels.add(c);
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String base;
            if (vowels.contains(w.charAt(0))) {
                base = w + "ma";
            } else {
                base = w.substring(1) + w.charAt(0) + "ma";
            }
            sb.append(base).append("a".repeat(i + 1));
            if (i < words.length - 1) sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac GoatLatin.java &amp;&amp; java org.leetcode.easy.GoatLatin</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        GoatLatin sol = new GoatLatin();
                System.out.println(sol.toGoatLatin("I speak Goat Latin"));
                // "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
                System.out.println(sol.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }
}
