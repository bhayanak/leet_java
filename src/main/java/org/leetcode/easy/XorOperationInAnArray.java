package org.leetcode.easy;


/**
 * <b>#1486 - XOR Operation in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and an integer start.
 *
 *
 * Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
 *
 *
 * Return the bitwise XOR of all elements of nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, start = 0
 * Output: 8
 * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
 * Where "^" corresponds to bitwise XOR operator.
 *
 * Example 2:
 *
 * Input: n = 4, start = 3
 * Output: 8
 * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 0 &lt;= start &lt;= 1000
 *
 * n == nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process, create an array nums and return the Bitwise XOR of all elements of it.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/xor-operation-in-an-array/">LeetCode #1486</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class XorOperationInAnArray {

    /**
     * Solves the problem: Xor operation.
     *
     * @param n the n (int)
     * @param start the start (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int xorOperation(int n, int start) {
        int res=0;
        for (int i=0;i<n;i++) res^=start+2*i;
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        XorOperationInAnArray sol = new XorOperationInAnArray();
                System.out.println(sol.xorOperation(5, 0)); // 8
                System.out.println(sol.xorOperation(4, 3)); // 8
                System.out.println(sol.xorOperation(1, 7)); // 7
                System.out.println(sol.xorOperation(10, 5)); // 2
    }
}
