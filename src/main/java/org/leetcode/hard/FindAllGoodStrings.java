package org.leetcode.hard;


/**
 * <b>#1397 - Find All Good Strings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the strings s1 and s2 of size n and the string evil, return the number of good strings.
 *
 *
 * A good string has size n, it is alphabetically greater than or equal to s1, it is alphabetically smaller than or equal to s2, and it does not contain the string evil as a substring. Since the answer can be a huge number, return this modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, s1 = "aa", s2 = "da", evil = "b"
 * Output: 51 
 * Explanation: There are 25 good strings starting with 'a': "aa","ac","ad",...,"az". Then there are 25 good strings starting with 'c': "ca","cc","cd",...,"cz" and finally there is one good string starting with 'd': "da". 
 *
 * Example 2:
 *
 * Input: n = 8, s1 = "leetcode", s2 = "leetgoes", evil = "leet"
 * Output: 0 
 * Explanation: All strings greater than or equal to s1 and smaller than or equal to s2 start with the prefix "leet", therefore, there is not any good string.
 *
 * Example 3:
 *
 * Input: n = 2, s1 = "gx", s2 = "gz", evil = "x"
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * s1.length == n
 *
 * s2.length == n
 *
 * s1 &lt;= s2
 *
 * 1 &lt;= n &lt;= 500
 *
 * 1 &lt;= evil.length &lt;= 50
 *
 * All strings consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use DP with 4 states (pos: Int, posEvil: Int, equalToS1: Bool, equalToS2: Bool) which compute the number of valid strings of size "pos" where the maximum common suffix with string "evil" has size "posEvil". When "equalToS1" is "true", the current valid string is equal to "S1" otherwise it is greater. In a similar way when equalToS2 is "true" the current valid string is equal to "S2" otherwise it is smaller.
 * Hint 2: To update the maximum common suffix with string "evil" use KMP preprocessing.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming, String Matching).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-all-good-strings/">LeetCode #1397</a>
 */
public class FindAllGoodStrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All Good Strings");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindAllGoodStrings ===");
        FindAllGoodStrings sol = new FindAllGoodStrings();
        System.out.println(sol.solve(null));
    }
}
