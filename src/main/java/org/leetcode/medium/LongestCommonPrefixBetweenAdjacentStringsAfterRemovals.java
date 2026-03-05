package org.leetcode.medium;


/**
 * <b>#3598 - Longest Common Prefix Between Adjacent Strings After Removals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words. For each index i in the range [0, words.length - 1], perform the following steps:
 *
 *
 * Remove the element at index i from the words array.
 *
 * Compute the length of the longest common prefix among all adjacent pairs in the modified array.
 *
 * Return an array answer, where answer[i] is the length of the longest common prefix between the adjacent pairs after removing the element at index i. If no adjacent pairs remain or if none share a common prefix, then answer[i] should be 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["jump","run","run","jump","run"]
 *
 *
 * Output: [3,0,0,3,3]
 *
 *
 * Explanation:
 *
 *
 * Removing index 0:
 *
 *
 *
 * words becomes ["run", "run", "jump", "run"]
 *
 * Longest adjacent pair is ["run", "run"] having a common prefix "run" (length 3)
 *
 *
 *
 * Removing index 1:
 *
 *
 *
 * words becomes ["jump", "run", "jump", "run"]
 *
 * No adjacent pairs share a common prefix (length 0)
 *
 *
 *
 * Removing index 2:
 *
 *
 *
 * words becomes ["jump", "run", "jump", "run"]
 *
 * No adjacent pairs share a common prefix (length 0)
 *
 *
 *
 * Removing index 3:
 *
 *
 *
 * words becomes ["jump", "run", "run", "run"]
 *
 * Longest adjacent pair is ["run", "run"] having a common prefix "run" (length 3)
 *
 *
 *
 * Removing index 4:
 *
 *
 *
 * words becomes ["jump", "run", "run", "jump"]
 *
 * Longest adjacent pair is ["run", "run"] having a common prefix "run" (length 3)
 *
 *
 *
 * Example 2:
 *
 * Input: words = ["dog","racer","car"]
 *
 *
 * Output: [0,0,0]
 *
 *
 * Explanation:
 *
 *
 * Removing any index results in an answer of 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 105
 *
 * 1 &lt;= words[i].length &lt;= 104
 *
 * words[i] consists of lowercase English letters.
 *
 * The sum of words[i].length is smaller than or equal 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Precompute the longest common prefix length for adjacent prefixes and suffixes.
 * Hint 2: After deleting <code>words[i]</code>, compute the longest common prefix for <code>words[i - 1]</code> and <code>words[i + 1]</code> (if they exist).
 * Hint 3: Use the result of the prefix computation up to <code>i - 1</code> and the suffix computation from <code>i + 1</code> onwards.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix-between-adjacent-strings-after-removals/">LeetCode #3598</a>
 */
public class LongestCommonPrefixBetweenAdjacentStringsAfterRemovals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Common Prefix Between Adjacent Strings After Removals");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestCommonPrefixBetweenAdjacentStringsAfterRemovals ===");
        LongestCommonPrefixBetweenAdjacentStringsAfterRemovals sol = new LongestCommonPrefixBetweenAdjacentStringsAfterRemovals();
        System.out.println(sol.solve(null));
    }
}
