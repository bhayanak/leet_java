package org.leetcode.medium;


/**
 * <b>#3211 - Generate Binary Strings Without Adjacent Zeros</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Backtracking, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n.
 *
 *
 * A binary string x is valid if all substrings of x of length 2 contain at least one "1".
 *
 *
 * Return all valid strings with length n, in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 *
 *
 * Output: ["010","011","101","110","111"]
 *
 *
 * Explanation:
 *
 *
 * The valid strings of length 3 are: "010", "011", "101", "110", and "111".
 *
 * Example 2:
 *
 * Input: n = 1
 *
 *
 * Output: ["0","1"]
 *
 *
 * Explanation:
 *
 *
 * The valid strings of length 1 are: "0" and "1".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 18
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we have a string <code>s</code> of length <code>x</code>, we can generate all strings of length <code>x + 1</code>.
 * Hint 2: If <code>s</code> has 0 as the last character, we can only append 1, whereas if the last character is 1, we can append both 0 and 1.
 * Hint 3: We can use recursion and backtracking to generate all such strings.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Backtracking, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/generate-binary-strings-without-adjacent-zeros/">LeetCode #3211</a>
 */
public class GenerateBinaryStringsWithoutAdjacentZeros {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Generate Binary Strings Without Adjacent Zeros");
    }

    public static void main(String[] args) {
        System.out.println("=== GenerateBinaryStringsWithoutAdjacentZeros ===");
        GenerateBinaryStringsWithoutAdjacentZeros sol = new GenerateBinaryStringsWithoutAdjacentZeros();
        System.out.println(sol.solve(null));
    }
}
