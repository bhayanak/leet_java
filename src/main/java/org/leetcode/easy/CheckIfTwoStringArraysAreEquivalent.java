package org.leetcode.easy;


/**
 * <b>#1662 - Check If Two String Arrays are Equivalent</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 *
 *
 * A string is represented by an array if the array elements concatenated in order forms the string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -&gt; "abc"
 * word2 represents string "a" + "bc" -&gt; "abc"
 * The strings are the same, so return true.
 *
 * Example 2:
 *
 * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
 * Output: false
 *
 * Example 3:
 *
 * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
 * Output: true
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length, word2.length &lt;= 103
 *
 * 1 &lt;= word1[i].length, word2[i].length &lt;= 103
 *
 * 1 &lt;= sum(word1[i].length), sum(word2[i].length) &lt;= 103
 *
 * word1[i] and word2[i] consist of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Concatenate all strings in the first array into a single string in the given order, the same for the second array.
 * Hint 2: Both arrays represent the same string if and only if the generated strings are the same.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/">LeetCode #1662</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class CheckIfTwoStringArraysAreEquivalent {

    /**
     * Solves the problem: Array strings are equal.
     *
     * @param word1 the word1 (String[])
     * @param word2 the word2 (String[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("",word1).equals(String.join("",word2));
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfTwoStringArraysAreEquivalent sol = new CheckIfTwoStringArraysAreEquivalent();
                System.out.println(sol.arrayStringsAreEqual(new String[]{"ab","c"},new String[]{"a","bc"})); // true
                System.out.println(sol.arrayStringsAreEqual(new String[]{"a","cb"},new String[]{"ab","c"})); // false
                System.out.println(sol.arrayStringsAreEqual(new String[]{"abc","d","defg"},new String[]{"abcddefg"})); // true
    }
}
