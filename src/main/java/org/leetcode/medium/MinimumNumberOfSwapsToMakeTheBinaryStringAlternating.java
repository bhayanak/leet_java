package org.leetcode.medium;


/**
 * <b>#1864 - Minimum Number of Swaps to Make the Binary String Alternating</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a binary string s, return the minimum number of character swaps to make it alternating, or -1 if it is impossible.
 *
 *
 * The string is called alternating if no two adjacent characters are equal. For example, the strings "010" and "1010" are alternating, while the string "0100" is not.
 *
 *
 * Any two characters may be swapped, even if they are not adjacent.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "111000"
 * Output: 1
 * Explanation: Swap positions 1 and 4: "111000" -&gt; "101010"
 * The string is now alternating.
 *
 * Example 2:
 *
 * Input: s = "010"
 * Output: 0
 * Explanation: The string is already alternating, no swaps are needed.
 *
 * Example 3:
 *
 * Input: s = "1110"
 * Output: -1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s[i] is either '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about all valid strings of length n.
 * Hint 2: Try to count the mismatched positions with each valid string of length n.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-binary-string-alternating/">LeetCode #1864</a>
 */
public class MinimumNumberOfSwapsToMakeTheBinaryStringAlternating {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Swaps to Make the Binary String Alternating");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfSwapsToMakeTheBinaryStringAlternating ===");
        MinimumNumberOfSwapsToMakeTheBinaryStringAlternating sol = new MinimumNumberOfSwapsToMakeTheBinaryStringAlternating();
        System.out.println(sol.solve(null));
    }
}
