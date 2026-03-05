package org.leetcode.medium;


/**
 * <b>#3746 - Minimum String Length After Balanced Removals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting only of the characters 'a' and 'b'.
 *
 *
 * You are allowed to repeatedly remove any substring where the number of 'a' characters is equal to the number of 'b' characters. After each removal, the remaining parts of the string are concatenated together without gaps.
 *
 *
 * Return an integer denoting the minimum possible length of the string after performing any number of such operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aabbab"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The substring "aabbab" has three 'a' and three 'b'. Since their counts are equal, we can remove the entire string directly. The minimum length is 0.
 *
 * Example 2:
 *
 * Input: s = "aaaa"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Every substring of "aaaa" contains only 'a' characters. No substring can be removed as a result, so the minimum length remains 4.
 *
 * Example 3:
 *
 * Input: s = "aaabb"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * First, remove the substring "ab", leaving "aab". Next, remove the new substring "ab", leaving "a". No further removals are possible, so the minimum length is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either 'a' or 'b'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Remove the longest possible balanced substring initially
 * Hint 2: Let the count of a's be <code>count_a</code> and the count of b's be <code>count_b</code>. Can we derive the final length from these?
 * Hint 3: The answer is <code>abs(count_a - count_b)</code>
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Counting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-string-length-after-balanced-removals/">LeetCode #3746</a>
 */
public class MinimumStringLengthAfterBalancedRemovals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum String Length After Balanced Removals");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumStringLengthAfterBalancedRemovals ===");
        MinimumStringLengthAfterBalancedRemovals sol = new MinimumStringLengthAfterBalancedRemovals();
        System.out.println(sol.solve(null));
    }
}
