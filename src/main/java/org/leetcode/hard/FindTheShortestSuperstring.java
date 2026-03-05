package org.leetcode.hard;


/**
 * <b>#943 - Find the Shortest Superstring</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of strings words, return the smallest string that contains each string in words as a substring. If there are multiple valid strings of the smallest length, return any of them.
 *
 *
 * You may assume that no string in words is a substring of another string in words.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: words = ["alex","loves","leetcode"]
 * Output: "alexlovesleetcode"
 * Explanation: All permutations of "alex","loves","leetcode" would also be accepted.
 *
 * Example 2:
 *
 * Input: words = ["catg","ctaagt","gcta","ttca","atgcatc"]
 * Output: "gctaagttcatgcatc"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= words.length &lt;= 12
 *
 * 1 &lt;= words[i].length &lt;= 20
 *
 * words[i] consists of lowercase English letters.
 *
 * All the strings of words are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-shortest-superstring/">LeetCode #943</a>
 */
public class FindTheShortestSuperstring {

    /**
     * TODO: Implement "Find the Shortest Superstring".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Shortest Superstring");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FindTheShortestSuperstring.java &amp;&amp; java org.leetcode.hard.FindTheShortestSuperstring</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheShortestSuperstring ===");
        FindTheShortestSuperstring sol = new FindTheShortestSuperstring();
        System.out.println(sol.solve(null));
    }
}
