package org.leetcode.hard;


/**
 * <b>#2963 - Count the Number of Good Partitions</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Combinatorics</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed array nums consisting of positive integers.
 *
 *
 * A partition of an array into one or more contiguous subarrays is called good if no two subarrays contain the same number.
 *
 *
 * Return the total number of good partitions of nums.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: 8
 * Explanation: The 8 possible good partitions are: ([1], [2], [3], [4]), ([1], [2], [3,4]), ([1], [2,3], [4]), ([1], [2,3,4]), ([1,2], [3], [4]), ([1,2], [3,4]), ([1,2,3], [4]), and ([1,2,3,4]).
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: 1
 * Explanation: The only possible good partition is: ([1,1,1,1]).
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,3]
 * Output: 2
 * Explanation: The 2 possible good partitions are: ([1,2,1], [3]) and ([1,2,1,3]).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If a segment contains a value, it must contain all occurrences of the same value.
 * Hint 2: Partition the array into segments making each one as short as possible. This can be achieved by two-pointers or using a Set.
 * Hint 3: If we have <code>m</code> segments, we can arbitrarily group the neighboring segments. How many ways are there to group these <code>m</code> segments?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Combinatorics).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-good-partitions/">LeetCode #2963</a>
 */
public class CountTheNumberOfGoodPartitions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Good Partitions");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfGoodPartitions ===");
        CountTheNumberOfGoodPartitions sol = new CountTheNumberOfGoodPartitions();
        System.out.println(sol.solve(null));
    }
}
