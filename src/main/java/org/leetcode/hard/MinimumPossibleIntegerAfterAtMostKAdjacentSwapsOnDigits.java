package org.leetcode.hard;


/**
 * <b>#1505 - Minimum Possible Integer After at Most K Adjacent Swaps On Digits</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Greedy, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num representing the digits of a very large integer and an integer k. You are allowed to swap any two adjacent digits of the integer at most k times.
 *
 *
 * Return the minimum integer you can obtain also as a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "4321", k = 4
 * Output: "1342"
 * Explanation: The steps to obtain the minimum integer from 4321 with 4 adjacent swaps are shown.
 *
 * Example 2:
 *
 * Input: num = "100", k = 1
 * Output: "010"
 * Explanation: It's ok for the output to have leading zeros, but the input is guaranteed not to have any leading zeros.
 *
 * Example 3:
 *
 * Input: num = "36789", k = 1000
 * Output: "36789"
 * Explanation: We can keep the number without any swaps.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 3 * 104
 *
 * num consists of only digits and does not contain leading zeros.
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We want to make the smaller digits the most significant digits in the number.
 * Hint 2: For each index i, check the smallest digit in a window of size k and append it to the answer. Update the indices of all digits in this range accordingly.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Binary Indexed Tree, Segment Tree).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-possible-integer-after-at-most-k-adjacent-swaps-on-digits/">LeetCode #1505</a>
 */
public class MinimumPossibleIntegerAfterAtMostKAdjacentSwapsOnDigits {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Possible Integer After at Most K Adjacent Swaps On Digits");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumPossibleIntegerAfterAtMostKAdjacentSwapsOnDigits ===");
        MinimumPossibleIntegerAfterAtMostKAdjacentSwapsOnDigits sol = new MinimumPossibleIntegerAfterAtMostKAdjacentSwapsOnDigits();
        System.out.println(sol.solve(null));
    }
}
