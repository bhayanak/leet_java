package org.leetcode.medium;


/**
 * <b>#3805 - Count Caesar Cipher Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array words of n strings. Each string has length m and contains only lowercase English letters.
 *
 *
 * Two strings s and t are similar if we can apply the following operation any number of times (possibly zero times) so that s and t become equal.
 *
 *
 * Choose either s or t.
 *
 * Replace every letter in the chosen string with the next letter in the alphabet cyclically. The next letter after 'z' is 'a'.
 *
 * Count the number of pairs of indices (i, j) such that:
 *
 *
 * i &lt; j
 *
 * words[i] and words[j] are similar.
 *
 * Return an integer denoting the number of such pairs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["fusion","layout"]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * words[0] = "fusion" and words[1] = "layout" are similar because we can apply the operation to "fusion" 6 times. The string "fusion" changes as follows.
 *
 *
 * "fusion"
 *
 * "gvtjpo"
 *
 * "hwukqp"
 *
 * "ixvlrq"
 *
 * "jywmsr"
 *
 * "kzxnts"
 *
 * "layout"
 *
 * Example 2:
 *
 * Input: words = ["ab","aa","za","aa"]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * words[0] = "ab" and words[2] = "za" are similar. words[1] = "aa" and words[3] = "aa" are similar.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == words.length &lt;= 105
 *
 * 1 &lt;= m == words[i].length &lt;= 105
 *
 * 1 &lt;= n * m &lt;= 105
 *
 * words[i] consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Two strings are similar if the differences between consecutive characters (mod 26) are the same; normalize each string by shifting its first character to <code>'a'</code>.
 * Hint 2: Compute a hashable key for each normalized string representing its relative character differences.
 * Hint 3: Use a map to count how many strings share the same normalized key.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-caesar-cipher-pairs/">LeetCode #3805</a>
 */
public class CountCaesarCipherPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Caesar Cipher Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== CountCaesarCipherPairs ===");
        CountCaesarCipherPairs sol = new CountCaesarCipherPairs();
        System.out.println(sol.solve(null));
    }
}
