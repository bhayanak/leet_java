package org.leetcode.medium;


/**
 * <b>#2531 - Make Number of Distinct Characters Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed strings word1 and word2.
 *
 *
 * A move consists of choosing two indices i and j such that 0 &lt;= i &lt; word1.length and 0 &lt;= j &lt; word2.length and swapping word1[i] with word2[j].
 *
 *
 * Return true if it is possible to get the number of distinct characters in word1 and word2 to be equal with exactly one move. Return false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "ac", word2 = "b"
 * Output: false
 * Explanation: Any pair of swaps would yield two distinct characters in the first string, and one in the second string.
 *
 * Example 2:
 *
 * Input: word1 = "abcc", word2 = "aab"
 * Output: true
 * Explanation: We swap index 2 of the first string with index 0 of the second string. The resulting strings are word1 = "abac" and word2 = "cab", which both have 3 distinct characters.
 *
 * Example 3:
 *
 * Input: word1 = "abcde", word2 = "fghij"
 * Output: true
 * Explanation: Both resulting strings will have 5 distinct characters, regardless of which indices we swap.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word1.length, word2.length &lt;= 105
 *
 * word1 and word2 consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create a frequency array of the letters of each string.
 * Hint 2: There are 26*26 possible pairs of letters to swap. Can we try them all?
 * Hint 3: Iterate over all possible pairs of letters and check if swapping them will yield two strings that have the same number of distinct characters. Use the frequency array for the check.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/make-number-of-distinct-characters-equal/">LeetCode #2531</a>
 */
public class MakeNumberOfDistinctCharactersEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Make Number of Distinct Characters Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== MakeNumberOfDistinctCharactersEqual ===");
        MakeNumberOfDistinctCharactersEqual sol = new MakeNumberOfDistinctCharactersEqual();
        System.out.println(sol.solve(null));
    }
}
