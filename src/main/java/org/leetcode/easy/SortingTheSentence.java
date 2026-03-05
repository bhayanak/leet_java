package org.leetcode.easy;


/**
 * <b>#1859 - Sorting the Sentence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
 *
 *
 * A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
 *
 *
 * For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
 *
 * Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "is2 sentence4 This1 a3"
 * Output: "This is a sentence"
 * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
 *
 * Example 2:
 *
 * Input: s = "Myself2 Me1 I4 and3"
 * Output: "Me Myself and I"
 * Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 200
 *
 * s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
 *
 * The number of words in s is between 1 and 9.
 *
 * The words in s are separated by a single space.
 *
 * s contains no leading or trailing spaces.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Divide the string into the words as an array of strings
 * Hint 2: Sort the words by removing the last character from each word and sorting according to it
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sorting-the-sentence/">LeetCode #1859</a>
  *
  * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
  */
public class SortingTheSentence {

    /**
     * Sorts Sort sentence.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Sorts using the natural order or a custom comparator.</p>
      */
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        for (String w:words) {
            int pos=w.charAt(w.length()-1)-'1';
            res[pos]=w.substring(0,w.length()-1);
        }
        return String.join(" ",res);
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        SortingTheSentence sol = new SortingTheSentence();
                System.out.println(sol.sortSentence("is2 sentence4 This1 a3")); // "This is a sentence"
                System.out.println(sol.sortSentence("Myself2 Me1 I4 and3")); // "Me Myself and I"
    }
}
