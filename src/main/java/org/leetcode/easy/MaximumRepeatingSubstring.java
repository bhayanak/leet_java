package org.leetcode.easy;


/**
 * <b>#1668 - Maximum Repeating Substring</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Dynamic Programming, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.
 *
 *
 * Given strings sequence and word, return the maximum k-repeating value of word in sequence.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sequence = "ababc", word = "ab"
 * Output: 2
 * Explanation: "abab" is a substring in "ababc".
 *
 * Example 2:
 *
 * Input: sequence = "ababc", word = "ba"
 * Output: 1
 * Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".
 *
 * Example 3:
 *
 * Input: sequence = "ababc", word = "ac"
 * Output: 0
 * Explanation: "ac" is not a substring in "ababc". 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sequence.length &lt;= 100
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * sequence and word contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are low enough for a brute force approach.
 * Hint 2: Try every k value from 0 upwards until word is no longer k-repeating.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-repeating-substring/">LeetCode #1668</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumRepeatingSubstring {

    /**
     * Computes the maximum Max repeating.
     *
     * @param sequence the sequence (String)
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxRepeating(String sequence, String word) {
        int k=0; String w=word;
        while (sequence.contains(w)) { k++; w+=word; }
        return k;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MaximumRepeatingSubstring sol = new MaximumRepeatingSubstring();
                System.out.println(sol.maxRepeating("ababc","ab")); // 2
                System.out.println(sol.maxRepeating("ababc","ba")); // 1
                System.out.println(sol.maxRepeating("ababc","ac")); // 0
    }
}
