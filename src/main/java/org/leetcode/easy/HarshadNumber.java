package org.leetcode.easy;


/**
 * <b>#3099 - Harshad Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: x = 18
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9.
 *
 * Example 2:
 *
 * Input: x = 23
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * The sum of digits of x is 5. 23 is not divisible by 5. So 23 is not a Harshad number and the answer is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= x &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a while loop and divide <code>x</code> by <code>10</code> to find the sum of the digits of <code>x</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/harshad-number/">LeetCode #3099</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class HarshadNumber {

    /**
     * Computes the sum of Sum of encrypted int.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public int sumOfEncryptedInt(int[] nums) {
        int total=0;
        for (int n:nums) {
            String s=String.valueOf(n); int max=0;
            for (char c:s.toCharArray()) max=Math.max(max,c-'0');
            StringBuilder sb=new StringBuilder();
            for (int i=0;i<s.length();i++) sb.append(max);
            total+=Integer.parseInt(sb.toString());
        }
        return total;
    }

    public static void main(String[] args) {
        HarshadNumber sol = new HarshadNumber();
        System.out.println(sol.sumOfEncryptedInt(new int[]{1,2,3}));
    }
}
