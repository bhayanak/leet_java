package org.leetcode.hard;


/**
 * <b>#3441 - Minimum Cost Good Caption</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string caption of length n. A good caption is a string where every character appears in groups of at least 3 consecutive occurrences.
 *
 *
 * For example:
 *
 *
 * "aaabbb" and "aaaaccc" are good captions.
 *
 * "aabbb" and "ccccd" are not good captions.
 *
 * You can perform the following operation any number of times:
 *
 *
 * Choose an index i (where 0 &lt;= i &lt; n) and change the character at that index to either:
 *
 *
 * The character immediately before it in the alphabet (if caption[i] != 'a').
 *
 * The character immediately after it in the alphabet (if caption[i] != 'z').
 *
 * Your task is to convert the given caption into a good caption using the minimum number of operations, and return it. If there are multiple possible good captions, return the lexicographically smallest one among them. If it is impossible to create a good caption, return an empty string "".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: caption = "cdcd"
 *
 *
 * Output: "cccc"
 *
 *
 * Explanation:
 *
 *
 * It can be shown that the given caption cannot be transformed into a good caption with fewer than 2 operations. The possible good captions that can be created using exactly 2 operations are:
 *
 *
 * "dddd": Change caption[0] and caption[2] to their next character 'd'.
 *
 * "cccc": Change caption[1] and caption[3] to their previous character 'c'.
 *
 * Since "cccc" is lexicographically smaller than "dddd", return "cccc".
 *
 * Example 2:
 *
 * Input: caption = "aca"
 *
 *
 * Output: "aaa"
 *
 *
 * Explanation:
 *
 *
 * It can be proven that the given caption requires at least 2 operations to be transformed into a good caption. The only good caption that can be obtained with exactly 2 operations is as follows:
 *
 *
 * Operation 1: Change caption[1] to 'b'. caption = "aba".
 *
 * Operation 2: Change caption[1] to 'a'. caption = "aaa".
 *
 * Thus, return "aaa".
 *
 * Example 3:
 *
 * Input: caption = "bc"
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * It can be shown that the given caption cannot be converted to a good caption by using any number of operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= caption.length &lt;= 5 * 104
 *
 * caption consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Construct a DP table and try all possible characters at every index.
 * Hint 2: Choose characters greedily to get the lexicographically smallest caption.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-good-caption/">LeetCode #3441</a>
 */
public class MinimumCostGoodCaption {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost Good Caption");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostGoodCaption ===");
        MinimumCostGoodCaption sol = new MinimumCostGoodCaption();
        System.out.println(sol.solve(null));
    }
}
