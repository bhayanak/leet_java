package org.leetcode.easy;


/**
 * <b>#2114 - Maximum Number of Words Found in Sentences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 *
 *
 * You are given an array of strings sentences, where each sentences[i] represents a single sentence.
 *
 *
 * Return the maximum number of words that appear in a single sentence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
 * Output: 6
 * Explanation: 
 * - The first sentence, "alice and bob love leetcode", has 5 words in total.
 * - The second sentence, "i think so too", has 4 words in total.
 * - The third sentence, "this is great thanks very much", has 6 words in total.
 * Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
 *
 * Example 2:
 *
 * Input: sentences = ["please wait", "continue to fight", "continue to win"]
 * Output: 3
 * Explanation: It is possible that multiple sentences contain the same number of words. 
 * In this example, the second and third sentences (underlined) have the same number of words.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentences.length &lt;= 100
 *
 * 1 &lt;= sentences[i].length &lt;= 100
 *
 * sentences[i] consists only of lowercase English letters and ' ' only.
 *
 * sentences[i] does not have leading or trailing spaces.
 *
 * All the words in sentences[i] are separated by a single space.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Process each sentence separately and count the number of words by looking for the number of space characters in the sentence and adding it by 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/">LeetCode #2114</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumNumberOfWordsFoundInSentences {

    /**
     * Solves the problem: Maximum words in sentence.
     *
     * @param sentences the sentences (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumWordsInSentence(String[] sentences) {
        int max=0;
        for (String s:sentences) max=Math.max(max, s.split(" ").length);
        return max;
    }

    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentences sol = new MaximumNumberOfWordsFoundInSentences();
                System.out.println(sol.maximumWordsInSentence(new String[]{"alice and bob love leetcode","i think so too","this is great thanks very much"})); // 6
                System.out.println(sol.maximumWordsInSentence(new String[]{"please wait","continue to fight","continue to win"})); // 3
    }
}
