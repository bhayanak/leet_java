package org.leetcode.medium;


/**
 * <b>#1638 - Count Substrings That Differ by One Character</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, find the number of ways you can choose a non-empty substring of s and replace a single character by a different character such that the resulting substring is a substring of t. In other words, find the number of substrings in s that differ from some substring in t by exactly one character.
 *
 *
 * For example, the underlined substrings in "computer" and "computation" only differ by the 'e'/'a', so this is a valid way.
 *
 *
 * Return the number of substrings that satisfy the condition above.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aba", t = "baba"
 * Output: 6
 * Explanation: The following are the pairs of substrings from s and t that differ by exactly 1 character:
 * ("aba", "baba")
 * ("aba", "baba")
 * ("aba", "baba")
 * ("aba", "baba")
 * ("aba", "baba")
 * ("aba", "baba")
 * The underlined portions are the substrings that are chosen from s and t.
 *
 *
 * ​​Example 2:
 *
 * Input: s = "ab", t = "bb"
 * Output: 3
 * Explanation: The following are the pairs of substrings from s and t that differ by 1 character:
 * ("ab", "bb")
 * ("ab", "bb")
 * ("ab", "bb")
 * ​​​​The underlined portions are the substrings that are chosen from s and t.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 100
 *
 * s and t consist of lowercase English letters only.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Take every substring of s, change a character, and see how many substrings of t match that substring.
 * Hint 2: Use a Trie to store all substrings of t as a dictionary.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-substrings-that-differ-by-one-character/">LeetCode #1638</a>
 */
public class CountSubstringsThatDifferByOneCharacter {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Substrings That Differ by One Character");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSubstringsThatDifferByOneCharacter ===");
        CountSubstringsThatDifferByOneCharacter sol = new CountSubstringsThatDifferByOneCharacter();
        System.out.println(sol.solve(null));
    }
}
