package org.leetcode.hard;


/**
 * <b>#3485 - Longest Common Prefix of K Strings After Removal</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words and an integer k.
 *
 *
 * For each index i in the range [0, words.length - 1], find the length of the longest common prefix among any k strings (selected at distinct indices) from the remaining array after removing the ith element.
 *
 *
 * Return an array answer, where answer[i] is the answer for ith element. If removing the ith element leaves the array with fewer than k strings, answer[i] is 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["jump","run","run","jump","run"], k = 2
 *
 *
 * Output: [3,4,4,3,4]
 *
 *
 * Explanation:
 *
 *
 * Removing index 0 ("jump"):
 *
 *
 *
 *
 * words becomes: ["run", "run", "jump", "run"]. "run" occurs 3 times. Choosing any two gives the longest common prefix "run" (length 3).
 *
 *
 *
 * Removing index 1 ("run"):
 *
 *
 *
 * words becomes: ["jump", "run", "jump", "run"]. "jump" occurs twice. Choosing these two gives the longest common prefix "jump" (length 4).
 *
 *
 *
 * Removing index 2 ("run"):
 *
 *
 *
 * words becomes: ["jump", "run", "jump", "run"]. "jump" occurs twice. Choosing these two gives the longest common prefix "jump" (length 4).
 *
 *
 *
 * Removing index 3 ("jump"):
 *
 *
 *
 * words becomes: ["jump", "run", "run", "run"]. "run" occurs 3 times. Choosing any two gives the longest common prefix "run" (length 3).
 *
 *
 *
 * Removing index 4 ("run"):
 *
 *
 *
 * words becomes: ["jump", "run", "run", "jump"]. "jump" occurs twice. Choosing these two gives the longest common prefix "jump" (length 4).
 *
 *
 *
 * Example 2:
 *
 * Input: words = ["dog","racer","car"], k = 2
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
 * 1 &lt;= k &lt;= words.length &lt;= 105
 *
 * 1 &lt;= words[i].length &lt;= 104
 *
 * words[i] consists of lowercase English letters.
 *
 * The sum of words[i].length is smaller than or equal 105.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a trie to store all the strings initially.
 * Hint 2: For each node in the trie, maintain the count of paths ending there.
 * Hint 3: For each <code>arr[i]</code>, remove it from the trie and update the counts.
 * Hint 4: During evaluation, find the innermost node with at least <code>k</code> paths ending there.
 * Hint 5: Use a multiset or similar structure to handle updates efficiently.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Trie).
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix-of-k-strings-after-removal/">LeetCode #3485</a>
 */
public class LongestCommonPrefixOfKStringsAfterRemoval {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Common Prefix of K Strings After Removal");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestCommonPrefixOfKStringsAfterRemoval ===");
        LongestCommonPrefixOfKStringsAfterRemoval sol = new LongestCommonPrefixOfKStringsAfterRemoval();
        System.out.println(sol.solve(null));
    }
}
