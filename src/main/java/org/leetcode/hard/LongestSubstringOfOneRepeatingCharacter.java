package org.leetcode.hard;


/**
 * <b>#2213 - Longest Substring of One Repeating Character</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Segment Tree, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s. You are also given a 0-indexed string queryCharacters of length k and a 0-indexed array of integer indices queryIndices of length k, both of which are used to describe k queries.
 *
 *
 * The ith query updates the character in s at index queryIndices[i] to the character queryCharacters[i].
 *
 *
 * Return an array lengths of length k where lengths[i] is the length of the longest substring of s consisting of only one repeating character after the ith query is performed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "babacc", queryCharacters = "bcb", queryIndices = [1,3,3]
 * Output: [3,3,4]
 * Explanation: 
 * - 1st query updates s = "bbbacc". The longest substring consisting of one repeating character is "bbb" with length 3.
 * - 2nd query updates s = "bbbccc". 
 *   The longest substring consisting of one repeating character can be "bbb" or "ccc" with length 3.
 * - 3rd query updates s = "bbbbcc". The longest substring consisting of one repeating character is "bbbb" with length 4.
 * Thus, we return [3,3,4].
 *
 * Example 2:
 *
 * Input: s = "abyzz", queryCharacters = "aa", queryIndices = [2,1]
 * Output: [2,3]
 * Explanation:
 * - 1st query updates s = "abazz". The longest substring consisting of one repeating character is "zz" with length 2.
 * - 2nd query updates s = "aaazz". The longest substring consisting of one repeating character is "aaa" with length 3.
 * Thus, we return [2,3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 *
 * k == queryCharacters.length == queryIndices.length
 *
 * 1 &lt;= k &lt;= 105
 *
 * queryCharacters consists of lowercase English letters.
 *
 * 0 &lt;= queryIndices[i] &lt; s.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a segment tree to perform fast point updates and range queries.
 * Hint 2: We need each segment tree node to store the length of the longest substring of that segment consisting of only 1 repeating character.
 * Hint 3: We will also have each segment tree node store the leftmost and rightmost character of the segment, the max length of a prefix substring consisting of only 1 repeating character, and the max length of a suffix substring consisting of only 1 repeating character.
 * Hint 4: Use this information to properly merge the two segment tree nodes together.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Segment Tree, Ordered Set).
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-of-one-repeating-character/">LeetCode #2213</a>
 */
public class LongestSubstringOfOneRepeatingCharacter {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Substring of One Repeating Character");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSubstringOfOneRepeatingCharacter ===");
        LongestSubstringOfOneRepeatingCharacter sol = new LongestSubstringOfOneRepeatingCharacter();
        System.out.println(sol.solve(null));
    }
}
