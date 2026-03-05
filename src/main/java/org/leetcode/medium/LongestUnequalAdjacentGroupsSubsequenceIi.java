package org.leetcode.medium;


/**
 * <b>#2901 - Longest Unequal Adjacent Groups Subsequence II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string array words, and an array groups, both arrays having length n.
 *
 *
 * The hamming distance between two strings of equal length is the number of positions at which the corresponding characters are different.
 *
 *
 * You need to select the longest subsequence from an array of indices [0, 1, ..., n - 1], such that for the subsequence denoted as [i0, i1, ..., ik-1] having length k, the following holds:
 *
 *
 * For adjacent indices in the subsequence, their corresponding groups are unequal, i.e., groups[ij] != groups[ij+1], for each j where 0 &lt; j + 1 &lt; k.
 *
 * words[ij] and words[ij+1] are equal in length, and the hamming distance between them is 1, where 0 &lt; j + 1 &lt; k, for all indices in the subsequence.
 *
 * Return a string array containing the words corresponding to the indices (in order) in the selected subsequence. If there are multiple answers, return any of them.
 *
 *
 * Note: strings in words may be unequal in length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["bab","dab","cab"], groups = [1,2,2]
 *
 *
 * Output: ["bab","cab"]
 *
 *
 * Explanation: A subsequence that can be selected is [0,2].
 *
 *
 * groups[0] != groups[2]
 *
 * words[0].length == words[2].length, and the hamming distance between them is 1.
 *
 * So, a valid answer is [words[0],words[2]] = ["bab","cab"].
 *
 *
 * Another subsequence that can be selected is [0,1].
 *
 *
 * groups[0] != groups[1]
 *
 * words[0].length == words[1].length, and the hamming distance between them is 1.
 *
 * So, another valid answer is [words[0],words[1]] = ["bab","dab"].
 *
 *
 * It can be shown that the length of the longest subsequence of indices that satisfies the conditions is 2.
 *
 * Example 2:
 *
 * Input: words = ["a","b","c","d"], groups = [1,2,3,4]
 *
 *
 * Output: ["a","b","c","d"]
 *
 *
 * Explanation: We can select the subsequence [0,1,2,3].
 *
 *
 * It satisfies both conditions.
 *
 *
 * Hence, the answer is [words[0],words[1],words[2],words[3]] = ["a","b","c","d"].
 *
 *
 * It has the longest length among all subsequences of indices that satisfy the conditions.
 *
 *
 * Hence, it is the only answer.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == words.length == groups.length &lt;= 1000
 *
 * 1 &lt;= words[i].length &lt;= 10
 *
 * 1 &lt;= groups[i] &lt;= n
 *
 * words consists of distinct strings.
 *
 * words[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i]</code> represent the length of the longest subsequence ending with <code>words[i]</code> that satisfies the conditions.
 * Hint 2: <code>dp[i] =</code> (maximum value of <code>dp[j]</code>) <code>+ 1</code> for indices <code>j &lt; i</code>, where <code>groups[i] != groups[j]</code>, <code>words[i]</code> and <code>words[j]</code> are equal in length, and the hamming distance between <code>words[i]</code> and <code>words[j]</code> is exactly <code>1</code>.
 * Hint 3: Keep track of the <code>j</code> values used to achieve the maximum <code>dp[i]</code> for each index <code>i</code>.
 * Hint 4: The expected array's length is <code>max(dp[0:n])</code>, and starting from the index having the maximum value in <code>dp</code>, we can trace backward to get the words.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-ii/">LeetCode #2901</a>
 */
public class LongestUnequalAdjacentGroupsSubsequenceIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Unequal Adjacent Groups Subsequence II");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestUnequalAdjacentGroupsSubsequenceIi ===");
        LongestUnequalAdjacentGroupsSubsequenceIi sol = new LongestUnequalAdjacentGroupsSubsequenceIi();
        System.out.println(sol.solve(null));
    }
}
