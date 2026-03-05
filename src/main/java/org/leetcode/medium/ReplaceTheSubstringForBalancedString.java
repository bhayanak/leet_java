package org.leetcode.medium;


/**
 * <b>#1234 - Replace the Substring for Balanced String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n containing only four kinds of characters: 'Q', 'W', 'E', and 'R'.
 *
 *
 * A string is said to be balanced if each of its characters appears n / 4 times where n is the length of the string.
 *
 *
 * Return the minimum length of the substring that can be replaced with any other string of the same length to make s balanced. If s is already balanced, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "QWER"
 * Output: 0
 * Explanation: s is already balanced.
 *
 * Example 2:
 *
 * Input: s = "QQWE"
 * Output: 1
 * Explanation: We need to replace a 'Q' to 'R', so that "RQWE" (or "QRWE") is balanced.
 *
 * Example 3:
 *
 * Input: s = "QQQW"
 * Output: 2
 * Explanation: We can replace the first "QQ" to "ER". 
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length
 *
 * 4 &lt;= n &lt;= 105
 *
 * n is a multiple of 4.
 *
 * s contains only 'Q', 'W', 'E', and 'R'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use 2-pointers algorithm to make sure all amount of characters outside the 2 pointers are smaller or equal to n/4.
 * Hint 2: That means you need to count the amount of each letter and make sure the amount is enough.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/replace-the-substring-for-balanced-string/">LeetCode #1234</a>
 */
public class ReplaceTheSubstringForBalancedString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Replace the Substring for Balanced String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReplaceTheSubstringForBalancedString ===");
        ReplaceTheSubstringForBalancedString sol = new ReplaceTheSubstringForBalancedString();
        System.out.println(sol.solve(null));
    }
}
