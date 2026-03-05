package org.leetcode.easy;


/**
 * <b>#1342 - Number of Steps to Reduce a Number to Zero</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer num, return the number of steps to reduce it to zero.
 *
 *
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 14
 * Output: 6
 * Explanation: 
 * Step 1) 14 is even; divide by 2 and obtain 7. 
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * Step 3) 6 is even; divide by 2 and obtain 3. 
 * Step 4) 3 is odd; subtract 1 and obtain 2. 
 * Step 5) 2 is even; divide by 2 and obtain 1. 
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 *
 * Example 2:
 *
 * Input: num = 8
 * Output: 4
 * Explanation: 
 * Step 1) 8 is even; divide by 2 and obtain 4. 
 * Step 2) 4 is even; divide by 2 and obtain 2. 
 * Step 3) 2 is even; divide by 2 and obtain 1. 
 * Step 4) 1 is odd; subtract 1 and obtain 0.
 *
 * Example 3:
 *
 * Input: num = 123
 * Output: 12
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= num &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process to get the final answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">LeetCode #1342</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class NumberOfStepsToReduceANumberToZero {

    /**
     * Solves the problem: Number of steps.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numberOfSteps(int num) {
        int steps=0;
        while (num>0) { num = (num%2==0) ? num/2 : num-1; steps++; }
        return steps;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero sol = new NumberOfStepsToReduceANumberToZero();
                System.out.println(sol.numberOfSteps(14)); // 6
                System.out.println(sol.numberOfSteps(8));  // 4
                System.out.println(sol.numberOfSteps(123)); // 12
    }
}
