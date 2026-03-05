package org.leetcode.medium;


/**
 * <b>#3091 - Apply Operations to Make Sum of Array Greater Than or Equal to k</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer k. Initially, you have an array nums = [1].
 *
 *
 * You can perform any of the following operations on the array any number of times (possibly zero):
 *
 *
 * Choose any element in the array and increase its value by 1.
 *
 * Duplicate any element in the array and add it to the end of the array.
 *
 * Return the minimum number of operations required to make the sum of elements of the final array greater than or equal to k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 11
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * We can do the following operations on the array nums = [1]:
 *
 *
 * Increase the element by 1 three times. The resulting array is nums = [4].
 *
 * Duplicate the element two times. The resulting array is nums = [4,4,4].
 *
 * The sum of the final array is 4 + 4 + 4 = 12 which is greater than or equal to k = 11.
 *
 * The total number of operations performed is 3 + 2 = 5.
 *
 * Example 2:
 *
 * Input: k = 1
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * The sum of the original array is already greater than or equal to 1, so no operations are needed.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is optimal to make all the increase operations first and all the duplicate operations last.
 * Hint 2: Iterate over all possible number of increase operations that can be done and find the corresponding number of duplicate operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/apply-operations-to-make-sum-of-array-greater-than-or-equal-to-k/">LeetCode #3091</a>
 */
public class ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Apply Operations to Make Sum of Array Greater Than or Equal to k");
    }

    public static void main(String[] args) {
        System.out.println("=== ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualToK ===");
        ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualToK sol = new ApplyOperationsToMakeSumOfArrayGreaterThanOrEqualToK();
        System.out.println(sol.solve(null));
    }
}
