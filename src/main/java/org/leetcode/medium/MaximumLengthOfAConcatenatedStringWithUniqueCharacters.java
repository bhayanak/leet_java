package org.leetcode.medium;


/**
 * <b>#1239 - Maximum Length of a Concatenated String with Unique Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Backtracking, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.
 *
 *
 * Return the maximum possible length of s.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = ["un","iq","ue"]
 * Output: 4
 * Explanation: All the valid concatenations are:
 * - ""
 * - "un"
 * - "iq"
 * - "ue"
 * - "uniq" ("un" + "iq")
 * - "ique" ("iq" + "ue")
 * Maximum length is 4.
 *
 * Example 2:
 *
 * Input: arr = ["cha","r","act","ers"]
 * Output: 6
 * Explanation: Possible longest valid concatenations are "chaers" ("cha" + "ers") and "acters" ("act" + "ers").
 *
 * Example 3:
 *
 * Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
 * Output: 26
 * Explanation: The only string in arr has all 26 characters.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 16
 *
 * 1 &lt;= arr[i].length &lt;= 26
 *
 * arr[i] contains only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can try all combinations and keep mask of characters you have.
 * Hint 2: You can use DP.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Backtracking, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/">LeetCode #1239</a>
 */
public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Length of a Concatenated String with Unique Characters");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumLengthOfAConcatenatedStringWithUniqueCharacters ===");
        MaximumLengthOfAConcatenatedStringWithUniqueCharacters sol = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();
        System.out.println(sol.solve(null));
    }
}
