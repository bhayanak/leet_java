package org.leetcode.medium;


/**
 * <b>#3144 - Minimum Substring Partition of Equal Character Frequency</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, you need to partition it into one or more balanced substrings. For example, if s == "ababcc" then ("abab", "c", "c"), ("ab", "abc", "c"), and ("ababcc") are all valid partitions, but ("a", "bab", "cc"), ("aba", "bc", "c"), and ("ab", "abcc") are not. The unbalanced substrings are bolded.
 *
 *
 * Return the minimum number of substrings that you can partition s into.
 *
 *
 * Note: A balanced string is a string where each character in the string occurs the same number of times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "fabccddg"
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * We can partition the string s into 3 substrings in one of the following ways: ("fab, "ccdd", "g"), or ("fabc", "cd", "dg").
 *
 * Example 2:
 *
 * Input: s = "abababaccddb"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * We can partition the string s into 2 substrings like so: ("abab", "abaccddb").
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists only of English lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> be the minimum number of partitions for the prefix ending at index <code>i + 1</code>.
 * Hint 2: <code>dp[i]</code> can be calculated as the <code>min(dp[j])</code> over all <code>j</code> such that <code>j &lt; i</code> and <code>word[j+1…i]</code> is valid.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-substring-partition-of-equal-character-frequency/">LeetCode #3144</a>
 */
public class MinimumSubstringPartitionOfEqualCharacterFrequency {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Substring Partition of Equal Character Frequency");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumSubstringPartitionOfEqualCharacterFrequency ===");
        MinimumSubstringPartitionOfEqualCharacterFrequency sol = new MinimumSubstringPartitionOfEqualCharacterFrequency();
        System.out.println(sol.solve(null));
    }
}
