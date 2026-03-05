package org.leetcode.easy;


/**
 * <b>#1816 - Truncate Sentence</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
 *
 *
 * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
 *
 * You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "Hello how are you Contestant", k = 4
 * Output: "Hello how are you"
 * Explanation:
 * The words in s are ["Hello", "how" "are", "you", "Contestant"].
 * The first 4 words are ["Hello", "how", "are", "you"].
 * Hence, you should return "Hello how are you".
 *
 * Example 2:
 *
 * Input: s = "What is the solution to this problem", k = 4
 * Output: "What is the solution"
 * Explanation:
 * The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
 * The first 4 words are ["What", "is", "the", "solution"].
 * Hence, you should return "What is the solution".
 *
 * Example 3:
 *
 * Input: s = "chopper is not a tanuki", k = 5
 * Output: "chopper is not a tanuki"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * k is in the range [1, the number of words in s].
 *
 * s consist of only lowercase and uppercase English letters and spaces.
 *
 * The words in s are separated by a single space.
 *
 * There are no leading or trailing spaces.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It's easier to solve this problem on an array of strings so parse the string to an array of words
 * Hint 2: After return the first k words as a sentence
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/truncate-sentence/">LeetCode #1816</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class TruncateSentence {

    /**
     * Solves the problem: Truncate sentence.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        return String.join(" ", java.util.Arrays.copyOfRange(words, 0, k));
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        TruncateSentence sol = new TruncateSentence();
                System.out.println(sol.truncateSentence("Hello how are you Contestant",4)); // "Hello how are you"
                System.out.println(sol.truncateSentence("What is the solution to this problem",4)); // "What is the solution"
                System.out.println(sol.truncateSentence("chopper is not a tanuki",5)); // "chopper is not a tanuki"
    }
}
