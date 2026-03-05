package org.leetcode.medium;


/**
 * <b>#2939 - Maximum Xor Product</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given three integers a, b, and n, return the maximum value of (a XOR x) * (b XOR x) where 0 &lt;= x &lt; 2n.
 *
 *
 * Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * Note that XOR is the bitwise XOR operation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = 12, b = 5, n = 4
 * Output: 98
 * Explanation: For x = 2, (a XOR x) = 14 and (b XOR x) = 7. Hence, (a XOR x) * (b XOR x) = 98. 
 * It can be shown that 98 is the maximum value of (a XOR x) * (b XOR x) for all 0 &lt;= x &lt; 2n.
 *
 * Example 2:
 *
 * Input: a = 6, b = 7 , n = 5
 * Output: 930
 * Explanation: For x = 25, (a XOR x) = 31 and (b XOR x) = 30. Hence, (a XOR x) * (b XOR x) = 930.
 * It can be shown that 930 is the maximum value of (a XOR x) * (b XOR x) for all 0 &lt;= x &lt; 2n.
 *
 * Example 3:
 *
 * Input: a = 1, b = 6, n = 3
 * Output: 12
 * Explanation: For x = 5, (a XOR x) = 4 and (b XOR x) = 3. Hence, (a XOR x) * (b XOR x) = 12.
 * It can be shown that 12 is the maximum value of (a XOR x) * (b XOR x) for all 0 &lt;= x &lt; 2n.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= a, b &lt; 250
 *
 * 0 &lt;= n &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate over bits from most significant to least significant.
 * Hint 2: For the <code>i<sup>th</sup></code> bit, if both <code>a</code> and <code>b</code> have the same value, we can always make <code>x</code>'s <code>i<sup>th</sup></code> bit different from <code>a</code> and <code>b</code>, so <code>a ^ x</code> and <code>b ^ x</code> both have the <code>i<sup>th</sup></code> bit set.
 * Hint 3: Otherwise, we can only set the <code>i<sup>th</sup></code> bit of one of <code>a ^ x</code> or <code>b ^ x</code>. Depending on the previous bits of  <code>a ^ x</code> or <code>b ^ x</code>, we should set the smaller value’s <code>i<sup>th</sup></code> bit.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-xor-product/">LeetCode #2939</a>
 */
public class MaximumXorProduct {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Xor Product");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumXorProduct ===");
        MaximumXorProduct sol = new MaximumXorProduct();
        System.out.println(sol.solve(null));
    }
}
