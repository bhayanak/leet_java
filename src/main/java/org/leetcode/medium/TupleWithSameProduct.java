package org.leetcode.medium;


/**
 * <b>#1726 - Tuple with Same Product</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of distinct positive integers, return the number of tuples (a, b, c, d) such that a * b = c * d where a, b, c, and d are elements of nums, and a != b != c != d.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,4,6]
 * Output: 8
 * Explanation: There are 8 valid tuples:
 * (2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
 * (3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
 *
 * Example 2:
 *
 * Input: nums = [1,2,4,5,10]
 * Output: 16
 * Explanation: There are 16 valid tuples:
 * (1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
 * (2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
 * (2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
 * (4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 104
 *
 * All elements in nums are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that all of the integers are distinct. This means that each time a product is formed it must be formed by two unique integers.
 * Hint 2: Count the frequency of each product of 2 distinct numbers. Then calculate the permutations formed.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/tuple-with-same-product/">LeetCode #1726</a>
 */
public class TupleWithSameProduct {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Tuple with Same Product");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== TupleWithSameProduct ===");
        TupleWithSameProduct sol = new TupleWithSameProduct();
        System.out.println(sol.solve(null));
    }
}
