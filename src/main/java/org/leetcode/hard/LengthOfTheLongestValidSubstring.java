package org.leetcode.hard;


/**
 * <b>#2781 - Length of the Longest Valid Substring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word and an array of strings forbidden.
 *
 *
 * A string is called valid if none of its substrings are present in forbidden.
 *
 *
 * Return the length of the longest valid substring of the string word.
 *
 *
 * A substring is a contiguous sequence of characters in a string, possibly empty.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "cbaaaabc", forbidden = ["aaa","cb"]
 * Output: 4
 * Explanation: There are 11 valid substrings in word: "c", "b", "a", "ba", "aa", "bc", "baa", "aab", "ab", "abc" and "aabc". The length of the longest valid substring is 4. 
 * It can be shown that all other substrings contain either "aaa" or "cb" as a substring. 
 *
 * Example 2:
 *
 * Input: word = "leetcode", forbidden = ["de","le","e"]
 * Output: 4
 * Explanation: There are 11 valid substrings in word: "l", "t", "c", "o", "d", "tc", "co", "od", "tco", "cod", and "tcod". The length of the longest valid substring is 4.
 * It can be shown that all other substrings contain either "de", "le", or "e" as a substring. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 105
 *
 * word consists only of lowercase English letters.
 *
 * 1 &lt;= forbidden.length &lt;= 105
 *
 * 1 &lt;= forbidden[i].length &lt;= 10
 *
 * forbidden[i] consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/length-of-the-longest-valid-substring/">LeetCode #2781</a>
 */
public class LengthOfTheLongestValidSubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Length of the Longest Valid Substring");
    }

    public static void main(String[] args) {
        System.out.println("=== LengthOfTheLongestValidSubstring ===");
        LengthOfTheLongestValidSubstring sol = new LengthOfTheLongestValidSubstring();
        System.out.println(sol.solve(null));
    }
}
