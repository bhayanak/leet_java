package org.leetcode.easy;


/**
 * <b>#1768 - Merge Strings Alternately</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 *
 * Return the merged string.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b 
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q 
 * merged: a p b q c   d
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= word1.length, word2.length &lt;= 100
 *
 * word1 and word2 consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two pointers, one pointer for each string. Alternately choose the character from each pointer, and move the pointer upwards.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/merge-strings-alternately/">LeetCode #1768</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Uses two pointers moving towards each other to process pairs in O(n) time.</p>
  */
public class MergeStringsAlternately {

    /**
     * Solves the problem: Merge alternately.
     *
     * @param word1 the word1 (String)
     * @param word2 the word2 (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Uses two pointers moving towards each other to process pairs in O(n) time.</p>
      */
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i=0, j=0;
        while (i<word1.length() || j<word2.length()) {
            if (i<word1.length()) sb.append(word1.charAt(i++));
            if (j<word2.length()) sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        MergeStringsAlternately sol = new MergeStringsAlternately();
                System.out.println(sol.mergeAlternately("abc","pqr")); // "apbqcr"
                System.out.println(sol.mergeAlternately("ab","pqrs")); // "apbqrs"
                System.out.println(sol.mergeAlternately("abcd","pq")); // "apbqcd"
    }
}
