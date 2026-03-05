package org.leetcode.easy;


/**
 * <b>#1009 - Complement of Base 10 Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 *
 *
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 *
 * Given an integer n, return its complement.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: 2
 * Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
 *
 * Example 2:
 *
 * Input: n = 7
 * Output: 0
 * Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
 *
 * Example 3:
 *
 * Input: n = 10
 * Output: 5
 * Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt; 109
 *
 *
 *
 * Note: This question is the same as 476: https://leetcode.com/problems/number-complement/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A binary number plus its complement will equal 111....111 in binary.  Also, N = 0 is a corner case.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/complement-of-base-10-integer/">LeetCode #1009</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class ComplementOfBase10Integer {

    /**
     * Solves the problem: Bitwise complement.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mask = 1;
        while (mask < n) mask = (mask << 1) | 1;
        return mask ^ n;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ComplementOfBase10Integer.java &amp;&amp; java org.leetcode.easy.ComplementOfBase10Integer</pre>
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ComplementOfBase10Integer sol = new ComplementOfBase10Integer();
                System.out.println(sol.bitwiseComplement(5));  // 2 (101 -> 010)
                System.out.println(sol.bitwiseComplement(7));  // 0 (111 -> 000)
                System.out.println(sol.bitwiseComplement(10)); // 5 (1010 -> 0101)
    }
}
