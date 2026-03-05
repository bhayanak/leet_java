package org.leetcode.hard;


/**
 * <b>#2416 - Sum of Prefix Scores of Strings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Trie, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array words of size n consisting of non-empty strings.
 *
 *
 * We define the score of a string term as the number of strings words[i] such that term is a prefix of words[i].
 *
 *
 * For example, if words = ["a", "ab", "abc", "cab"], then the score of "ab" is 2, since "ab" is a prefix of both "ab" and "abc".
 *
 * Return an array answer of size n where answer[i] is the sum of scores of every non-empty prefix of words[i].
 *
 *
 * Note that a string is considered as a prefix of itself.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["abc","ab","bc","b"]
 * Output: [5,4,3,2]
 * Explanation: The answer for each string is the following:
 * - "abc" has 3 prefixes: "a", "ab", and "abc".
 * - There are 2 strings with the prefix "a", 2 strings with the prefix "ab", and 1 string with the prefix "abc".
 * The total is answer[0] = 2 + 2 + 1 = 5.
 * - "ab" has 2 prefixes: "a" and "ab".
 * - There are 2 strings with the prefix "a", and 2 strings with the prefix "ab".
 * The total is answer[1] = 2 + 2 = 4.
 * - "bc" has 2 prefixes: "b" and "bc".
 * - There are 2 strings with the prefix "b", and 1 string with the prefix "bc".
 * The total is answer[2] = 2 + 1 = 3.
 * - "b" has 1 prefix: "b".
 * - There are 2 strings with the prefix "b".
 * The total is answer[3] = 2.
 *
 * Example 2:
 *
 * Input: words = ["abcd"]
 * Output: [4]
 * Explanation:
 * "abcd" has 4 prefixes: "a", "ab", "abc", and "abcd".
 * Each prefix has a score of one, so the total is answer[0] = 1 + 1 + 1 + 1 = 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 1000
 *
 * 1 &lt;= words[i].length &lt;= 1000
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What data structure will allow you to efficiently keep track of the score of each prefix?
 * Hint 2: Use a Trie. Insert all the words into it, and keep a counter at each node that will tell you how many times we have visited each prefix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Trie, Counting).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-prefix-scores-of-strings/">LeetCode #2416</a>
 */
public class SumOfPrefixScoresOfStrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Prefix Scores of Strings");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfPrefixScoresOfStrings ===");
        SumOfPrefixScoresOfStrings sol = new SumOfPrefixScoresOfStrings();
        System.out.println(sol.solve(null));
    }
}
