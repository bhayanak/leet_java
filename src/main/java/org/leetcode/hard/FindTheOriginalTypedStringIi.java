package org.leetcode.hard;


/**
 * <b>#3333 - Find the Original Typed String II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice is attempting to type a specific string on her computer. However, she tends to be clumsy and may press a key for too long, resulting in a character being typed multiple times.
 *
 *
 * You are given a string word, which represents the final output displayed on Alice's screen. You are also given a positive integer k.
 *
 *
 * Return the total number of possible original strings that Alice might have intended to type, if she was trying to type a string of size at least k.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "aabbccdd", k = 7
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The possible strings are: "aabbccdd", "aabbccd", "aabbcdd", "aabccdd", and "abbccdd".
 *
 * Example 2:
 *
 * Input: word = "aabbccdd", k = 8
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only possible string is "aabbccdd".
 *
 * Example 3:
 *
 * Input: word = "aaabbb", k = 3
 *
 *
 * Output: 8
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 5 * 105
 *
 * word consists only of lowercase English letters.
 *
 * 1 &lt;= k &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Instead of solving for at least <code>k</code>, can we solve for at most <code>k - 1</code> length?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-original-typed-string-ii/">LeetCode #3333</a>
 */
public class FindTheOriginalTypedStringIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Original Typed String II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheOriginalTypedStringIi ===");
        FindTheOriginalTypedStringIi sol = new FindTheOriginalTypedStringIi();
        System.out.println(sol.solve(null));
    }
}
