package org.leetcode.medium;


/**
 * <b>#2442 - Count Number of Distinct Integers After Reverse Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * You have to take each integer in the array, reverse its digits, and add it to the end of the array. You should apply this operation to the original integers in nums.
 *
 *
 * Return the number of distinct integers in the final array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,13,10,12,31]
 * Output: 6
 * Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
 * The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
 * The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
 *
 * Example 2:
 *
 * Input: nums = [2,2,2]
 * Output: 1
 * Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
 * The number of distinct integers in this array is 1 (The number 2).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What data structure allows us to insert numbers and find the number of distinct numbers in it?
 * Hint 2: Try using a set, insert all the numbers and their reverse into it, and return its size.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/">LeetCode #2442</a>
 */
public class CountNumberOfDistinctIntegersAfterReverseOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Distinct Integers After Reverse Operations");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumberOfDistinctIntegersAfterReverseOperations ===");
        CountNumberOfDistinctIntegersAfterReverseOperations sol = new CountNumberOfDistinctIntegersAfterReverseOperations();
        System.out.println(sol.solve(null));
    }
}
