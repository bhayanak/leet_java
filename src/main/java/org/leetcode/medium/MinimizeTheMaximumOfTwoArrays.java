package org.leetcode.medium;


/**
 * <b>#2513 - Minimize the Maximum of Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Binary Search, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We have two arrays arr1 and arr2 which are initially empty. You need to add positive integers to them such that they satisfy all the following conditions:
 *
 *
 * arr1 contains uniqueCnt1 distinct positive integers, each of which is not divisible by divisor1.
 *
 * arr2 contains uniqueCnt2 distinct positive integers, each of which is not divisible by divisor2.
 *
 * No integer is present in both arr1 and arr2.
 *
 * Given divisor1, divisor2, uniqueCnt1, and uniqueCnt2, return the minimum possible maximum integer that can be present in either array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: divisor1 = 2, divisor2 = 7, uniqueCnt1 = 1, uniqueCnt2 = 3
 * Output: 4
 * Explanation: 
 * We can distribute the first 4 natural numbers into arr1 and arr2.
 * arr1 = [1] and arr2 = [2,3,4].
 * We can see that both arrays satisfy all the conditions.
 * Since the maximum value is 4, we return it.
 *
 * Example 2:
 *
 * Input: divisor1 = 3, divisor2 = 5, uniqueCnt1 = 2, uniqueCnt2 = 1
 * Output: 3
 * Explanation: 
 * Here arr1 = [1,2], and arr2 = [3] satisfy all conditions.
 * Since the maximum value is 3, we return it.
 *
 * Example 3:
 *
 * Input: divisor1 = 2, divisor2 = 4, uniqueCnt1 = 8, uniqueCnt2 = 2
 * Output: 15
 * Explanation: 
 * Here, the final possible arrays can be arr1 = [1,3,5,7,9,11,13,15], and arr2 = [2,6].
 * It can be shown that it is not possible to obtain a lower maximum satisfying all conditions. 
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= divisor1, divisor2 &lt;= 105
 *
 * 1 &lt;= uniqueCnt1, uniqueCnt2 &lt; 109
 *
 * 2 &lt;= uniqueCnt1 + uniqueCnt2 &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use binary search to find smallest maximum element.
 * Hint 2: Add numbers divisible by x in nums2 and vice versa.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/minimize-the-maximum-of-two-arrays/">LeetCode #2513</a>
 */
public class MinimizeTheMaximumOfTwoArrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize the Maximum of Two Arrays");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeTheMaximumOfTwoArrays ===");
        MinimizeTheMaximumOfTwoArrays sol = new MinimizeTheMaximumOfTwoArrays();
        System.out.println(sol.solve(null));
    }
}
