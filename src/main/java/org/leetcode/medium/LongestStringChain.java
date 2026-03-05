package org.leetcode.medium;


/**
 * <b>#1048 - Longest String Chain</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, String, Dynamic Programming, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of words where each word consists of lowercase English letters.
 *
 *
 * wordA is a predecessor of wordB if and only if we can insert exactly one letter anywhere in wordA without changing the order of the other characters to make it equal to wordB.
 *
 *
 * For example, "abc" is a predecessor of "abac", while "cba" is not a predecessor of "bcad".
 *
 * A word chain is a sequence of words [word1, word2, ..., wordk] with k &gt;= 1, where word1 is a predecessor of word2, word2 is a predecessor of word3, and so on. A single word is trivially a word chain with k == 1.
 *
 *
 * Return the length of the longest possible word chain with words chosen from the given list of words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["a","b","ba","bca","bda","bdca"]
 * Output: 4
 * Explanation: One of the longest word chains is ["a","ba","bda","bdca"].
 *
 * Example 2:
 *
 * Input: words = ["xbc","pcxbcf","xb","cxbc","pcxbc"]
 * Output: 5
 * Explanation: All the words can be put in a word chain ["xb", "xbc", "cxbc", "pcxbc", "pcxbcf"].
 *
 * Example 3:
 *
 * Input: words = ["abcd","dbqca"]
 * Output: 1
 * Explanation: The trivial word chain ["abcd"] is one of the longest word chains.
 * ["abcd","dbqca"] is not a valid word chain because the ordering of the letters is changed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length &lt;= 16
 *
 * words[i] only consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Instead of adding a character, try deleting a character to form a chain in reverse.
 * Hint 2: For each word in order of length, for each word2 which is word with one character removed, length[word2] = max(length[word2], length[word] + 1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, String, Dynamic Programming, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-string-chain/">LeetCode #1048</a>
 */
public class LongestStringChain {

    /**
     * TODO: Implement "Longest String Chain".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest String Chain");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongestStringChain.java &amp;&amp; java org.leetcode.medium.LongestStringChain</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LongestStringChain ===");
        LongestStringChain sol = new LongestStringChain();
        System.out.println(sol.solve(null));
    }
}
