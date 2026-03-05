package org.leetcode.medium;


/**
 * <b>#1849 - Splitting a String Into Descending Consecutive Values</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s that consists of only digits.
 *
 *
 * Check if we can split s into two or more non-empty substrings such that the numerical values of the substrings are in descending order and the difference between numerical values of every two adjacent substrings is equal to 1.
 *
 *
 * For example, the string s = "0090089" can be split into ["0090", "089"] with numerical values [90,89]. The values are in descending order and adjacent values differ by 1, so this way is valid.
 *
 * Another example, the string s = "001" can be split into ["0", "01"], ["00", "1"], or ["0", "0", "1"]. However all the ways are invalid because they have numerical values [0,1], [0,1], and [0,0,1] respectively, all of which are not in descending order.
 *
 * Return true if it is possible to split s​​​​​​ as described above, or false otherwise.
 *
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1234"
 * Output: false
 * Explanation: There is no valid way to split s.
 *
 * Example 2:
 *
 * Input: s = "050043"
 * Output: true
 * Explanation: s can be split into ["05", "004", "3"] with numerical values [5,4,3].
 * The values are in descending order with adjacent values differing by 1.
 *
 * Example 3:
 *
 * Input: s = "9080701"
 * Output: false
 * Explanation: There is no valid way to split s.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 20
 *
 * s only consists of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: One solution is to try all possible splits using backtrack
 * Hint 2: Look out for trailing zeros in string
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/splitting-a-string-into-descending-consecutive-values/">LeetCode #1849</a>
 */
public class SplittingAStringIntoDescendingConsecutiveValues {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Splitting a String Into Descending Consecutive Values");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SplittingAStringIntoDescendingConsecutiveValues ===");
        SplittingAStringIntoDescendingConsecutiveValues sol = new SplittingAStringIntoDescendingConsecutiveValues();
        System.out.println(sol.solve(null));
    }
}
