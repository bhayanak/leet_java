package org.leetcode.easy;


/**
 * <b>#2843 -   Count Symmetric Integers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers low and high.
 *
 *
 * An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.
 *
 *
 * Return the number of symmetric integers in the range [low, high].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: low = 1, high = 100
 * Output: 9
 * Explanation: There are 9 symmetric integers between 1 and 100: 11, 22, 33, 44, 55, 66, 77, 88, and 99.
 *
 * Example 2:
 *
 * Input: low = 1200, high = 1230
 * Output: 4
 * Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= low &lt;= high &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">Iterate over all numbers from <code>low</code> to <code>high</code></div>
 * Hint 2: <div class="_1l1MA">Convert each number to a string and compare the sum of the first half with that of the second.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-symmetric-integers/">LeetCode #2843</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountSymmetricIntegers {

    /**
     * Counts Count symmetric integers.
     *
     * @param low the low (int)
     * @param high the high (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
        for (int n=low;n<=high;n++) {
            String s=String.valueOf(n); int len=s.length();
            if (len%2!=0) continue;
            int half=len/2, sum1=0, sum2=0;
            for (int i=0;i<half;i++) sum1+=s.charAt(i)-'0';
            for (int i=half;i<len;i++) sum2+=s.charAt(i)-'0';
            if (sum1==sum2) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountSymmetricIntegers sol = new CountSymmetricIntegers();
                System.out.println(sol.countSymmetricIntegers(1,100)); // 9
                System.out.println(sol.countSymmetricIntegers(1200,1230)); // 4
    }
}
