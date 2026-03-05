package org.leetcode.hard;


/**
 * <b>#1312 - Minimum Insertion Steps to Make a String Palindrome</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s. In one step you can insert any character at any index of the string.
 *
 *
 * Return the minimum number of steps to make s palindrome.
 *
 *
 * A Palindrome String is one that reads the same backward as well as forward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "zzazz"
 * Output: 0
 * Explanation: The string "zzazz" is already palindrome we do not need any insertions.
 *
 * Example 2:
 *
 * Input: s = "mbadm"
 * Output: 2
 * Explanation: String can be "mbdadbm" or "mdbabdm".
 *
 * Example 3:
 *
 * Input: s = "leetcode"
 * Output: 5
 * Explanation: Inserting 5 characters the string becomes "leetcodocteel".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Is dynamic programming suitable for this problem ?
 * Hint 2: If we know the longest palindromic sub-sequence is x and the length of the string is n then, what is the answer to this problem? It is n - x as we need n - x insertions to make the remaining characters also palindrome.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/">LeetCode #1312</a>
 */
public class MinimumInsertionStepsToMakeAStringPalindrome {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Insertion Steps to Make a String Palindrome");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumInsertionStepsToMakeAStringPalindrome ===");
        MinimumInsertionStepsToMakeAStringPalindrome sol = new MinimumInsertionStepsToMakeAStringPalindrome();
        System.out.println(sol.solve(null));
    }
}
