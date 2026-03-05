package org.leetcode.easy;


/**
 * <b>#2235 - Add Two Integers</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers num1 and num2, return the sum of the two integers.
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = 12, num2 = 5
 * Output: 17
 * Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
 *
 * Example 2:
 *
 * Input: num1 = -10, num2 = 4
 * Output: -6
 * Explanation: num1 + num2 = -6, so -6 is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * -100 &lt;= num1, num2 &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/add-two-integers/">LeetCode #2235</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class AddTwoIntegers {

    /**
     * Computes the sum of Sum.
     *
     * @param num1 the num1 (int)
     * @param num2 the num2 (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sum(int num1, int num2) { return num1+num2; }

    public static void main(String[] args) {
        AddTwoIntegers sol = new AddTwoIntegers();
                System.out.println(sol.sum(12,5));  // 17
                System.out.println(sol.sum(-10,4)); // -6
    }
}
