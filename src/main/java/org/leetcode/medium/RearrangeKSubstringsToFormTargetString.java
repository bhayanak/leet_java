package org.leetcode.medium;


/**
 * <b>#3365 - Rearrange K Substrings to Form Target String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and t, both of which are anagrams of each other, and an integer k.
 *
 *
 * Your task is to determine whether it is possible to split the string s into k equal-sized substrings, rearrange the substrings, and concatenate them in any order to create a new string that matches the given string t.
 *
 *
 * Return true if this is possible, otherwise, return false.
 *
 *
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.
 *
 *
 * A substring is a contiguous non-empty sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcd", t = "cdab", k = 2
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Split s into 2 substrings of length 2: ["ab", "cd"].
 *
 * Rearranging these substrings as ["cd", "ab"], and then concatenating them results in "cdab", which matches t.
 *
 * Example 2:
 *
 * Input: s = "aabbcc", t = "bbaacc", k = 3
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * Split s into 3 substrings of length 2: ["aa", "bb", "cc"].
 *
 * Rearranging these substrings as ["bb", "aa", "cc"], and then concatenating them results in "bbaacc", which matches t.
 *
 * Example 3:
 *
 * Input: s = "aabbcc", t = "bbaacc", k = 2
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * Split s into 2 substrings of length 3: ["aab", "bcc"].
 *
 * These substrings cannot be rearranged to form t = "bbaacc", so the output is false.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length == t.length &lt;= 2 * 105
 *
 * 1 &lt;= k &lt;= s.length
 *
 * s.length is divisible by k.
 *
 * s and t consist only of lowercase English letters.
 *
 * The input is generated such that s and t are anagrams of each other.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Split <code>s</code> into <code>k</code> equal-sized substrings, use a map to track frequencies, and check if rearranging them can form <code>t</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/rearrange-k-substrings-to-form-target-string/">LeetCode #3365</a>
 */
public class RearrangeKSubstringsToFormTargetString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rearrange K Substrings to Form Target String");
    }

    public static void main(String[] args) {
        System.out.println("=== RearrangeKSubstringsToFormTargetString ===");
        RearrangeKSubstringsToFormTargetString sol = new RearrangeKSubstringsToFormTargetString();
        System.out.println(sol.solve(null));
    }
}
