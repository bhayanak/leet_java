package org.leetcode.easy;


/**
 * <b>#1716 - Calculate Money in Leetcode Bank</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
 *
 *
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday. 
 *
 *
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4
 * Output: 10
 * Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
 *
 * Example 2:
 *
 * Input: n = 10
 * Output: 37
 * Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
 *
 * Example 3:
 *
 * Input: n = 20
 * Output: 96
 * Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
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
 * Hint 1: Simulate the process by keeping track of how much money Hercy is putting in and which day of the week it is, and use this information to deduce how much money Hercy will put in the next day.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/calculate-money-in-leetcode-bank/">LeetCode #1716</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class CalculateMoneyInLeetcodeBank {

    /**
     * Solves the problem: Total money.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int totalMoney(int n) {
        int total=0, base=1;
        for (int day=1;day<=n;day++) {
            int week=(day-1)/7, dayOfWeek=(day-1)%7;
            total += week + 1 + dayOfWeek;
        }
        return total;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        CalculateMoneyInLeetcodeBank sol = new CalculateMoneyInLeetcodeBank();
                System.out.println(sol.totalMoney(4));  // 10
                System.out.println(sol.totalMoney(10)); // 37
                System.out.println(sol.totalMoney(20)); // 96
    }
}
