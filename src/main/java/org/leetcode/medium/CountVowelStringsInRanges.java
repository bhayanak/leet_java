package org.leetcode.medium;


/**
 * <b>#2559 - Count Vowel Strings in Ranges</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array of strings words and a 2D array of integers queries.
 *
 *
 * Each query queries[i] = [li, ri] asks us to find the number of strings present at the indices ranging from li to ri (both inclusive) of words that start and end with a vowel.
 *
 *
 * Return an array ans of size queries.length, where ans[i] is the answer to the ith query.
 *
 *
 * Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
 * Output: [2,3,0]
 * Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
 * The answer to the query [0,2] is 2 (strings "aba" and "ece").
 * to query [1,4] is 3 (strings "ece", "aa", "e").
 * to query [1,1] is 0.
 * We return [2,3,0].
 *
 * Example 2:
 *
 * Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
 * Output: [3,2,1]
 * Explanation: Every string satisfies the conditions, so we return [3,2,1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 105
 *
 * 1 &lt;= words[i].length &lt;= 40
 *
 * words[i] consists only of lowercase English letters.
 *
 * sum(words[i].length) &lt;= 3 * 105
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * 0 &lt;= li &lt;= ri &lt; words.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Precompute the prefix sum of strings that start and end with vowels.
 * Hint 2: Use unordered_set to store vowels.
 * Hint 3: Check if the first and last characters of the string are present in the vowels set.
 * Hint 4: Subtract prefix sum for range [l-1, r] to find the number of strings starting and ending with vowels.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-vowel-strings-in-ranges/">LeetCode #2559</a>
 */
public class CountVowelStringsInRanges {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Vowel Strings in Ranges");
    }

    public static void main(String[] args) {
        System.out.println("=== CountVowelStringsInRanges ===");
        CountVowelStringsInRanges sol = new CountVowelStringsInRanges();
        System.out.println(sol.solve(null));
    }
}
