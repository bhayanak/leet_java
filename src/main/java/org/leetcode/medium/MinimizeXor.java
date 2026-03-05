package org.leetcode.medium;


/**
 * <b>#2429 - Minimize XOR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two positive integers num1 and num2, find the positive integer x such that:
 *
 *
 * x has the same number of set bits as num2, and
 *
 * The value x XOR num1 is minimal.
 *
 * Note that XOR is the bitwise XOR operation.
 *
 *
 * Return the integer x. The test cases are generated such that x is uniquely determined.
 *
 *
 * The number of set bits of an integer is the number of 1's in its binary representation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = 3, num2 = 5
 * Output: 3
 * Explanation:
 * The binary representations of num1 and num2 are 0011 and 0101, respectively.
 * The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.
 *
 * Example 2:
 *
 * Input: num1 = 1, num2 = 12
 * Output: 3
 * Explanation:
 * The binary representations of num1 and num2 are 0001 and 1100, respectively.
 * The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num1, num2 &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: To arrive at a small xor, try to turn off some bits from num1
 * Hint 2: If there are still left bits to set, try to set them from the least significant bit
 *
 * <h2>Approach</h2>
 * Think about the category (Greedy, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimize-xor/">LeetCode #2429</a>
 */
public class MinimizeXor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize XOR");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeXor ===");
        MinimizeXor sol = new MinimizeXor();
        System.out.println(sol.solve(null));
    }
}
