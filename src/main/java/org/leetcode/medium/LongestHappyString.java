package org.leetcode.medium;


/**
 * <b>#1405 - Longest Happy String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A string s is called happy if it satisfies the following conditions:
 *
 *
 * s only contains the letters 'a', 'b', and 'c'.
 *
 * s does not contain any of "aaa", "bbb", or "ccc" as a substring.
 *
 * s contains at most a occurrences of the letter 'a'.
 *
 * s contains at most b occurrences of the letter 'b'.
 *
 * s contains at most c occurrences of the letter 'c'.
 *
 * Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = 1, b = 1, c = 7
 * Output: "ccaccbcc"
 * Explanation: "ccbccacc" would also be a correct answer.
 *
 * Example 2:
 *
 * Input: a = 7, b = 1, c = 0
 * Output: "aabaa"
 * Explanation: It is the only correct answer in this case.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= a, b, c &lt;= 100
 *
 * a + b + c &gt; 0
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a greedy approach.
 * Hint 2: Use the letter with the maximum current limit that can be added without breaking the condition.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Heap (Priority Queue)).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/longest-happy-string/">LeetCode #1405</a>
 */
public class LongestHappyString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Happy String");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LongestHappyString ===");
        LongestHappyString sol = new LongestHappyString();
        System.out.println(sol.solve(null));
    }
}
