package org.leetcode.easy;


/**
 * <b>#1455 - Check If a Word Occurs As a Prefix of Any Word in a Sentence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
 *
 *
 * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
 *
 *
 * A prefix of a string s is any leading contiguous substring of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sentence = "i love eating burger", searchWord = "burg"
 * Output: 4
 * Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
 *
 * Example 2:
 *
 * Input: sentence = "this problem is an easy problem", searchWord = "pro"
 * Output: 2
 * Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
 *
 * Example 3:
 *
 * Input: sentence = "i am tired", searchWord = "you"
 * Output: -1
 * Explanation: "you" is not a prefix of any word in the sentence.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sentence.length &lt;= 100
 *
 * 1 &lt;= searchWord.length &lt;= 10
 *
 * sentence consists of lowercase English letters and spaces.
 *
 * searchWord consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First extract the words of the sentence.
 * Hint 2: Check for each word if searchWord occurs at index 0, if so return the index of this word (1-indexed)
 * Hint 3: If searchWord doesn't exist as a prefix of any word return the default value (-1).
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/">LeetCode #1455</a>
  *
  * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    /**
     * Returns true if Is prefix of word.
     *
     * @param sentence the sentence (String)
     * @param searchWord the searchWord (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length;i++) if (words[i].startsWith(searchWord)) return i+1;
        return -1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfAWordOccursAsAPrefixOfAnyWordInASentence sol = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
                System.out.println(sol.isPrefixOfWord("i love eating burger","burg")); // 4
                System.out.println(sol.isPrefixOfWord("this problem is an easy problem","pro")); // 2
                System.out.println(sol.isPrefixOfWord("i am tired","you")); // -1
    }
}
