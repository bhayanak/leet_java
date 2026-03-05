package org.leetcode.medium;


/**
 * <b>#3853 - Merge Close Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters and an integer k.
 *
 *
 * Two equal characters in the current string s are considered close if the distance between their indices is at most k.
 *
 *
 * When two characters are close, the right one merges into the left. Merges happen one at a time, and after each merge, the string updates until no more merges are possible.
 *
 *
 * Return the resulting string after performing all possible merges.
 *
 *
 * Note: If multiple merges are possible, always merge the pair with the smallest left index. If multiple pairs share the smallest left index, choose the pair with the smallest right index.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abca", k = 3
 *
 *
 * Output: "abc"
 *
 *
 * Explanation:
 *
 *
 * ​​​​​​​Characters 'a' at indices i = 0 and i = 3 are close as 3 - 0 = 3 &lt;= k.
 *
 * Merge them into the left 'a' and s = "abc".
 *
 * No other equal characters are close, so no further merges occur.
 *
 * Example 2:
 *
 * Input: s = "aabca", k = 2
 *
 *
 * Output: "abca"
 *
 *
 * Explanation:
 *
 *
 * Characters 'a' at indices i = 0 and i = 1 are close as 1 - 0 = 1 &lt;= k.
 *
 * Merge them into the left 'a' and s = "abca".
 *
 * Now the remaining 'a' characters at indices i = 0 and i = 3 are not close as k &lt; 3, so no further merges occur.
 *
 * Example 3:
 *
 * Input: s = "yybyzybz", k = 2
 *
 *
 * Output: "ybzybz"
 *
 *
 * Explanation:
 *
 *
 * Characters 'y' at indices i = 0 and i = 1 are close as 1 - 0 = 1 &lt;= k.
 *
 * Merge them into the left 'y' and s = "ybyzybz".
 *
 * Now the characters 'y' at indices i = 0 and i = 2 are close as 2 - 0 = 2 &lt;= k.
 *
 * Merge them into the left 'y' and s = "ybzybz".
 *
 * No other equal characters are close, so no further merges occur.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * 1 &lt;= k &lt;= s.length
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/merge-close-characters/">LeetCode #3853</a>
 */
public class MergeCloseCharacters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Merge Close Characters");
    }

    public static void main(String[] args) {
        System.out.println("=== MergeCloseCharacters ===");
        MergeCloseCharacters sol = new MergeCloseCharacters();
        System.out.println(sol.solve(null));
    }
}
