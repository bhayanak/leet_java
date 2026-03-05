package org.leetcode.hard;


/**
 * <b>#3292 - Minimum Number of Valid Strings to Form Target II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Binary Search, Dynamic Programming, Segment Tree, Rolling Hash, String Matching, Hash Function</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words and a string target.
 *
 *
 * A string x is called valid if x is a prefix of any string in words.
 *
 *
 * Return the minimum number of valid strings that can be concatenated to form target. If it is not possible to form target, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","aaaaa","bcdef"], target = "aabcdabc"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The target string can be formed by concatenating:
 *
 *
 * Prefix of length 2 of words[1], i.e. "aa".
 *
 * Prefix of length 3 of words[2], i.e. "bcd".
 *
 * Prefix of length 3 of words[0], i.e. "abc".
 *
 * Example 2:
 *
 * Input: words = ["abababab","ab"], target = "ababaababa"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The target string can be formed by concatenating:
 *
 *
 * Prefix of length 5 of words[0], i.e. "ababa".
 *
 * Prefix of length 5 of words[0], i.e. "ababa".
 *
 * Example 3:
 *
 * Input: words = ["abcdef"], target = "xyz"
 *
 *
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 100
 *
 * 1 &lt;= words[i].length &lt;= 5 * 104
 *
 * The input is generated such that sum(words[i].length) &lt;= 105.
 *
 * words[i] consists only of lowercase English letters.
 *
 * 1 &lt;= target.length &lt;= 5 * 104
 *
 * target consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> be the minimum cost to form the prefix of length <code>i</code> of <code>target</code>.
 * Hint 2: Use Rabin-Karp to hash every prefix and store it in a HashSet.
 * Hint 3: Use Binary search to find the longest substring starting at index <code>i</code> (<code>target[i..j]</code>) that has a hash present in the HashSet.
 * Hint 4: Inverse Modulo precomputation can optimise hash calculation.
 * Hint 5: Use Lazy Segment Tree, or basic Segment Tree to update <code>dp[i..j]</code>.
 * Hint 6: Is it possible to use two TreeSets to update <code>dp[i..j]</code>?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Binary Search, Dynamic Programming, Segment Tree, Rolling Hash, String Matching, Hash Function).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-valid-strings-to-form-target-ii/">LeetCode #3292</a>
 */
public class MinimumNumberOfValidStringsToFormTargetIi {

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
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Valid Strings to Form Target II");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfValidStringsToFormTargetIi ===");
        MinimumNumberOfValidStringsToFormTargetIi sol = new MinimumNumberOfValidStringsToFormTargetIi();
        System.out.println(sol.solve(null));
    }
}
