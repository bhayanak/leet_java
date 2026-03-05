package org.leetcode.medium;


/**
 * <b>#1702 - Maximum Binary String After Change</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string binary consisting of only 0's or 1's. You can apply each of the following operations any number of times:
 *
 *
 * Operation 1: If the number contains the substring "00", you can replace it with "10".
 *
 *
 *
 *
 * For example, "00010" -&gt; "10010"
 *
 *
 *
 * Operation 2: If the number contains the substring "10", you can replace it with "01".
 *
 *
 *
 * For example, "00010" -&gt; "00001"
 *
 *
 *
 * Return the maximum binary string you can obtain after any number of operations. Binary string x is greater than binary string y if x's decimal representation is greater than y's decimal representation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: binary = "000110"
 * Output: "111011"
 * Explanation: A valid transformation sequence can be:
 * "000110" -&gt; "000101" 
 * "000101" -&gt; "100101" 
 * "100101" -&gt; "110101" 
 * "110101" -&gt; "110011" 
 * "110011" -&gt; "111011"
 *
 * Example 2:
 *
 * Input: binary = "01"
 * Output: "01"
 * Explanation: "01" cannot be transformed any further.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= binary.length &lt;= 105
 *
 * binary consist of '0' and '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that with the operations, you can always make the string only contain at most 1 zero.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-binary-string-after-change/">LeetCode #1702</a>
 */
public class MaximumBinaryStringAfterChange {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Binary String After Change");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumBinaryStringAfterChange ===");
        MaximumBinaryStringAfterChange sol = new MaximumBinaryStringAfterChange();
        System.out.println(sol.solve(null));
    }
}
