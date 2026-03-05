package org.leetcode.hard;


/**
 * <b>#1639 - Number of Ways to Form a Target String Given a Dictionary</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a list of strings of the same length words and a string target.
 *
 *
 * Your task is to form target using the given words under the following rules:
 *
 *
 * target should be formed from left to right.
 *
 * To form the ith character (0-indexed) of target, you can choose the kth character of the jth string in words if target[i] = words[j][k].
 *
 * Once you use the kth character of the jth string of words, you can no longer use the xth character of any string in words where x &lt;= k. In other words, all characters to the left of or at index k become unusuable for every string.
 *
 * Repeat the process until you form the string target.
 *
 * Notice that you can use multiple characters from the same string in words provided the conditions above are met.
 *
 *
 * Return the number of ways to form target from words. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["acca","bbbb","caca"], target = "aba"
 * Output: 6
 * Explanation: There are 6 ways to form target.
 * "aba" -&gt; index 0 ("acca"), index 1 ("bbbb"), index 3 ("caca")
 * "aba" -&gt; index 0 ("acca"), index 2 ("bbbb"), index 3 ("caca")
 * "aba" -&gt; index 0 ("acca"), index 1 ("bbbb"), index 3 ("acca")
 * "aba" -&gt; index 0 ("acca"), index 2 ("bbbb"), index 3 ("acca")
 * "aba" -&gt; index 1 ("caca"), index 2 ("bbbb"), index 3 ("acca")
 * "aba" -&gt; index 1 ("caca"), index 2 ("bbbb"), index 3 ("caca")
 *
 * Example 2:
 *
 * Input: words = ["abba","baab"], target = "bab"
 * Output: 4
 * Explanation: There are 4 ways to form target.
 * "bab" -&gt; index 0 ("baab"), index 1 ("baab"), index 2 ("abba")
 * "bab" -&gt; index 0 ("baab"), index 1 ("baab"), index 3 ("baab")
 * "bab" -&gt; index 0 ("baab"), index 2 ("baab"), index 3 ("baab")
 * "bab" -&gt; index 1 ("abba"), index 2 ("baab"), index 3 ("baab")
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
 * All strings in words have the same length.
 *
 * 1 &lt;= target.length &lt;= 1000
 *
 * words[i] and target contain only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each index i, store the frequency of each character in the ith row.
 * Hint 2: Use dynamic programing to calculate the number of ways to get the target string using the frequency array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-form-a-target-string-given-a-dictionary/">LeetCode #1639</a>
 */
public class NumberOfWaysToFormATargetStringGivenADictionary {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Form a Target String Given a Dictionary");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToFormATargetStringGivenADictionary ===");
        NumberOfWaysToFormATargetStringGivenADictionary sol = new NumberOfWaysToFormATargetStringGivenADictionary();
        System.out.println(sol.solve(null));
    }
}
