package org.leetcode.medium;


/**
 * <b>#1593 - Split a String Into the Max Number of Unique Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the maximum number of unique substrings that the given string can be split into.
 *
 *
 * You can split string s into any list of non-empty substrings, where the concatenation of the substrings forms the original string. However, you must split the substrings such that all of them are unique.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ababccc"
 * Output: 5
 * Explanation: One way to split maximally is ['a', 'b', 'ab', 'c', 'cc']. Splitting like ['a', 'b', 'a', 'b', 'c', 'cc'] is not valid as you have 'a' and 'b' multiple times.
 *
 * Example 2:
 *
 * Input: s = "aba"
 * Output: 2
 * Explanation: One way to split maximally is ['a', 'ba'].
 *
 * Example 3:
 *
 * Input: s = "aa"
 * Output: 1
 * Explanation: It is impossible to split the string any further.
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * 1 &lt;= s.length &lt;= 16
 *
 *
 *
 *
 * s contains only lower case English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a set to keep track of which substrings have been used already
 * Hint 2: Try each possible substring at every position and backtrack if a complete split is not possible
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/">LeetCode #1593</a>
 */
public class SplitAStringIntoTheMaxNumberOfUniqueSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Split a String Into the Max Number of Unique Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SplitAStringIntoTheMaxNumberOfUniqueSubstrings ===");
        SplitAStringIntoTheMaxNumberOfUniqueSubstrings sol = new SplitAStringIntoTheMaxNumberOfUniqueSubstrings();
        System.out.println(sol.solve(null));
    }
}
