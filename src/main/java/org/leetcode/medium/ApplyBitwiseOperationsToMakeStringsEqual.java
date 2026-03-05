package org.leetcode.medium;


/**
 * <b>#2546 - Apply Bitwise Operations to Make Strings Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two 0-indexed binary strings s and target of the same length n. You can do the following operation on s any number of times:
 *
 *
 * Choose two different indices i and j where 0 &lt;= i, j &lt; n.
 *
 * Simultaneously, replace s[i] with (s[i] OR s[j]) and s[j] with (s[i] XOR s[j]).
 *
 * For example, if s = "0110", you can choose i = 0 and j = 2, then simultaneously replace s[0] with (s[0] OR s[2] = 0 OR 1 = 1), and s[2] with (s[0] XOR s[2] = 0 XOR 1 = 1), so we will have s = "1110".
 *
 *
 * Return true if you can make the string s equal to target, or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1010", target = "0110"
 * Output: true
 * Explanation: We can do the following operations:
 * - Choose i = 2 and j = 0. We have now s = "0010".
 * - Choose i = 2 and j = 1. We have now s = "0110".
 * Since we can make s equal to target, we return true.
 *
 * Example 2:
 *
 * Input: s = "11", target = "00"
 * Output: false
 * Explanation: It is not possible to make s equal to target with any number of operations.
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length == target.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * s and target consist of only the digits 0 and 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of when it is impossible to convert the string to the target.
 * Hint 2: If exactly one of the strings is having all 0’s, then it is impossible. And it is possible in all other cases. Why is that true?
 *
 * <h2>Approach</h2>
 * Think about the category (String, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/apply-bitwise-operations-to-make-strings-equal/">LeetCode #2546</a>
 */
public class ApplyBitwiseOperationsToMakeStringsEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Apply Bitwise Operations to Make Strings Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== ApplyBitwiseOperationsToMakeStringsEqual ===");
        ApplyBitwiseOperationsToMakeStringsEqual sol = new ApplyBitwiseOperationsToMakeStringsEqual();
        System.out.println(sol.solve(null));
    }
}
