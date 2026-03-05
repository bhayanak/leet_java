package org.leetcode.easy;


/**
 * <b>#1370 - Increasing Decreasing String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s. Reorder the string using the following algorithm:
 *
 *
 * Remove the smallest character from s and append it to the result.
 *
 * Remove the smallest character from s that is greater than the last appended character, and append it to the result.
 *
 * Repeat step 2 until no more characters can be removed.
 *
 * Remove the largest character from s and append it to the result.
 *
 * Remove the largest character from s that is smaller than the last appended character, and append it to the result.
 *
 * Repeat step 5 until no more characters can be removed.
 *
 * Repeat steps 1 through 6 until all characters from s have been removed.
 *
 * If the smallest or largest character appears more than once, you may choose any occurrence to append to the result.
 *
 *
 * Return the resulting string after reordering s using this algorithm.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaaabbbbcccc"
 * Output: "abccbaabccba"
 * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
 * After steps 4, 5 and 6 of the first iteration, result = "abccba"
 * First iteration is done. Now s = "aabbcc" and we go back to step 1
 * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
 * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
 *
 * Example 2:
 *
 * Input: s = "rat"
 * Output: "art"
 * Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the frequency of each character.
 * Hint 2: Loop over all character from 'a' to 'z' and append the character if it exists and decrease frequency by 1. Do the same from 'z' to 'a'.
 * Hint 3: Keep repeating until the frequency of all characters is zero.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/increasing-decreasing-string/">LeetCode #1370</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class IncreasingDecreasingString {

    /**
     * Sorts Sort string.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String sortString(String s) {
        int[] cnt = new int[26];
        for (char c : s.toCharArray()) cnt[c-'a']++;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < s.length()) {
            for (int i=0;i<26;i++)   if (cnt[i]>0) { sb.append((char)('a'+i)); cnt[i]--; }
            for (int i=25;i>=0;i--)  if (cnt[i]>0) { sb.append((char)('a'+i)); cnt[i]--; }
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        IncreasingDecreasingString sol = new IncreasingDecreasingString();
                System.out.println(sol.sortString("aaaabbbbcccc")); // "abccbaabccba"
                System.out.println(sol.sortString("rat"));          // "art"
    }
}
