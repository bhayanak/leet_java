package org.leetcode.easy;


/**
 * <b>#2520 - Count the Digits That Divide a Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer num, return the number of digits in num that divide num.
 *
 *
 * An integer val divides nums if nums % val == 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 7
 * Output: 1
 * Explanation: 7 divides itself, hence the answer is 1.
 *
 * Example 2:
 *
 * Input: num = 121
 * Output: 2
 * Explanation: 121 is divisible by 1, but not 2. Since 1 occurs twice as a digit, we return 2.
 *
 * Example 3:
 *
 * Input: num = 1248
 * Output: 4
 * Explanation: 1248 is divisible by all of its digits, hence the answer is 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 109
 *
 * num does not contain 0 as one of its digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use mod by 10 to retrieve the least significant digit of the number
 * Hint 2: Divide the number by 10, then round it down so that the second least significant digit becomes the least significant digit of the number
 * Hint 3: Use your language’s mod operator to see if a number is a divisor of another.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/count-the-digits-that-divide-a-number/">LeetCode #2520</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountTheDigitsThatDivideANumber {

    /**
     * Counts Count the digits.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countTheDigits(int num) {
        int cnt=0; String s=String.valueOf(num);
        for (char c:s.toCharArray()) if (num%(c-'0')==0) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        CountTheDigitsThatDivideANumber sol = new CountTheDigitsThatDivideANumber();
                System.out.println(sol.countTheDigits(7));   // 1
                System.out.println(sol.countTheDigits(121)); // 2
                System.out.println(sol.countTheDigits(1248)); // 4
    }
}
