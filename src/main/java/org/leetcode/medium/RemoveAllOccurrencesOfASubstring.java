package org.leetcode.medium;


/**
 * <b>#1910 - Remove All Occurrences of a Substring</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and part, perform the following operation on s until all occurrences of the substring part are removed:
 *
 *
 * Find the leftmost occurrence of the substring part and remove it from s.
 *
 * Return s after removing all occurrences of part.
 *
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "daabcbaabcbc", part = "abc"
 * Output: "dab"
 * Explanation: The following operations are done:
 * - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
 * - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
 * - s = "dababc", remove "abc" starting at index 3, so s = "dab".
 * Now s has no occurrences of "abc".
 *
 * Example 2:
 *
 * Input: s = "axxxxyyyyb", part = "xy"
 * Output: "ab"
 * Explanation: The following operations are done:
 * - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
 * - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
 * - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
 * - s = "axyb", remove "xy" starting at index 1 so s = "ab".
 * Now s has no occurrences of "xy".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * 1 &lt;= part.length &lt;= 1000
 *
 * s​​​​​​ and part consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that a new occurrence of pattern can appear if you remove an old one, For example, s = "ababcc" and pattern = "abc".
 * Hint 2: You can maintain a stack of characters and if the last character of the pattern size in the stack match the pattern remove them
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-all-occurrences-of-a-substring/">LeetCode #1910</a>
 */
public class RemoveAllOccurrencesOfASubstring {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Remove All Occurrences of a Substring");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RemoveAllOccurrencesOfASubstring ===");
        RemoveAllOccurrencesOfASubstring sol = new RemoveAllOccurrencesOfASubstring();
        System.out.println(sol.solve(null));
    }
}
