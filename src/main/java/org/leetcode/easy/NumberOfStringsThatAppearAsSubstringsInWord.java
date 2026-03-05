package org.leetcode.easy;


/**
 * <b>#1967 - Number of Strings That Appear as Substrings in Word</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: patterns = ["a","abc","bc","d"], word = "abc"
 * Output: 3
 * Explanation:
 * - "a" appears as a substring in "abc".
 * - "abc" appears as a substring in "abc".
 * - "bc" appears as a substring in "abc".
 * - "d" does not appear as a substring in "abc".
 * 3 of the strings in patterns appear as a substring in word.
 *
 * Example 2:
 *
 * Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
 * Output: 2
 * Explanation:
 * - "a" appears as a substring in "aaaaabbbbb".
 * - "b" appears as a substring in "aaaaabbbbb".
 * - "c" does not appear as a substring in "aaaaabbbbb".
 * 2 of the strings in patterns appear as a substring in word.
 *
 * Example 3:
 *
 * Input: patterns = ["a","a","a"], word = "ab"
 * Output: 3
 * Explanation: Each of the patterns appears as a substring in word "ab".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= patterns.length &lt;= 100
 *
 * 1 &lt;= patterns[i].length &lt;= 100
 *
 * 1 &lt;= word.length &lt;= 100
 *
 * patterns[i] and word consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Deal with each of the patterns individually.
 * Hint 2: Use the built-in function in the language you are using to find if the pattern exists as a substring in <code>word</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/">LeetCode #1967</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class NumberOfStringsThatAppearAsSubstringsInWord {

    /**
     * Solves the problem: Num of strings.
     *
     * @param patterns the patterns (String[])
     * @param word the word (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int numOfStrings(String[] patterns, String word) {
        int cnt=0;
        for (String p:patterns) if (word.contains(p)) cnt++;
        return cnt;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        NumberOfStringsThatAppearAsSubstringsInWord sol = new NumberOfStringsThatAppearAsSubstringsInWord();
                System.out.println(sol.numOfStrings(new String[]{"a","abc","bc","d"},"abc")); // 3
                System.out.println(sol.numOfStrings(new String[]{"a","b","c"},"aaaaabbbbcc")); // 3
                System.out.println(sol.numOfStrings(new String[]{"a","a","a"},"ab")); // 3
    }
}
