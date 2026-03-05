package org.leetcode.easy;


/**
 * <b>#1961 - Check If String Is a Prefix of Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s and an array of strings words, determine whether s is a prefix string of words.
 *
 *
 * A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.
 *
 *
 * Return true if s is a prefix string of words, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
 * Output: true
 * Explanation:
 * s can be made by concatenating "i", "love", and "leetcode" together.
 *
 * Example 2:
 *
 * Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
 * Output: false
 * Explanation:
 * It is impossible to make s using a prefix of arr.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 20
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * words[i] and s consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are only words.length prefix strings.
 * Hint 2: Create all of them and see if s is one of them.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/">LeetCode #1961</a>
  *
  * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class CheckIfStringIsAPrefixOfArray {

    /**
     * Returns true if Is prefix string.
     *
     * @param s the s (String)
     * @param words the words (String[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public boolean isPrefixString(String s, String[] words) {
        int i=0;
        for (String w:words) {
            if (!s.startsWith(w, i)) return i==s.length();
            i+=w.length();
            if (i==s.length()) return true;
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CheckIfStringIsAPrefixOfArray sol = new CheckIfStringIsAPrefixOfArray();
                System.out.println(sol.isPrefixString("iloveleetcode",new String[]{"i","love","leetcode","apples"})); // true
                System.out.println(sol.isPrefixString("iloveleetcode",new String[]{"apples","i","love","leetcode"})); // false
    }
}
