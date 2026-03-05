package org.leetcode.medium;


/**
 * <b>#2150 - Find All Lonely Numbers in the Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.
 *
 *
 * Return all lonely numbers in nums. You may return the answer in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,6,5,8]
 * Output: [10,8]
 * Explanation: 
 * - 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
 * - 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
 * - 5 is not a lonely number since 6 appears in nums and vice versa.
 * Hence, the lonely numbers in nums are [10, 8].
 * Note that [8, 10] may also be returned.
 *
 * Example 2:
 *
 * Input: nums = [1,3,5,3]
 * Output: [1,5]
 * Explanation: 
 * - 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
 * - 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
 * - 3 is not a lonely number since it appears twice.
 * Hence, the lonely numbers in nums are [1, 5].
 * Note that [5, 1] may also be returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For a given element x, how can you quickly check if x - 1 and x + 1 are present in the array without reiterating through the entire array?
 * Hint 2: Use a set or a hash map.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 *
 * @see <a href="https://leetcode.com/problems/find-all-lonely-numbers-in-the-array/">LeetCode #2150</a>
 */
public class FindAllLonelyNumbersInTheArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All Lonely Numbers in the Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindAllLonelyNumbersInTheArray ===");
        FindAllLonelyNumbersInTheArray sol = new FindAllLonelyNumbersInTheArray();
        System.out.println(sol.solve(null));
    }
}
