package org.leetcode.medium;


/**
 * <b>#1540 - Can Convert String in K Moves</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, your goal is to convert s into t in k moves or less.
 *
 *
 * During the ith (1 &lt;= i &lt;= k) move you can:
 *
 *
 * Choose any index j (1-indexed) from s, such that 1 &lt;= j &lt;= s.length and j has not been chosen in any previous move, and shift the character at that index i times.
 *
 * Do nothing.
 *
 * Shifting a character means replacing it by the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Shifting a character by i means applying the shift operations i times.
 *
 *
 * Remember that any index j can be picked at most once.
 *
 *
 * Return true if it's possible to convert s into t in no more than k moves, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "input", t = "ouput", k = 9
 * Output: true
 * Explanation: In the 6th move, we shift 'i' 6 times to get 'o'. And in the 7th move we shift 'n' to get 'u'.
 *
 * Example 2:
 *
 * Input: s = "abc", t = "bcd", k = 10
 * Output: false
 * Explanation: We need to shift each character in s one time to convert it into t. We can shift 'a' to 'b' during the 1st move. However, there is no way to shift the other characters in the remaining moves to obtain t from s.
 *
 * Example 3:
 *
 * Input: s = "aab", t = "bbb", k = 27
 * Output: true
 * Explanation: In the 1st move, we shift the first 'a' 1 time to get 'b'. In the 27th move, we shift the second 'a' 27 times to get 'b'.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 10^5
 *
 * 0 &lt;= k &lt;= 10^9
 *
 * s, t contain only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Observe that shifting a letter x times has the same effect of shifting the letter x + 26 times.
 * Hint 2: You need to check whether k is large enough to cover all shifts with the same remainder after modulo 26.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/can-convert-string-in-k-moves/">LeetCode #1540</a>
 */
public class CanConvertStringInKMoves {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Can Convert String in K Moves");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CanConvertStringInKMoves ===");
        CanConvertStringInKMoves sol = new CanConvertStringInKMoves();
        System.out.println(sol.solve(null));
    }
}
