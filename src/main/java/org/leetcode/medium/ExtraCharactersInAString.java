package org.leetcode.medium;


/**
 * <b>#2707 - Extra Characters in a String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Dynamic Programming, Trie</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string s and a dictionary of words dictionary. You have to break s into one or more non-overlapping substrings such that each substring is present in dictionary. There may be some extra characters in s which are not present in any of the substrings.
 *
 *
 * Return the minimum number of extra characters left over if you break up s optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetscode", dictionary = ["leet","code","leetcode"]
 * Output: 1
 * Explanation: We can break s in two substrings: "leet" from index 0 to 3 and "code" from index 5 to 8. There is only 1 unused character (at index 4), so we return 1.
 *
 * Example 2:
 *
 * Input: s = "sayhelloworld", dictionary = ["hello","world"]
 * Output: 3
 * Explanation: We can break s in two substrings: "hello" from index 3 to 7 and "world" from index 8 to 12. The characters at indices 0, 1, 2 are not used in any substring and thus are considered as extra characters. Hence, we return 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 50
 *
 * 1 &lt;= dictionary.length &lt;= 50
 *
 * 1 &lt;= dictionary[i].length &lt;= 50
 *
 * dictionary[i] and s consists of only lowercase English letters
 *
 * dictionary contains distinct words
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use Dynamic Programming here?
 * Hint 2: Define DP[i] as the min extra character if breaking up s[0:i] optimally.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Dynamic Programming, Trie).
 *
 * @see <a href="https://leetcode.com/problems/extra-characters-in-a-string/">LeetCode #2707</a>
 */
public class ExtraCharactersInAString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Extra Characters in a String");
    }

    public static void main(String[] args) {
        System.out.println("=== ExtraCharactersInAString ===");
        ExtraCharactersInAString sol = new ExtraCharactersInAString();
        System.out.println(sol.solve(null));
    }
}
