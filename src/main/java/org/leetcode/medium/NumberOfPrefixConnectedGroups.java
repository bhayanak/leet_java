package org.leetcode.medium;


/**
 * <b>#3839 - Number of Prefix Connected Groups</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings words and an integer k.
 *
 *
 * Two words a and b at distinct indices are prefix-connected if a[0..k-1] == b[0..k-1].
 *
 *
 * A connected group is a set of words such that each pair of words is prefix-connected.
 *
 *
 * Return the number of connected groups that contain at least two words, formed from the given words.
 *
 *
 * Note:
 *
 *
 * Words with length less than k cannot join any group and are ignored.
 *
 * Duplicate strings are treated as separate words.
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["apple","apply","banana","bandit"], k = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Words sharing the same first k = 2 letters are grouped together:
 *
 *
 * words[0] = "apple" and words[1] = "apply" share prefix "ap".
 *
 * words[2] = "banana" and words[3] = "bandit" share prefix "ba".
 *
 * Thus, there are 2 connected groups, each containing at least two words.
 *
 * Example 2:
 *
 * Input: words = ["car","cat","cartoon"], k = 3
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Words are evaluated for a prefix of length k = 3:
 *
 *
 * words[0] = "car" and words[2] = "cartoon" share prefix "car".
 *
 * words[1] = "cat" does not share a 3-length prefix with any other word.
 *
 * Thus, there is 1 connected group.
 *
 * Example 3:
 *
 * Input: words = ["bat","dog","dog","doggy","bat"], k = 3
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Words are evaluated for a prefix of length k = 3:
 *
 *
 * words[0] = "bat" and words[4] = "bat" form a group.
 *
 * words[1] = "dog", words[2] = "dog" and words[3] = "doggy" share prefix "dog".
 *
 * Thus, there are 2 connected groups, each containing at least two words.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 5000
 *
 * 1 &lt;= words[i].length &lt;= 100
 *
 * 1 &lt;= k &lt;= 100
 *
 * All strings in words consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Filter out words with length &lt; <code>k</code>; they can never participate in any valid group.
 * Hint 2: Two words are connected exactly when their first <code>k</code> characters are identical; this reduces the problem to grouping by prefix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/number-of-prefix-connected-groups/">LeetCode #3839</a>
 */
public class NumberOfPrefixConnectedGroups {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Prefix Connected Groups");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPrefixConnectedGroups ===");
        NumberOfPrefixConnectedGroups sol = new NumberOfPrefixConnectedGroups();
        System.out.println(sol.solve(null));
    }
}
