package org.leetcode.easy;


/**
 * <b>#2169 - Count Operations to Obtain Zero</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two non-negative integers num1 and num2.
 *
 *
 * In one operation, if num1 &gt;= num2, you must subtract num2 from num1, otherwise subtract num1 from num2.
 *
 *
 * For example, if num1 = 5 and num2 = 4, subtract num2 from num1, thus obtaining num1 = 1 and num2 = 4. However, if num1 = 4 and num2 = 5, after one operation, num1 = 4 and num2 = 1.
 *
 * Return the number of operations required to make either num1 = 0 or num2 = 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = 2, num2 = 3
 * Output: 3
 * Explanation: 
 * - Operation 1: num1 = 2, num2 = 3. Since num1 &lt; num2, we subtract num1 from num2 and get num1 = 2, num2 = 3 - 2 = 1.
 * - Operation 2: num1 = 2, num2 = 1. Since num1 &gt; num2, we subtract num2 from num1.
 * - Operation 3: num1 = 1, num2 = 1. Since num1 == num2, we subtract num2 from num1.
 * Now num1 = 0 and num2 = 1. Since num1 == 0, we do not need to perform any further operations.
 * So the total number of operations required is 3.
 *
 * Example 2:
 *
 * Input: num1 = 10, num2 = 10
 * Output: 1
 * Explanation: 
 * - Operation 1: num1 = 10, num2 = 10. Since num1 == num2, we subtract num2 from num1 and get num1 = 10 - 10 = 0.
 * Now num1 = 0 and num2 = 10. Since num1 == 0, we are done.
 * So the total number of operations required is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= num1, num2 &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try simulating the process until either of the two integers is zero.
 * Hint 2: Count the number of operations done.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/count-operations-to-obtain-zero/">LeetCode #2169</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountOperationsToObtainZero {

    /**
     * Counts Count operations.
     *
     * @param num1 the num1 (int)
     * @param num2 the num2 (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countOperations(int num1, int num2) {
        int ops=0;
        while (num1!=0 && num2!=0) {
            if (num1>=num2) num1-=num2; else num2-=num1;
            ops++;
        }
        return ops;
    }

    public static void main(String[] args) {
        CountOperationsToObtainZero sol = new CountOperationsToObtainZero();
                System.out.println(sol.countOperations(2,3)); // 3
                System.out.println(sol.countOperations(10,10)); // 1
    }
}
