package org.leetcode.easy;


/**
 * <b>#1941 - Check if All Characters Have Equal Number of Occurrences</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return true if s is a good string, or false otherwise.
 *
 *
 * A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abacbc"
 * Output: true
 * Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
 *
 * Example 2:
 *
 * Input: s = "aaabb"
 * Output: false
 * Explanation: The characters that appear in s are 'a' and 'b'.
 * 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build a dictionary containing the frequency of each character appearing in s
 * Hint 2: Check if all values in the dictionary are the same.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/">LeetCode #1941</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {

    /**
     * Solves the problem: Are occurrences equal.
     *
     * @param s the s (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean areOccurrencesEqual(String s) {
        int[] cnt=new int[26];
        for (char c:s.toCharArray()) cnt[c-'a']++;
        int target=0; for (int v:cnt) if (v>0) { target=v; break; }
        for (int v:cnt) if (v!=0 && v!=target) return false;
        return true;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences sol = new CheckIfAllCharactersHaveEqualNumberOfOccurrences();
                System.out.println(sol.areOccurrencesEqual("abacbc")); // true
                System.out.println(sol.areOccurrencesEqual("aaabb"));  // false
    }
}
