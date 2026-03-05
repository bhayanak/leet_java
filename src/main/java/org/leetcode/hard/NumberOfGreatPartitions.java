package org.leetcode.hard;


/**
 * <b>#2518 - Number of Great Partitions</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers and an integer k.
 *
 *
 * Partition the array into two ordered groups such that each element is in exactly one group. A partition is called great if the sum of elements of each group is greater than or equal to k.
 *
 *
 * Return the number of distinct great partitions. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * Two partitions are considered distinct if some element nums[i] is in different groups in the two partitions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4], k = 4
 * Output: 6
 * Explanation: The great partitions are: ([1,2,3], [4]), ([1,3], [2,4]), ([1,4], [2,3]), ([2,3], [1,4]), ([2,4], [1,3]) and ([4], [1,2,3]).
 *
 * Example 2:
 *
 * Input: nums = [3,3,3], k = 4
 * Output: 0
 * Explanation: There are no great partitions for this array.
 *
 * Example 3:
 *
 * Input: nums = [6,6], k = 2
 * Output: 2
 * Explanation: We can either put nums[0] in the first partition or in the second partition.
 * The great partitions will be ([6], [6]) and ([6], [6]).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, k &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the sum of the array is smaller than 2*k, then it is impossible to find a great partition.
 * Hint 2: Solve the reverse problem, that is, find the number of partitions where the sum of elements of at least one of the two groups is smaller than k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/number-of-great-partitions/">LeetCode #2518</a>
 */
public class NumberOfGreatPartitions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Great Partitions");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfGreatPartitions ===");
        NumberOfGreatPartitions sol = new NumberOfGreatPartitions();
        System.out.println(sol.solve(null));
    }
}
