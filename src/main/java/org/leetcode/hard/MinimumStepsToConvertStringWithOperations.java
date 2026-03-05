package org.leetcode.hard;


/**
 * <b>#3579 - Minimum Steps to Convert String with Operations</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings, word1 and word2, of equal length. You need to transform word1 into word2.
 *
 *
 * For this, divide word1 into one or more contiguous substrings. For each substring substr you can perform the following operations:
 *
 *
 *
 *
 * Replace: Replace the character at any one index of substr with another lowercase English letter.
 *
 *
 *
 *
 * Swap: Swap any two characters in substr.
 *
 *
 *
 *
 * Reverse Substring: Reverse substr.
 *
 *
 * Each of these counts as one operation and each character of each substring can be used in each type of operation at most once (i.e. no single index may be involved in more than one replace, one swap, or one reverse).
 *
 *
 * Return the minimum number of operations required to transform word1 into word2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abcdf", word2 = "dacbe"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Divide word1 into "ab", "c", and "df". The operations are:
 *
 *
 * For the substring "ab",
 *
 *
 *
 *
 * Perform operation of type 3 on "ab" -&gt; "ba".
 *
 * Perform operation of type 1 on "ba" -&gt; "da".
 *
 *
 *
 * For the substring "c" do no operations.
 *
 * For the substring "df",
 *
 *
 *
 * Perform operation of type 1 on "df" -&gt; "bf".
 *
 * Perform operation of type 1 on "bf" -&gt; "be".
 *
 *
 *
 * Example 2:
 *
 * Input: word1 = "abceded", word2 = "baecfef"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Divide word1 into "ab", "ce", and "ded". The operations are:
 *
 *
 * For the substring "ab",
 *
 *
 *
 *
 * Perform operation of type 2 on "ab" -&gt; "ba".
 *
 *
 *
 * For the substring "ce",
 *
 *
 *
 * Perform operation of type 2 on "ce" -&gt; "ec".
 *
 *
 *
 * For the substring "ded",
 *
 *
 *
 * Perform operation of type 1 on "ded" -&gt; "fed".
 *
 * Perform operation of type 1 on "fed" -&gt; "fef".
 *
 *
 *
 * Example 3:
 *
 * Input: word1 = "abcdef", word2 = "fedabc"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Divide word1 into "abcdef". The operations are:
 *
 *
 * For the substring "abcdef",
 *
 *
 *
 *
 * Perform operation of type 3 on "abcdef" -&gt; "fedcba".
 *
 * Perform operation of type 2 on "fedcba" -&gt; "fedabc".
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length == word2.length &lt;= 100
 *
 * word1 and word2 consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming
 * Hint 2: Do DP on disjoint substrings of <code>word1</code>. For the DP, we try both the substring and its reversed version (just add one extra operation)
 * Hint 3: First we swap pairs like (<code>word1[i]</code>, <code>word2[i]</code>) and (<code>word1[j]</code>, <code>word2[j]</code>) where <code>word1[i] == word2[j]</code> and <code>word2[i] == word1[j]</code>
 * Hint 4: For the remaining characters, we use replace operations
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-steps-to-convert-string-with-operations/">LeetCode #3579</a>
 */
public class MinimumStepsToConvertStringWithOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Steps to Convert String with Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumStepsToConvertStringWithOperations ===");
        MinimumStepsToConvertStringWithOperations sol = new MinimumStepsToConvertStringWithOperations();
        System.out.println(sol.solve(null));
    }
}
