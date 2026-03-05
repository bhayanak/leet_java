package org.leetcode.easy;


/**
 * <b>#3370 - Smallest Number With All Set Bits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive number n.
 *
 *
 * Return the smallest number x greater than or equal to n, such that the binary representation of x contains only set bits
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * The binary representation of 7 is "111".
 *
 * Example 2:
 *
 * Input: n = 10
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * The binary representation of 15 is "1111".
 *
 * Example 3:
 *
 * Input: n = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The binary representation of 3 is "11".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the strictly greater power of 2, and subtract 1 from it.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/smallest-number-with-all-set-bits/">LeetCode #3370</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class SmallestNumberWithAllSetBits {

    /**
     * Solves the problem: Smallest number.
     * Sorts the input first to enable efficient processing.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation. Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int smallestNumber(int n) {
        String bin=Integer.toBinaryString(n);
        char[] sorted=bin.toCharArray(); java.util.Arrays.sort(sorted);
        // arrange: all 1s first, then leading 1
        int ones=(int)new String(sorted).chars().filter(c->c=='1').count();
        int zeros=sorted.length-ones;
        StringBuilder sb=new StringBuilder();
        sb.append('1');
        for (int i=0;i<ones-1;i++) sb.append('1');
        for (int i=0;i<zeros;i++) sb.append('0');
        return Integer.parseInt(sb.toString(),2);
    }

    public static void main(String[] args) {
        SmallestNumberWithAllSetBits sol = new SmallestNumberWithAllSetBits();
        System.out.println(sol.smallestNumber(0));
    }
}
