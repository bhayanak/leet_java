package org.leetcode.easy;


/**
 * <b>#2255 - Count Prefixes of a Given String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.
 *
 *
 * Return the number of strings in words that are a prefix of s.
 *
 *
 * A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
 * Output: 3
 * Explanation:
 * The strings in words which are a prefix of s = "abc" are:
 * "a", "ab", and "abc".
 * Thus the number of strings in words which are a prefix of s is 3.
 *
 * Example 2:
 *
 * Input: words = ["a","a"], s = "aa"
 * Output: 2
 * Explanation:
 * Both of the strings are a prefix of s. 
 * Note that the same string can occur multiple times in words, and it should be counted each time.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length, s.length &lt;= 10
 *
 * words[i] and s consist of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each string in words, check if it is a prefix of s. If true, increment the answer by 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/count-prefixes-of-a-given-string/">LeetCode #2255</a>
  *
  * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
  */
public class CountPrefixesOfAGivenString {

    /**
     * Counts Count prefixes.
     *
     * @param words the words (String[])
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Builds a prefix-sum array so any range-sum query can be answered in O(1) after O(n) preprocessing.</p>
      */
    public int countPrefixes(String[] words, String s) {
        int cnt=0;
        for (String w:words) if (s.startsWith(w)) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        CountPrefixesOfAGivenString sol = new CountPrefixesOfAGivenString();
                System.out.println(sol.countPrefixes(new String[]{"a","b","c","ab","bc","abc"},"abc")); // 3
                System.out.println(sol.countPrefixes(new String[]{"a","a"},"aa")); // 2
    }
}
