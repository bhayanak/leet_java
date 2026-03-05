package org.leetcode.medium;


/**
 * <b>#1525 - Number of Good Ways to Split a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s.
 *
 *
 * A split is called good if you can split s into two non-empty strings sleft and sright where their concatenation is equal to s (i.e., sleft + sright = s) and the number of distinct letters in sleft and sright is the same.
 *
 *
 * Return the number of good splits you can make in s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aacaba"
 * Output: 2
 * Explanation: There are 5 ways to split "aacaba" and 2 of them are good. 
 * ("a", "acaba") Left string and right string contains 1 and 3 different letters respectively.
 * ("aa", "caba") Left string and right string contains 1 and 3 different letters respectively.
 * ("aac", "aba") Left string and right string contains 2 and 2 different letters respectively (good split).
 * ("aaca", "ba") Left string and right string contains 2 and 2 different letters respectively (good split).
 * ("aacab", "a") Left string and right string contains 3 and 1 different letters respectively.
 *
 * Example 2:
 *
 * Input: s = "abcd"
 * Output: 1
 * Explanation: Split the string as follows ("ab", "cd").
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use two HashMap to store the counts of distinct letters in the left and right substring divided by the current index.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-good-ways-to-split-a-string/">LeetCode #1525</a>
 */
public class NumberOfGoodWaysToSplitAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Good Ways to Split a String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfGoodWaysToSplitAString ===");
        NumberOfGoodWaysToSplitAString sol = new NumberOfGoodWaysToSplitAString();
        System.out.println(sol.solve(null));
    }
}
