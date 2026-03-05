package org.leetcode.medium;


/**
 * <b>#3675 - Minimum Operations to Transform String</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting only of lowercase English letters.
 *
 *
 * You can perform the following operation any number of times (including zero):
 *
 *
 *
 *
 * Choose any character c in the string and replace every occurrence of c with the next lowercase letter in the English alphabet.
 *
 *
 * Return the minimum number of operations required to transform s into a string consisting of only 'a' characters.
 *
 *
 * Note: Consider the alphabet as circular, thus 'a' comes after 'z'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "yz"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Change 'y' to 'z' to get "zz".
 *
 * Change 'z' to 'a' to get "aa".
 *
 * Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: s = "a"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The string "a" only consists of 'a'​​​​​​​ characters. Thus, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 5 * 105
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Each operation shifts every occurrence of a chosen character forward by one in the alphabet (with wrap-around).
 * Hint 2: For any character <code>c</code>, the number of moves required to turn it into <code>'a'</code> is <code>(26 - (ord(c) - ord('a'))) % 26</code>.
 * Hint 3: You can plan operations so characters that need more shifts are advanced first and cause merges that don't increase the total number of moves; therefore the minimum number of moves equals the maximum, over characters appearing in <code>s</code>, of <code>(26 - (ord(c) - ord('a'))) % 26</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-transform-string/">LeetCode #3675</a>
 */
public class MinimumOperationsToTransformString {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Transform String");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToTransformString ===");
        MinimumOperationsToTransformString sol = new MinimumOperationsToTransformString();
        System.out.println(sol.solve(null));
    }
}
