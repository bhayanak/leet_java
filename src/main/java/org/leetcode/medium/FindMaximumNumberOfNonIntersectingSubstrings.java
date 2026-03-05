package org.leetcode.medium;


/**
 * <b>#3557 - Find Maximum Number of Non Intersecting Substrings</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string word.
 *
 *
 * Return the maximum number of non-intersecting substrings of word that are at least four characters long and start and end with the same letter.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: word = "abcdeafdef"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The two substrings are "abcdea" and "fdef".
 *
 * Example 2:
 *
 * Input: word = "bcdaaaab"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only substring is "aaaa". Note that we cannot also choose "bcdaaaab" since it intersects with the other substring.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= word.length &lt;= 2 * 105
 *
 * word consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we solve the problem using Dynamic Programming?
 * Hint 2: For each character <code>c</code>, store all occurrence indices in order
 * Hint 3: At each position <code>i</code>, let <code>j</code> be the first index of <code>word[i]</code>; if <code>i - j &gt;= 3</code>, we can form substring <code>[j, i]</code>
 * Hint 4: For each index, also store the maximum for <b>any</b> substring ending before that index in the dp.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/find-maximum-number-of-non-intersecting-substrings/">LeetCode #3557</a>
 */
public class FindMaximumNumberOfNonIntersectingSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Maximum Number of Non Intersecting Substrings");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMaximumNumberOfNonIntersectingSubstrings ===");
        FindMaximumNumberOfNonIntersectingSubstrings sol = new FindMaximumNumberOfNonIntersectingSubstrings();
        System.out.println(sol.solve(null));
    }
}
