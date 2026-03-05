package org.leetcode.medium;


/**
 * <b>#3170 - Lexicographically Minimum String After Removing Stars</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Stack, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s. It may contain any number of '*' characters. Your task is to remove all '*' characters.
 *
 *
 * While there is a '*', do the following operation:
 *
 *
 * Delete the leftmost '*' and the smallest non-'*' character to its left. If there are several smallest characters, you can delete any of them.
 *
 * Return the lexicographically smallest resulting string after removing all '*' characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaba*"
 *
 *
 * Output: "aab"
 *
 *
 * Explanation:
 *
 *
 * We should delete one of the 'a' characters with '*'. If we choose s[3], s becomes the lexicographically smallest.
 *
 * Example 2:
 *
 * Input: s = "abc"
 *
 *
 * Output: "abc"
 *
 *
 * Explanation:
 *
 *
 * There is no '*' in the string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists only of lowercase English letters and '*'.
 *
 * The input is generated such that it is possible to delete all '*' characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Stack, Greedy, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/lexicographically-minimum-string-after-removing-stars/">LeetCode #3170</a>
 */
public class LexicographicallyMinimumStringAfterRemovingStars {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Lexicographically Minimum String After Removing Stars");
    }

    public static void main(String[] args) {
        System.out.println("=== LexicographicallyMinimumStringAfterRemovingStars ===");
        LexicographicallyMinimumStringAfterRemovingStars sol = new LexicographicallyMinimumStringAfterRemovingStars();
        System.out.println(sol.solve(null));
    }
}
