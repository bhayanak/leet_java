package org.leetcode.medium;


/**
 * <b>#1759 - Count Number of Homogenous Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * A string is homogenous if all the characters of the string are the same.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abbcccaa"
 * Output: 13
 * Explanation: The homogenous substrings are listed as below:
 * "a"   appears 3 times.
 * "aa"  appears 1 time.
 * "b"   appears 2 times.
 * "bb"  appears 1 time.
 * "c"   appears 3 times.
 * "cc"  appears 2 times.
 * "ccc" appears 1 time.
 * 3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
 *
 * Example 2:
 *
 * Input: s = "xy"
 * Output: 2
 * Explanation: The homogenous substrings are "x" and "y".
 *
 * Example 3:
 *
 * Input: s = "zzzzz"
 * Output: 15
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A string of only 'a's of length k contains k + 1 choose 2 homogenous substrings.
 * Hint 2: Split the string into substrings where each substring contains only one letter, and apply the formula on each substring's length.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-homogenous-substrings/">LeetCode #1759</a>
 */
public class CountNumberOfHomogenousSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Homogenous Substrings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountNumberOfHomogenousSubstrings ===");
        CountNumberOfHomogenousSubstrings sol = new CountNumberOfHomogenousSubstrings();
        System.out.println(sol.solve(null));
    }
}
