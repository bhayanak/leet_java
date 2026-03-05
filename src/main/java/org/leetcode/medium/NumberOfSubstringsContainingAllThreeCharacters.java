package org.leetcode.medium;


/**
 * <b>#1358 - Number of Substrings Containing All Three Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting only of characters a, b and c.
 *
 *
 * Return the number of substrings containing at least one occurrence of all these characters a, b and c.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabc"
 * Output: 10
 * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
 *
 * Example 2:
 *
 * Input: s = "aaacb"
 * Output: 3
 * Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 
 *
 * Example 3:
 *
 * Input: s = "abc"
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= s.length &lt;= 5 x 10^4
 *
 * s only consists of a, b or c characters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each position we simply need to find the first occurrence of a/b/c on or after this position.
 * Hint 2: So we can pre-compute three link-list of indices of each a, b, and c.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/">LeetCode #1358</a>
 */
public class NumberOfSubstringsContainingAllThreeCharacters {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Substrings Containing All Three Characters");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubstringsContainingAllThreeCharacters ===");
        NumberOfSubstringsContainingAllThreeCharacters sol = new NumberOfSubstringsContainingAllThreeCharacters();
        System.out.println(sol.solve(null));
    }
}
